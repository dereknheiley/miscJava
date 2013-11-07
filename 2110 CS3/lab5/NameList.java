/**
 * @author Derek
 * read file for string content 
 * and construct ordered list
 */
import java.util.Scanner;
import java.util.LinkedList;
import java.io.*;
public class NameList {
	
	//global variables
	private static LinkedList<OrderedList<String>> lists = new LinkedList<OrderedList<String>>();
	private static Scanner keyboard = new Scanner(System.in);
			
	public static void main(String[] args){
		
		//get files and create ordered lists
		getLists();
		while(lists.size()<2){
			System.out.println("We need at least two lists to proceed!");
			getLists();
		}
		
		if(lists.size()>2)
			System.out.println("\nThanks for all the lists! " +
					"But we're only going to use the first two :P");
		
		//merge lists
		System.out.println("\nMerged list:");
		System.out.println( twoFingerMerge(lists.get(0), lists.get(1)) );
		
		//intersection of lists
		System.out.println("\nIntersection of lists:");
		System.out.println( intersect(lists.get(0), lists.get(1)) );
		
		//difference of lists
		System.out.println("\nItems unique to first list:");
		System.out.println( diff(lists.get(0), lists.get(1)) );
		
		//reverse difference of lists
		System.out.println("\nItems unique to second list:");
		//just swap the inputs to the same method as before
		System.out.println( diff(lists.get(1), lists.get(0)) );
		
		System.out.println("\nDone!");
	}
	
	//items common to both lists
	public static OrderedList<String> intersect(OrderedList<String> list1, OrderedList<String> list2){
		OrderedList<String> list3 = new OrderedList<String>();
		for(int i=0; i<list1.size(); i++)
			if(list2.binarySearch(list1.get(i)) >=0)
				list3.insert(list1.get(i));
		return list3;
	}
	
	//items that only appear in the first list passed into this method
	public static OrderedList<String> diff(OrderedList<String> list1, OrderedList<String> list2){
		OrderedList<String> list3 = new OrderedList<String>();
		for(int i=0; i<list1.size(); i++)
			if(list2.binarySearch(list1.get(i)) <0)
				list3.insert(list1.get(i));
		return list3;
	}
	
	//looping method that takes as many lists as the user wants to provide valid file names for
	//keeps pointers to ordered lists in global linked list called "lists"
	public static void getLists(){
		System.out.print("Please enter a filename path (or quit): ");
		String fileName = keyboard.next().trim().toLowerCase();
		
		while(!fileName.matches("(^q.*)")){
			OrderedList<String> orderedList = new OrderedList<String>();
			//read a file of strings
			File file = new File(fileName);
			try{
				Scanner inputFile = new Scanner(file);
				//process file
				while(inputFile.hasNext()){
					//duplicates are ignored in OrderedList insert method
					orderedList.insert(inputFile.next());
				}
				//print resulting OrderedList
				System.out.println(orderedList);
				lists.add(orderedList);
			}
			catch (IOException e){
				System.out.println("File not found!\n");
			}
			//get next filename
			System.out.print("Please enter a filename path (or quit): ");
			fileName = keyboard.next().trim().toLowerCase();
		}
	}
	
	//two finger merge of two ordered lists
	//i made this up because i was sick for this lecture :(
	public static OrderedList<String> twoFingerMerge(OrderedList<String> list1, OrderedList<String> list2){
		OrderedList<String> list3 = new OrderedList<String>();
		
		//list cursors
		int i = 0;
		int j = 0;
		
		//loop through lists comparing front of each as you walk through them
		while(i<list1.size() || j<list2.size()){
			if(i<list1.size() && j<list2.size()){
				int c = list1.get(i).compareTo(list2.get(j));
				if( c==0 ){ //they were the same so just insert one
					list3.insert(list1.get(i));
					i++;
					j++;
				}
				else if ( c<0 ){ //list2 item is after so add list1 item
					list3.insert(list1.get(i));
					i++;
				}
				else if( c>0 ){ //list1 item is after, so add list2 item
					list3.insert(list2.get(j));
					j++;
				}
			}
			else if(i<list1.size())
				for(;i<list1.size(); i++)
					list3.insert(list1.get(i));
			else if(j<list2.size())
				for(;j<list2.size(); j++)
					list3.insert(list2.get(j));
		}
		return list3;
	}

}
