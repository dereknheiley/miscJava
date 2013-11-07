
public class NumberDisplay {

	//attributes
	private int limit;
	private int value;
	
	//constructor
	public NumberDisplay(int limit) {
		this.limit = limit;
	}
	
	//set and get for value attribute only
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		if(value >=0 && value < limit)
			this.value = value;
		else
			System.out.print("Not a valid value");
	}
	
	//increment increases value and rolls over 
	//once it reaches limit
	public void increment(){
		value++;
		if (value == limit)
			value =0;
	}
	
	//make sure output is in ## format
	public String toString() {
		if(value<10)
			return "0"+value;
		else 
			return ""+value;
	}
	
}
