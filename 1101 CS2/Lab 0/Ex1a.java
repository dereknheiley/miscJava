//Lab0 Derek Neil
//sum of factors equals number

   import java.util.Scanner;
   public class Ex1a {
      public static void main (String [] args) {
         Scanner keyboard = new Scanner(System.in);
         System.out.print("Please type a number: ");
         int n = keyboard.nextInt();
         int check = 0;
         if(n>0){
            for (int i=1; i<n; i++){
               if(n%i==0)
                  check +=i;
            }
         }
         System.out.print(""+n+" is");
         if(n!=check)
            System.out.print(" not");
         System.out.print(" a perfect number");
      }	
   }