
public class ClockDisplayAMPM {

	//attributes
	private NumberDisplay hours;
	private NumberDisplay minutes;
	private NumberDisplay seconds;
	private String displayString;
	private final int ampmLim = 13;
	private final int hrLim = 24;
	private final int minLim = 60;
	private final int secLim = 60;
	
	//constructor
	public ClockDisplayAMPM(){
		hours = new NumberDisplay(hrLim);
		minutes = new NumberDisplay(minLim);
		seconds = new NumberDisplay(secLim);
	}
	public ClockDisplayAMPM(int h, int m, int s){
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
		if(hours.getValue() >= ampmLim && hours.getValue() <22)
			displayString = "0"+(hours.getValue()-12)+":"+minutes+":"+seconds+" PM";
		else if(hours.getValue() >= ampmLim && hours.getValue() >=22)
			displayString = ""+(hours.getValue()-12)+":"+minutes+":"+seconds+" PM";
		else if (hours.getValue() == 12)
			displayString = "12"+":"+minutes+":"+seconds+" PM";
		else if (hours.getValue() == 0)
			displayString = "12"+":"+minutes+":"+seconds+" AM";
		else
			displayString = ""+hours+":"+minutes+":"+seconds+" AM";
	}
}
