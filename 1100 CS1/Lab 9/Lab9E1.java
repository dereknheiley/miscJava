// Derek Neil
// Lab9 E1

// import java.util.Scanner;
public class Lab9E1 {
	public static void main(String[] args) {
		// Scanner keyboard = new Scanner(System.in);
		
		for (int i = 10; i >= 0; i--)
         System.out.print(i); 
         
      int x = 5; 
      for (int i = 0; i <= 10; i+=2){
         x -= i;
         System.out.println("x: " + x);
      }  

      for (int i = 0; i < 3; i++)
         for (int j = 0; j < 4; j++){
            for (int k = 0; k < 5; k++)
               System.out.print("*");
            System.out.println();
         }  
   
      x = 10;
      while ( x-- >= 0)
         System.out.println(x);
   
      int num1 = 4, num2 = 2;
      while ( num1 > 0 ){
            num1--;
           num2 += num1;
            System.out.println(num2);  
      }
	
  	}
}





