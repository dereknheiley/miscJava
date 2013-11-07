// Derek Neil
// Lab 12, Excersize 11

import java.util.Scanner;
public class L12E11{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
      System.out.print("Type in a string: ");
      String b = keyboard.nextLine();
		drawBoard(b);
      int result = decide(b);
		System.out.println();
      if (result == 1) System.out.println("Win for X");
      else if (result == 0) System.out.println("Win for O");
      else if (result == 3) System.out.println("Draw");
      else System.out.println("Game Unfinished");
   }
	
	public static void drawBoard(String board){
		System.out.println();
		// load board into char array
		char[] g = new char[9];
		int moves = board.length();
		if (board.length() > 9)
			moves = 9;
		for (int i=0; i<moves; i++){
			g[i] = board.charAt(i);
		}
		// fill in any blank spaces left until end
		if (9-board.length() >0){
			for (int i=8; i>moves-1; i--)
				g[i] = ' ';
		}
		// display gameboard
		for (int i=0; i<9; i+=3) {
			System.out.print(g[i]+" | ");
			System.out.print(g[i+1]+" | ");
			System.out.print(g[i+2]);
			System.out.println();
		}
	}

	public static int decide(String board){
		int decision = 3;
		char w = ' ';
		// load board into char array
		char[] g = new char[9];
		int moves = board.length();
		if (board.length() > 9)
			moves = 9;
		for (int i=0; i<moves; i++){
			g[i] = board.charAt(i);
		}
		// fill in any blank spaces left until end
		if (9-board.length() >0){
			for (int i=8; i>moves-1; i--)
				g[i] = ' ';
		}
		// row win check
		for(int i=0; i<=6; i+=3){
			if( g[i]!=' ' && g[i]==g[i+1] && g[i+1]==g[i+2] )
				w = g[i];
		}
		// column win check
		for(int i=0; i<=2; i++){
			if( g[i]!=' ' && g[i]==g[i+3] && g[i+3]==g[i+6] )
				w = g[i];
		}
		// diagonal check
		if( g[0]!=' ' && g[0]==g[4] && g[4]==g[8] )
				w = g[0];
		// reverse diagonal check
		if( g[2]!=' ' && g[2]==g[4] && g[4]==g[6] )
				w = g[2];
		// convert winner to decision
		if ( w=='o' | w=='O' | w=='x' | w=='X' ){
			if ( w=='o' | w=='O' )
				decision=0;
			if ( w=='x' | w=='X' )
				decision=1;
			}
		// if game incomplete instead of draw
		else
			if (board.length() <9)
				decision = 4;
		return decision;
	}
}