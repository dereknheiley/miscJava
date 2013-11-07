
public class LineTest {
	public static void main(String[] args){
		
		//test out some o the LineShape methods
		LineShape ls1 = new LineShape();
		ls1.drawHere();
		ls1.drawHere();
		
		System.out.println();
		
		ls1.drawHorizontal(5);
		System.out.println();
		ls1.setOffset(3);
		ls1.drawVertical(4);
		
	}
}
