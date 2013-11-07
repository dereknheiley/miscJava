// Derek Neil
// Lab 5 Ex1

import java.util.Scanner;
public class Lab5Ex1{
	public static void main(String[] args){
		System.out.print("Welcome to Bill Calculator!");
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Price of the appetizer? ");
		double app = keyboard.nextDouble();
		System.out.print("Price of the main dish? ");
		double entre = keyboard.nextDouble();
		System.out.print("Price of the desert? ");
		double desert = keyboard.nextDouble();
		System.out.print("Tip rate? ");
		double tipRate = keyboard.nextDouble();
		double subtotal = app + entre + desert;
		double tax = subtotal * 15 / 100;
		double tip = subtotal * tipRate / 100;
		System.out.println("\nSubtotal: "+ subtotal );
		System.out.println("Tax: "+ tax );
		System.out.println("Tip: "+ tip );
		System.out.println("Total: "+ (subtotal+tax+tip) );
  }
}





