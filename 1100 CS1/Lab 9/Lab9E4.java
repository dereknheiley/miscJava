// Derek Neil
// Lab9 E4

import java.util.Scanner;
import java.util.Random;		
public class Lab9E4 {
	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();
		
		System.out.println("I, the computer, had picked a number between 1-10. Please\nguess what number it is.\n");
		System.out.print(" Your guess ? ");
		int n = keyboard.nextInt(), count=1;		
		int r = randomNumber.nextInt(10);
		while( n!=r ){
			System.out.print(" Sorry. Try again.\n Your guess ? ");
			n = keyboard.nextInt();
			count ++;
		}
		System.out.print("Great! You got the number "+ r +" in " + count + " guesses.");
  	}
}





