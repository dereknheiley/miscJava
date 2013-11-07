// Derek Neil
// Lab 12, Excersize 10

import java.util.Scanner;
public class L12E10 {
	public static void main(String [] args){
		Scanner keyboard = new Scanner(System.in);
		String[] numbers = {"ZERO", "ONE", "TWO", "THREE", 
			"FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
		System.out.print("Please Type a number between 0 and 9 (-1 to end): ");
		int n = keyboard.nextInt();
		while ( n >= 0 && n<10 ){
			System.out.println(n + " - " + numbers[n]);
			System.out.print("Please Type a number between 0 and 9 (-1 to end): ");
			n = keyboard.nextInt();
		}
		System.out.print("BYE");
	}
}