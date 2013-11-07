import java.util.Random;
public class MultiplyMatrices{
	
	//global variables
	private static int max = 9; //max random number
	private static int n = 3; //rows and columns
	private static Random r = new Random();
	private static int[][] a = new int[n][n];
	private static int[][] b = new int[n][n];
	
	
	//main method
	public static void main(String[] args){
		
		//fill arrays
		fillArray(a);
		fillArray(b);
		
		//print arrays
		printArray(a);
		printArray(b);
		
		//multiply arrays and print result
		System.out.println("Result:");
		printArray( multiplyMatrix(a,b) );
		
	}
	
	//fills board with random numbers between 0-max
	public static void fillArray(int[][] z){
		for(int i=0; i<n;i++)
			for (int j=0;j<n; j++)
				z[i][j]= r.nextInt(max);
	}
	
	//prints array
	public static void printArray(int[][] z){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
				System.out.print(z[i][j]+" ");
			System.out.println();
		}
		System.out.println();
	}
	
	//multiplies arrays
	public static int [][] multiplyMatrix(int[][] z, int[][] x){
		int [][] y = new int [n][n];
		//create array and fill with result
		for(int i=0; i<n;i++)
			for (int j=0;j<n; j++)
				y[i][j]= z[i][0]*x[0][j]+ z[i][1]*x[1][j]+ z[i][2]*x[2][j];
		return y;
	}
	
}