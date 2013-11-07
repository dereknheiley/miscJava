import java.util.Scanner;

/**
 * @author Derek
 *	test class for MyString class
 */
public class Jumble {
	public static void main(String[] args) {
		//create instance of scanner for input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the word: ");
		MyString ms = new MyString(keyboard.next());
		System.out.print("Enter the number of jumbled versions required: ");
		int n = keyboard.nextInt();
		//create the number of permutations user wants
		for(int i=0; i<n; i++){
			System.out.println(ms.permuted());
		}
	}
}//end Jumble class
