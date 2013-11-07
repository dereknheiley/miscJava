/**
 * @author Derek
 *	test out generic class Point
 */
public class PointTester
{
	public static void main(String[] args)
	{
		Point<Integer> point1 = new Point<Integer>(2,1);
		Point<Double> point2 = new Point<Double>(3.14, 0.005678);
		Point<String> point3 = new Point<String>("nevernever", "land");
		System.out.println(point1);
		System.out.println(point2);
		System.out.println(point3);
	}
	
}

