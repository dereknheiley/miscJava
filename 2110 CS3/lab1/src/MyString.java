/**
 * @author Derek
 *	class for handling strings
 */
public class MyString {
	//instance variables
	private String word;
	
	//Constructor
	public MyString(String w){
		word = w;
	}
	
	//permuted version of word
	public String permuted(){
		char[] a = word.toCharArray();
		int n = a.length;
		for(int i=0;i<2*n; i++){
			int r1 = (int)(n*Math.random());
			char tmp = a[r1];
			int r2 = (int)(n*Math.random());
			a[r1] = a[r2];
			a[r2] = tmp;
		}
		return new String(a);
	}
} //end MyString class
