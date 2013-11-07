//question3 A
public class Employee {
	
	private String name;
	private int ID;
	private double hourlyRate;
	private double hours;
	private double pay=0;

	public Employee(String n, int i, double hr, double h){
	name = n;
	ID = i;
	hourlyRate = hr;
	hours = h;
	}

	public void calcPay(){
	if(hours > 40){
		pay= (hours-40)*1.5*hourlyRate;
		pay+= 40*hourlyRate;
	}
	else
		pay=hours*hourlyRate;
	}
	
	public String toString(){
	return "Name: "+name+"\tID: "+ID+"\tPay: "+pay;
	}

}

//question3 b
public class EmployeeUser{

	
	
}


//question3 C
import java.Arraylists;
public class StudentEmployee extends Employee{

	//attributes
	private ArrayLists<String> courses = new Arraylist<String>();
	private ArrayLists<Double> marks = new Arraylist<Double>();
	
	//constructors
	public StudentEmployee(String name, int ID, double hourlyRate, double hours){
		super(name, ID, hourlyRate, hours);
	}
	
	public StudentEmployee(String name, int ID, double hourlyRate, double hours, String c, double m){
		super(name, ID, hourlyRate, hours);
		courses.add(c);
		marks.add(m);
	}
	
	//set method for another course for the Student Employee
	public void setCourse(String c, double m){
	courses.add(c);
	marks.add(m);
	}
}

//question 5
public int smallest(Arraylist<Integer> a){
	
	int index = -1;
	int min; //assuming -1 is the flag value since no other info provided
	if(a.getSize() >0){
		min = a.get(0);
		index = 0;
		for(int i=1; i<a.getSize(); i++){
			if(a.get(i) < min){
				min = a.get(i)
				index = i;
			}
		}
	}
	return index; // will only return index of first occurance of smallest value
}

//question 6 assuming head node is called head
//6 a
public void addAfterHead(String s){
	Node curr = new Node(s);
	if(head == null){
		head = curr;
	else{
		curr.setNext(head.getNext());
		head.setNext(curr);
	}
	count++;
}

// 6 b
public void deleteLastNode(){
	if(head == null)
		System.out.println("Can't delete, empty List");
	else{
		Node curr = head;
		while(curr.getNext().getNext()!= null)
			curr = curr.getNext();
		curr.setNext(null);
		count--;
	}
}

// 6 c
public void printEvenNodes(){
	Node curr = head.getNext();
	System.out.println(curr);
	while(curr.getNext().getNext() != null){
		curr = curr.getNext().getNext();
		System.out.println(curr.getData());
	}
}

// 6 d
public void deleteSecondLastNode(){
	if( count == 2){
		head = head.getNext();
		count--;
	}
	else if(size() >2){
		Node curr = head;
		while(curr.getNext().getNext().getNext() != null)
			curr = curr.getNext();
		curr.setNext(curr.getNext().getNext());
		count--;
	}
}

//7
public Linkedlist intersect(LinkedLista, LinkedList b){
	Linkedlist c = new LinkedList();
	for(int i=0; i<a.size(); i++){
		if( a.contains(b.get(i)) ){
			if(!c.contains(b.get(i))
				c.add(a.get(i));
	return c;
}
//8
public LinkedList reverse(LinkedList a){
	LinkedList b = new LinkedList();
	for(int i=a.getSize()-1; i>=0; i--_)
		b.add(a.get(i));
	return b;
}

//9
public static LinkedList combine(LinkedList list1, LinkedList list2){
	Linkedlist c = new LinkedList();
	for(int i=0; i<list1.getSize(); i++){
		if(!c.contains(list1.get(i)) // or c.contains(list1.get(i) == -1 depending on contains method
			c.add(list1.get(i));
	for(int i=0; i<list2.getSize(); i++){
		if(!c.contains(list2.get(i))
			c.add(list2.get(i));
	return c;
}

//19
public static void reverseQ(Queue q){
	Stack s = new Stack();
	while(q.size() >0 )
		s.push(q.dequeue());
	while (s.size() >0)
		q.enqueue(s.pop());
}