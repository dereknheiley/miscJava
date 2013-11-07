// Derek Neil
// Lab 12, Excersize 8

public class L12E8 {
	public static void main(String [] args){
		int[] A = {10, 12, 11, 9, 7};
		System.out.print("{");
		for (int index = 0; index < A.length; index++){
			System.out.print(A[index]);
			if (index < A.length-1)
				System.out.print(", ");
		}
		System.out.print("}");
	}
}