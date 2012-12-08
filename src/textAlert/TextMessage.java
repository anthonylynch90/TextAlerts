package textAlert;

public class TextMessage {

	private int homeScore;
	private int awayScore;
	private double lastGoalTime;
	private String lastScorer;
	private String team;

	public TextMessage(int homeScore, int awayScore, double lastGoalTime, String lastScorer, String team) {
		this.homeScore = homeScore;
		this.awayScore = awayScore;
		this.lastGoalTime = lastGoalTime;
		this.lastScorer = lastScorer;
		this.team = team;
	}

	public double getLastGoalTime() {
		return lastGoalTime;
	}

	public int getAwayScore() {
		return awayScore;
	}
	
	public int getHomeScore() {
		return homeScore;
	}
	
	public String getLastScorer() {
		return lastScorer;
	}

	public int getHomeTeamScore() {
		return homeScore;
	}
	
	public String getTeam() {
		return team;
	}
	

}



