// Derek Neil
// Lab 10, Excersize 6

public class L11E6 {
	public static void main(String [] args){
		String grade = letterGrade(80);
		System.out.print(grade);
	}
	public static String letterGrade(double n) {
		String grade = "F";
   	if (n > 95)
			grade = "A+";
		else if (n > 85)
			grade = "A";
		else if (n > 75)
			grade = "B";
		else if (n > 65)
			grade = "C";
		else if (n > 55)
			grade = "D";
		return grade;
	}
}