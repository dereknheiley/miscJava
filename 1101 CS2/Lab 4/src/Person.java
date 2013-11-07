
public class Person {

	//attributes
	private String name;
	
	//constructor
	public Person(){
	}

	//set and gets
	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	//toString
	public String toString() {
		return "Name: " + name;
	}
	
	//compares names of two people
	public boolean hasSameName(Person anotherPerson){
		if(anotherPerson.getName() == name)
			return true;
		else
			return false;
	}
}
