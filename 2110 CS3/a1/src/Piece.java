/**
 * @author Derek
 * abstract class for a Piece on a gameboard
 * defines the required parameters and base methods
 */
public abstract class Piece {
	//instance variables
	private String name;
	private String colour="black"; //black, white, red, blue, or green
	private int i=0; //left, right
	private int j=0; //up, down
	private static int min=0; 
	private static int size=8; //this seems redundant at this level
	
	//Constructor
	public Piece(String n, String c, int i, int j){
		name = n;
		setColour(c);
		setI(i);
		setJ(j);
	}
	
	//set new max size for position
	public static void setSize(int newsize){
		size=newsize;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name.trim();
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String c) {
		String temp = c.toLowerCase();
		if(temp.matches("(^bla.*)")
			||temp.matches("(^w.*)")
			||temp.matches("(^r.*)")
			||temp.matches("(^blu.*)")
			||temp.matches("(^g.*)"))
			colour = c.trim();
		else
			System.out.println("Unknown piece colour in Piece Class");
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = (i<size && i>=min)?i:this.i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = (j<size && j>=min)?j:this.j;
	}
	public void setIJ(int i, int j){
		setI(i);
		setJ(j);
	}
	
	//abstract method to be overridden by all subclasses
	abstract void move(String dir, int n);
	
	//move methods that build on set method logic
	public void moveRight(){
		setI(i+1);
	}
	public void moveRight(int n){//overloaded method
		setI(i+n);
	}
	public void moveLeft(){
		setI(i-1);
	}
	public void moveLeft(int n){//overloaded method
		setI(i-n);
	}
	public String toString(){
		return colour+" "+name+" "+i+","+j;
	}
}
