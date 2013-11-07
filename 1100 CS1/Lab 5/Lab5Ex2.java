// Derek Neil
// Lab 5 Ex2

import java.util.Scanner;
public class Lab5Ex2{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please input the first double ");
		double n1 = keyboard.nextDouble();
		System.out.print("Please input the second double ");
		double n2 = keyboard.nextDouble();
		System.out.print("Please input the third double ");
		double n3 = keyboard.nextDouble();
		System.out.print("The sum of "+ n1 + " and " + n2 + " is " + (n1+n2) + " which is");
		if ( n1+n2 <= n3) {
			System.out.print(" not");
			}
		System.out.print(" greater than "+ n3 );
  }
}





