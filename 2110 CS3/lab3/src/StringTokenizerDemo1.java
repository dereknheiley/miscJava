import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
public class StringTokenizerDemo1{
	public static void main(String[] args) throws IOException{
		//variables
		Scanner keyboard = new Scanner(System.in);
		String line, word;
		StringTokenizer token;
		int chars=0;
		int words=0;
		int lines=0;
		
		//get file
		System.out.print("Enter the filename to read from: ");
		String filename = keyboard.nextLine();
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		
		//scan through file content
		while (inputFile.hasNext()){
			line = inputFile.nextLine();
			token = new StringTokenizer(line, " "); //looks a lot like split()
			while (token.hasMoreTokens()){
				word = token.nextToken();
				//increment counters
				words++;
				chars = chars+word.length();
			}
			lines++; //this counts blank lines per the example expected output!
		}
		inputFile.close();		
		
		//print results
		System.out.println("The Number of characters (no spaces) in the file is: "+chars);
		System.out.println("The Number of words in the file is: "+words);
		System.out.println("The Number of lines in the file is: "+lines);
	}
}