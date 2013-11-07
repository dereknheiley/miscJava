/**
 * @author Derek
 * slow piece can only move left/right 1 space at a time
 */
public class SlowPiece extends Piece {
	
	//constructor
	public SlowPiece(String n, String c, int i, int j){
		super(n,c,i,j);
	}
	
	//override abstract move method
	public void move(String dir, int n){
		switch (dir){
		case "right": moveRight(n); break;
		case "left": moveLeft(n); break;
		}
	}
	
	//override inherited methods to only move
	//slow pieces 1 place even if they're sent
	//n spaces to move
	public void moveRight(int n){
		if(n>=1)
			super.moveRight();
	}
	public void moveLeft(int n){
		if(n>=1)
			super.moveLeft();
	}
	
	//override toString method
	public String toString(){
		return "Slow "+super.toString();
	}
	
}
