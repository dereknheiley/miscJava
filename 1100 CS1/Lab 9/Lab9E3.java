// Derek Neil
// Lab9 E3

import java.util.Scanner;		
public class Lab9E3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String n = keyboard.nextLine();
		System.out.print("Digits in Revers: ");
		int i = n.length();
		while( i>0 ){
			System.out.print(n.charAt(i-1)+" ");
			i--;
		}
  	}
}





