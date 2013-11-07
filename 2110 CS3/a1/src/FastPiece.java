/**
 * @author Derek
 * Fast pieces can move left/right n spaces
 */
public class FastPiece extends Piece{
	
	//constructor
	public FastPiece(String n, String c, int i, int j){
		super(n,c,i,j);
	}
	
	//inherit moveRight moveLeft methods from super
	
	//override abstract move method
	public void move(String dir, int n){
		switch (dir){
		case "right": moveRight(n); break;
		case "left": moveLeft(n); break;
		}
	}
	
	//override toString method
	public String toString(){
		return "Fast "+super.toString();
	}
}