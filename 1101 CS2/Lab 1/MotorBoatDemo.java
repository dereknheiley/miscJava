   public class MotorBoatDemo
   {
      public static void main(String[] args)
      {
         Motorboat m1;
         //Motorboat(fuelTankSz, fuelAmt, maxSpeed, fuelRate)
         m1 = new Motorboat(60,35,80,.5);
         m1.setCurSpeed(25);
         m1.trip(30);
         
         m1.getCurSpeedPrint();
         m1.getDistTrvldPrint();
         m1.getFuelAmtPrint();
         System.out.println();  
         System.out.println();
      	
         m1.setCurSpeed(25);
         m1.trip(30);
         
         m1.getCurSpeedPrint();
         m1.getDistTrvldPrint();
         m1.getFuelAmtPrint();
      }
   }
