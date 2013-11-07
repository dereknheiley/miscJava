import java.util.Scanner;
/**
 * @author Derek Neil B00163969
 *
 */
public class On3 {
	public static void main(String[] args) {
		//variables
		Scanner keyboard = new Scanner(System.in);
	   	int n;
	    double num;
	    
	    System.out.print("Enter the size of each matrix: ");
	    n = keyboard.nextInt();
	    System.out.println("Enter the matrix element");
	    System.out.print("All elements of the matrices are assumed to be the same: ");
	    num = keyboard.nextDouble();
	    while(n>0){
		    
		    double[][] matrix1 = new double[n][n];
		    for (int i = 0; i < n; i++)
		      for (int j = 0; j < n; j++)
		        matrix1[i][j] = num;
	
		    double[][] matrix2 = new double[n][n];
		    for (int i = 0; i < n; i++)
		      for (int j = 0; j < n; j++)
		        matrix2[i][j] = num;
		    
		    
		    long startTime, endTime, executionTime;
			startTime = System.currentTimeMillis();
	
		 	double[][] resultMatrix = multiplyMatrix(matrix1, matrix2);
	
			endTime = System.currentTimeMillis();
			executionTime = endTime - startTime;
			
			System.out.println("Execution time: " + executionTime + " millisecs\n");
			
			System.out.print("Enter the size of each matrix: ");
		    n = keyboard.nextInt();
	    }
	    System.out.println("Done.");
	}

  /** The method for multiplying two matrices */
  public static double[][] multiplyMatrix(double[][] m1, double[][] m2){
	  double[][] m3 = new double[m1.length][m2[0].length];
	  for(int i=0; i<m3.length; i++)
		  for(int j=0; j<m3[i].length; j++)
			  m3[i][j] = m1[i][1]*m2[1][j] + m1[i][2]*m2[2][j] + m1[i][3]*m2[3][j];
	  return m3;
  }

}
