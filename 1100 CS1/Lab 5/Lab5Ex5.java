// Derek Neil
// Lab 5 Ex5

import java.util.Scanner;
public class Lab5Ex5{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please input the province code: ");
		int n1 = keyboard.nextInt();
		if ( n1 <= 4) {
			System.out.print("You have chosen ");
			if ( n1 == 1 ) {
				System.out.print("Nova Scotia");
				}
			if ( n1 == 2 ) {
				System.out.print("New Brunswick");
				}
			if ( n1 == 3 ) {
				System.out.print("Prince Edward Island");
				}
			if ( n1 == 4 ) {
				System.out.print("Newfoundland and Labrador");
				}
			}
		else {
			System.out.print("Not valid input.");
			}
  }
}





