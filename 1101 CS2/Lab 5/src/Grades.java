
public class Grades {

	//attributes
	private static String [] names = new String [5];
	private static String [] grades = new String [5];
	private static double [] scores = new double [5];
	
	//constructors
	public Grades(){
	}
	public Grades(String name, double score, int index){
		names[index] = name;
		scores[index] = score;
		findGrade(index);
	}
	
	//set and get methods
	public void setName(String name,int i){
		names[i] = name;
	}
	public String getName(int i){
		return names[i];
	}
	public void setScore(double n, int i){
		scores[i] = n;
		findGrade(i);
	}
	public double getScore(int i){
		return scores[i];
	}
	public void findGrade(int i){
		double score = scores[i];
		if(score >= 90.0)
			grades[i] = "A";
		else if (score >= 80.0)
			grades[i] = "B";
		else if (score >= 70.0)
			grades[i] = "C";
		else if (score >= 60.0)
			grades[i] = "D";
		else
			grades[i] = "F";
	}
	public String getGrade(int i){
		return grades[i];
	}
	
	//toString
	public String toString(int i){
		return "Name: "+names[i]+"\tScore: "+scores[i]+"\tGrade: "+grades[i];
	}
}
