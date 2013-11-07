public class Lottery {

	//attributes
	private static int n = 5;
	private static int [] lotteryNumbers = new int[n];
	private int [] userArray = new int[n];
	private int matches = 0;
	
	//constructor
	public Lottery(){
		for(int i=0; i<n; i++){
			lotteryNumbers[i] = (int)(Math.random()*9+1);
		}
	}
	
	//copies values from user array into class instance
	public void enterPicks(int[] a){
		
		//just in case someone passes a different length array
		int l =0;
		if(a.length >= userArray.length)
			l = userArray.length;
		else
			l = a.length;
		
		//actually entering the values
		for(int i=0; i<l; i++){
			userArray[i] = a[i];
		}
	}
	
	//compares lottery numbers to user numbers
	private void checkPicks(){
		for(int i=0; i<n; i++){
			if (lotteryNumbers[i] == userArray[i])
				matches++;
		}
	}
	
	//generates String of array numbers
	private String printNumbers(int[] a){
		String num = "";
		for(int i=0; i<n; i++){
			num += ""+a[i];
			if(i < n-1)
				num += ", ";
		}
		return num;
	}
	
	// prints out results
	public void printPrize(){
		System.out.println("Lottery Numbers: "+ printNumbers(lotteryNumbers));
		System.out.println("User Picks: "+ printNumbers(userArray));
		checkPicks();
		System.out.println("Matches: "+matches);
		if(matches == 5)
			System.out.println("Grand Prize ($1 million)");
		else if(matches == 4)
			System.out.println("$500,000 prize");
		else if(matches == 3)
			System.out.println("$10,000 prize");
		else if(matches == 2)
			System.out.println("$10 prize");
		else if(matches == 1)
			System.out.println("$2 prize");
		else
			System.out.println("Sorry, nothing for you.");
	}

}
