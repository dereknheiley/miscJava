// Derek Neil
// asgn3 q1

import java.util.Scanner;
public class Asgn3Q1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please type an integer number: ");
		int n = keyboard.nextInt();
		int i;
		for ( i=0 ; i <= n-1 ; i++) {
			for ( int j=0 ; j < n-i ; j++)
				System.out.print("*");
			for ( int j=0 ; j < 2*i ; j++)
				System.out.print("#");
			for ( int j=0 ; j < n-i ; j++)
				System.out.print("*");
			System.out.println();
			}
		for ( i = i-1  ; i >=0 ; i--) {
			for ( int j=0 ; j < n-i ; j++)
				System.out.print("*");
			for ( int j=0 ; j < 2*i ; j++)
				System.out.print("#");
			for ( int j=0 ; j < n-i ; j++)
				System.out.print("*");
			System.out.println();
			}
  	}
}





