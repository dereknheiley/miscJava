/**
 * @author Derek
 * demonstrate usage of the NHLList class that's built on other classes
 */
import java.util.Scanner;
import java.io.*;
public class NLListDemo {
	public static void main(String[] args) throws IOException {
		
		//variables
		File filename = new File("nhlstats.txt");
		NHLList nhl = new NHLList();
		
		//get file
		Scanner inputFile = new Scanner(filename);
		
		//process NHL input file and create players for NHLList
		while (inputFile.hasNext()){
			nhl.addPlayer(new PlayerRecord(
						inputFile.next(), 	//name
						inputFile.next(), 	//team
						inputFile.next(), 	//position
						inputFile.nextInt(),//numGames
						inputFile.nextInt(),//numGoals
						inputFile.nextInt(),//numAssists
						inputFile.nextInt(),//numPenaltyMins
						inputFile.nextInt() //numWinningGoals
					));
			
		}
		
		//start user output
		System.out.println("NHL 2011 Results Summary\n");
		
		System.out.print("Player with the maximum number of points: ");
		System.out.println(nhl.mostValuable()+"\n");
		
		System.out.print("Player with the maximum number of penalty minutes: ");
		System.out.println(nhl.maxPenaltyMinutes()+"\n");
		
		System.out.print("Most valuable player: ");
		System.out.println(nhl.mostValuable()+"\n");
		
		System.out.print("Team that won the most games: ");
		System.out.println(nhl.teamWonMostGames() +"\n");
		
		System.out.println("Ranking of players (based on points scored):");
		nhl.playerRanking();
		System.out.println();
		
		//setup keyboard scanner
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Players with position p and team t (y to continue and n to quit): ");
		String cont = keyboard.next().trim();
		
		//loop until user doesn't respond yes or y
		while( cont.toLowerCase().matches("(^y.*)") ){
			System.out.print("Enter position (C, L, R, D): ");
			String position = keyboard.next().trim().substring(0, 1);
			System.out.print("Enter team (PIT, CGY, OTT, VAN, TOR, MTL, EDM): ");
			String team = keyboard.next().trim();
			System.out.println(nhl.playerType(position, team));
			
			System.out.print("Players with position p and team t (y to continue and n to quit): ");
			cont = keyboard.next().trim();
		}
		
		//finish program
		System.out.println("Bye!");
	}
}
