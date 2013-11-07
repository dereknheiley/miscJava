/**
 * @author Derek
 * unordered list of players
 */
public class NHLList {
	
	//instance variables
	private List<PlayerRecord> playerList;
	
	//constructor
	public NHLList(){
		playerList = new List<PlayerRecord>();
	}
	
	//accessor & mutators
	public void addPlayer(PlayerRecord p){
		playerList.add(p);
	}
	public void deletePlayer(PlayerRecord p){
		playerList.remove(p);
	}
	public String nameAndPoints(PlayerRecord p){
		String output = "Player not found!";
		if(p!=null)
			output = p.getName() +" "+ p.getTotalPoints();
		return output;
	}
	
	//search through list for player with highest number penalty minutes and print his name
	public String maxPenaltyMinutes(){
		PlayerRecord output = null;
		int max = 0;
		PlayerRecord p = playerList.first();
		while(p!=null){
			if(p.getNumPenaltyMins()>max){
				max=p.getNumPenaltyMins();
				output=p;
			}
			p = playerList.next();
		}
		if(output==null)
			return "No Penalty Minutes Recorded";
		return output.getName()+"\nTeam: "+output.getTeam();
	}
	
	//search through list for player with highest number winning goals and print his name
	public String mostValuable(){
		int max = 0;
		PlayerRecord p = playerList.first();
		PlayerRecord output = null;
		while(p!=null){
			if(p.getNumWinningGoals()>max){
				max=p.getNumWinningGoals();
				output=p;
			}
			p = playerList.next();
		}
		return output.getName()+"\nTeam: "+output.getTeam();
	}
	
	//find team with most won games based on players winning goals count
	public String teamWonMostGames(){
		String output="No teams have won yet!";
		if(playerList.isEmpty())
			output="No players loaded!";
		else{
			LinkedList<String> teams = new LinkedList<String>();
			LinkedList<Integer> gamesWon = new LinkedList<Integer>();
			//scan through list of players
			PlayerRecord p = playerList.first();
			int maxWins = 0;
			int maxWinsTeam =-1;
			while(p!=null){
				//get team name
				String team = p.getTeam();
				int wins = p.getNumWinningGoals();
				//if team name is not in list add to end of list
				//if team name is in list, get index
				int index = teams.indexOf(team);
				if(index==-1){
					teams.add(team);
					gamesWon.add(0);
					index = teams.size()-1;
				}
				//if player scored any Winning goals, += the gamesWon at that index by that amount
				else{
					int teamWins = gamesWon.getAt(index)+wins;
					gamesWon.setAt(teamWins, index);
					//get index of highest gamesWon count and assign to maxWinsTeam
					if(teamWins>maxWins){
						maxWins=teamWins;
						maxWinsTeam = index;
					}
				}
				p=playerList.next();
			}
			if(maxWinsTeam!=-1)
				output = teams.getAt(maxWinsTeam)+" with a total of "+maxWins+" wins!";
		}
		return output;
	}
	
	//search through list for players that match this position and team
	public String playerType(String position, String team){
		String output = "Players:\n";
		PlayerRecord p = playerList.first();
		if(p==null)
			return output+"Not Found";
		while(p!=null){
			if(p.getPosition().equalsIgnoreCase(position)
					&& p.getTeam().equalsIgnoreCase(team))
				output+=p.getName()+" "+p.getTotalPoints()+"\n";
			p = playerList.next();
		}
		return output;
	}
	
	//organized players in descending order of points and print them out
	public void playerRanking(){
		LinkedList<String> rankedNames = new LinkedList<String>();
		//using modified version of OrderedList to handle & accept duplicates
		//this will make inserting in the right order faster
		OrderedList<Integer> rankedPoints = new OrderedList<Integer>();
		PlayerRecord p = playerList.first();
		if(p!=null){ //add first player to start the list
			rankedNames.add(p.getName());
			rankedPoints.insert(p.getTotalPoints());
			p = playerList.next();
		}
		//scan through list of players
		while(p!=null){
			//use binary search on ordered list to insert & get index
			int index = rankedPoints.insert(p.getTotalPoints());
			//add player name to index returned binary search
			rankedNames.insertAt(p.getName(), index);
			p=playerList.next();
		}
		//print out ordered list
		int n = rankedPoints.size();
		for(int i=n-1; i>=0; i--)
			System.out.println(rankedPoints.get(i)+" "+rankedNames.getAt(i));
	}
	
	//some redundant code because we're not extending List.java
	public int size(){
		return playerList.size();
	}
	public boolean isEmpty(){
		return playerList.isEmpty();
	}
	public PlayerRecord firstPlayer(){
		return playerList.first();
	}
	public PlayerRecord nextPlayer(){
		return playerList.next();
	}
	public void enumerate(){
		playerList.enumerate();
	}
	public boolean contains(PlayerRecord p){
		return playerList.contains(p);
	}
	public void removePlayer(PlayerRecord p){
		playerList.remove(p);
	}
	public void removePlayerAll(PlayerRecord p){
		playerList.removeAll(p);
	}
	public void clear(){
		playerList.clear();
	}
}
