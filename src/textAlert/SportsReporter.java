package textAlert;

public class SportsReporter extends AbsentPartie {

	public SportsReporter(String name, MatchAttender matchAttender) {
		super(name, matchAttender);
		
	}
	
	public void react(TextMessage textMessage){
		System.out.println(this.getName() + " (Sports Reporter): Apparently " + textMessage.getLastScorer() +
					" scored after " + textMessage.getLastGoalTime() +" minute(s) of play. I need to update" +
							" the papers website!");	
	}

}



