// Derek Neil
// Lab 10, Excersize 7

public class L11E7 {
	public static void main(String[] args) {
		int x = 2;
		int y = 4;
		int z = 6;
		x = mystery(z, y, x);
		y = mystery(y, x, z);
		z = mystery(x, y, z);
		System.out.println("x:"+x+" y:" + y + " z:" + z);
	}
	
	public static int mystery(int x, int y, int z) {
		y++;
		x = y + z;
		return x;
	}
}
