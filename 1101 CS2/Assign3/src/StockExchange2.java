import java.util.ArrayList;
public class StockExchange2 {

	//instance variables
	private double cashOnHand=0;
	private ArrayList<Stock> allStocks = new ArrayList<Stock>();
	
	//constructors
	public StockExchange2(){
	}
	public StockExchange2(double cash){
		cashOnHand = cash;
	}
	
	//cashOnHand get and sets
	public double getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	
	//adds a company and it's shares to exchange
	public void addCompany(Stock s){
		allStocks.add(s);
	}
	
	// buyStock assuming fixed price of $100.00
	public Stock buy(String company, int numberOfShares){
		Stock s = new Stock(company.toUpperCase(), 0.0, 0);
		if(inExchange(company)){
			int i = getIndex(company);
			int shares = allStocks.get(i).getShares();
			if( numberOfShares <= shares ){
				allStocks.get(i).setShares( (shares - numberOfShares) );
				cashOnHand += numberOfShares*allStocks.get(i).getPrice();
				s = allStocks.get(i);
				if(allStocks.get(i).getShares() == 0)
					allStocks.remove(i);
			}
			else 
				System.out.println("Not enough shares available");
		}
		else
			System.out.println("Not in Stock Exchange");
		return s;
	}
	
	//sell based on stock reference
	public void sell(Stock aStock){
		if(!this.inExchange(aStock)) //test to see if stock isn't in exchange
			allStocks.add(aStock);
		double cost = aStock.getPrice() * aStock.getShares();
		if(cashOnHand > cost)
			cashOnHand -= cost;
		else
			System.out.println("Not enough cash on hand");
	}

	//sell based on company name
	public void sell(String company, int shares){
		if(!this.inExchange(company)) //test to see if stock isn't in exchange
			System.out.println("Not enough information to sell Stock" );
		else{
			int i = getIndex(company);
			int sharesAvail = allStocks.get(i).getShares();
			double price = allStocks.get(i).getPrice();
			double cost = price * shares;
			if(cashOnHand > cost){
				cashOnHand -= cost;
				allStocks.get(i).setShares(sharesAvail+shares);
			}
			else
				System.out.println("Not enough cash on hand");
		}
	}
	
	//tests to see if company is in exchange
	public boolean inExchange(String company){
		boolean exists = false;
		String name = company.toUpperCase();
		for (int i=0; i<allStocks.size(); i++){
			if(allStocks.get(i).getCompanyName().toUpperCase().equals(name)){
				exists = true;
				break;
			}
		}
		return exists;
	}
	//tests to see if stock is in exchange
	public boolean inExchange(Stock s){
		boolean exists = false;
		if(allStocks.contains(s))
			exists = true;
		return exists;
	}
	
	//finds stock location in the exchange arrays
	public int getIndex(String company){
		int i=0;
		String name = company.toUpperCase();
		for (; i<allStocks.size(); i++)
			if(allStocks.get(i).getCompanyName().toUpperCase().equals(name))
				break;
		return i;
	}
	
	public String toString(){
		String output = "Cash on Hand: $"+cashOnHand;
		for(int i=0; i<allStocks.size(); i++)
			output += "\n\t"+allStocks.get(i).getShares()+" "+allStocks.get(i).getCompanyName();
		return output;
	}
	
}
