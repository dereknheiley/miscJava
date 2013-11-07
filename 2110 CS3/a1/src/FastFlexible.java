/**
 * @author Derek
 * fast flexible can move in all directions
 * and n spaces per move
 */
public class FastFlexible extends FastPiece{
	//constructor
	public FastFlexible(String n, String c, int i, int j){
		super(n,c,i,j);
	}
	
	//override move method in FastPiece class
	//to include Up/Down directions
	public void move(String dir, int n){
		switch (dir){
		case "up": moveUp(n); break;
		case "down": moveDown(n); break;
		case "right": moveRight(n); break;
		case "left": moveLeft(n); break;
		}
	}
	//new move methods to go up and down
	public void moveUp(){
		setJ(super.getJ()-1);
	}
	public void moveUp(int n){
		setJ(super.getJ()-n);
	}
	public void moveDown(){
		setJ(super.getJ()+1);
	}
	public void moveDown(int n){
		setJ(super.getJ()+n);
	}
	
	//override toString method
	public String toString(){
		return "Flexible "+super.toString();
	}
}
