/**
 * @author Derek
 * demonstrate hashing logins and checking them against user input
 */
import java.io.File;
import java.util.Scanner;
import java.io.*;
import java.util.HashMap;
public class PasswordDemo {
	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		try{
			Scanner inputFile = new Scanner(new File("validation.txt"));
			HashMap<String, String> validUsers = new HashMap<>();//store pass as key and full name as value
			
			//get all the credentials and load into hashMap checking name matches username
			while (inputFile.hasNext()){ //assumes that file is indeed providing 4 words per row
				String name = inputFile.next()+" "+inputFile.next();// first and last name
				
				//derive username from full name and check against user name provided
				String[] names = name.split(" "); 
				String check = name.substring(0, 1) + names[1]; 
				check = check.toLowerCase();
				if(!inputFile.next().equals(check)){
					System.out.println("skipping username "+check+" doesn't match full name");
					continue;
				}
				String pass = inputFile.next(); //password provided
				validUsers.put( pass, name); //add pair to hashtable
			}
			
			int loginAttempts=3; //the allowed number of login attempts
			boolean authenticated=false;
			String login = "";
			String pass = "";
			String name=null;
			
			//prompt user for login credentials in loop
			while(loginAttempts>0 && !authenticated){
				//print out warning
				if(!login.equals("") && !pass.equals("")){
					System.out.println("\nEither the username or password is incorrect!");
					System.out.println("You have "+loginAttempts+" more attempt(s) remaining.");
				}
				//get credentials
				System.out.print("Login: ");
				login = key.next();
				System.out.print("Password: ");
				pass = key.next();
				
				//check credentials against hashmap
				name = validUsers.get(pass);
				if(null!=name){//this prevents null pointer exceptions
					String[] names = name.split(" ");
					String check = name.substring(0, 1) + names[1];
					check = check.toLowerCase();
					if(login.equals(check))
						authenticated=true;
				}
				loginAttempts--;
			}
			
			if(authenticated){
				System.out.println("\nLogin successful!");
				System.out.println("Welcome "+name);
			}
			else
				System.out.println("\nSorry. Incorrect login. Please contact the system administrator.");

		}catch(IOException e){
			System.out.println("File Not Found!");
		}
		System.out.print("\nDone");
	}
}
