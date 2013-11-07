// Derek Neil
// lab8 q1

import java.util.Scanner;
public class Lab8Q1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please type ten numberes: ");
		int sum = 0, i=1;
		while (i <= 10) {
			int number = keyboard.nextInt();
			sum += number;
			i++;
			}
		System.out.println("The sum is: " + sum);
  	}
}





