// Derek Neil
// Lab 12, Excersize 7

public class L12E7 {
	public static void main(String [] args){
		char[] letter = {'a' + 1, 'b' + 2, 'c' + 3, 'd' + 4, 'e' + 5};
		for (int index = 0; index < letter.length; index++)
			System.out.print(letter[index] + " ");
	}
}