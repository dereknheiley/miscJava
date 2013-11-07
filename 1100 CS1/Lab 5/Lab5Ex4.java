// Derek Neil
// Lab 5 Ex4

import java.util.Scanner;
public class Lab5Ex4{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please input 2 integers: ");
		int n1 = keyboard.nextInt();
		int n2 = keyboard.nextInt();
		System.out.print( n1 + " is");
		if ( n1/n2*n2 != n1) {
			System.out.print(" not");
			}
		System.out.print(" divisible by " + n2);
  }
}





