import java.util.Enumeration;
public class LexyEnumeration implements Enumeration<String> {
	private final char strt = 'a'; //inclusive start of alphabet set you're using
	private final char end = 'd'; //inclusive end of alphabet set you're using
	private char[] chars = {strt};
	private int maxLen=0; //inclusive max length of string formed by alphabet set
	private boolean moreElements=true;

	//constructor
	public LexyEnumeration(int len){
		maxLen=len;
	}
	
	/*returns next element that was calculate from previous call
	 * and calculates value for the next call*/
	public String nextElement(){
		String cur=string(chars); //value calculated from last step to be returned
		if(moreElements){ //calculate next value for next call
			if( increment(chars, 1) ){
				//add another leading 'start' character
				int newLen = chars.length+1;
				chars = new char[newLen];
				for(int i=0; i<newLen; i++)
					chars[i]=strt;
				/*it would be much more efficient to initialize the char array
				 *to the maxLen in the constructor, but then this would not be
				 *inline with the whole concept of coroutines where you start
				 *at the smallest value and moreElementsinue generating larger values
				 *until you're no longer asked to do so, or you reach a
				 *predefined limit
				 *For example, if someone called Lexy(int)
				 *with an int value larger then the available memory of the
				 *computer, a fixed length implementation would fail to generate
				 *any values at all, hence we have to keep allocating a new
				 *larger array of chars as the requests for nextElement moreElementsinue,
				 *because the callee may only call for a small subset of elements*/
			}
		}
		return cur; //value calculated from last step
	}
	
	/*recursive worker method that increments lexicographically
	 * if it is on the last value then it doesn't increment
	 * and sets moreElements to false*/
	private boolean increment(char[] a, int i){
		int curLen = chars.length;
		if(i<=curLen){
			if(a[curLen-i]<end){
				a[curLen-i]=(char)( (int)a[curLen-i]+1 );
				return false;
			}
			else{
				boolean incr = increment(a, i+1);
				if(moreElements && !incr)//don't change if at last value
					a[curLen-i]=strt; //and don't bother changing if about to grow
				return incr;
			}
		}
		else{
			if(i<=maxLen)
				return true;
			else
				return moreElements=false;
		}
	}
	
	//array to string method because java is too stupid to implement it
	private String string(char[] a){
		String array="";
		for(int i=0; i<a.length; i++)
			array+=a[i];
		return array;
	}
	
	//simply returns boolean value that's controlled in increment method
	public boolean hasMoreElements(){
		return moreElements;
	}
	
	//reset to first value
	public void reset(){
		chars = new char[]{strt};
	}
}