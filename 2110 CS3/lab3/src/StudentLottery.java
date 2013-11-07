/**
 * @author Derek Neil B00163969
 * Creates ArrayList of type Student to add & pick from
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class StudentLottery {
	//global instance variables
	private ArrayList<Student> students = new ArrayList<Student>();
	
	//constructor
	public StudentLottery(){
	}
	
	//prompts & adds student if they haven't already entered
	public void addStudents(){
		System.out.print("Enter? (y or n): ");
		Scanner key = new Scanner(System.in);
		if( key.nextLine().matches("(^y.*)") ){
			System.out.print("Name: ");
			String name = key.nextLine();
			System.out.print("ID: ");
			String i = key.nextLine();
			while( !i.matches("([0-9][0-9]*)") ){
				System.out.print("ID: ");
				i = key.nextLine();
			}
			int id = Integer.parseInt(i);
			Student n = new Student(name, id);
			if(!students.contains(n)){
				students.add(n);
			}
			else
				System.out.println("Studnet already entered!");
			addStudents();
		}
		else
			System.out.println("Thank you.\n");
	}
	
	//randomly picks a winner if anyone has entered
	public void pickWinner(){
		String output = "No one entered the lottery!";
		int size = students.size();
		if(size>0){
			Random r = new Random();
			Student w = students.get(r.nextInt(size));
			output =  "And the winner is: "+w.getName()+", "+w.getId();
		}
		System.out.println(output);
	}
}
