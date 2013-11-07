/**
 * @author Derek
 * process class for creating an object with int id, time units required
 * priority and arrival time. Implements comparable, and toString is tabbed.
 */
public class Process implements Comparable<Process>{

	//instance variables
	private int id=0;
	private int unitsReq=1;
	private int priority=10;
	private int arrival=0;
	
	//constructor
	public Process(int i, int u, int p, int a){
		id=i;
		unitsReq=u;
		priority=p;
		arrival=a;
	}
	
	//comparison
	public int compareTo(Process p){
		int other = p.getPriority();
		if(priority==other)
			return 0;
		if(priority<other)
			return-1;
		else 
			return 1;
	}
	
	//toString to print process
	public String toString(){
		return ""+id+"\t"+unitsReq+"\t\t"+priority+"\t\t"+arrival;
	}
	
	//set & get methods
	public int getId() {
		return id;
	}
	public int getUnitsReq() {
		return unitsReq;
	}
	public void setUnitsReq(int u) {
		if(u>=0)
			unitsReq = u;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getArrival() {
		return arrival;
	}
	
}
