/**
 * @author Derek Neil B00163969
 * Special bare bone queue class with enqueue and dequeue
 * only! O(1) speed & add/remove efficiency with tail pointer.
 */
public class Q<T>{
	
	//instance variables
	private Node<T> head;
	private Node<T> tail;
	private int count=0;
	
	//constructor
	public Q(){
		head = tail = null;
	}
	
	public boolean isEmpty(){
		return head==null;
	}
	public int size(){
		return count;
	}
	
	//adds item to the end of the queue
	public void enqueue(T item){
		if(item !=null){
			Node<T> itemnode = new Node<T>(item, null); 
			if (head==null)
				head = tail= itemnode; 
			else{
				tail.setNext(itemnode);
				tail = itemnode;
			}
		}
		count++;
	}
	
	public T peek(){
		if(head!=null)
			return head.getData();
		else
			return null;
	}
	
	//returns data at given index and removes it from head
	public T dequeue(){
		if(head!=null){
			Node<T> pop = head;
			head = head.getNext();
			count--;
			return pop.getData();
		}
		return null;
	}
}