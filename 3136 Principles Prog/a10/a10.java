import java.util.Random;

public class a10 {

	public static void main(String[] args) {
		
		//fill linkedlist with random data for testing
		LinkedList nll = new LinkedList(7);
		Random rand = new Random();
		for (int i=0; i<110; i++) {
			nll.insertEnd(rand.nextInt(10));
		}
		
		//Q3 a) use visitor to multiply each node and get sum
		System.out.println("Visitor tests:");
		NodeVisitor nv1 = new NodeVisitor();
		nll.forEach(nv1);
		System.out.println("Sum: "+nv1.getSum());
		NodeVisitor nv2 = new NodeVisitor(12);
		nll.forEach(nv2);
		System.out.println("Sum after multiplied by 12: "+nv2.getSum());
		
		//Q4 use same visitor from Q3 for simplicity, but use getState to access state
		System.out.println("\nVisitor state tests:");
		System.out.println("Sum of first 100 nodes minus sum of rest of list: "+nv1.getState());
	}

}