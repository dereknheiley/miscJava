import java.util.Scanner;
public class TestQm6 {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please type three letters: ");
		String s1 = keyboard.nextLine();
		char c1= s1.charAt(2), c2=s1.charAt(1), c3=s1.charAt(0);
		String s2=c1+c2+c3;
		System.out.println("The string is "+s1);
		System.out.print(s2);
	}
}