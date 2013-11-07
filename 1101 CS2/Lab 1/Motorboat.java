   public class Motorboat
   {
      private double fuelTankSz = 0;
      private double fuelAmt = 0;
      private double maxSpeed = 0;
      private double curSpeed = 0;
      private double fuelRate = 0;
      private double disTrvld = 0;
   
      public Motorboat(double fuelTankSz, double fuelAmt, double maxSpeed, double fuelRate) {
         this.fuelTankSz = fuelTankSz;
         this.fuelAmt = fuelAmt;
         this.maxSpeed = maxSpeed;
         this.fuelRate = fuelRate;
      }
   
      public double getFuelTankSz() {
         return fuelTankSz;
      }
      public void setFuelTankSz(double fuelTankSz) {
         this.fuelTankSz = fuelTankSz;
      }
      public double getFuelAmt() {
         return fuelAmt;
      }
   
      public void getFuelAmtPrint(){
         System.out.print("Fuel in tank: "+fuelAmt);
      }
   
      public void refuel(double fill){
         if (fuelAmt+fill>fuelTankSz)
            fuelAmt = fuelTankSz;
         else
            fuelAmt += fill;
      }
   
      public void setFuelAmt(double fuelAmt) {
         this.fuelAmt = fuelAmt;
      }
      public double getMaxSpeed() {
         return maxSpeed;
      }
      public void setMaxSpeed(double maxSpeed) {
         this.maxSpeed = maxSpeed;
      }	
      public double getCurSpeed() {
         return curSpeed;
      }
   
      public void getCurSpeedPrint() {
         System.out.println("Current speed: "+curSpeed);
      }
   
      public void setCurSpeed(double change){
         if (curSpeed + change < maxSpeed && curSpeed + change > 0)
            this.curSpeed += change;
         else if (curSpeed + change < maxSpeed && curSpeed + change < 0)
            this.curSpeed = 0;
         else
            this.curSpeed = maxSpeed;
      }
   
      public double getFuelRate() {
         return fuelRate;
      }
      public void setFuelRate(double fuelRate) {
         this.fuelRate = fuelRate;
      }
      public double getDisTrvld() {
         return disTrvld;
      }
   
      public void getDistTrvldPrint(){
         System.out.println("Distance driven: "+disTrvld);
      }	
      public void trip(double time){
         this.disTrvld = time/60.0*curSpeed;
         double usage = disTrvld * fuelRate;
         if(usage <= fuelAmt)
            this.fuelAmt -= usage;
         else
            System.out.println("you'd be "+(fuelAmt-usage)+"L short :(");
      }
   
      public void setDisTrvld(double disTrvld) {
         this.disTrvld = disTrvld;
      }
      
   }
