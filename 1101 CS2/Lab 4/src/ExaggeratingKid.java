
public class ExaggeratingKid extends SchoolKid{
	
	//Constructor
	public ExaggeratingKid(String name, int age, String teacher, String greeting){
		super(name,age,teacher,greeting);
	}
	
	//override getAge method by adding 2
	public int getAge(){
		return super.getAge()+2;
	}
	
	//override greeting method appending "I am the best" to the front
	public String getGreeting(){
		return "I am the best "+super.getGreeting();
	}
	
	//override toString to reflect overriden methods
	public String toString(){
		return "Name: " + super.getName() + ", age: " + this.getAge() + ", teacher: " 
				+ super.getTeacher()+ "\nGreeting: " + this.getGreeting();
	}
}
