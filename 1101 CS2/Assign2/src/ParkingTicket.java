
public class ParkingTicket {

	private ParkedCar illegal;
	private int fine=25;
	private String offName;
	private int offBadgeNum;
	
	//constructors
	public ParkingTicket(ParkingMeter m, PoliceOfficer p){
			illegal = m.getCar();
			offName = p.getOffName();
			offBadgeNum = p.getOffBadgeNum();
			if(m.getStatus() < -60)
				fine += m.getStatus()/(-60)*10;
	}
	public ParkingTicket(ParkingMeter m, String n, int b){
		illegal = m.getCar();
		offName = n;
		offBadgeNum = b;
		if(m.getStatus() < -60)
			fine += m.getStatus()/(-60)*10;
	}
	
	public String toString(){
		return illegal+"\nOfficer Name: "+offName+"\tBadge Number: "+offBadgeNum+"\nFine Amount: $"+fine;
	}
	
}
