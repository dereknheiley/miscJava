public class ShapeBasics
{
		//offset indicates how far it is indented from the left
		//edge of the screen
		private int offset;
		
		public ShapeBasics()
		{
			offset=0;
		}
		public ShapeBasics(int theOffset)
		{
			offset = theOffset;
		}
		public void setOffset(int newOffset)
		{
			offset = newOffset;
		}
		public int getOffset()
		{
			return offset;
		}
		//static method skipLines skips the given number of lines
		//down from the current one
		public static void skipLines(int lineNumber)
		{
			for(int count=0;count<lineNumber;count++)
				System.out.println();
		}
		//static method skipSpaces that skips the given number of spaces
		public static void skipSpaces(int number)
		{
			for(int count = 0; count<number; count++)
				System.out.print(' ');
		}
		//method drawHere draws the shape beginning at the current line
		public void drawHere()
		{
			skipSpaces(offset);
			System.out.print('*'); //changed from println to print
		}
		//method drawStar draws just a star, this is needed for horizontal lines
		public void drawStar(){
			System.out.print('*');
		}
}