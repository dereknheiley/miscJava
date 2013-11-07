// Derek Neil
// Lab 4 Ex2

import java.util.Scanner
public class Lab3Ex2{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double lab1, lab2, Total, Average;
		System.out.println("Please type a mark for lab 1: ")
		lab1 = keyboard.nextDouble();
		System.out.println("Please type a mark for lab 2: ")
		lab2 = keyboard.nextDouble();
		Total = lab1 + lab2;
		Average = Total / 2;
		System.out.println("Total: "+Total);
		System.out.println("Average: "+Average);
		System.out.println("Percentage: "+(Average/100)"%");
  }
}





