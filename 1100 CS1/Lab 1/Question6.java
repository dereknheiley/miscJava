// Derek Neil
// mock mid term question 6

import java.util.Scanner;
public class Question6 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please type a string of 1 letter: ");
		String s1 = keyboard.nextLine();
		String s2 = s1.toLowerCase().substring(0,1);
		if (s2.equals("a")||s2.equals("e")||s2.equals("i")||s2.equals("o")||s2.equals("u"))
			System.out.print("vowel");
		else
			System.out.print("noun");
  	}
}





