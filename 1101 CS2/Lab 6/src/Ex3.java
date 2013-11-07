import java.util.ArrayList;
import java.util.Scanner;
public class Ex3 {
  public static void main(String[] args) {
  	
    // Create a lists
    ArrayList<String> list1 = new ArrayList<String>();
    ArrayList<String> list2 = new ArrayList<String>();
    
    //create scanner object to use 
    Scanner keyboard = new Scanner(System.in);
    
    //set control string
    String ctl = "-1";
    
    //greeting
    System.out.println("Please enter a list of words or names (-1 to end):");
    
    //fill list one
    while (!list1.contains(ctl)){
    	list1.add(keyboard.next());
    }
    
    //removes control string from list 1
    list1.remove(list1.indexOf(ctl));
    
    //add strings to list2 in order
    list2.add(list1.get(0));
    for(int i=1; i<list1.size(); i++){
    	int j=0;
    	while( (list1.get(i).compareTo(list2.get(j)) <0) )
    		j++;
    	if(j < list2.size() -1 )
    		list2.add(j, list1.get(i));
    	else
    		list2.add(list1.get(i));
    }
    		  
    //result
    System.out.println("Sorted array list:");
    System.out.print(list2);
 
  }
}
