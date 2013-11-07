//RobotRace.java

public class RobotRace
{
	//attributes: two race tracks, two robots.
	private String[] track1;
	private String[] track2;
	private Robot robot1;
	private Robot robot2;
	
	//constructor: creates the two robots with the given names
	//places the robots in array position 0
	//fills the remaining array positions with Ò-Ò
	public RobotRace(String n1, String n2)
	{
		track1 = new String[50];
		track2 = new String[50];
		robot1 = new Robot(n1);
		robot2 = new Robot(n2);
		track1[0] = n1;
		for(int i=1;i<50;i++)
			track1[i]="-";
		track2[0] = n2;
		for(int i=1;i<50;i++)
			track2[i] = "-";
						
	}

	//sets track1[x] to a given value
	public void setTrack1(int x, String n)
	{
		track1[x] = n;
	}

	//resets track1[x] back to Ò-Ò
	//this method is useful when the robot moves from its current position
	public void resetTrack1(int x)
	{
		track1[x] = "-";
	}

	//sets track2[x] to a given value
	public void setTrack2(int x, String n)
	{
		track2[x] = n;
	}

	//resets track1[x] back to Ò-Ò
	//this method is useful when the robot moves from its current position
	public void resetTrack2(int x)
	{
		track2[x] = "-";
	}

	public void play()
	{
		display();
		//while neither robot has won, assuming =49 is a victory
		boolean running = true;
		while (running)
		{
			//robot and track 1
			resetTrack1(robot1.getX());
			robot1.move();
			setTrack1(robot1.getX(),robot1.getName());
	
			//robot and track 2
			resetTrack2(robot2.getX());
			robot2.move();
			setTrack2(robot2.getX(),robot2.getName());
			
			display();
			
			if(robot1.getX() == 49 | robot2.getX() == 49)
				running = false;
		} 
		
	}
	public void declareWinners()
	{
		//print if robot1 has won or robot2 has won or if both have won.
		//assuming =49 is a win
		if(robot1.getX() == 49 && robot2.getX() !=49)
			System.out.println(""+robot1.getName()+" wins");
		else if (robot1.getX() != 49 && robot2.getX() ==49)
			System.out.println(""+robot2.getName()+" wins");
		else if (robot1.getX() == 49 && robot2.getX() ==49)
			System.out.println(""+robot1.getName()+" and "+robot2.getName()+" both win");
	}
	public void display()
	{
		System.out.println("Track1: ");
		for(int i=0;i<50;i++)
			System.out.print(track1[i]);
		System.out.println();
			
		System.out.println("Track2: ");
		for(int i=0;i<50;i++)
		System.out.print(track2[i]);
		System.out.println("\n\n");
	}

}