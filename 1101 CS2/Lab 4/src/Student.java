
public class Student extends Person{

	//attributes
	private int studentNumber;
	
	//constructor
	public Student(){
	}

	//get and sets
	public int getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(int n) {
		studentNumber = n;
	}

	//toString
	public String toString() {
		return super.toString()+"\nStudent Number: " + studentNumber;
	}
	
	//reset changes both student number and person name
	public void reset(String newName, int newNumber){
		studentNumber = newNumber;
		super.setName(newName);
	}
	
	//compares name of students
	public boolean equals(Student anotherStudent){
		return super.hasSameName(anotherStudent);
	}
}
