// Derek Neil
// lab8 q6

import java.util.Scanner;
public class Lab8Q6 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = keyboard.nextInt(), i = 1, fac = 0;
		while (i <= n) { 
			if(n % i == 0)
				fac++;
			i++;
			}
		System.out.print(n + " has " + fac + " factors");
  	}
}





