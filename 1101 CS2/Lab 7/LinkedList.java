import java.util.ArrayList;
public class LinkedList
{
	private Node head;
	private int count;
	
	//constructor	
	public LinkedList()
	{
		head = null;
		count = 0;
	}
	
	//add a node to the front of the linked list
	public void addToFront(String d)
	{
		Node n;
		n = new Node(d, head);
		head = n;
		count++;
	}
	
	//set the indicated node to desired string
	public void set(int index, String d){
		if( index <0 || index > size()-1)
			System.out.println("Can't set, index out of bounds.");
		else{
			Node curr = head;
			for(int i=0; i<index; i++)
				curr = curr.getNext();
			curr.setData(d);
		}
	}
	
	//gets data from a given index
	public String get(int index){
		String r;
		if( index <0 || index > size()-1)
			r ="Can't get, index out of bounds";
		else{
			Node curr = head;
			for(int i=0; i<index; i++)
				curr = curr.getNext();
			r = curr.getData();
		}
		return r;
	}
	
	//get the current size of the list
	public int size()
	{
		return count;
	}
	
	//check if the list is empty
	public boolean isEmpty()
	{
		if (head==null)
			return true;
		else
			return false;
	}
	
	//clear the list
	public void clear()
	{
		head = null;
		count=0;
	}
	
	//get the content of the first node
	public String getFrontData()
	{
		if (head==null)
			return "Empty list";
		else
			return head.getData();
	}
	
	//get the reference to the first node
	public Node getFirstNode()
	{
		return head;
	}
	
	//returns arraylist containing linkedlist contents in same order
	public ArrayList<String> convertToArrayList(){
		ArrayList<String> a = new ArrayList<String>();
		Node curr = head;
		for(int i=0; i<size(); i++){
			a.add(curr.getData());
			curr = curr.getNext();
		}
		return a;
	}
	
	//scan the list and print contents
	public void enumerate()
	{
		Node curr = head;
		while (curr!= null)
		{
			System.out.print(curr.getData()+" ");
			curr = curr.getNext();
		}
		System.out.println();
	}
	
	//scan the list and print odd index contents
	public void printOddIndices(){
		if(size() == 1)
			System.out.println("None.");
		else {
			Node curr = head;		
			for(int i=1; i<size(); i+=2){
				curr = curr.getNext();
				System.out.print(curr.getData()+" ");
				curr = curr.getNext();
				}
			System.out.println();
		}
	}
	
	//scan the list and print contents in reverse
	public void printReverse(){
		Node curr = head;
		for(int i=size()-1; i>=0; i--){
			System.out.print(get(i)+" ");
		}
		System.out.println();
	}
	
	//prints index of all matches in the linkedlist
	public void listAll(String d){
		Node curr = head;
		int num = 0;
		for(int i=0; i<size(); i++){
			if(curr.getData().equals(d)){
				if(num == 0)
					System.out.print(i);
				else
					System.out.print(", "+i);
				num++;
			}
			curr = curr.getNext();
		}
		System.out.println(". ");
	}
	
	//remove front node
	public void removeFront()
	{
		if (head==null)
		{
			System.out.println("Empty list");
		}
		else
		{
			head = head.getNext();
			count--;
		}
	}
	
	//add a node to the end
	public void addToEnd(String d)
	{
		Node n = new Node(d, null);
		Node curr = head;
		if (head==null)
			head = n;
		else
		{
			while (curr.getNext()!=null)
				curr = curr.getNext();
			curr.setNext(n);
		}
		count++;		
	}
	
	//remove last node
	public void removeLast()
	{
		if (head==null)
		{
			System.out.println("Empty list");
		}
		else if (head.getNext()==null)
		{
			head = null;
			count--;
		}
		else
		{
			Node curr = head;
			while (curr.getNext().getNext()!=null)
				curr = curr.getNext();
			curr.setNext(null);
			count--;
		}
			
	}

	//search for a given data and return the index of the node (first occurrence)
	//return -1 if not found
	public int contains(String d)
	{
		Node curr = head;
		boolean found = false;
		int index = -1;
		while (curr!=null&&!found)
		{
			index++;
			if (curr.getData().equals(d))
				found=true;
			curr= curr.getNext();
		}
		if (!found)
			return -1;
		else
			return index;
		
	}
	
	//add a node at a given index
	public void add(int index, String d)
	{
		if (index<0 || index>size()-1)
			System.out.println("Can't add. Index out of bounds");
		else
		{
	
			if (index==0)
				addToFront(d);
			else
			{
				Node curr = head;
				for(int i=0; i<index-1; i++)
					curr = curr.getNext();
				Node n = new Node(d,curr.getNext());
				curr.setNext(n);
				count++;
			}
		}
		
	}
	
	//remove a node at a given index
	public void remove(int index)
	{
		if (index<0 || index>size())
			System.out.println("Can't remove. Index out of bounds");
		else if (index==0)
			removeFront();
		else if (index==size()-1)
			removeLast();
		else
		{
			Node curr = head;
			for(int i=0;i<index-1;i++)
				curr = curr.getNext();
			curr.setNext(curr.getNext().getNext());
			count--;
		}
	}
	
}
