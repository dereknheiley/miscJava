
public class StudentTest {
	public static void main(String[] args) {
		
		//create student and set attributes
		Student stu1 = new Student();
		stu1.setName("John");
		stu1.setStudentNumber(5678);
		
		System.out.println(stu1);
		System.out.println("Students name only is: "+stu1.getName());
	}

}
