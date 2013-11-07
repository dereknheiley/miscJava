// Derek Neil
// Lab 10, Excersize 5

public class L11E5 {
	public static void main(String [] args){
		boolean result = isBetween(2,6,7);
		System.out.println(result);
	}
	public static boolean isBetween(int min, int max, int mid) {
		return ( (min<mid) && (mid<max) );
	}
}