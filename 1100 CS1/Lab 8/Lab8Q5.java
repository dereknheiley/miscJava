// Derek Neil
// lab8 q5

import java.util.Scanner;
public class Lab8Q5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str1 = keyboard.nextLine();
		System.out.print("String in reverse: ");
		int i = str1.length() -1;
		while (i >= 0) {
			System.out.print(str1.charAt(i)); 
			i--;
			}
  	}
}





