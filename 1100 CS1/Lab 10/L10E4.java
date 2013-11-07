// Derek Neil
// Lab 10 E4

//import java.util.Scanner;
		// Scanner keyboard = new Scanner(System.in);
		
public class L10E4 {
   public static void main(String[] args) {
      drawHex(75, Bot.BLUE);
   }
	public static void drawHex(int sideLength,String color){
      for (int i=1; i<=6; i++){
			color();
         Bot.fd(sideLength);
         Bot.rt(360/6);
      }
  }
}








