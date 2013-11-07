// Derek Neil
// google sample question
// Array of 100 integers from 1 to 100, shuffled. One integer is taken out, find that integer.

   public class Google01 {
      public static void main(String[] args) {
         int [] numbers = 100;
         int temp = 0;
         for ( int i=0; i<numbers.length; i++ ){
            numbers[i] = 100-i;
         }
      }
   }





