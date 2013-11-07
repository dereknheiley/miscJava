public class Pair implements Comparable<Pair>{
	
	private char ltr; 
	private double prob;
	
	public Pair(char l, double f) {
		ltr = l;
		prob = f; 
	}
	public char getLtr() {
		return ltr; 
	}
	public double getProb() {
		return prob; 
	}
	public int compareTo(Pair c){
		if(prob < c.getProb())
			return -1;
		if(prob > c.getProb())
			return 1;
		return 0;
	}
	public String toString(){
		return ""+ltr+"   "+prob;
	}
}
