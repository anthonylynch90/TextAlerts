package textAlert;

import java.util.ArrayList;

public class MatchAttender {

	private int homeScore;
	private int awayScore;
	private double LastGoalTime;
	private String lastScorer;
	private ArrayList <AbsentPartie> subscribers = new ArrayList<AbsentPartie>();
	private String whichTeamScoredLast;

	public MatchAttender() {	
	}	
	
	public void addAbsentPartieToList(AbsentPartie absentPartie) {
		subscribers.add(absentPartie);
	}
	

	public void removeAbsentPartieFromList(AbsentPartie absentPartie) {
		subscribers.remove(absentPartie);
	}

	public void informAbsentFans() {
		TextMessage textMessage = new TextMessage(homeScore, awayScore, LastGoalTime, lastScorer, whichTeamScoredLast);
		for(AbsentPartie absentPartie: subscribers) {
			absentPartie.react(textMessage);
		}
	}

	public void setTeamScore(String whichTeamScored, double newTime, String newLastScorer ) {
		if(whichTeamScored.equalsIgnoreCase("home")) {
			homeScore++;
		}
		if(whichTeamScored.equalsIgnoreCase("away")){
			awayScore++;
		}
		whichTeamScoredLast = whichTeamScored;
		LastGoalTime = newTime;
		lastScorer = newLastScorer;
		this.informAbsentFans();
	}
}

	
	








