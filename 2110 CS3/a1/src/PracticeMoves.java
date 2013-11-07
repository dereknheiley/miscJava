import java.util.Scanner;
/**
 * @author Derek
 * Main method interacts with user to
 * catch input errors & send commands
 * to the board class for processing.
 * Also contains help file.
 */

public class PracticeMoves {
	
	//global variables
	private static Scanner keyboard = new Scanner(System.in);
	private static Board board = new Board();
	private static int i = 0;
	private static int j = 0;
	private static String cmd="";
	private static String[] cmds;
	
	//the main method that runs
	public static void main(String[] args) {
		System.out.println("Welcome to the Practices Moves Game!");
		System.out.println("Type \"help\" for more instructions.\n");
		System.out.print("Enter a Command: ");
		cmd = keyboard.nextLine();
		
		//start command loop
		while(!cmd.toLowerCase().matches("(^e.*)")){
			
			//split command into arguments for inspection
			cmds = cmd.split(" ");
			
			//check for which command
			if(cmd.matches("(^c.*)|(^\"c.*)"))
				create(cmd);
			else if(cmd.matches("(^m.*)|(^\"m.*)"))
				move(cmd);
			else if(cmd.matches("(^p.*)|(^\"p.*)"))
				print();
			else if(cmd.matches("(^h.*)|(^\"h.*)"))
				help();
			else if(cmd.matches("(^s.*)|(^\"s.*)"))
				size();
			else
				System.out.println("Unknown command!");

			//get next command
			System.out.print("\nEnter another command: ");
			cmd = keyboard.nextLine();
		}
		System.out.println("Game over.");
	}
	
	//method to handle piece creation
	//default slow nonflexible
	public static void create(String cmd){
		
		checkCoordinates();
		
		//get name
		System.out.print("Piece name: ");
		String name = keyboard.nextLine().trim();
		
		//get colour
		System.out.print("Piece colour: ");
		String colour = keyboard.nextLine().trim().toLowerCase();
		//validate colour selection
		boolean valid=false;
		while(!valid){
			if(colour.matches("(^bla.*)")){
				colour = "Black";
				valid=true;
			}
			else if(colour.matches("(^w.*)")){
				colour = "White";
				valid=true;
			}
			else if(colour.matches("(^r.*)")){
				colour = "Red";
				valid=true;
			}
			else if(colour.matches("(^blu.*)")){
				colour = "Blue";
				valid=true;
			}
			else if(colour.matches("(^g.*)")){
				colour = "Green";
				valid=true;
			}
			else{
				System.out.print("Piece colour (black, white, red, blue, or green): ");
				colour = keyboard.nextLine().trim().toLowerCase();
			}
		}
		
		//break down location 
		if(cmds.length==2)
			board.add(new SlowPiece(name, colour, i, j));
		else if(cmds.length==3){
			if(cmds[2].toLowerCase().matches("(^f.*))"))
				board.add(new FastPiece(name, colour, i, j));
			else
				board.add(new SlowPiece(name, colour, i, j));
		}
		else if(cmds.length==4){
			if(cmds[2].toLowerCase().matches("(^f.*)")){
				if(cmds[3].toLowerCase().matches("(^f.*)"))
					board.add(new FastFlexible(name, colour, i, j));
				else
					board.add(new FastPiece(name,colour, i, j));
			}
			else if(cmds[2].toLowerCase().matches("(^s.*)")){
				if(cmds[3].toLowerCase().matches("(^f.*)"))
					board.add(new SlowFlexible(name, colour, i, j));
				else
					board.add(new SlowPiece(name, colour, i, j));
			}
		}
	}
	
	//method to change the size of the board & pieces if it's empty
	public static void size(){
		if(board.getPieces()==0){
			boolean valid = false;
			while(!valid){
				if(cmds.length==1){
					System.out.println("How big (betwee 2 and 10)?: ");
					cmds = new String[]{cmds[0], keyboard.nextLine().trim()};
				}
				if(cmds.length>=2){
					if(cmds[1].matches("([2-9])|(10)")){
						valid = true;
					}
				}
				else{
					System.out.print("How big (betwee 2 and 10)?: ");
					cmds[1] = keyboard.nextLine().trim();
				}
			}
			board.changeSize(Integer.parseInt(cmds[1]));
		}
		else
			System.out.println("Can't change board size, pieces already on board!");
	}
	
