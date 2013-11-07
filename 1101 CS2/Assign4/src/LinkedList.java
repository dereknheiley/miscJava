import java.util.ArrayList;
public class LinkedList{
	
	//instance variables
	private Node head;
	private int count;
	
	//constructor	
	public LinkedList(){
		head = null;
		count = 0;
	}


	//SET METHODS ----------------------------------------
	
	//set the indicated node to desired string
	public void set(int index, String n1, String n2){
		if( index <0 || index > size()-1)
			System.out.println("Can't set, index out of bounds.");
		else{
			Node curr = head;
			for(int i=0; i<index; i++)
				curr = curr.getNext();
			curr.setData(n1,n2);
		}
	}
	
	
	//GET METHODS ----------------------------------------
	
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
	//gets data from a given index
	public String get1(int index){
		String r;
		if( index <0 || index > size()-1)
			r ="Can't get, index out of bounds";
		else{
			Node curr = head;
			for(int i=0; i<index; i++)
				curr = curr.getNext();
			r = curr.getData1();
		}
		return r;
	}
	//gets data from a given index
	public String get2(int index){
		String r;
		if( index <0 || index > size()-1)
			r ="Can't get, index out of bounds";
		else{
			Node curr = head;
			for(int i=0; i<index; i++)
				curr = curr.getNext();
			r = curr.getData2();
		}
		return r;
	}
	
	//get the content of the first node
	public String getFrontData(){
		if (head==null)
			return "Empty list";
		else
			return head.getData();
	}
//get the content of the first node
	public String getFrontData1(){
		if (head==null)
			return "Empty list";
		else
			return head.getData1();
	}
//get the content of the first node
	public String getFrontData2(){
		if (head==null)
			return "Empty list";
		else
			return head.getData2();
	}
	
	//get the reference to the first node
	public Node getFirstNode(){
		return head;
	}
	
	
	//QUERY & SEARCH METHODS -----------------------------
	
	//get the current size of the list
	public int size(){
		return count;
	}
	
	//check if the list is empty
	public boolean isEmpty(){
		if (head==null)
			return true;
		else
			return false;
	}
	
	//search for a given data and return the index of the 
	//node (first occurrence), return -1 if not found
	public int contains(String d){
		Node curr = head;
		boolean found = false;
		int index = -1;
		while (curr!=null&&!found){
			index++;
			if (curr.getData1().equals(d)||curr.getData2().equals(d))
				found=true;
			curr= curr.getNext();
		}
		if (!found)
			return -1;
		else
			return index;
	}
	
	public int contains1(String d){
		Node curr = head;
		boolean found = false;
		int index = -1;
		while (curr!=null&&!found){
			index++;
			if (curr.getData1().equals(d))
				found=true;
			curr= curr.getNext();
		}
		if (!found)
			return -1;
		else
			return index;
	}
	
	public int contains2(String d){
		Node curr = head;
		boolean found = false;
		int index = -1;
		while (curr!=null&&!found){
			index++;
			if (curr.getData2().equals(d))
				found=true;
			curr= curr.getNext();
		}
		if (!found)
			return -1;
		else
			return index;
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
	
	
	//PRINT & CONVERT METHODS ----------------------------
	
	//scan the list and print contents
	public void enumerate(){
		Node curr = head;
		while (curr!= null){
			System.out.println(curr.getData());
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
		for(int i=size()-1; i>=0; i--){
			System.out.print(get(i)+" ");
		}
		System.out.println();
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
	

	//ADD METHODS ----------------------------------------

	//add a node at a given index
	public void add(int index, String n1, String n2){
		if (index<0 || index>size()-1)
			System.out.println("Can't add. Index out of bounds");
		else{
			if (index==0)
				addToFront(n1,n2);
			else{
				Node curr = head;
				for(int i=0; i<index; i++)
					curr = curr.getNext();
				Node n = new Node(n1,n2,curr.getNext());
				curr.setNext(n);
				count++;
			}
		}
	}
	
	//overloaded version of add in case index is forgotten
	public void add(String n1, String n2){
		addToEnd(n1,n2);		
	}
	
	//add a node to the front of the linked list
	public void addToFront(String n1, String n2){
		Node n;
		n = new Node(n1, n2, head);
		head = n;
		count++;
	}
	
	//add a node to the end
	public void addToEnd(String n1, String n2){
		Node n = new Node(n1, n2, null);
		Node curr = head;
		if (head==null)
			head = n;
		else{
			while (curr.getNext()!=null)
				curr = curr.getNext();
			curr.setNext(n);
		}
		count++;		
	}
	
	
	//REMOVE AND CLEARING METHODS ------------------------
	
	//remove a node at a given index
	public void remove(int index){
		if (index<0 || index > size()-1)
			System.out.println("Can't remove. Index out of bounds");
		else if (index==0)
			removeFront();
		else if (index==size()-1)
			removeLast();
		else{
			Node curr = head;
			for(int i=0;i<index;i++)
				curr = curr.getNext();
			curr.setNext(curr.getNext().getNext());
			count--;
		}
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
	
	//remove last node
	public void removeLast(){
		if (head==null){
			System.out.println("Empty list");
		}
		else if (head.getNext()==null){
			head = null;
		count--;
		}
		else{
			Node curr = head;
			while (curr.getNext().getNext()!=null)
				curr = curr.getNext();
			curr.setNext(null);
			count--;
		}	
	}
	
	//clear the list
	public void clear(){
		head = null;
		count=0;
	}
	
}//close class


