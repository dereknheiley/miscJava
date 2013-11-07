import java.util.Scanner;
import java.util.Random;
public class TestDoor {

	public static void main(String[] args) {
		
		//create holders to create game door
		String doortypes[] = {"Enter","Exit","Treasure"};
		boolean inside = false;
		boolean key = false;
		
		//create random generator and holders
		Random random = new Random();
		int namegen, keygen;
		String play ="no";
		
		//start game
		System.out.print("Welcome to the Dungeon.\nPlay? (Enter Y or N): ");
		Scanner keyboard = new Scanner(System.in);
		play = keyboard.nextLine();
		
		while (play.toLowerCase().charAt(0) !='n'){
			
			//generate door type key
			namegen = random.nextInt(3);
			keygen = random.nextInt(2);
			
			//generate door
			// Door(String inscription, boolean closed, boolean locked) 
			Door gamedoor = new Door(doortypes[namegen],true,true);
			
			//print game
			gamedoor.getInscription();
			System.out.print("Key: ");
			if (keygen == 1){
				key = true;
				System.out.println("True");
			}
			else{
				key = false;
				System.out.println("False");
			}
			
			if(namegen == 2 && !inside){
				System.out.println("Sorry. Cannot get to treasure without entering.");
			}
			else if (namegen == 1 && !inside){
				System.out.println("Sorry. Cannot exit without entering.");
			}
			else if (namegen == 0 && inside){
				System.out.println("Sorry. Already inside.");
			}
			else{
			
				//play game key
				if(key){
					gamedoor.unlock();
					gamedoor.open();
					if(namegen == 0){
						inside = true;
						System.out.println("ENTER");
					}
					else if(namegen == 1){
						inside = false;
						System.out.println("EXITED");
					}
					else if(namegen == 2){
						System.out.println("GET TREASURE");
					}
				}
				else{
					System.out.println("Sorry. Cannot unlock.");
				}
			}
			System.out.print("\nPlay? (Enter Y or N): ");
			play = keyboard.nextLine();
		}
		System.out.print("Good bye!");

	}

}
