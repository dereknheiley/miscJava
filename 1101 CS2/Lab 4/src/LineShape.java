
public class LineShape extends ShapeBasics{
	
	//Constructor
	public LineShape(){
	}
	
	//set method
	public void setOffset(int offset){
		super.setOffset(offset);
	}
	
	//draw vertical
	public void drawVertical(int l){
		for(int i=1; i<=l; i++){
			super.drawHere();
			super.skipLines(1);
		}
	}
	
	//draw horizontal
	public void drawHorizontal(int l){
		super.drawHere();
		for(int i=1; i<l; i++){
			super.drawStar();
		}
	}
}
