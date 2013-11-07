
public class PizzaStand {

	private int id;
	private int sold;
	
	//static variable to track all pizza's sold
	private static int allSold=0;
	
	//fixed price per pizza
	private static double cost=5.00;
	
	//assign store number from static increment
	private static int stores =1;
	
	//constructors
	public PizzaStand(){
		this.id = stores;
		stores++;
		sold = 0;
	}
	
	// gets for static variables
	public int getAllSold(){
		return allSold;
	}
	public double getPizzaCost(){
		return cost;
	}
	
	public void justSold(){
		sold++;
		allSold ++;
	}
	
	//get for Store ID
	public int getId() {
		return id;
	}
	
	//get pizza's sold per store
	public int getSold() {
		return sold;
	}
	
	//get pre calculated sales information
	public double getSales(){
		return ( (int) (sold*cost*100) ) / 100.0;
	}
	public double getAllSales(){
		return ( (int) (allSold*cost*100) ) / 100.0;
	}
	
}
