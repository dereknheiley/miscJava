
public class RectangleShape extends LineShape{
	
	//attributes
	private int height;
	private int width;

	//Constructor
	public RectangleShape(int offset, int width, int height){
		super.setOffset(offset);
		this.height = height;
		this.width = width;
	}
	
	//draws rectangle
	public void drawHere(){
		super.drawHorizontal(width);
		System.out.println();
		this.drawSides();
		super.drawHorizontal(width);
	}
	
	//draws sides only
	public void drawSides(){
		int sideLength = height-2;
		int insideSpace = (width-2) < 0 ? 0: (width-2);
		for (int i=1; i<=sideLength; i++){
			super.drawHere();
			super.skipSpaces(insideSpace);
			super.drawStar();
			System.out.println();
		}
	}
}
