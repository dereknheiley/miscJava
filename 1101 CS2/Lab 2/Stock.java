public class Stock {
	
	//instance variables
    private String symbol;
   	private double price;
   	private int shares;
    
   	//constructors
    public Stock() {
    }
   	
   	public Stock(String symbol,double price,int shares){
   		this.symbol = symbol;
    	this.price = price;
    	this.shares = shares;
   	}
   	
   	//get set for SYMBOL
   	public void setSymbol(String s){
   		symbol = s;
   	}
    public String getSymbol(){
    	return symbol;
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
    
    // compare method for comparing one stock to another stock
    public int compare(Stock s){
    	double other = s.getValue();
    	double value = this.getValue(); 
    	if(value < other)
    		return -1;
    	else if(value > other)
    		return 1;
    	else
    		return 0;
    }
    
    //difference method to save some coding in demo
    public double difference(Stock s){
    	return ( (int) ((this.getValue() - s.getValue())*100) )/100.0;
    }
    public double absDifference(Stock s){
    	return ( (int) ( Math.abs(this.getValue() - s.getValue()) *100 ) )/100.0;
    }
    
    public double getValue(){
    	return ( (int) (price*shares*100) )/100.0;
    }
    
    //returns stats about the stock
    public String toString(){
    	return "Symbol: "+symbol+"\tPrice: "+price+"\tNumber of Shares: "+shares;
    }
}
