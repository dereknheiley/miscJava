   public class testArray {
   
      public static void main(String[] args) {
      
         char[] letters = new char[50];
         String word = "word";
         letters = word.toCharArray();
         char c = 'z';
         //String tmp = ""+c;
         c = (""+c).toLowerCase().charAt(0);
         System.out.print(letters[0]==c);
         
      }
   
   }
