// Derek Neil
// Asign4 Q2

import java.util.Scanner;
import java.util.Random;
public class Asign4Q2 {
	public static void main(String[] args) {
		Random randomNumbers = new Random();
		Scanner keyboard = new Scanner(System.in);
		String correct = "n";
		int guessCounter =0;
		System.out.println("Please pick a number between 1-10, and I, the computer will guess it.\n");
		while ( !correct.equals("y")){
			guessCounter ++;
			System.out.print("Is the number " + (randomNumbers.nextInt(9)+1) + " ? ");
			correct = keyboard.nextLine();
		}
		System.out.print("I got your number in "+ guessCounter + " guess(es)");
  	}
}





