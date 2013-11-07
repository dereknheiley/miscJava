/**
 * @author Derek
 * demonstration of cpu handling a heap of processes
 * that are loaded at various different times with
 * different run lengths and priorities
 */
import java.io.File;
import java.util.Scanner;
import java.io.*;
public class CPUdemo {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		try{
			Scanner inputFile = new Scanner(new File("processes.txt"));
			Heap<Process> processQ = new Heap<Process>();//store current processes by priority
			
			System.out.print("Number of cycles the CPU \"holds on to\" each process: ");
			CPU cpu = new CPU(key.nextInt(), processQ); //specify cycles in CPU constructor
			
			int time=1; //"time"
			int nextTime=0; //holder for next's time of arrival, just to save some method calls
			Process next;//holder for next process that has been read from file
			//get CPU processes from file
			loadingProcesses: while (inputFile.hasNextInt()){
				next = new Process(
						inputFile.nextInt(),//processID
						inputFile.nextInt(),//TimeUnitsRequired
						inputFile.nextInt(),//Priority
						nextTime=inputFile.nextInt() //Time of Arrival
						);
				//add to processQ heap until nextTime is greater then current time
				if(nextTime==time){
					processQ.add(next);
					continue loadingProcesses;
				}
				else if(nextTime<time){
					System.out.println("Can't have negative arrival time!");
					System.exit(0);
				}
				//else run the cpu until next's arrival time is here
				while(nextTime!=time){
					cpu.go();
					time++;
				}
				processQ.add(next);
			}
			//continue processing in loop until out of processes
			while(!processQ.isEmpty() || !cpu.isSleeping()){
				cpu.go();//run another cycle on the cpu
				time++;
			}

		}catch(IOException e){
			System.out.println("File Not Found!");
		}
		System.out.print("\nDone");
	}
}
