//Lab0 Derek Neil
//sum of factors equals number

   public class Ex1c {
      public static void main (String [] args) {
         System.out.print("The following numbers are perfect: ");
         long startTime, endTime, executionTime;
         startTime = System.currentTimeMillis();
         for (int n=1; n<=10000; n++){
            if(isPerfect(n))
               System.out.print(n+", ");
         }
         endTime = System.currentTimeMillis();
         executionTime = endTime - startTime;
         System.out.print("\nTotal execution time is: "+executionTime+"ms");
      }
      
      public static boolean isPerfect (int n) {
         int check = 0;
         if(n>0){
            for (int i=1; i<n; i++){
               if(n%i==0)
                  check +=i;
            }
         }
         if(n!=check)
            return false;
         return true;
      }		
   }