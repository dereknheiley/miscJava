import java.util.Scanner;

/**
 * @author Derek Neil B00163969
 *
 */
public class On2 {
	public static void main(String[] args) {
		//variables
		long startTime, endTime, executionTime;
		long result = 1;
		int n = 0;
		double x = 0;
		Scanner keyboard = new Scanner(System.in);
		
		//get parameters for polynomial
		System.out.print("Enter the degree of polynomial (n): ");
		n = keyboard.nextInt();
		System.out.print("Enter the value of x: ");
		x = keyboard.nextDouble();
		
		//run the program in a loop so i can check multiple values if i want
		while(n>0){
			
			startTime = System.currentTimeMillis();
			
			//compute the value
			for(int i=0; i<n; i++)
				result+=(long)Math.pow(x, i);
			endTime = System.currentTimeMillis(); 
			executionTime = endTime - startTime;
			
			//print executionTime
			System.out.println("n="+n+" time="+executionTime+"millisecs\n");
			
			System.out.print("Enter the degree of polynomial (n): ");
			n = keyboard.nextInt();
		}
		System.out.println("Done.");
	}
}
