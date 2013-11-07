/**
 * @author Derek
 * reads String input from file and inserts
 * it into ArrayList according to first letter
 */
import java.util.Scanner;
import java.io.*; 
import java.util.ArrayList;

public class FileReadDemo
{
	public static void main(String[] args) throws IOException
	{
		//variables
		Scanner keyboard = new Scanner(System.in);
		ArrayList<String> inSorted = new ArrayList<String>(); 
		
		//getfile
		System.out.print("Enter the filename to read from: ");
		String filename = keyboard.nextLine();
		File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		
		//insert lines based on first letter
		while (inputFile.hasNext())
		{
			String line = inputFile.nextLine();
			if(inSorted.isEmpty()) //just insert
				inSorted.add(line);
			else{ //sort by first letter
				char c = line.charAt(0);
				int i=0;
				while( i<inSorted.size() && c>inSorted.get(i).charAt(0) )
					i++;
				inSorted.add(i, line); //add here
			}
			//print result
			System.out.println( inSorted );
		}
		inputFile.close();
	}
}

