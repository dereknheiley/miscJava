//Robot.java
import java.util.Random;
public class Robot
{
	
	//attributes: name and a position	
	private String name;
	private int xpos;
	
	//constructor
	public Robot(String n)
	{
		//set the name to the given value
		name = n;
		//set the xposition to 0
		xpos = 0;
	}
	
	//gets for the variables
	public int getX()
	{
		//get the xposition
		return xpos;
	}
	public String getName()
	{
		//get the name
		return name;
	}
	
	public void move()
	{
		//generate two random integers direction (0 or 1)
		//and numPlaces (0,1,2 or 3).
		Random r = new Random();
		int direction = r.nextInt(2);
		int numPlaces = r.nextInt(4);
		
		//if the direction is 0, decrement xpos by numPlaces
		//if it doesn’t go below 0
		if (direction == 0){
			if (xpos - numPlaces >= 0)
				xpos -= numPlaces;
			else
				xpos = 0;
		}
	
		//if the direction is 1, increment xpos by numPlaces
		//if it doesn’t go above 49.
		if(direction == 1)
		{
			if (xpos + numPlaces <= 49)
				xpos += numPlaces;
			else
				xpos = 49;
		}
			
	}
		
}