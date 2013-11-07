// Derek Neil
// Sample Q5

import java.util.Scanner;
public class SampleQ5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the scores (end with -1): ");
		int i = keyboard.nextInt(), students = 0, passes = 0;
		while (i != -1){
			students++;
			if( i > 50)
				passes++;
			System.out.print("Enter the scores (end with -1): ");
			i = keyboard.nextInt();
			}
		System.out.println("Total number of students: "+students);	
		System.out.print("Number of passes: "+passes);	
  	}
}





