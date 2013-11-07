import java.util.ArrayList;
import java.util.Scanner;
public class Ex2 {
  public static void main(String[] args) {
  	
    // Create a lists
    ArrayList<String> list1 = new ArrayList<String>();
    ArrayList<String> list2 = new ArrayList<String>();
    ArrayList<String> list3 = new ArrayList<String>();
    
    //create scanner object to use 
    Scanner keyboard = new Scanner(System.in);
    
    //set control string
    String ctl = "-1";
    
    //greeting
    System.out.println("Enter words on one line, end with "+ctl);
    
    //fill list one
    while (!list1.contains(ctl)){
    	list1.add(keyboard.next());
    }
    
    //fill list two
    while (!list2.contains(ctl)){
    	list2.add(keyboard.next());
    }
    
    //check for matches in list 1 and list 2
    for(int i=0; i<list1.size(); i++)
    	if(!list1.get(i).equals(ctl)) //not ctl string
    		if(list2.contains(list1.get(i))) //matches
    			if(!list3.contains(list1.get(i))) //not duplicate
    			list3.add(list1.get(i)); // add to list3
    
    System.out.println("Array List with common strings:");
    System.out.print(list3);
 
  }
}
