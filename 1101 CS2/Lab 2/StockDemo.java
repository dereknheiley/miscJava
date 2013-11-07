import java.util.Scanner;   
public class StockDemo {
   
      public static void main(String[] args) {
      
      //setup variables & scanner
  		Scanner keyboard = new Scanner(System.in);
  		String sym1, sym2;
  		double prc1, prc2;
  		double totalval;
  		int sh1, sh2;
  		
  		//get the values for two stocks
  		System.out.print("Enter the symbols for the two stocks: ");
  		sym1 = keyboard.next();
  		sym2 = keyboard.next();
  		System.out.print("Enter their prices: ");
  		prc1 = keyboard.nextDouble();
  		prc2 = keyboard.nextDouble();
  		System.out.print("Enter the number of shares for the two stocks: ");
  		sh1 = keyboard.nextInt();
  		sh2 = keyboard.nextInt();
  		
  		//create Stocks
  		Stock s1 = new Stock(sym1,prc1,sh1);
  		Stock s2 = new Stock(sym2,prc2,sh2);
  		
  		//display stock information
  		System.out.println("I have the following stocks: ");
  		System.out.println(s1);
  		System.out.println(s1.getSymbol()+" Value: $"+s1.getValue());
  		System.out.println(s2);
  		System.out.println(s2.getSymbol()+" Value: $"+s2.getValue());
  		
  		//compare stocks
  		System.out.print("The value of ");
  		if(s1.compare(s2) == 0)
  			System.out.println("both stocks are the same at $"+s1.getValue());
  		else{
  			if (s1.compare(s2) == 1)
  				System.out.print(s1.getSymbol());
  			else
  				System.out.print(s2.getSymbol());
  			System.out.print(" is higher than ");
  			if(s1.compare(s2) == 1)
  				System.out.print(s2.getSymbol());
  			else
  				System.out.print(s1.getSymbol());
  			System.out.println(" by $"+s1.absDifference(s2));
  		}
  		
  		//calculate total value & print to finish
  		totalval = s1.getValue() + s2.getValue();
  		System.out.println("The total value of my portfolio is $"+totalval);
  		System.out.print("\nProcess completed.");
  		
      }
   
   }
