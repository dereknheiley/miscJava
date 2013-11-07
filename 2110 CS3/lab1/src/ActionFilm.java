/**
 * @author Derek
 * extends Film class to add variables for 
 * mainActor and yearReleased
 */
public class ActionFilm extends Film {
	
	//instance variables
	private String mainActor;
	private int yearReleased;
	
	//Constructor
	public ActionFilm(String t, String d, String w, int g, String mA, int yR) {
		super(t, d, w, g);
		mainActor = mA;
		yearReleased = yR;
	}
	
	//getters and setters
	public String getMainActor() {
		return mainActor;
	}
	public void setMainActor(String mainActor) {
		this.mainActor = mainActor;
	}
	public int getYearReleased() {
		return yearReleased;
	}
	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}
	
	//override display method
	public void display(){
		super.display();
		System.out.println("Main Actor: "+mainActor);
		System.out.println("Year Released: "+yearReleased);
	}
}//end ActionFilm class
