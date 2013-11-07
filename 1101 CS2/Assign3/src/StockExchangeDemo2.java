
public class StockExchangeDemo2 {
	public static void main(String [] args){
		
		//start with cash on had of $1000
		StockExchange2 exchange= new StockExchange2 (1000);
		Stock ibm, microsoft, apple, oracle;
		
		//create stocks
		ibm= new Stock ("IBM", 1000, 100.0);  
		microsoft = new Stock ("Microsoft", 1000, 10.0);
		apple = new Stock ("Apple", 1000, 50.0);
		oracle = new Stock ("Oracle", 1500, 115.0);
		
		//load stocks to exchange
		exchange.addCompany(ibm); 
		exchange.addCompany(microsoft);
		exchange.addCompany(apple);
		
		//print exchange
		System.out.println(exchange);
		
		//buy stocks
		exchange.buy("Oracle", 200);
		System.out.println(oracle);
		
		//print exchange
		System.out.println(exchange);
		
		//sell stocks
		exchange.sell("IBM", 100);
		System.out.println(ibm);
		
		//print exchange
		System.out.println(exchange);    
		
		//buy different stocks
		exchange.buy("Apple", 1000);

		//load new company to exchange
		exchange.addCompany(oracle);
		
		//print exchange
		System.out.println(exchange); 
	}
}
