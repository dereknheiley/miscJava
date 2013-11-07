//Lab0 Derek Neil
//find out if phrase is a palindrome

   import java.util.Scanner;
   public class Ex3 {
      public static void main (String [] args) {
         Scanner keyboard = new Scanner(System.in);
         System.out.print("Please type a phrase: ");
         String str = keyboard.nextLine();
         System.out.print("That phrase is");
         if(!isPalindrome(str))
            System.out.print(" not");
         System.out.print(" a palindrome.");
      }
      
      public static boolean isPalindrome (String str) {
         str = str.toLowerCase();
         String str0 = "";
         for(int i=0; i<str.length(); i++){
            if(isLetter(str.charAt(i)))
               str0 += str.charAt(i);
         }
         String reverse = "";
         for(int i=str0.length()-1; i>=0; i--)
            reverse += str0.charAt(i);
         if (reverse.equals(str0))
            return true;
         return false; 
      }
      
      public static boolean isLetter (char c) {
         c = Character.toLowerCase(c);
         char[] alph = {'a','b','c','d','e','f',
               'g','h','i','j','k','l','m','o','p','q',
               'r','s','t','u','v','w','x','y','z'};
         for (int i=0 ; i<alph.length; i++)
            if (c== alph[i])
               return true;
         return false; 
      }		
   }