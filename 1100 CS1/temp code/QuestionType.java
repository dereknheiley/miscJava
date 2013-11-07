   import java.util.Random;
   import java.util.Scanner;
   public class QuestionType {
	
		public static int level, score = 0, numQuestions = 10;
   	public static String name = "", questionType = "", again="yes";
		public static int levels[] = {1,2,3,4,5};

		public static void main(String[] arg) {
			Scanner keyboard = new Scanner(System.in);
			char [] type = {'+','a','-','s'};
			while ( !(questionType.equals("Addition")) && !(questionType.equals("Subtraction")) ) {
				System.out.print("Do you want to do addition or subraction?: ");
         	questionType = keyboard.nextLine();
				for (int i = 0; i < type.length; i++){
					if (questionType.toLowerCase().charAt(0) == type[i] ) {
						if ( i <=1 )
							questionType = "Addition";
						else
							questionType = "Subtraction";
					}
				}
			}
		}
	}