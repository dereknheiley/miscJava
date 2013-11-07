// Derek Neil
// Lab 12, Excersize 10

import.java.util.scanner;
public class L12E10 {
	public static void main(String [] args){
		Scanner keyboard = new Scanner(System.n);
		String[] numbers = {"ZERO", "ONE", "TWO", "THREE", 
			"FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
		int n = keyboard.nextInt();
		while ( n >= 0| n<10 )
			System.out.println(numbers[n]);
		System.out.print("BYE");
	}
}