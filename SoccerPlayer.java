
public class SoccerPlayer {
	private String name;
	private int number;
	private SoccerTeam Team;
	private boolean cardR;
	private boolean cardY;
	private int goalsScored;
	
	public SoccerPlayer(String name) {
		this.name = name;
	}
	
	public void redCard() {
		  cardR=true;
	}
	public void yellowCard() {
		if(cardY==true) {
			redCard();
			
		}
	}
	
	public int getNumber() {
		return this.number;
	}
	public int setNumber(int number) {
		return this.number= number;
	}
	public String getname() {
		return this.name;
	}
	
	public SoccerTeam getTeam() {
		return this.Team;
	}
	public void increaseGoalCount() {
		this.goalsScored++;
	}
	public void setTeam(SoccerTeam newTeam) {
		this.Team = newTeam;
	}
	public String toString() {
		return name + number + Team.getName()+ goalsScored;
	}

}
