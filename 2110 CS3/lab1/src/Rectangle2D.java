/**
 * @author Derek
 * Question 2
 */
public class Rectangle2D {
	//instance variables
	private int xpos, ypos, width, height;
	
	//Constructors
	public Rectangle2D(){
		xpos = 0;
		ypos = 0;
		width = 0;
		height = 0;
	}
	public Rectangle2D(int x, int y, int w, int h){
		xpos = x;
		ypos = y;
		width = w;
		height = h;
	}
	
	//getters and setters
	public int getXpos() {
		return xpos;
	}
	public void setXpos(int xpos) {
		this.xpos = xpos;
	}
	public int getYpos() {
		return ypos;
	}
	public void setYpos(int ypos) {
		this.ypos = ypos;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	//calculated attributes about Rectangles
	public int getArea(){
		return width*height;
	}
	public int getPerimeter(){
		return 2*width+2*height;
	}
	
	//comparison methods
	public boolean contains(int x, int y){
		return (xpos<=x && x<=(xpos+width))
				&&(ypos<=y && y<=(ypos+height));
	}
	public boolean contains(Rectangle2D r){
		return (contains(r.getXpos(), r.getYpos())
				&& width >= r.getWidth()+r.getXpos()-xpos
				&& height >= r.getHeight()+r.getYpos()-ypos );
	}
	public boolean overlaps(Rectangle2D r){
		if(contains(r) || r.contains(this))
			return false;
		else{
			return (contains(r.getXpos(), r.getYpos())
					|| contains(r.getXpos()+r.getWidth(), r.getYpos())
					|| contains(r.getXpos(), r.getYpos()+r.getHeight())
					|| contains(r.getXpos()+r.getWidth(), r.getYpos()+r.getHeight())
					|| r.overlaps(this));
		}
	}
	
	//toString method
	public String toString(){
		return "["+xpos+","+ypos+"] width= "+width+", height= "+height;
	}
}
