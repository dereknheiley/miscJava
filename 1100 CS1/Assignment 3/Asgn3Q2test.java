// Derek Neil
// asgn3 q2

import java.util.Scanner;
public class Asgn3Q2test {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Welcome to Supper Lottery!");
			
			// play game
			System.out.print("What is your guess? ");
			int n1 = keyboard.nextInt(0), n2 = keyboard.nextInt(1);
			System.out.println("n1 is "+n1);
			System.out.println("n2 is "+n2);
		}
	}