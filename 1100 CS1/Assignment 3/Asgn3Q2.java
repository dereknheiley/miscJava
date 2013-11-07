// Derek Neil
// asgn3 q2
// lottery game

import java.util.Random;
import java.util.Scanner;
public class Asgn3Q2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random randomNumbers = new Random();
		
		System.out.println("Welcome to Supper Lottery!");
		int winnings = 0;
		
		// ten games
		for ( int i=1 ; i <= 10 ; i++) {
		
			// generate two distinct lottery numbers
			int r01 = randomNumbers.nextInt(10), r02 = randomNumbers.nextInt(10);
			String r1 = r01+"", r2 = r02+""; 
			
			// input double digit guess to be compared to random numbers
			System.out.print("What is your guess? ");
			String n0 = keyboard.nextLine();
			String n1 = n0.substring(0,1), n2 = n0.substring(1);
			
			// winning criteria
			if ( n1.equals(r1) && n2.equals(r2) ){
				System.out.println("You win the jackpot!"); 
				winnings += 1000;
				}
			else if ( n1.equals(r2) && n2.equals(r1) ){
				System.out.println("You win 100 dollars!"); 
				winnings += 100;
				}
			else if ( n1.equals(r1)||n1.equals(r2)||n2.equals(r1)||n2.equals(r2) ){
				System.out.println("You win 50 dollars!"); 
				winnings += 50;
				}
				
			System.out.println("The Jackpot number is "+r1+r2);
			
			// display until last game
			if (10-i>0)
				System.out.println("Let's play again. You have "+(10-i)+" chance(s) left\n");
			}
			
		System.out.println("Game over!\n");
		
		// payout if any
		if ( winnings >0 )
			System.out.println("You have won "+winnings+" dollars.");
  	}
}





