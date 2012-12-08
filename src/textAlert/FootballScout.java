package textAlert;

public class FootballScout extends AbsentPartie {

	public FootballScout(String name, MatchAttender matchAttender) {
		super(name, matchAttender);
	}
	
	public void react(TextMessage textMessage) {
			System.out.println(this.getName() + " (football scout): Apparently " +textMessage.getLastScorer()
					+ " has scored. If he keeps scoring, I'll have to arrange to go and see him play");
		
	}
}
	
	







