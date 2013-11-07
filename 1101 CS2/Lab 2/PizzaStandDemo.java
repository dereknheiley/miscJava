public class PizzaStandDemo {

	public static void main(String[] args) {
		
		//create the pizza stands
		PizzaStand [] pstands = new PizzaStand[6];
		for (int i=0; i<pstands.length; i++){
			pstands[i] = new PizzaStand();
		}
		
		//register sales from various stores
		pstands[0].justSold();
		pstands[3].justSold();
		pstands[2].justSold();
		pstands[4].justSold();
		pstands[2].justSold();
		pstands[0].justSold();
		pstands[4].justSold();
		pstands[2].justSold();
		pstands[2].justSold();
		pstands[1].justSold();
		pstands[5].justSold();
		pstands[1].justSold();
		pstands[5].justSold();
		
		//print out daily sales of stores
		System.out.println("Pizza Sales: ");
		System.out.println("Id\tSold");
		for (int i=0; i<pstands.length; i++){
			System.out.print(""+pstands[i].getId());
			System.out.println("\t"+pstands[i].getSold()+"\n");
		}
		
		//print totals for all stands
		System.out.println("Total Pizzas sold: "+pstands[0].getAllSold());
		System.out.println("Total sales: "+ pstands[0].getAllSales());
		
		System.out.println("\nProcess Complete");
	}

}
