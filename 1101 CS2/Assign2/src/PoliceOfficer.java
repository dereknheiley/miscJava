
public class PoliceOfficer {

	private String offName;
	private int offBadgeNum;
	
	//constructor
	public PoliceOfficer(String n, int b){
		offName = n;
		offBadgeNum = b;
	}

	//get methods for police officer only
	public String getOffName() {
		return offName;
	}

	public int getOffBadgeNum() {
		return offBadgeNum;
	}
	
	//checks if car is present and time is run out on meter
	public boolean isExpired(ParkingMeter m){
		if(m.getStatus() <= 0 && m.getCar().getMake() != "null")
			return true;
		else
			return false;
	}
	
	//issues ticket for a given meter
	public ParkingTicket issueTicket(ParkingMeter m){
		ParkingTicket t = new ParkingTicket(m, offName, offBadgeNum);
		return t;
	}
	
	//toString
	public String toString(){
		return "Officer Name: "+offName+"\tBadge Number: "+offBadgeNum;
	}
	
}
