
public class Dictionary extends Book{

	//attributes
	private int numDefinitions =0;
	
	//Constructor
	public Dictionary(int p, int d){
		super(p);
		numDefinitions = d;
	}
	
	//set and get for def's
	public setDefinitions(int n){
		numDefinitions = n;
	}
	public int getDefinitions(){
		return numDefinitions;
	}
	
	//determines avg num of def's per page
	public int computeRatio(){
		return numDefinitions/super.getPages();
	}
}
