package textAlert;

public class AbsentFan extends AbsentPartie {

	private String myTeam;

	public AbsentFan(String name, MatchAttender matchAttender, String team) {
		super(name, matchAttender);
		myTeam = team;

	}

	public String getMyTeam() {
		return myTeam;
	}
	
	public void react(TextMessage textMessage) {
		String reaction = textMessage.getLastScorer() + " has scored for the " + textMessage.getTeam() + " team after " +
				textMessage.getLastGoalTime() + " minute(s) of play." + " The score is now " +textMessage.getHomeTeamScore() + ": " + 
				textMessage.getAwayScore();
		if(this.getMyTeam().equalsIgnoreCase(textMessage.getTeam())) {
			System.out.println(this.getName() + " (" + this.getMyTeam() + " team fan): Yes! " + reaction);
		}
		if(!this.getMyTeam().equalsIgnoreCase(textMessage.getTeam()))  {
			System.out.println(this.getName() + " (" + this.getMyTeam() + " team fan): No! " + reaction);
		}
	}
	
	

}



