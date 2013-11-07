   import java.util.Scanner;
   public class RectangleDemo
   {
      public static void main(String[] args)
      {
         Rectangle rect1, rect2;
         Scanner keyboard = new Scanner(System.in);
         System.out.print("Type the length and width of the first rectangle: ");
         rect1 = new Rectangle(keyboard.nextInt(),keyboard.nextInt());
         System.out.print("Type the length and width of the second rectangle: ");
         rect2 = new Rectangle(keyboard.nextInt(),keyboard.nextInt());
         System.out.println("The first rectangle has: " + rect1.toString());
         System.out.println("and an area of: " + rect1.findArea());
         System.out.println("\nThe second rectangle has: " + rect2.toString());
         System.out.println("and an area of: " + rect2.findArea());
      }
   }
