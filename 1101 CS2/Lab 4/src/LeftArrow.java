
public class LeftArrow extends LineShape{
	
	//attributes
	private int length;
	private int width=3;
	
	//Constructor
	public LeftArrow(int length, int width){
		this.length = length;
		this.width = this.isOdd(width) ? width : width++;
	}
	
	public static boolean isOdd(int n){
		if(n%2 != 0)
			return true;
		else
			return false;
	}
	
	//set offset
	public void setOffset(int offset){
		super.setOffset(offset);
	}
	
	//inserts offset before skipSpaces
	public void offsetThenSkipSpaces(int length){
		super.skipSpaces(super.getOffset());
		super.skipSpaces(length);
	}
	
	//draws arrow
	public void drawHere(){
		
		int mid = (width-1)/2+1;
		int cut = mid;
		//draw top star
		offsetThenSkipSpaces(mid);
		super.drawStar();
		System.out.println();
		
		//draw middle stars
		
		for(int i=0 ; i<width; i++){
			cut--;
			//check if it's tail line
			if( i+2 == mid)
				super.drawHorizontal(length);
			else
				offsetThenSkipSpaces(length);
			super.drawStar();
			if(i+2 <= mid)
				super.skipSpaces(i);
			else if (i+2 > mid)
				super.skipSpaces(cut);
			super.drawStar();
			System.out.println();
			
		}
		
		//draw bottom star
		offsetThenSkipSpaces(mid);
		super.drawStar();
	}
	
}
