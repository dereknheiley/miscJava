// Derek Neil
// Lab 10 E7

import java.util.Scanner;
class CalculatorTester {
  public static void main(String[] arg) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Please type a radius: ");
    double rad = keyboard.nextDouble(); 
    double area = calcArea(rad);
    System.out.println("Circle radius: " + rad + "   area: " + area);
  }

// Define method here.
	public static double calcArea (double rad){
		double area = 3.14 * Math.pow(rad,2);
		return area;
	}
}









