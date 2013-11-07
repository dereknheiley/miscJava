// Derek Neil
// google sample question
// Array of 100 integers from 1 to 100, shuffled. One integer is taken out, find that integer.

   public class Google01 {
      public static void main(String[] args) {
         int [] numbers = new int[100];
         for ( int i=0; i<numbers.length; i++ ){
            numbers[i] = 100-i;
         }
         numbers[25] = 0;
         numbers[73] = 0;
         for (int i=0 ; i<numbers.length; i++){
            if(numbers[i]<1||numbers[i]>100)
               System.out.println("Index "+i+" is missing");
         }
      }
   }





