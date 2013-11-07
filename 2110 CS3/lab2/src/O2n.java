import java.util.Scanner;

/**
 * @author Derek Neil B00163969
 *
 */
public class O2n {
	public static void main(String[] args) {
		//variables
		Scanner keyboard = new Scanner(System.in);
	   	int n;
	    
	    System.out.print("Enter the value of n: ");
	    n = keyboard.nextInt();
	    while(n>0){
		    
	    	long startTime, endTime, executionTime;
			startTime = System.currentTimeMillis();
	
		 	int b = (int)Math.pow(2, n);
			for(int i=1; i<=b; i++){
				String sb = Integer.toBinaryString(i);
			}
	
			endTime = System.currentTimeMillis();
			executionTime = endTime - startTime;
			
			System.out.println("Execution time to generate 2^"+n+" binary numbers: " + executionTime + " millisecs\n");
			
			System.out.print("Enter the value of n: ");
		    n = keyboard.nextInt();
	    }
	    System.out.println("Done.");

	}

}
