import java.util.ArrayList;
class Team{
	private String teamName;
	private int teamRank;
	private ArrayList<String> members = new ArrayList<String>();
	
	public Team(String teamName){
		this.teamName = teamName;
		
	
	}
	
	public int setRank(int rank){
		this.teamRank = rank;
		return teamRank;
	}
	
	public String toString(){
		return("Hold: "+teamName + " Rang: "+teamRank);
	}
	
}