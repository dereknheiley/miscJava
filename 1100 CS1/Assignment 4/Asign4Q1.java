// Derek Neil
// Asign4 Q1

//import java.util.Scanner;
		// Scanner keyboard = new Scanner(System.in);
		
public class A4Q1 {
	public static void main(String[] args) {
		long dayCounter=1;
		double speedPerDay = 6., ropeLength=200., ropeStretchPerDay=100.;
		double distanceFromEnd= ropeLength-speedPerDay;
		System.out.print("Day = " + ((long)dayCounter / 1000000)+ " Million. ");
		System.out.println("Distance from end = " + ((long)distanceFromEnd / 1000000) + " Million meters.");
		while ( distanceFromEnd > 0 ){
		
			dayCounter ++;
			ropeLength += ropeStretchPerDay;
			distanceFromEnd = ropeLength/( ropeLength - ropeStretchPerDay ) *distanceFromEnd - speedPerDay;
			
			// Selective output at every million days
			if ( dayCounter % 1000000 == 0 ){
				System.out.print("Day = " + ((long)dayCounter / 1000000)+ " Million. ");
				System.out.println("Distance from end = " + ((long)distanceFromEnd / 1000000) + " Million meters.");
			}
		}
		System.out.println("When the worm crawls "+ (int)speedPerDay + " meters per day:");
		System.out.print("the worm reaches the end of the rope on day = "+ dayCounter);
  	}
}





