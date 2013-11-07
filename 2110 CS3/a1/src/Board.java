/**
 * @author Derek
 * Tracks pieces relative to each other &
 * organizes them for moves, printing etc.
 * Calculates move to check for same team
 * collisions & off of board problems
 */
public class Board {
	//assumes a flat square shaped playing board
	private Piece[][] board = new Piece[8][8];
	private static int pieces = 0;
	private int size = 8;
	private boolean graphic = false;
	
	//constructor
	public Board(){
	}
	
	//returns active pieces on the board
	public int getPieces(){
		return pieces;
	}
	
	//control persistent graphic printout
	public void setGraphic(){
		graphic = !graphic;
		if(graphic)
			System.out.println("Graphic board turned on!");
		else
			System.out.println("Graphic board turned off!");
	}
	public void setGraphic(boolean b){ //overloaded method
		graphic = b;
		if(graphic)
			System.out.println("Graphic board turned on!");
		else
			System.out.println("Graphic board turned off!");
	}
	
	//changes size of playing board when no pieces on board
	public void changeSize(int newsize){
		if(pieces==0){
			if(newsize>1){
				size=newsize;
				Piece.setSize(newsize);
				board = new Piece[size][size];
				if(graphic)
					graphic();
			}
			else
				System.out.println("Board size must be greater then 1!");
		}
		else
			System.out.println("Can't change board size, peices already on board!");
	}
	
	//add a piece to the board
	public void add(Piece p){
		int i = p.getI();
		int j = p.getJ();
		if(i<size && i>=0 && j<size && j>=0){
			if(board[i][j]==null){
				board[i][j] = p;
				board[i][j].setIJ(i,j);
				pieces++;
				System.out.println(board[i][j]+" created!");
				if(pieces>14 && graphic)
					graphic();
			}
			else
				System.out.println("Location already used");
		}
		else
			System.out.println("Not a valid position on the board!");
	}
	
	//move method calculates new position & various checks before moving
	public void move(int i, int j, String dir, int n ){
		if(pieces>0){
			boolean one = false;
			boolean two = false;
			boolean three = false;
			
			//clean up direction input
			dir = dir.toLowerCase().trim();
			if(dir.matches("(^l.*)"))
				dir = "left";
			else if(dir.matches("(^r.*)"))
				dir = "right";
			else if(dir.matches("(^u.*)"))
				dir = "up";
			else if(dir.matches("(^d.*)"))
				dir = "down";
			else
				System.out.println("Unknown move direction in Board Class");
			
			if(i<size && i>=0 && j<size && j>=0){ //validate board position
				if(board[i][j]!=null){ //make sure there's a piece there
					if(dir.equals("up")||dir.equals("down")){
						if((board[i][j] instanceof SlowFlexible) 
						   || (board[i][j] instanceof FastFlexible))
							one = true;
					}
					else if(dir.equals("right")||dir.equals("left"))
						one=true;
					if(one){
						//make sure there isn't a piece of the same colour at the future spot
						String c = board[i][j].getColour();
						if((board[i][j] instanceof SlowFlexible)
							|| (board[i][j] instanceof SlowPiece))
							if(n>1)
								n=1; //this also makes sure slows don't move more the one
						//calculate new coordinates
						int newi = i;
						int newj = j;
						switch(dir){
						case "up" : newj = j-n; break;
						case "down" : newj = j+n; break;
						case "right" : newi = i+n; break;
						case "left" : newi = i-n; break;
						}
						if(newi<size && newi>=0 && newj<size && newj>=0){
						//if there's a piece already there make sure it's a different color
							if(board[newi][newj]==null)
								two=true;
							else if(!board[newi][newj].getColour().equals(c)){
								two=true;
								pieces--; // decrement because you're taking another players piece
							}
						}
						if(two){
							//move the piece
							if((board[i][j] instanceof SlowFlexible) 
								|| (board[i][j] instanceof FastFlexible)){
								board[i][j].move(dir,n);
								three=true;
							}
							else if(dir.equals("right")){
								board[i][j].moveRight(n);
								three=true;
							}
							else if(dir.equals("left")){
								board[i][j].moveLeft(n);
								three=true;
							}
							//update the board
							if(three){
								board[newi][newj]=board[i][j];
								board[i][j] = null;
								if(graphic)
									graphic();
							}
							else{
								System.out.println("Something went wrong, good luck!");
								System.out.println("i:"+i+"\tj"+j);
								System.out.println("dir:"+dir+"\tn:"+n);
								System.out.println("newi:"+newi+"\tnewj"+newj);
								System.out.println("one:"+one+"\ttwo:"+two+"\tthree:"+three);
							}
						}
						else
							System.out.println("Not a valid move");
					}
					else
						System.out.print("Can only move Flexible pieces up and down!");
				}
				else
					System.out.println("No piece there to move!");
			}
			else
				System.out.println("Not a valid position on the board!");
		}
		else
			System.out.println("No pieces to move!");
	}
	
	//prints list of board spots & pieces they contain if any
	public String toString(){
		String out="";
		if(pieces>0){
			for(int i=0; i<size; i++)
				for(int j=0; j<size; j++)
					if(board[i][j]!=null)
						out = out+"["+i+"]["+j+"] "+board[i][j]+"\n";
		}
		else if(pieces==0 || out.equals(""))
			out = "No pieces on board!";
		return out;
	}
	
	//centers text in given number of spaces
	public String center(String str, int n){
		String out = str.trim();
		int strl = str.length();
		if(strl<n){
			int buff = n-strl;
			for(int i=0; i<buff/2; i++)
				out = " "+out;
			for(int i=0; i<buff/2; i++)
				out = out+ " ";
			if(buff%2!=0)
				out = out+" ";
		}
		else if(strl>n)
			out = str.trim().substring(0, n+1);	
		return out;
	}
	
	//prints graphic representation of the board w/ pieces in place
	public void graphic(){
		String top = "---------";
		String spc = "        ";
		System.out.println(" ");
		
		System.out.print(" ");
		for(int h=0; h<size; h++){ //print the actual i coordinate
			System.out.print(" ");
			System.out.print( center(""+h, spc.length()) );
			if(h==size-1) //print end border
				System.out.println(" ");
		}
		
		for(int j=0; j<size; j++){
			
			System.out.print(" ");
			for(int i=0; i<size; i++) //print upper border
				System.out.print(top);
			System.out.println("-");
			
			System.out.print(" ");
			for(int i=0; i<size; i++){ //print piece color row
				System.out.print("|");
				if(board[i][j] !=null)
					System.out.print(center(board[i][j].getColour(), spc.length()));
				else
					System.out.print(spc);
				if(i==size-1) //print end border
					System.out.println("|");
			}
			
			System.out.print(j); //print the actual j coordinate
			for(int i=0; i<size; i++){ //print piece name row
				System.out.print("|");
				if(board[i][j] !=null)
					System.out.print(center(board[i][j].getName(), spc.length()));
				else
					System.out.print(spc);
				if(i==size-1) //print end border
					System.out.println("|");
			}
			
			System.out.print(" ");
			for(int i=0; i<size; i++){ //print spacer row below text
				System.out.print("|");
				System.out.print(spc);
				if(i==size-1)//print end border
					System.out.println("|");
			}
			
			if(j==size-1) { //print lower border
				System.out.print(" ");
				for(int i=0; i<size; i++) //print top border
					System.out.print(top);
				System.out.print("-");
			}
		}
		System.out.println();
	}
}
