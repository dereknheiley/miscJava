
public class Point {

	private int xcor;
	private int ycor;
	
	//constructors
	public Point(){
		
	}
	public Point(int x, int y){
		xcor = x;
		ycor = y;
		if (y>hY){
			hY = y;
			hX = x;
		}
	}
	
	//static method to hold coordinates of highest point
	private static int hX=-9999;
	private static int hY=-9999;
	
	//return highest point
	public String highest(){
		return "["+hX+","+hY+"]";
	}
	
	//get set for X
	public int getXcor() {
		return xcor;
	}
	public void setXcor(int xcor) {
		this.xcor = xcor;
	}
	
	//get set for Y
	public int getYcor() {
		return ycor;
	}
	public void setYcor(int ycor) {
		this.ycor = ycor;
		if (ycor>hY){
			hY = ycor;
			hX = xcor;
		}
	}
	
	/*
	//compares two point to see if they are equal
	public boolean equals(Point p){
		if(ycor == p.getYcor() && xcor == p.getXcor())
			return true;
		else 
			return false;
	}
	*/
	
	// order specific method to see if the first point is higher then the second
	public boolean isHigher(Point p){
		if (ycor > p.getYcor())
			return true;
		else
			return false;
	}
	
	// order specific method to see if first point is left of second
	public boolean isLeftOf(Point p){
		if (xcor < p.getXcor())
			return true;
		else
			return false;
	}
	
	/*
	public double findLength(Point p){
		double x = Math.pow(xcor-p.getXcor(), 2);
		double y = Math.pow(ycor-p.getYcor(), 2);
		return Math.sqrt((x+y));
	}
	*/
	
	public String toString(){
		return "["+xcor+","+ycor+"]";
	}
}
