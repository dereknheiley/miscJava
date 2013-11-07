import java.util.ArrayList;
import java.util.Random;
public class Ex5 {
  public static void main(String[] args) {
  	
    //create Random variable
    Random r = new Random();
    
    for(int i=1; i<=10; i++){
    	
      //create perm list
      ArrayList<Integer> perm = new ArrayList<Integer>();
    	
    	//create and fill source list
      ArrayList<Integer> list = new ArrayList<Integer>();
      for(int j=1; j<=10; j++)
      	list.add(j);
    	
      //now use numbers from it to populate perm list
      for(int k=1; k<=10; k++){
    		int random = r.nextInt(list.size());
    		perm.add(list.get(random));
    		list.remove(random);
    	}
      //print result of each perm loop
    	System.out.println("List "+i+": "+perm);
    }
  }
}
