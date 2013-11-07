import java.util.Random;
public class Checkers{
	public static void main(String[] args){
		
		//setup variables and random num r
		Random r = new Random();
		int n = 8; //rows and columns
		int[][] a = new int[n][n];
		int i,j, sum=0;
		
		//fills board with random 1's and 0's
		for(i=0; i<n;i++)
			for (j=0;j<n; j++)
				a[i][j]= r.nextInt(2);
		
		//print board
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println();
		
		//horizontal check
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
				sum+=a[i][j];
			if(sum == 0){
				System.out.println("Check: All 0's on horizontal");
				break;
			}
			else if(sum == 8){
				System.out.println("Check: All 1's on horizontal");
				break;
			}
			else sum = 0;
		}
		
		//vertical check
		sum =0;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++)
				sum+=a[j][i];
			if(sum == 0){
				System.out.println("Check: All 0's on vertical");
				break;
			}
			else if(sum == 8){
				System.out.println("Check: All 1's on vertical");
				break;
			}
			else sum = 0;
		}
		
		//diagonal check
		sum =0;
		for(i=0;i<n;i++)
			sum+=a[i][i];
		if(sum == 0)
			System.out.println("Check: All 0's on diagonal");
		else if(sum == 8)
			System.out.println("Check: All 1's on diagonal");
		
		//subdiagonal check
		sum =0;
		for(i=0;i<n;i++)
			sum+=a[n-1-i][i];
		if(sum == 0)
			System.out.println("Check: All 0's on subdiagonal");
		else if(sum == 8)
			System.out.println("Check: All 1's on subdiagonal");
		
	}
}