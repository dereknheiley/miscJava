/**
 * @author Derek
 * first generic class ever!
 */
public class Point<T> {
	//instance variables
	private T xpos, ypos;
	
	//constructor
	public Point(T x, T y){
		xpos = x;
		ypos = y;
	}

	//getters and setters
	public T getXpos() {
		return xpos;
	}
	public void setXpos(T xpos) {
		this.xpos = xpos;
	}
	public T getYpos() {
		return ypos;
	}
	public void setYpos(T ypos) {
		this.ypos = ypos;
	}
	
	//toString method
	public String toString(){
		return "XPOS: "+xpos+"\tYPOS:"+ypos;
	}
}//end Point class
