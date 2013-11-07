
public class Rectangle2D {

	private Point tL;
	private Point bR;
	private int length;
	private int width;
	
	//constructors
	public Rectangle2D(){
	}
	public Rectangle2D(Point tl, Point br){
		tL = new Point( tl.getXcor() , tl.getYcor() );
		bR = new Point( br.getXcor() , br.getYcor() );
		calcLength();
		calcWidth();
	}
	public Rectangle2D(int tlX, int tlY, int brX, int brY){
		tL = new Point( tlX, tlY );
		bR = new Point( brX, brY );
		calcLength();
		calcWidth();
	}
	
	private void calcLength(){
		length = bR.getXcor() - tL.getXcor();
	}
	private void calcWidth(){
		width = bR.getYcor() - tL.getYcor();
	}
	
	//get methods for the coordinates of the rectangle
	public Point getRectBR(){
		return bR;
	}
	public Point getRectTL(){
		return tL;
	}
	
	//methods to calculate and return length and width of rectangle
	// the assumption is made that rectangle is parrallel to both axis
	public int getLength(){
		calcLength();
		return length;
	}
	public int getWidth(){
		calcWidth();
		return width;
	}
	
	//checks if a point is inside the bounds of a rectangle
	public boolean contains(Point p){
		if(p.isLeftOf(bR) && tL.isLeftOf(p) && p.isHigher(tL) && bR.isHigher(p))
			return true;
		else
			return false;
	}
	
	// checks if another rectangle is completely within another rectangle
	public boolean contains(Rectangle2D r){
		Point rBR = r.getRectBR();
		Point rTL = r.getRectTL();
		if( bR.isHigher(rBR) && rBR.isLeftOf(bR) && rTL.isHigher(tL) && tL.isLeftOf(rTL))
			return true;
		else
			return false;
	}
	
	//toString method returns stats about rectangle
	public String toString(){
		return "Top Left Point: "+tL+"\nBottom Right Point: "+bR+"\nLength: "+length+""+"\nWidth: "+width;
	}
	
}
