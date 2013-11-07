/**
 * modified by Derek Neil B00163969
 */
import java.util.ArrayList;
public class OrderedList<T extends Comparable<T>>{
	
	//instance variables
	private ArrayList<T> elements;
	private int cursor;
	
	//constructors
	public OrderedList(){
		elements = new ArrayList<T>();
		cursor=-1;
	}
	public OrderedList(int cap){
		elements = new ArrayList<T>(cap);
		cursor=-1;
	}
	
	//general use methods
	public int size(){
		return elements.size();
	}
	public boolean isEmpty(){
		return elements.isEmpty();
	}
	public void clear(){
		elements.clear();
		cursor=-1;
	}
	public T get(int pos){
		if (pos<0||pos>=elements.size()){
			System.out.println("Can't get, index out of bounds");
			return null;
		}
		return elements.get(pos);
	}
	public T first(){
		if (elements.size()==0)
			return null;
		cursor=0;
		return elements.get(cursor);
	}
	public T next(){
		if (cursor<0||cursor==(elements.size()-1))
			return null;
		cursor++;
		return elements.get(cursor);
	}
	public void enumerate(){
		System.out.println(elements);
	}
	/*removed "add" method since this could 
	 * allow duplicates out of order!*/
	public T remove(int pos){
		if (pos<0||pos>=elements.size()){
			System.out.println("Can't remove, index out of bounds!");
			return null;
		}
		return remove(pos);
	}
	
	//binary search & methods that make use of it
	public int binarySearch(T item){
		if (elements.size()==0)
			return -1;
			
		int lo=0, hi=elements.size()-1, mid=0;
		
		while (lo<=hi){
			mid = (lo+hi)/2;
			int c = item.compareTo(elements.get(mid));
			if (c==0) return mid;
			if (c<0) hi = mid-1;
			if (c>0) lo = mid+1;
		}
		
		return (-(lo+1)); // you take the mid road and i'll take the lo road!
	}
	public void insert(T item){
		if (elements.size()==0){
			elements.add(item);
			return;
		}
		int pos = binarySearch(item);
		if (pos>=0){
			System.out.println("Skipped duplicate entry of "+item);
			//return instead of System.exit(0)
			return; //so that program keeps running
		}
		else
			elements.add(-pos-1, item);
	}
	public void remove(T item){
		int pos = binarySearch(item);
		if (pos<0){
			System.out.println("Can't remove, not found in list!");
			return;
		}
		else
			elements.remove(pos);
	}
	
	//toString method
	public String toString(){
		String output ="[";
		int n = elements.size();
		for(int i=0; i<n; i++){
			output+=elements.get(i);
			if(i<n-1)
				output+=", ";
		}
		return output+"]";
	}
}