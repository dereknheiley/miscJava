// Derek Neil
// Asign4 Q1 alternate seconds interval
		
public class Asign4Q1b {
	public static void main(String[] args) {
		int dayCounter=1;
		double speedPerDay = 5.0, ropeLength=100.0, ropeStretchPerDay=100.0;
		double distanceFromEnd = ropeLength-speedPerDay/3600;
		System.out.print("Day = " + ((long)dayCounter / 1000000)+ " Million. ");
		System.out.println("Distance from end = " + ((long)distanceFromEnd / 1000000) + " Million meters.");
		while ( distanceFromEnd > 0 ){
			for ( int days=0; days<=1000000; days++) {
				dayCounter ++;
				for (int seconds=0; seconds <=3600; seconds++) {
					ropeLength += ropeStretchPerDay/3600;
					distanceFromEnd = ropeLength/( ropeLength - ropeStretchPerDay/3600 ) *distanceFromEnd - speedPerDay/3600;
				}
			}
			System.out.print("Day = " + ((long)dayCounter / 1000000)+ " Million. ");
			System.out.println("Distance from end = " + ((long)distanceFromEnd / 1000000) + " Million meters.");	
		}
		System.out.println("When the worm crawls "+ speedPerDay + " meters per day:");
		System.out.print("the worm reaches the end of the rope on day = "+ dayCounter);
  	}
}





