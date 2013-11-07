   public class Fan
   {
      private String speed;
      private boolean on;
      private double radius;
      private String colour;
   
      public Fan()
      {
      }
   	
      public void setSpeed(String s)
      {
    	 s = s.toLowerCase();
         if (s.equals("slow")||s.equals("medium")||s.equals("fast"))
            this.speed = s;
      }
      public void setOn(boolean o)
      {
         this.on = o;
      }
      public void setRadius(double r)
      {
         this.radius = r;
      }
      public void setColour(String c)
      {
         this.colour = c;
      }
   	
      public String getSpeed()
      {
         return speed;
      }
      public boolean getOn()
      {
         return on;
      }
      public double getRadius()
      {
         return radius;
      }
      public String getColour()
      {
         return colour;
      }
      
      public String toString()
      {
         return "Speed: "+speed+"\tOn: "+on+"\tRadius: "+radius+"\tColour: "+colour;
      }
   }
