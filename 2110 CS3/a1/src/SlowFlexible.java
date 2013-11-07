/**
 * @author Derek
 * Slow Flexible can move in all directions
 * but still limited to one space per move
 */
public class SlowFlexible extends SlowPiece{
	//constructor
	public SlowFlexible(String n, String c, int i, int j){
		super(n,c,i,j);
	}
	//move method that accepts direction & n
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
	public void moveDown(){
		setJ(super.getJ()+1);
	}
	//because this is a Slow piece, n is disregarded
	public void moveUp(int n){
		moveUp();
	}
	public void moveDown(int n){
		moveDown();
	}
	
	//override toString method
	public String toString(){
		return "Flexible "+super.toString();
	}
}
