//Derek Neil
//find prime numbers in a range

   public class PrimeNumberTester {
      public static void main (String [] args) {
         System.out.println("The following numbers are prime: ");
         long startTime, endTime, executionTime;
         int count = 0;
         startTime = System.currentTimeMillis();
         // define range of numbers to test in the for loop
         for (int n=2147483647; n>=2147483500; n--){
            if(isPrime(n)){
               System.out.print(n+", ");
               count++;
               if(count == 7){
                  count = 0;
                  System.out.println();
               }
            }
         }
         endTime = System.currentTimeMillis();
         executionTime = endTime - startTime;
         System.out.print("\nTotal execution time is: "+executionTime+"ms");
      }
      
      public static boolean isPrime (int n) {
         if(n>0){
            for (int i=2; i<n; i++){
               if(n%i==0 && i>1 )
                  return false;
            }
            return true;
         }
         return false;  
      }		
   }