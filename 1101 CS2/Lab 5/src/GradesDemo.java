import java.util.Scanner;
public class GradesDemo {
	public static void main(String[] args) {
		
		//setup scanner and attributes
		Scanner keyboard = new Scanner(System.in);
		Grades [] g = new Grades[5];
		String again = "yes";
		
		String name = "Dummy";
		double score = 0;
		int i = 0;
		
		//run program in again
		while(again.toLowerCase().charAt(0) != 'n' && i < 5){
			System.out.print("Please enter the students name: ");
			name = keyboard.next();
			System.out.print("Please enter a score between 0 and 100: ");
			score = keyboard.nextDouble();
			
			while(score<0 || score >100){
				System.out.print("Please enter a score between 0 and 100: ");
				score = keyboard.nextDouble();
			}
			g[i] = new Grades(name, score, i);
			System.out.println(g[i].toString(i)+"\n");
			i++;
			if(i<5){
				System.out.print("Do you want to enter another student? (y/n): ");
				again = keyboard.next();
			}
		}
		
		//print summary of all students entered before ending program
		System.out.println("\nStudent Records: ");
		for(int j=0 ;j<i; j++){
			System.out.println(g[j].toString(j));
		}
		System.out.println("~End of program~");
	}
}
