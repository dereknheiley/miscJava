
public class ClockDisplay {

	//attributes
	private NumberDisplay hours;
	private NumberDisplay minutes;
	private NumberDisplay seconds;
	private String displayString;
	private final int hrLim = 24;
	private final int minLim = 60;
	private final int secLim = 60;
	
	//constructor
	public ClockDisplay(){
		hours = new NumberDisplay(hrLim);
		minutes = new NumberDisplay(minLim);
		seconds = new NumberDisplay(secLim);
	}
	public ClockDisplay(int h, int m, int s){
		hours = new NumberDisplay(hrLim);
		minutes = new NumberDisplay(minLim);
		seconds = new NumberDisplay(secLim);
		setTime(h,m,s);
	}
	
	//increments value of minutes and updates hours accordingly
	public void timeTick(){
		seconds.increment();
		if(seconds.getValue() == 0){
			minutes.increment();
			if(minutes.getValue() == 0)
				hours.increment();
		}
		updateDisplay();
	}
	
	//set time of the display to specified hour and minute
	public void setTime(int h, int m, int s){
		hours.setValue(h);
		minutes.setValue(m);
		seconds.setValue(s);
		updateDisplay();
	}
	
	//toString
	public String toString(){
		return displayString;
	}
	
	//updates internal string that represents the display
	private void updateDisplay(){
		displayString = ""+hours+":"+minutes+":"+seconds;
	}
}
