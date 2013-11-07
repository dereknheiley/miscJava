
public class Circle extends Shape{

	//attributes
	private double radius;
	
	//constructor
	public Circle(double r){
		radius =r;
		setArea(Math.PI*r*r);
	}
	
	//set and gets
	public void setRadius(double r){
		radius = r;
	}
	public double getRadius(){
		return radius;
	}
	
	//compares two circles
	
	
	//toString
	public String toString(){
		return "Radius: "+radius+"\nArea: "+getArea();
	}
	
}
