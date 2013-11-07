/**
 * @author Derek
 * ordered list class that accepts duplicates
 * used to store players in an order and print them out
 */
import java.util.ArrayList;
public class OrderedList <T extends Comparable<T>>{
	//instance variables
	private ArrayList<T> elements;
	
	//constructor
	public OrderedList(){
		elements = new ArrayList<T>();
	}
    public OrderedList(int size){
    	elements = new ArrayList<T>(size);
    }
    
    //general methods
    public int size(){
    	return elements.size();
    }
    public boolean isEmpty(){
    	return elements.isEmpty();
    }
    public T get(int pos){
    	if(pos<0||pos>elements.size()-1){
    		System.out.println("Get Index out of bounds");
    		return null;
    	}
    	else
    		return elements.get(pos);
    }
    
    //insert an item at the correct position
    //and allow duplicates
    //and return index it was added at to use for another list
    public int insert(T item){
    	if( elements.size() ==0 ){
    	    elements.add(item);
    	    return 0;
    	}
    	else{
			int pos = binarySearch(item);
			//regardless if item is found or not
			//use result from binary search as insert point
			//since we're allowing duplicates
			elements.add(pos,item);
			return pos;
    	}
    }
    
    //binary search returns just lo no -(lo+1)
    //because intended use is for an ordered list w/ duplicates
    public int binarySearch(T item){
        if(elements.size() ==0)
            return 0;
        int lo=0, hi= elements.size()-1, mid =0;
	    while (lo<=hi){
		    mid = (lo+hi)/2;
		    int c = item.compareTo(elements.get(mid));
		    if( c==0 ) return mid;
		    else if ( c<0 ) hi = mid -1;
		    else if( c>0 ) lo = mid + 1;
	    }
        return lo; 
    }
}
