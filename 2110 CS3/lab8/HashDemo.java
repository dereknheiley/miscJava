/**
 * @author Derek
 * looping program to generate table of hash table statistics
 * based on user entered table size and number of random elements
 * to populate table with
 */
import java.util.Scanner;
import java.util.Random;
public class HashDemo {
	public static void main(String[] args) {
		
		//instance variables
		Scanner keyboard = new Scanner(System.in);
		String output = "";
		
		System.out.print("Enter the size of the hash table(-1 to quit): ");
		int size = keyboard.nextInt();
		while(size>0){
			
			Random r = new Random();
			int collisions = 0;
			int longestListLength = 0;
			LinkedListN[] hashTable= new LinkedListN[size];
			
			System.out.print("Enter the number of keys to be hashed: ");
			int n = keyboard.nextInt();
			for(int i=0; i<n; i++){
				int num = r.nextInt(10000)+1;
				int numIndex = num%size;
				if(hashTable[numIndex]==null)
					hashTable[numIndex]=new LinkedListN();
				else
					collisions++;
				int length = hashTable[numIndex].size();
				hashTable[numIndex].add(num);
				length++;
				if(length > longestListLength)
					longestListLength = length;
			}
			
			//print hashtable just generated
			System.out.println("\nHash Table created:");
			for(int j=0; j<size; j++){
				if(hashTable[j]==null)
					System.out.println("-->empty");
				else
					System.out.println(hashTable[j]);
			}
			
			//and the stats for this individual table	
			System.out.println("\nStatistics:"
					+"\nTable Size: "+size
					+"\nNumber of Keys: "+n
					+"\nLoad Factor: "+(n/size)
					+"\nNumber of Collisions: "+collisions
					+"\nLongest List: "+longestListLength);
			
			//add to stats to aggregate output table
			output += size+"\t"+n+"\t"+(n/size)+"\t"+collisions+"\t"+longestListLength+"\n";
			
			//make another hastable?
			System.out.print("\n\nEnter the size of the hash table(-1 to quit): ");
			size = keyboard.nextInt();
		}
		
		//print out aggregate table of results
		System.out.println("\n\nTable Size\tNumber of Keys\tLoad Factor\t Number of Collisions\tLongest List");
		System.out.println(output);
		
	}

}
