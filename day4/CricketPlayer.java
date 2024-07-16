package day4;

public class CricketPlayer extends Player{
	private int runs;
	
	public CricketPlayer() {
		System.out.println("CricketPlayer()");
	}
	
	public CricketPlayer(String nm, int ag, int rn) {
		//super(nm, ag);
		super();
		runs = rn;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
	
}
