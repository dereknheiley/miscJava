// Derek Neil
// Lab 10, Excersize 8

public class L11E8 {
	public static void main(String [] args){
		boolean result = hasMidpoint(1,2,4);
		System.out.println(result);
	}
	public static boolean hasMidpoint(int min, int mid, int max) {
		return ( (double)(max-min)/2 +min == mid );
	}
}