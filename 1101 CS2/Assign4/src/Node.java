public class Node{
	
	//instance variables
	private String name1, name2;
	private Node next;
	
	//Constructor
	public Node(String n1, String n2, Node n){
		name1 = n1;
		name2 = n2;
		next = n;
	}
	
	//GET METHODS
	public String getData(){
		return name1 +"\t"+name2;
	}
	public String getData1(){
		return name1;
	}
	public String getData2(){
		return name2;
	}
	public Node getNext(){
		return next;
	}
	
	//SET METHODS
	public void setNext(Node n){
		next = n;
	}
	public void setData(String n1, String n2){
		name1 = n1;
		name2 = n2;
	}
	public void setData1(String n1){
		name1 = n1;
	}
	public void setData2(String n2){
		name2 = n2;
	}
	
	//toString
	public String toString()
	{
		return name1 + " \t" + name2 + "-->";
	}
}//end Node Class