/**
 * @author Derek
 * demonstrate reading undirected unweighted graph to
 * adjacency matrix and traversals
 */
import java.io.File;
import java.util.Scanner;
import java.io.*;
public class GraphDemo {
	
	//global variables
	public static char[] labels;
	public static int[] visited;
	public static int[][] adjMatrix;
	
	public static void main(String[] args) {
		
		try{
			Scanner inputFile = new Scanner(new File("uugraph.txt"));
			
			//first value in file is size of matrix
			int num = inputFile.nextInt();
			adjMatrix = new int[num][num];
			//for this example. we'll use letter labels
			labels = new char[num];
			for(int i=0; i< labels.length; i++)
				labels[i]=(char)(65+i);
			
			//read file contents for edges
			while (inputFile.hasNext()){
				int x = inputFile.next().charAt(0)-65;
				int y = inputFile.next().charAt(0)-65;
				adjMatrix[x][y] = adjMatrix[y][x] = 1;
			}
			
			//print the matrix
			System.out.println("Adjacency Matrix:");
			System.out.print(" \t"); 			//blank label space
			for(int i=0; i< labels.length; i++) //print column labels
				System.out.print(labels[i]+"\t");
			System.out.println(); 				//return after label row
			for(int i=0; i< adjMatrix.length; i++){
				System.out.print(labels[i]+"\t"); //print row label
				for(int j=0; j< adjMatrix.length; j++)
					System.out.print(adjMatrix[i][j]+"\t"); //print row contents
				System.out.println(); 			//return after row content
			}
			
			//traverse the graph
			System.out.println();
			System.out.println("Depth First Search: ");
			visited = new int[num]; //keep track if a vertice has been visited
			
			Scanner key = new Scanner(System.in);
			System.out.print("Enter vertice to start DFS traversal (-1 to quit): ");
			int start=0;
			while((start = key.nextInt()) >=0){
				if(start < num){
					DFS(start); //start recursive depth first search traversal at any vertice
					visited = new int[num]; //reset visited check
				}
				System.out.print("\n\nEnter vertice to start DFS traversal (-1 to quit): ");
			}

		}catch(IOException e){
			System.out.println("File Not Found!");
		}
		System.out.print("\nDone");
	}
	
	//depth first search method (recursive)
	public static void DFS(int i){
		System.out.print(labels[i]+ " "); //print v
		visited[i]=1;						//mark as visited
		for(int j=0; j<visited.length; j++) //scan adjMatrix row
			if(adjMatrix[i][j]==1 && visited[j]==0) //if next edge exists
				DFS(j); //recursive call for next edge
	}
}
