import java.util.ArrayList;
import java.util.Scanner;
public class VirusTrackerDemo {
	public static LinkedList names = new LinkedList();
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter two names or \"end\": ");
		String n1 = keyboard.next();
		String n2 = "";
		while (!n1.equals("end")){
			n2 = keyboard.next();
			if(n2.equals("end"))
				break;
			names.add(n1,n2);
			System.out.print("Enter two names or \"end\": ");
			n1 = keyboard.next();
		}
		
		System.out.println("\nHere is the order of coughing: ");
		//return entered list
		names.enumerate();
		
		//print spreaders
		System.out.println("The following people are responsible for");
		System.out.println("for spreading the virus: ");
		spreaders();
		
		//affected but not spreaders
		System.out.println("\nThe following people were not responsible ");
		System.out.println("for spreading the virus, but might be still");
		System.out.println("be infected: ");
		nonSpreaders();
		
		//print people s infected
		System.out.print("\nEnter a name to see who they infected: ");
		String s = keyboard.next();
		infectedBy(s);
		
		System.out.println("\nDone.");
		
	}// close main class
	
	
	//VIRUS TRACKER METHODS------------------------------
	
	//returns all people infected by "s"
	public static void infectedBy(String s){
		if(names.isEmpty()){
			System.out.println("Empty List.");
		}
		else{
			Node curr = names.getFirstNode();
			ArrayList<String> inf = new ArrayList<String>();
			ArrayList<String> sprd = new ArrayList<String>();
			ArrayList<String> infBy = new ArrayList<String>();
			inf.add(curr.getData1());
			while(curr != null){
				if(inf.contains(curr.getData1())){
					if(!inf.contains(curr.getData2()))
						inf.add(curr.getData2());
					if(!sprd.contains(curr.getData1()))
						sprd.add(curr.getData1());
					if(curr.getData1().equals(s))
						infBy.add(curr.getData2());
				}
				curr = curr.getNext();
			}
			if(infBy.size()==0)
				System.out.println(s + " did not infect anyone.");
			else
				System.out.println(infBy);
		}
	}

	//returns all people responsible for spreading virus
	public static void spreaders(){
		if(names.isEmpty()){
			System.out.println("Empty List.");
		}
		else{
			Node curr = names.getFirstNode();
			ArrayList<String> inf = new ArrayList<String>();
			ArrayList<String> sprd = new ArrayList<String>();
			inf.add(curr.getData1());
			while(curr != null){
				if(inf.contains(curr.getData1())){
					if(!inf.contains(curr.getData2()))
						inf.add(curr.getData2());
					if(!sprd.contains(curr.getData1())){
						sprd.add(curr.getData1());
						System.out.print(curr.getData1()+" ");
					}
				}
				curr = curr.getNext();
			}
			System.out.println();
		}
	}
	
	//returns all people not responsible for spreading virus
	//even if they're infected
	public static void nonSpreaders(){
		if(names.isEmpty()){
			System.out.println("Empty List.");
		}
		else{
			Node curr = names.getFirstNode();
			ArrayList<String> inf = new ArrayList<String>();
			ArrayList<String> sprd = new ArrayList<String>();
			ArrayList<String> nonSprd = new ArrayList<String>();
			inf.add(curr.getData1());
			while(curr != null){
				if(inf.contains(curr.getData1())){
					if(!sprd.contains(curr.getData1()))
						sprd.add(curr.getData1());
					if(nonSprd.contains(curr.getData1()))
						nonSprd.remove(curr.getData1());
					if(!inf.contains(curr.getData2()))
						inf.add(curr.getData2());
				}
				else
					if(!nonSprd.contains(curr.getData1()))
						nonSprd.add(curr.getData1());
				if(!sprd.contains(curr.getData2()))
					if(!nonSprd.contains(curr.getData2()))
						nonSprd.add(curr.getData2());
				curr = curr.getNext();
			}
			System.out.println(nonSprd);
		}
	}
	
}// close VirusTrackerDemo class