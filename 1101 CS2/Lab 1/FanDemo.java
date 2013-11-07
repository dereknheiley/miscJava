   public class FanDemo
   {
    public static void main(String[] args)
      {
         Fan fan1, fan2;
         fan1 = new Fan();
         fan2 = new Fan();
         fan1.setSpeed("fast");
         fan1.setRadius(10);
         fan1.setColour("yellow");
         fan1.setOn(true);
         fan2.setSpeed("medium");
         fan2.setRadius(5);
         fan2.setColour("blue");
         fan2.setOn(false);
         System.out.println("Fan1 has the following properties: "+fan1);
         System.out.println("Fan2 has the following properties: "+fan2);
      }
   }
