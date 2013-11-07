/**
 * @author Derek
 * 
 * After talking to Dr. Sampali, he advised i did
 * not have to re structure this lab with the given
 * data stucture for storing owners and jobIds together
 * 
 * Print queue demo with supporting methods
 * for printing & modifying demo queue
 */
import java.util.Scanner;
public class PrintQueue {
	//instance variables
	private Queue<String> owners;
	private Queue<Integer> jobIds;
	
	//constructorr
	public PrintQueue(){
		//instanciate the variables
		owners = new Queue<String>();
		jobIds = new Queue<Integer>();
	}
	
	//main method to run the program
	public static void main(String[] ars){
		
		Scanner keyboard = new Scanner(System.in);
		PrintQueue myPQ=new PrintQueue();
		String name;
		int id;
		
		//load print queue
		for(int i=1; i<=5; i++){
			System.out.print("Enter owner and id: ");
			name = keyboard.next().trim();
			id = keyboard.nextInt();
			myPQ.lpr(name, id);
		}
		
		System.out.println("\nPrint Queue");
		myPQ.lpq();
		myPQ.lprm(101);
		
		System.out.println();
		myPQ.lprmAll("davidh");
		
		System.out.println("\nPrint Queue");
		myPQ.lpq();
	}
	
	//enqueues a job with the specified owner name and jobId
	public void lpr(String owner, int jobId){
		owners.enqueue(owner);
		jobIds.enqueue(jobId);
	}
	//print all entries in this queue
	public void lpq(){
		if(!owners.isEmtry()){
			System.out.println(owners.first()+"\t"+jobIds.first());
			int n = owners.size()-1;
			for(int i=0; i<n; i++)
				System.out.println(owners.next()+"\t"+jobIds.next());
		}
	}
	//removes active job at front of queue if jobId matches
	public void lprm(int jobId){
		if(jobIds.peek()==jobId){
			jobIds.dequeue();
			owners.dequeue();
		}
		else
			System.out.println("JobId does not match front of queue");
	}
	//remove all jobs in queue matching this owner
	public void lprmAll(String owner){
		int i = -1;
		while((i=owners.positionOf(owner))!=-1){
			owners.removeAt(i);
			jobIds.removeAt(i);
		}
	}
}
