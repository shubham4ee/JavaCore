package day4;

public class SoccerPlayer extends Player {
	private int goals;
	
	public SoccerPlayer() {
		System.out.println("SoccerPlayer()");
	}
	

	public SoccerPlayer(int age, String name, int goals) {
		super(age, name);
		this.goals = goals;
	}


	public int getGoals() {
		return goals;
	}

	public void setGoals(int goals) {
		this.goals = goals;
	}
	
}
