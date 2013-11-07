// Derek Neil
// Lab 10 E6

//import java.util.Scanner;
		// Scanner keyboard = new Scanner(System.in);
		

public class L10E6 {
   public static void main(String[] args) {
      drawHex(30,60);
   }
	public static void drawHex(int sideLength, int angle){
      for (int i=1; i<=360/angle; i++){
         Bot.fd(sideLength);
         Bot.rt(angle);
      }
  }
}








