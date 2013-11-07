
public class SchoolKid {
	
	//attributes
	private String name;
	private int age;
	private String teacher;
	private String greeting;
	
	public SchoolKid(String name, int age, String teacher, String greeting) {
		this.name = name;
		this.age = age;
		this.teacher = teacher;
		this.greeting = greeting;
	}

	//set and get methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	//toString
	public String toString() {
		return "Name: " + name + ", age: " + age + ", teacher: " + teacher
				+ "\nGreeting: " + greeting;
	}
}
