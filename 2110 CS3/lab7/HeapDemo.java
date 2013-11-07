import java.util.Scanner;
public class HeapDemo{
	public static void main(String[] args){
		
		//Exercise 6:
		Heap<String> myHeap = new Heap<String>();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter words into the heap (-1 when done): ");
		String val = keyboard.next();
		while (!val.equals("-1"))
		{
			myHeap.add(val);
			val = keyboard.next();
		}
		myHeap.enumerate();
		
		System.out.println("\nEnumerate: ");
		myHeap.enumerate();
		
		//Exercise 7
		System.out.println("Min value in heap is: "+myHeap.findMin());
		
		System.out.println("\nRemoving nodes on a priority basis");
		while(!myHeap.isEmpty())
		{
			System.out.println(myHeap.deleteMax());
			myHeap.enumerate();
		}	
	}
}