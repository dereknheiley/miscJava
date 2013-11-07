// Derek Neil
// Lab 10, Excersize 1

// import java.util.Random;
// import java.util.Scanner;

public class L11E1 {
	public static void main(String[] arg) {
		int a[] = new int[5];
		a[0] = a[1] = a[2] = a[3] = a[4] = 2;
		a[0] = a[3] + 1;
		a[4] = a[0] + 1;
		System.out.println(a[0] + "\t" + a[1] + "\t" + a[2] + "\t" + a[3] + "\t" + a[4] + "\t");  
		a[a[3]] = 5;
		System.out.println(a[0] + "\t" + a[1] + "\t" + a[2] + "\t" + a[3] + "\t" + a[4] + "\t");  
		System.out.println(a[4] == a[2]-1);
	}
	
}