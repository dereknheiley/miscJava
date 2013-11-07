/**
 * @author Derek Neil B00163969
 * Stores information about a student
 */
public class Student {
	private String name;
	private int id;
	
	//constructor
	public Student(String n, int i){
		name = n;
		id = i;
	}

	//set and get methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public boolean equals(Object s){
		return ( ((Student)s).getName().equals(name) && ((Student)s).getId()==id);
	}
}
