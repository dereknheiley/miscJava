/**
 * @author Derek
 * attributes for one player
 */
public class PlayerRecord {
	
	//instance variables
	private String name;
	private String team;
	private String position;
	private int numGames;
	private int numGoals;
	private int numAssists;
	private int numPenaltyMins;
	private int numWinningGoals;
	private int totalPoints = 0;
	
	//constructors
	public PlayerRecord(){
	}

	public PlayerRecord(String name, String team, String position,
			int numGames, int numGoals, int numAssists, int numPenaltyMins,
			int numWinningGoals) {
		this.name = name;
		this.team = team;
		this.position = position;
		this.numGames = numGames;
		this.numGoals = numGoals;
		this.numAssists = numAssists;
		this.numPenaltyMins = numPenaltyMins;
		this.numWinningGoals = numWinningGoals;
		this.totalPoints = numGoals + numAssists;
	}

	//get and set methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getNumGames() {
		return numGames;
	}
	public void setNumGames(int numGames) {
		this.numGames = numGames;
	}
	public int getNumGoals() {
		return numGoals;
	}
	public void setNumGoals(int numGoals) {
		this.numGoals = numGoals;
	}
	public int getNumAssists() {
		return numAssists;
	}
	public void setNumAssists(int numAssists) {
		this.numAssists = numAssists;
	}
	public int getNumPenaltyMins() {
		return numPenaltyMins;
	}
	public void setNumPenaltyMins(int numPenaltyMins) {
		this.numPenaltyMins = numPenaltyMins;
	}
	public int getNumWinningGoals() {
		return numWinningGoals;
	}
	public void setNumWinningGoals(int numWinningGoals) {
		this.numWinningGoals = numWinningGoals;
	}
	public int getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(int totalPoints) {
		this.totalPoints = totalPoints;
	}
	
	//toString method for printing a player
	public String toString(){
		return name+"\n"+team+"\n"+position+"\n"+numGames+"\n"+numGoals+"\n"+numAssists
				+"\n"+numPenaltyMins+"\n"+numWinningGoals+"\n"+totalPoints+"\n";
	}
}
