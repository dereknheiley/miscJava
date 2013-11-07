
public class ParkingMeter {
	private ParkedCar car = new ParkedCar();
	private int minutes=0;
	
	//constructors
	public ParkingMeter(){
	}
	public ParkingMeter(ParkedCar c){
		car = c;
		minutes = 0;
	}
	public ParkingMeter(ParkedCar c, int m){
		car = c;
		minutes = m;
	}

	//returns the car currently parked at the meter
	public ParkedCar getCar() {
		return car;
	}
	
	//parks a car at the meter
	public void parkCar(ParkedCar c){
		car = c;
		addTime(0);
	}
	public void parkCar(ParkedCar c, int m){
		car = c;
		addTime(m);
	}
	public void driveAway(){
		car = new ParkedCar();
	}
	
	//resets negative time and add purchased time to positive balance
	public void addTime(int m){
		if(minutes <0)
			minutes = m;
		else
			minutes += m;
	}
	
	//this method is used in lieu of a timeTick method
	//and having to connect this whole package to a clock
	public void setElapsedTime(int m){
		minutes -= m;
	}
	
	//returns minute balance at meter
	public int getStatus() {
		if(car.getMake() == "null")
			return 0;
		else
			return minutes;
	}
	
}
