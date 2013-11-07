//CourseDemo.java
public class CourseDemo
{
	public static void main(String[] args)
	{
		Instructor myInstr = new Instructor("Sampalli", "Srini", "CS319");
		TextBook myText = new TextBook("Java", "Gaddis&Muganda", "Addison-Wesley");
		Course myCourse = new Course("CSCI 1101", myInstr, myText);
		System.out.println(myCourse);
		myInstr.setONum("CS400");
		myText.setTitle("Super Java");
		System.out.println(myCourse);
		myCourse = new Course("CSCI 1101", myInstr, myText);
		System.out.println(myCourse);
	}
}
