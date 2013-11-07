// Derek Neil
// Asign4 Q2B

import java.util.Scanner;
import java.util.Random;
public class GuessNumbers2 {
	public static void main(String[] args) {
		Random randomNumbers = new Random();
		Scanner keyboard = new Scanner(System.in);
		String correct = "n", hint = "";
		int guessCounter=0, max=9, min=1, guess=0;
		System.out.println("Please pick a number between 1-10, and I, the computer will guess it.\n");
		while ( !correct.equals("y")){
			guessCounter ++;
			guess = randomNumbers.nextInt(max-min+1) + min;
			System.out.print("Is the number " + guess + " ? ");
			correct = keyboard.nextLine();
			if (!correct.equals("y")){
				System.out.print("Is my guess larger or smaller than your number? ");
				hint = keyboard.nextLine();
				if(hint.equals("smaller"))
					min = guess+1;
				else if(hint.equals("larger"))
					max = guess-1;
			}
		}
		System.out.print("I got your number "+guess+" in "+ guessCounter + " guess(es)");
  	}
}





