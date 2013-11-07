//Course.java
public class Course
{
		private String courseName;
		private Instructor instructor;
		private TextBook textbook;
		
		public Course(String name, Instructor instr, TextBook text)
		{
			courseName = name;
			instructor = new Instructor(instr.getLName(),instr.getFName(),instr.getONum());
			textbook = new TextBook(text.getTitle(),text.getAuthor(),text.getPublisher());
		}
		
		
		public String toString()
		{
			String str = "Course name: "+courseName+"\n\nInstructor Information:\n"+instructor+"\nTextbook Information:\n"+textbook;
			return str;
		}	
}
