// Derek Neil
// lab8 q4

import java.util.Scanner;
public class Lab8Q4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please type ten numberes: ");
		int largest = 0, i=1;
		while (i<= 10) {
			int number = keyboard.nextInt();
			if ( number > largest )
				largest = number;
			i++;
			}
		System.out.println("The largest is: " + largest);
  	}
}





