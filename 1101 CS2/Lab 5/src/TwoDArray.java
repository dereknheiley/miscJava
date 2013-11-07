import java.util.Scanner;
public class TwoDArray{
	public static void main(String[] args){
		int[][] a = new int[5][5];
		int i,j, sum=0;
		Scanner keyboard = new Scanner(System.in);
		for(i=0; i<5;i++)
			for (j=0;j<5; j++)
				a[i][j]= keyboard.nextInt();

		for(i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
				System.out.print(a[i][j] + "\t");
			System.out.println();
		}
		
		for(i=0;i<5;i++)
			for(j=0;j<5;j++)
				sum+=a[i][j];
		System.out.println("The sum of all elements is: " + sum);
	}
		
}