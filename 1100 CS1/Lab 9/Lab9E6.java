// Derek Neil
// Lab9 E6
		
public class Lab9E6 {
	public static void main(String[] args) {
		for (int i=4; i>0; i--){
			drawUp();
			drawDown();
		}
  	}
	
	public static void drawUp(){
		System.out.println("    *");
		System.out.println("   **");
		System.out.println("  ***");
		System.out.println(" ****");
		System.out.println("*****");
	}
	public static void drawDown(){
		System.out.println("    *****");
		System.out.println("    ****");
		System.out.println("    ***");
		System.out.println("    **");
		System.out.println("    *");
	}
}





