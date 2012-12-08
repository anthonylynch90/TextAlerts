package textAlert;

public class World {

	private MatchAttender matchAttender;

	public World() {
		matchAttender = new MatchAttender();
		
	}

	public void playSequenceOfEvents() {
		SportsReporter reporter1 = new SportsReporter("Ross Sheridian", matchAttender);
		reporter1.subscribe();
		FootballScout footballScout1 = new FootballScout("Oisin Mcdonnell", matchAttender);
		footballScout1.subscribe();
		AbsentFan fan1 = new AbsentFan("Anthony Lynch", matchAttender, "home");
		fan1.subscribe();
		AbsentFan fan2 = new AbsentFan("Tommy Smith", matchAttender, "home");
		fan2.subscribe();
		AbsentFan fan3 = new AbsentFan("Sarah Thomson", matchAttender, "away");
		fan3.subscribe();
		
		matchAttender.setTeamScore("Home", 23, "Wayne Rooney");
		matchAttender.setTeamScore("Away", 39, "Steven Gerard");
		matchAttender.setTeamScore("away", 65, "Fernando torres");
		fan2.unsubscribe();
		matchAttender.setTeamScore("home", 73, "Micheal Owen");
		reporter1.unsubscribe();
		matchAttender.setTeamScore("Home", 89, "Darren Fletcher");
		
	}

	public static void main(String[] args) {
		World world = new World();
		world.playSequenceOfEvents();
	}
}



