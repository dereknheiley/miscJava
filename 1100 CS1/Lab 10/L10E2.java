// Derek Neil
// Lab 10 E2

//import java.util.Scanner;
		// Scanner keyboard = new Scanner(System.in);

		
public class L10E2 {
	public static void main(String[] args) {
        int x = 1;
        int y = 3;
        strange(x, y);
        strange(y, x);
        System.out.println(x + " and " + y);
    }    
    public static void strange(int x, int y){
         x++;
         y--;  
         System.out.println(x + " and " + y);
    } 
}






