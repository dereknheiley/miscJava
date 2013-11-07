public class SalesDemo
   {
    public static void main(String[] args)
      {
         Sales item1, item2, item3;
         item1 = new Sales("Shampoo",2.50,4,10);
         item2 = new Sales("Toothpaste",1.99,20,15);
         item3 = new Sales("Battle Axe",89.99,3,5);
         
         item1.registerSale(10);
         item2.registerSale(10);
         item3.registerSale(5);
         
         item1.displaySales();
         item2.displaySales();
         item3.displaySales();
         
      }
   }
