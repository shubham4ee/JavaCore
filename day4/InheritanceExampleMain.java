package day4;

public class InheritanceExampleMain {

	public static void main(String[] args) {
		CricketPlayer cp = new CricketPlayer();
		cp.setName("Virat");
		cp.setAge(35);
		cp.setRuns(13545);
		
		SoccerPlayer sp = new SoccerPlayer();
		sp.setName("Ronaldo");
		sp.setAge(32);
		sp.setGoals(89);
		
		//Remaining code to get and print values
		System.out.println(cp.getName());
		System.out.println(cp.getRuns());
		

	}

}
