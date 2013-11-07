
public class ShapeTest {
	public static void main(String[] args) {
		
		//draw a couple things using the ShapeBasics Class
		ShapeBasics sb1 = new ShapeBasics();
		sb1.drawHere();
		sb1.drawHere();
		sb1.drawHere();
		
		System.out.println();
		
		sb1.setOffset(5);
		sb1.drawHere();
		sb1.skipSpaces(5);
		sb1.drawHere();
		sb1.skipLines(2);
		sb1.drawHere();

	}
}
