package textAlert;

public abstract class AbsentPartie {

	private String name;
	private MatchAttender matchAttender;

	public AbsentPartie(String name, MatchAttender matchAttender) {
		this.name = name;
		this.matchAttender = matchAttender;
	}


	public void subscribe() {
		matchAttender.addAbsentPartieToList(this);
	}
	
	public void unsubscribe() {
		matchAttender.removeAbsentPartieFromList(this);
	}
	

	public String getName() {
		return name;
	}

	
	public abstract void react(TextMessage textmessage);
			
	
}
