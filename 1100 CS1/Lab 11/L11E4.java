// Derek Neil
// Lab 10, Excersize 4

public class L11E4 {
	public static void main(String [] args){
		int result = sumBetween(2,8);
		System.out.println(result);
	}
	public static int sumBetween(int min, int max) {
		int sum = 0;
   	while (min<=max){
			sum += min;
			min ++;
		}
		return sum;
	}
}