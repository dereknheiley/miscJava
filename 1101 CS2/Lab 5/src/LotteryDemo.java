import java.util.Scanner;
public class LotteryDemo {
	public static void main(String[] args) {
		
		//setup scanner and variable
		String again = "yes";
		int n = 5;
		int[] picks = new int[n];
		Scanner keyboard = new Scanner(System.in);
		
		//run game in loop until user exits
		while (again.toLowerCase().charAt(0) != 'n'){
			for(int i=0; i<n; i++){
				System.out.print("Please pick a number (1-9): ");
				picks[i] = keyboard.nextInt();
			}
			Lottery lot = new Lottery();
			lot.enterPicks(picks);
			lot.printPrize();
			System.out.print("\nPlay again? (y/n): ");
			again = keyboard.next();
		}
		System.out.print("~End of Program~");
	}
}
