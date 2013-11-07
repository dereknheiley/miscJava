/**
 * @author Derek
 * basic CPU class that takes in # cycles to hold a process,
 * and a Heap of processes to process. Main operation is done
 * by calling the cpu.go() function
 */
public class CPU {
	
	//instance variables
	private Heap<Process> processQ; //reference to same processQ in main class
	private Process activeProcess; //holder for active process once removed from processQ
	private int cycles; //cycles to "hold on to" process
	private int time=0; //has to start at zero so mod cycles works out
	
	//constructor
	public CPU(int c, Heap<Process> q){
		cycles=c;
		processQ=q;
	}

	//set and get methods to modify cycles "hold time" for cpu
	public int getCycles() {
		return cycles;
	}
	public void setCycles(int cycles) {
		this.cycles = cycles;
	}
	public boolean isSleeping(){
		if(activeProcess==null)
			return true;
		return false;
	}

	//process the data for one cycle
	public void go(){
		if(time%cycles==0){
			if(activeProcess==null && processQ.isEmpty())
				return;
			// release back to heap to sit in processing queue
			if(activeProcess!=null){
				if(activeProcess.getUnitsReq()>0 ){
					processQ.add(activeProcess);
					System.out.println("CPU requeuing process id: "+activeProcess.getId());
				}
				else
					System.out.println("CPU done process id: "+activeProcess.getId());
			}
			activeProcess=null;
			System.out.println("\nTime: "+(time+1));
			System.out.print(processQ); //print out heap before next is removed!
			//get next process based on priority
			if(!processQ.isEmpty()){
				activeProcess = processQ.deleteMax();
				System.out.println("CPU got new process id: "+activeProcess.getId());
				int remain = activeProcess.getUnitsReq();
				activeProcess.setUnitsReq(remain-1);
			}
		}
		else{
			System.out.println("\nTime: "+(time+1));
			System.out.print(processQ); //print out heap
			if(activeProcess==null)
				return;
			int remain = activeProcess.getUnitsReq();
			activeProcess.setUnitsReq(remain-1);
		}
		System.out.println(this); //print the cpu toString
		time++;
	}
	
	public String toString(){
		if(activeProcess!=null)
			return "CPU processing id: "+activeProcess.getId()+"  priority: "+activeProcess.getPriority()+"  units remaining: "+activeProcess.getUnitsReq();
		return "CPU sleeping";
	}
}
