
public class StockExchange {

	//instance variables
	private double cashOnHand;
	private int [] sharesAvailable;
	private String [] shareNames;
	private static int c = 0; //count for loaded stocks
	
	//constructors
	public StockExchange(){
	}
	public StockExchange(int num, double cash){
		cashOnHand = cash;
		sharesAvailable = new int[num];
		shareNames = new String[num];
	}
	
	//cashOnHand get and sets
	public double getCashOnHand() {
		return cashOnHand;
	}
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
	
	//adds a company and it's shares to exchange
	public void addCompany(String n, int s){
		if(c < shareNames.length){
			sharesAvailable[c] = s;
			shareNames[c] = n;
			c++;
		}
		else
			System.out.println("Stock Exchange Full");
	}
	
	// buyStock
	public Stock buy(String company, int numberOfShares, double pricePerShare){
		Stock s = new Stock(company.toUpperCase(), 0.0, 0);;
		if(inExchange(company)){
			int i = getIndex(company);
			if( numberOfShares <= sharesAvailable[i] ){
				sharesAvailable[i] -= numberOfShares;
				cashOnHand += numberOfShares*pricePerShare;
				s.setPrice(pricePerShare);
				s.setShares(numberOfShares);
			}
			else 
				System.out.println(""+numberOfShares+ " shares are not currently available to buy");
		}
		return s;
	}
	
	//sell
	public void sell(Stock aStock){
		if(this.inExchange(aStock)) { //test to see if stock is in exchange
			double cost = aStock.getPrice() * aStock.getShares();
			if(cashOnHand >= cost){
				cashOnHand -= cost;
				sharesAvailable[this.getIndex(aStock.getCompanyName())] += aStock.getShares();
				aStock.sold();
			}
			else
				System.out.println("Not enough cash on hand");
		}
		else
			System.out.println("Stock not in exchange");
	}
	
	//tests to see if company is in exchange
	public boolean inExchange(String company){
		boolean exists = false;
		String name = company.toUpperCase();
		for (int i=0; i<c; i++){
			if(shareNames[i].toUpperCase().equals(name)){
				exists = true;
				break;
			}
		}
		return exists;
	}
	//tests to see if stock is in exchange
	public boolean inExchange(Stock s){
		boolean exists = false;
		String name = s.getCompanyName().toUpperCase();
		for (int i=0; i<c; i++){
			if(shareNames[i].toUpperCase().equals(name)){
				exists = true;
				break;
			}
		}
		return exists;
	}
	
	//finds stock location in the exchange arrays
	public int getIndex(String s){
		int i=0;
		for (; i<c; i++)
			if(shareNames[i].equals(s))
				break;
		return i;
	}
	
	public String toString(){
		String output = "Cash on Hand: $"+cashOnHand;
		for(int i=0; i<c; i++)
			output += "\n\t"+sharesAvailable[i]+" "+shareNames[i];
		return output;
	}
	
}
