
public class StockExchangeDemo {
	public static void main(String [] args){
		
		//3 companies with initial cash on hand of $1000
		StockExchange exchange= new StockExchange (3, 1000); 
		Stock ibm, microsoft, apple;
		
		//print current stock exchange
		System.out.println(exchange); 
		
		//add stocks to exchange
		exchange.addCompany("IBM", 1000);
		exchange.addCompany("Microsoft", 1000);
		exchange.addCompany("Apple", 1000);
		exchange.addCompany("ORCL", 1000);
		
	  //print current stock exchange
		System.out.println(exchange); 
		
		//buy from stock exchange
		ibm = exchange.buy("IBM", 100, 100.0);
		System.out.println(ibm);
		
		//print current stock exchange
		System.out.println(exchange);  
		
		//sell to stock exchange
		exchange.sell(ibm);  
		System.out.println(ibm);
		
		//print current stock exchange
		System.out.println(exchange);  
		
	}
}
