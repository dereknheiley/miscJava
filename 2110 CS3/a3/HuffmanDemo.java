/**
 * @author Derek Neil B00163969
 * reads String input from file and counts freq of char
 * creates huffman encoding tree to compress message
 * compresses message, then uses huffman tree to decode
 */
import java.util.Scanner;
import java.io.*;

public class HuffmanDemo{
	
	//global variables
	private static int maxCharVal=127; // is char value for ~
	//also see minCharVal in main method!
	
	public static void main(String[] args){
		
		//instance variables
		int minCharVal=33; // is char value for !
		//change this to char value 32 to include spaces between words
		
		Scanner keyboard = new Scanner(System.in);
		int counted=0; //num of chars counted
		double check=0; //prob check should equal 1.0
		int[] freq = new int[maxCharVal]; //create array where char freq in char index position
		Q<Integer> msg = new Q<Integer>(); //store message chars to encode the full message
		
		//Step 1
		//getfile
		String filename = "";
		boolean readFile = false;
		while(!readFile && !filename.equalsIgnoreCase("quit")){
			System.out.print("Enter the filename to read from (or quit): ");
			filename = keyboard.next();
			try{
				File file = new File(filename);
				Scanner inputFile = new Scanner(file);
				
				//get line and count freq of chars we want
				while (inputFile.hasNext()){
					String line = inputFile.nextLine();
					int n = line.length();
					for(int i=0; i<n; i++){
						int cval = (int)line.charAt(i);
						if( cval>=minCharVal && cval<=maxCharVal ){
							counted++;
							freq[cval]++;
							msg.enqueue(cval);
						}
					}
				}
				inputFile.close();
				readFile=true;
			}
			catch(IOException e){
				if(!filename.equalsIgnoreCase("quit"))
					System.out.println("Problem reading file!\n");
			}
		}

		if(readFile){
			//Step 2
			//put counted Pair in sorted list, keyed by probabilities stored in binary tree
			//note custom OrderedList allows duplicates since two Pair might have same prob
			OrderedList<BinaryTree<Pair>> S = new OrderedList<BinaryTree<Pair>>(maxCharVal-minCharVal);
			System.out.println("\nSymbol Probability Table");
			System.out.println("(printed before sorting)");
			int n=freq.length;
			for(int i=minCharVal; i<n; i++){
				double prob = freq[i]/(double)counted;
				if(prob>0){
					System.out.println(""+(char)i+"   "+prob);
					S.insert(new BinaryTree<Pair>(new Pair((char)i,prob)));
					check+=prob;
				}
			}
			
			System.out.println("Probability checksum = "+check);
			
			//Step 3
			
			//Build huffman tree w/ one ordered list
			/* Although this is O(nlog2 n), it is much easier to code,
			 * and because n is fixed at a maximum of 256, i present
			 * this simpler method as a better alternative if strict 
			 * O(n) is not required since it's 14 lines of code and 
			 * easier to understand & udpate vs 51 lines of code and
			 * much more tracing for the two queue approach */
//			while(S.size()>1){
//				BinaryTree<Pair> left = S.remove(0);
//				BinaryTree<Pair> right;
//				double newProb = left.getData().getProb();
//				if(S.isEmpty())
//					right = null;
//				else{
//					right = S.remove(0);
//					newProb+= right.getData().getProb();
//				}
//				BinaryTree<Pair> newTree = new BinaryTree<Pair>(new Pair(' ', newProb));
//				newTree.attachLeft(left);
//				newTree.attachRight(right);
//				S.insert(newTree);
//			}
			
			//Build huffman tree w/ one ordered list and one queue
			Q<BinaryTree<Pair>> T = new Q<BinaryTree<Pair>>();
			while(!S.isEmpty()){
				BinaryTree<Pair> left=null;
				if(!T.isEmpty()){
					if(S.get(0).compareTo(T.peek())>=0)
						left = T.dequeue();
					else
						left = S.remove(0);
				}
				else
					left = S.remove(0);
				BinaryTree<Pair> right =null;
				double newProb = left.getData().getProb();
				if(T.isEmpty()){
					if(S.isEmpty())
						right = null;
					else{
						right = S.remove(0);
						newProb+= right.getData().getProb();
					}
				}
				else{
					if(!S.isEmpty()){
						if(S.get(0).compareTo(T.peek())<=0)
							right = S.remove(0);
						else
							right = T.dequeue();
					}
					else
						right = T.dequeue();
					newProb+= right.getData().getProb();
				}
				BinaryTree<Pair> newTree = new BinaryTree<Pair>(new Pair(' ', newProb));
				newTree.attachLeft(left);
				newTree.attachRight(right);
				T.enqueue(newTree);
			}
			//once S is empty, loop until T.size() is 1
			while(T.size()>1){
				BinaryTree<Pair> left = T.dequeue();
				BinaryTree<Pair> right;
				double newProb = left.getData().getProb();
				if(T.isEmpty())
					right = null;
				else{
					right = T.dequeue();
					newProb+= right.getData().getProb();
				}
				BinaryTree<Pair> newTree = new BinaryTree<Pair>(new Pair(' ', newProb));
				newTree.attachLeft(left);
				newTree.attachRight(right);
				T.enqueue(newTree);
			}
			//one tree left is the huffman tree at index 0
			BinaryTree<Pair> huff = T.dequeue();
			System.out.println("\nHuffman Tree checksum = "+huff.getData().getProb());
			
			
			//Step 4
			//generate encoding table of binary code for each char
			System.out.println("\nSymbol Encoding Table:");
			String[] encodingTable = findEncoding(huff);

			//encode message using encoding table
			String compMsg = "";
			n = msg.size();
			System.out.println("\nEncoding the message:");
			for(int i=0; i<n; i++){
				int msgPart = msg.dequeue();
				String e = encodingTable[msgPart];
				System.out.println(""+(char)msgPart+"   "+e);
				compMsg+= e;
				//above prints confirmation, below doesn't
				//compMsg+= encodingTable[msg.dequeue()];
			}
			
			//Print message out
			System.out.println("\nCompressed message to decode:");
			System.out.println(compMsg);
			
			//Step 5
			//decode compressed message using huffman tree
			System.out.println("\nDecoded message:");
			System.out.println(decode(compMsg, huff));
		}
		
		System.out.println("\nDone.");
		
		//starting at huff go left for 0, or right for 1 based on the next bit in the string
		//when going that direction ==null return / output / append the char for the tree you're on
		//reset back to huff root, and continue with the next bit until you run out
		
	}
	
