/**
 * @author Derek
 * Queue class, first in first out
 */
public class Queue<T> {

	//instance variable
	private LinkedList<T> q;
	int cursor=0;
	
	//constructor
	public Queue(){
		q = new LinkedList<T>();
	}
	
	//add and remove methods
	public void enqueue(T item){
		q.addToEnd(item);
	}
	public T dequeue(){
		return q.removeAt(0);
	}
	
	//view but not remove item
	public T peek(){
		return q.getAt(0);
	}
	
	//some methods for traversing the queue
	public int positionOf(T item){
		return q.indexOf(item);
	}
	public void remove(T item){
		q.remove(item);
	}
	public void removeAt(int index){
		q.removeAt(index);
	}
	public T first(){
		if(!q.isEmpty()){
			cursor=0;
			return q.getAt(0);
		}
		return null;
	}
	public T next(){
		if(q.size()>=cursor){
			cursor++;
			return q.getAt(cursor);
		}
		return null;
	}
	
	//house keeping methods
	public int size(){
		return q.size();
	}
	public boolean isEmtry(){
		return q.isEmpty();
	}
	public void clear(){
		q.clear();
	}

}
