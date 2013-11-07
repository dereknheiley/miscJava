import java.util.Scanner; 
public class PointDemo {
	public static void main(String[] args){
		
	  //setup scanner & variables
		Scanner keyboard = new Scanner(System.in);
		Point [] points = new Point[4];
		double maxline=0, newline;
		int max =0;
		
	  //get the values for two stocks
		for (int i=0; i<4; i++){
			System.out.print("Enter the x and y coordinates for point"+(i+1)+": ");
			points[i] = new Point(keyboard.nextInt(),keyboard.nextInt());
		}
		
		//highest point
		System.out.println(points[0].highest()+" is the highest point.");
		
		//find and print lengths
		for(int i = 0; i<2; i++){
			newline = points[i].findLength(points[i+1]); 
			System.out.print("The length between "+points[i]+" and "+points[i+1]);
			System.out.println(" is "+newline);
			//store longest line
			if (newline>maxline){
				max = i;
				maxline = newline;
			}	
		}
		
		//print out longest line info
		System.out.print("Line from "+points[max]+" to "+points[max+1]+" is longer");
	}
}
