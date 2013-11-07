// Derek Neil
// Lab 10 E1

//import java.util.Scanner;
		// Scanner keyboard = new Scanner(System.in);

		
public class L10E1 {
	public static void main(String[] args) {
		drawHex(50);
	}	
	public static void drawHex(int sideLength)	{
		for (int i=1; i<=6; i++){
			Bot.fd(sideLength);
			Bot.rt(360/6);
		}
  	}
}





