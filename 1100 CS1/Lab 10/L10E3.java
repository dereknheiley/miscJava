// Derek Neil
// Lab 10 E3

//import java.util.Scanner;
		// Scanner keyboard = new Scanner(System.in);

		
public class L10E3 {
	public static void main(String [] args){
     String paper = "smile";
     String pen = "book";
     String heart = "smile";
     String smile = "book";
     touch(paper, pen);
     touch(heart, smile + pen);
   }
   public static void touch(String str1, String str2){
      System.out.println("Touch my " + str1 + " with your " + str2);
   }
}







