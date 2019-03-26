
public class SoccerTeam {
	
	private String name;
	private SoccerTrainer Trainer;
	private int tablePosition;
	private int goalsScored;
	private int goalsAgainst;
	
	private SoccerPlayer [] players = new SoccerPlayer[11];
	
	public SoccerTeam(String name,SoccerTrainer Trainer,int tablePosition) {
		this.name = name;
		this.Trainer = Trainer;
		this.tablePosition = tablePosition;
	}
    
	public String getName() {
		return this.name;
	}
	
	public boolean addPlayer(SoccerPlayer player){
		//check for first empty slot in array
		for(int i=0;i<players.length;i++){
			if(players[i]==null){
				
				players[i]=player;
				players[i].setTeam(this);
				players[i].setNumber(i+1);
				
				return true;
			}
		}
		return false;

	}
	public void goal(int playerNumber) {
		players[playerNumber-1].increaseGoalCount();
		goalsScored++;
	}
	
	public void goalAgainst() {
		this.goalsAgainst++;
	}
	
	public String ratioString() {
		return  goalsScored + ":" + goalsAgainst;
	}
	public String toString() {
		String result = name+Trainer.getName()+ratioString() + "\n";
		
		for(int i=0;i<players.length;i++) {
			result+=players[i].toString();
			result +="\n";
		}
		
		return result;
	}
}
