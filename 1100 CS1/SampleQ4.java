// Derek Neil
// Sample Q4

import java.util.Scanner;
public class SampleQ4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = keyboard.nextInt(), big = 0;
		for ( int i=2; i<n; i+=2 ){
			if( n % i == 0)
				big = i;
			}
		System.out.print("The biggest even factor is: "+big);		
  	}
}





