// Derek Neil
// Lab 10 E8

import java.util.Scanner;
public class MaxAndMin {
	public static void main(String[] arg) {
   	Scanner keyboard = new Scanner(System.in);
   	System.out.print("Please type three numbers: ");
   	double n1 = keyboard.nextDouble();
   	double n2 = keyboard.nextDouble();
		double n3 = keyboard.nextDouble();
		double min = calcMin(n1, n2, n3);
		System.out.println("The min of " + (int)n1 + ", " + (int)n2 + " and " + (int)n3 +" is " + (int)min);
	}
	public static double calcMin(double n1,double n2, double n3){
		double min =0;
		if (n1 < n2)
			if (n1 < n3)
				min = n1;
			else
				min = n3;
		else
			if ( n2 < n3)
				min = n2;
			else
				min = n3;
		return min;
	}
}










