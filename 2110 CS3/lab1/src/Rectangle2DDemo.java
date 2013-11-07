/**
 * @author Derek
 *	test out Rectangle2D class with some values
 */
public class Rectangle2DDemo
{
	public static void main(String[] args)
	{
		Rectangle2D rect1, rect2,rect3;
		rect1 = new Rectangle2D(100,100,14,12);
		rect2 = new Rectangle2D(110,110,15,50);
		rect3 = new Rectangle2D(110,110,50,15);
		
		if (rect1.contains(rect2))
			System.out.println(rect1 + " contains " + rect2);
		if (rect1.overlaps(rect2))
			System.out.println(rect1 +  " overlaps " + rect2);
		
		if (rect2.contains(rect1))
			System.out.println(rect2 + " contains " + rect1);
		if (rect2.overlaps(rect1))
			System.out.println(rect2 + " overlaps " + rect1);
		
		if (rect1.contains(rect3))
			System.out.println(rect1 + " contains " + rect3);
		if (rect1.overlaps(rect3))
			System.out.println(rect1 + " overlaps " + rect3);
		
		if (rect3.contains(rect1))
			System.out.println(rect3 + " contains " + rect1);
		if (rect3.overlaps(rect1))
			System.out.println(rect3  + " overlaps " + rect1);
		
		if (rect2.contains(rect3))
			System.out.println(rect2 + " contains " + rect3);
		if (rect2.overlaps(rect3))
			System.out.println(rect2 +  " overlaps " + rect3);
		
		if (rect3.contains(rect2))
			System.out.println(rect3 + " contains " + rect2);
		if (rect3.overlaps(rect2))
			System.out.println(rect3 +  " overlaps " + rect2);
	}
}//end Rectangle2DDemo class