	//methods for decoding compressed binary message
	//given the huffman tree to decode with
	public static String decode(String s, BinaryTree<Pair> huff){
		if(!huff.isEmpty()){
			if(s.length()>0){
				reset = huff;
				return decode(s, 0, huff);
			}
			else
				return "Nothing to decode!";
		}
		else
			return "Nothing to decode with!";
	}
	public static BinaryTree<Pair> reset; //to reset location back to root in o(1)
	public static String decode(String s, int i, BinaryTree<Pair> location){
		if(i < s.length()){
			if(s.charAt(i)=='0'){
				if(location.getLeft()==null){
					String temp = ""+location.getData().getLtr();
					location = reset;
						return temp + decode(s,i, location);
				}
				else{
					location = location.getLeft();
					return decode(s,++i,location);
				}
			}
			else if(s.charAt(i)=='1'){
				if(location.getRight()==null){
					String temp = ""+location.getData().getLtr();
					location = reset;
						return temp + decode(s,i,location);

				}
				else{
					location = location.getRight();
					return decode(s,++i,location);
				}
			}
			else
				return decode(s,++i,location);
		}
		else if(i==s.length()){
			return ""+location.getData().getLtr();
		}
		else
			return "";
	}
	
	//methods for finding the encoding from helpful hints posted in assignment notes
	public static String[] findEncoding(BinaryTree<Pair> t){
		String[] result = new String[maxCharVal];
		findEncoding(t, result, "");
		return result;
	}
	public static void findEncoding(BinaryTree<Pair> t, String[] a, String prefix){
		if (t.getLeft()==null && t.getRight()==null){
			//print out encoding table while it's being made
			char c = t.getData().getLtr();
			a[(byte)c] = prefix;
			System.out.println(""+c+"   "+prefix);
		}
		else{
			findEncoding(t.getLeft(), a, prefix+"0");
			findEncoding(t.getRight(), a, prefix+"1");
		}
	}
}
