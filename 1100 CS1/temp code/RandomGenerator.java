   import java.util.Random;
   import java.util.Scanner;
   public class RandomGenerator {
   	public static void main(String [] args) {
   		int level =1;
         int max = 0;
      // use predefined maximum values to create random numbers
      // level 1 Max = 10;
      // level 2 Max = 10;
      // level 3 Max = 50;
      // level 4 Max = 150;
      // level 5 Max = 750;
         if (level == 1) {
            max = 10;
         } 
         else if (level == 2) {
            max = 10;
         } 
         else if (level == 3) {
            max = 50;
         }
         else if (level == 4) {
            max = 150;
         }
         else if (level == 5) {
            max = 750;
         }
         Random rand = new Random();
         int randNum = rand.nextInt(max - 1);
         System.out.print(max+" "+randNum);
         //return randNum;
      }
   }