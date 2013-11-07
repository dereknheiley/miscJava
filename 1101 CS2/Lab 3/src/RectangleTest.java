
public class RectangleTest {
	public static void main(String[] args) {
		
		//Part a
		//create rectangle using direct coordinates
		Rectangle2D r1 = new Rectangle2D(10,4,14,7);
		System.out.print(r1);
		
		//Part b
		//create point to test contains method
		Point p1 = new Point(12,6);
		System.out.print("\n\nThe rectangle ");
		if(r1.contains(p1))
			System.out.print("contains ");
		else
			System.out.print("does not contain ");
		System.out.print("the point "+p1);
		//Another part b
		//another test of the contains method
		Point p2 = new Point(9,6);
		System.out.print("\n\nThe rectangle ");
		if(r1.contains(p2))
			System.out.print("contains ");
		else
			System.out.print("does not contain ");
		System.out.print("the point "+p2);
	
		//part c
		//create another rectangle to test contains with rectangle input
		Rectangle2D r2 = new Rectangle2D(8,3,15,8);
		Rectangle2D r3 = new Rectangle2D(10,4,14,9);
		System.out.print(r1);
		System.out.print("\n\nThe rectangle ");
		if(r2.contains(r3))
			System.out.print("contains ");
		else
			System.out.print("does not contain ");
		System.out.print("the rectangle\n"+r2);
		//another part c
		Rectangle2D r4 = new Rectangle2D(9,5,13,7);
		System.out.print(r1);
		System.out.print("\n\nThe rectangle ");
		if(r2.contains(r4))
			System.out.print("contains ");
		else
			System.out.print("does not contain ");
		System.out.print("the rectangle\n"+r2);
		
	}

}
