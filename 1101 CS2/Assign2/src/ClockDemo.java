
public class ClockDemo {
	public static void main(String[] args)throws InterruptedException {
		
		//intilize clock and print out started clock
		ClockDisplayAMPM bigClock = new ClockDisplayAMPM(11,59,54);
		System.out.println(bigClock);
		
		//run clock in demo looop
		// running accerrated (250ms) for demo purposes only
		for (int i=0; i<10; i++){
			Thread.sleep(250); 
			bigClock.timeTick();
			System.out.println(bigClock);	
		}

	}
}
