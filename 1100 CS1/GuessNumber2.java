// Derek Neil
// break test

public class Breaktest {
	public static void main(String[] args) {
		int n = 7;
		for ( int i=0; i<=5; i++ ) {
			System.out.print("start inner loop "+i);
			for ( int j=0; j<=n; j++){
				System.out.print(j + " ");
			}
			System.out.println("end loop");
		}
		System.out.print();
		System.out.print("end");
  	}
}





