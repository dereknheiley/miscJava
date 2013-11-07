public class Foo {
   static int i = 0;
   static int j = 0;

   public static void main(String[] args) {
     i = 2;
     System.out.println("i is " + i);
     int k = 3;
     {
       int j = 3;
       System.out.println("j is " + j);
     }

     k = i + j;
     System.out.println("i is " + i);
     System.out.println("j is " + j);
   }
}
