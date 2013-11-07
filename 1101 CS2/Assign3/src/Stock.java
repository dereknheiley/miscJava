   public class Stock {
   
  	 //instance variables
      private String companyName;
      private double price;
      private int shares;
    
      //constructors
      public Stock() {
      }
   	
      public Stock(String companyName,double price,int shares){
         this.companyName = companyName;
         this.price = price;
         this.shares = shares;
      }
      public Stock(String companyName,int shares, double price){
        this.companyName = companyName;
        this.price = price;
        this.shares = shares;
     }
   	
      //get set for companyName
      public void setCompanyName(String s){
         companyName = s;
      }
      public String getCompanyName(){
         return companyName;
      }
    
      //get set for PRICE
      public void setPrice(double price){
         this.price = price;
      }
      public double getPrice(){
         return price;
      }
    
      //get set for SHARES
      public void setShares(int shares){
         this.shares = shares;
      }
      public int getShares(){
         return shares;
      }
    
      //sets price and share to zero
      public void sold(){
      	price = 0;
      	shares = 0;
      }
    
      //returns stats about the stock
      public String toString(){
         return shares+" "+companyName+" shares at $"+price;
      }
   }