// Derek Neil
// Lab 10 E5

//import java.util.Scanner;
		// Scanner keyboard = new Scanner(System.in);
		

public class L10E5 {
   public static void main(String[] args) {
      drawHex(40,Bot.RED);
   }
	public static void drawHex(int sideLength, int color){
      for (int i=1; i<=6; i++){
			Bot.setc(color);
         Bot.fd(sideLength);
         Bot.rt(360/6);
      }
  }
}








