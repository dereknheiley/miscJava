import java.util.ArrayList;

public class Heap<T extends Comparable<T>>{
	ArrayList<T> heapList;

	
	public Heap(){
		heapList = new ArrayList<T>();
	}
	
	public int size(){
		return heapList.size();
	}
	public boolean isEmpty(){
		return (size()==0);
	}
	public void clear(){
		heapList.clear();
	}
	
	public void add(T item){
		heapList.add(item); //add it to the end of the arraylist
		
		int index = heapList.size()-1;  //get the index where it was added
		int pindex = (index-1)/2;		//get the index of its parent
		T parent = heapList.get(pindex); //get the key at the parent node
		while (index>0&&item.compareTo(parent)>0)
		{
			heapList.set(index,parent);
			heapList.set(pindex,item);
			index = pindex;
			pindex = (index-1)/2;
			parent = heapList.get(pindex);
		}
	}
	
	public T deleteMax(){
		if (isEmpty()){
			System.out.println("Heap is empty");
			return null;
		}
		else{
			T ret = heapList.get(0); //root has the item to be returned
			
			T item = heapList.remove(heapList.size()-1); //remove the last item
			
			if (heapList.size()==0)
				return ret;
				
			heapList.set(0,item); //set it as the root
			int index, lIndex, rIndex, maxIndex;
			T maxChild;
			boolean found=false;
			
			index =0;
			lIndex = index*2+1;
			rIndex = index*2+2;
			
			while(!found){
				//case 1: two child nodes
				if (lIndex<size()&&rIndex<size()){
					
					//find the maxChild and maxIndex
					if (heapList.get(lIndex).compareTo(heapList.get(rIndex))>0){
						maxChild = heapList.get(lIndex);
						maxIndex = lIndex;
					}
					else {
						maxChild = heapList.get(rIndex);
						maxIndex = rIndex;
					}
					//sift down if necessary
					if (item.compareTo(maxChild)<0){
						heapList.set(maxIndex,item);
						heapList.set(index,maxChild);
						index = maxIndex;
					}
					//otherwise found the right place
					else
						found=true;	
				}
				
				//case 2: only left child
				else if (lIndex<size()){
					if (item.compareTo(heapList.get(lIndex))<0){	
						heapList.set(index,heapList.get(lIndex));
						heapList.set(lIndex,item);
						index = lIndex;
					}
					else
						found = true;
				}
				
				//case 3: only right child
				else if (rIndex<size()){
					if (item.compareTo(heapList.get(rIndex))<0){
						heapList.set(index,heapList.get(rIndex));
						heapList.set(rIndex,item);
						index = rIndex;
					}
					else
						found = true;
				}
				//case 4: no children
				else
					found = true;
				
				lIndex = index*2+1;
				rIndex = index*2+2;
			}
			
			return ret;
		}
	}
	public void enumerate(){
		System.out.println(heapList);
	}
	
	//toString method for a little more control over output
	public String toString(){
		String out="";
		out+="id\tunitsReq\tpriority\tarrival\n";
		for(int i=0; i<size(); i++)	
			out+=heapList.get(i)+"\n";
		return out;
	}
} 
