   public class Rectangle
   {
      private int length;
      private int width;
   
      public Rectangle()
      {
      }
      public Rectangle(int l, int w )
      {
         this.length = l;
         this.width = w;
      }
      public void setLength(int l)
      {
         this.length = l;
      }
      public void setWidth(int w)
      {
         this.width = w;
      }
      public int getLength()
      {
         return length;
      }
      public int getWidth()
      {
         return width;
      }
      public int findArea()
      {
         return length*width;
      }
      public String toString()
      {
         return "Length: "+length+"\tWidth: "+width;
      }
   }
