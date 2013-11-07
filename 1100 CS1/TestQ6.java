import java.util.Scanner;
public class TestQ6 {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = keyboard.nextInt();
		System.out.print("The factors are: ");
		for (int i=1; i<=num; i++){
			if (num % i==0)
				System.out.print(i + " ");
		}
	}
}