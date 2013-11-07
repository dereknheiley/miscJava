public class Sales
{

	private String name;
	private double cost;
	private int bulkQty;
	private double disc;
	private int numSold;
	private double totalAmt;
	private double totalDisc;
   
	public Sales()
      {
    	  
      }

	public Sales(String name, double cost, int bulkQty, double disc)
	{
		this.name = name;
		this.cost = cost;
		this.bulkQty = bulkQty;
		this.disc = disc/100.0;
	}

	public void registerSale(int n)
	{
		if(n>bulkQty)
		{
			totalDisc += n*cost*disc;
			cost = cost - cost*disc;
			totalAmt += cost*n;
		}
		else
		{
			totalAmt += cost*n;
		}
			numSold += n;
	}
	
	
	public void displaySales()
	{
		System.out.println(name);
		System.out.println("Number sold: "+numSold);
		System.out.println("Total amount: $"+totalAmt);
		System.out.println("Total discount: $"+totalDisc);
		System.out.println();
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getCost() {
		return cost;
	}



	public void setCost(double cost) {
		this.cost = cost;
	}



	public int getBulkQty() {
		return bulkQty;
	}



	public void setBulkQty(int bulkQty) {
		this.bulkQty = bulkQty;
	}



	public double getDisc() {
		return disc;
	}



	public void setDisc(double disc) {
		this.disc = disc;
	}



	public int getNumSold() {
		return numSold;
	}



	public void setNumSold(int numSold) {
		this.numSold = numSold;
	}



	public double getTotalAmt() {
		return totalAmt;
	}



	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}



	public double getTotalDisc() {
		return totalDisc;
	}



	public void setTotalDisc(double totalDisc) {
		this.totalDisc = totalDisc;
	}
	
   
}