	//method to handle moving a piece
	public static void move(String cmd){
		if(board.getPieces()>0){
			
			checkCoordinates();
			
			boolean valid = false;
			String dir="";
			while(!valid){
				if(cmds.length==2){ //get direction if missing
					System.out.print("Direction (left, right, up, or down)?: ");
					dir = keyboard.nextLine();
					cmds = new String[]{cmds[0], cmds[1], dir.toLowerCase().trim()};
				}
				if(cmds.length>=3){
					if(cmds[2].matches("(^l.*)|(^r.*)|(^u.*)|(^d.*)")){
						dir = cmds[2];
						valid=true;
					}
					else{
						System.out.print("Direction (left, right, up, or down)?: ");
						dir = keyboard.nextLine();
						cmds[2] = dir.toLowerCase().trim();
					}
				}
			}
	
			int n = 1;
			//evaluate spaces to be moved if any entered
			if(cmds.length>3){
				valid = false;
				while(!valid){
					cmds[3] = cmds[3].trim().replaceAll(" ", "");
					if(cmds[3].matches("[1-9]")){
						n = Integer.parseInt(cmds[3]);
						valid = true;
					}
					else{
						System.out.print("How many spaces to move?: ");
						cmds[3] = keyboard.nextLine();
					}
				}
			}
			
			//move the piece
			board.move(i, j, dir, n);
		}
		else
			System.out.println("No pieces to move!");
	}
	//print the board
	public static void print(){
		if(cmds.length==1)
			System.out.println(board);
		else if(cmds.length>=2){
			if(cmds[1].toLowerCase().trim().matches("(^g.*)"))
				board.setGraphic();
				board.graphic();
		}
	}
	
	//debugging method to print out an array the way i want
	public static String print(String[] a){
		String out="";
		for(int i=0; i<a.length; i++)
			out+="["+i+"]"+a[i]+" ";
		return out;
	}
	
	public static void checkCoordinates(){
		//loop until you have two int coordinates
		i = 0;
		j = 0;
		boolean valid=false;
		while(!valid){
			//get coordinates
			if(cmds.length==1){
				System.out.print("What location (i,j)?: ");
				String temp = keyboard.nextLine();
				temp.trim().replaceAll(" ", "");
				cmds = new String[]{cmds[0], temp };
			}
			//validate coordinates
			if(cmds.length>=2){
				String[] coor = cmds[1].split(",");
				if(coor.length==2){
					if(coor[0].matches("[0-9]") && coor[1].matches("[0-9]")){
						i = Integer.parseInt(coor[0]);
						j = Integer.parseInt(coor[1]);
						valid = true;
					}
				}
				if(!valid){
					System.out.print("What location (i,j)?: ");
					cmds[1] = keyboard.nextLine().trim().replaceAll(" ", "");
				}
			}
		}
	}
	
	//help method lists all the commands
	public static void help(){
		System.out.println("----------------------Help File---------------------");
		System.out.println("create - Creates a piece at a given location\n" +
						   "	a slow non flexible piece is assumed\n" +
						   "	unless specified otherwise with optional\n" +
						   "	arguments (see example).\n"+
						   "	Syntax - \"create location [fast] [flexible]\"\n" +
						   "	Example - \"create 3,4 fast\"\n" +
						   "	Will create  fast non flexible piece\n" +
						   "	at position 3,4 on the board.\n");
		System.out.println("move - If a piece exists at the location specified\n" +
						   "	it is moved the direction and number of\n" +
						   "	spaces specified as allowed by the piece.\n" +
						   "	If the direction or number of spaces exceeds\n" +
						   "	the capability of the piece, it will do as\n" +
						   "	much as it can.\n" +
						   "	Syntax - \"move location direction [spaces]\"\n" +
						   "	Example - \"move 3,4 right 3\"\n" +
						   "	Will move the piece at 3,4 three spaces\n" +
						   "	to the right. Had a slow piece been there,\n" +
						   "	it would have only moved one space to the\n" +
						   "	right, and had the move called for \"up\"\n" +
						   "	the user would see an error message.\n");
		System.out.println("print - Prints pieces currently on the board.\n" +
						   "	Syntax - \"print [graphic]\"\n" +
						   "	Example - \"print\"\n"+
		   				   "	If the optional [graphic] flag is not used\n" +
		   				   "	a list prints on screen. If the [graphic] \n"+
		   				   "	option is used, a representation of the full\n"+
		   				   "	board is printed out with pieces shown in place.\n" +
		   				   "	Minimum required resolution for graphic print-\n" +
		   				   "	out is 530x530 pixels.\n");
		System.out.println("size - changes the size of the board from the\n" +
						   "	default size of 8x8. This command can only be\n" +
						   "	run before pieces are placed on the board!\n" +
				   		   "	Syntax - \"size integer\"\n" +
				   		   "	Example - \"size 3\"\n"+
				   		   "	In this example, the board will be changed to\n" +
				   		   "	to 3x3.\n");
		System.out.println("help - Prints this help menu.\n" +
						   "	Syntax / Example - \"help\"\n");
		System.out.println("exit - Exit the game.\n" +
						   "	Syntax / Example - \"exit\"\n");
		System.out.println("Command Abbreviations - all commands will also accept\n" +
				  		   "	the first letter of the command without the need to\n" +
				  		   "	type the remainder of the word, as long as spacing\n" +
				  		   "	is maintained.\n" +
				  		   "	Example - \"c 3,4 f\"\n" +
				  		   "	This will create a piece at 3,4 that is fast.\n" +
				  		   "	Example - \"m 3,4 r 3\n" +
				  		   "	This will move a piece from 3,4 three spaces to the\n" +
				  		   "	right.\n" +
				  		   "	Once exception is while specifying a colour, you\n" +
				  		   "	must type \"blu\" for blue, or \"bla\" for black.");
		System.out.println("---------------------End Help File---------------------");
	}
}
