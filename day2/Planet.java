package day2;

public class Planet {
	private String name;
	private int moons;
	static int planetCount;//Since it is 'static', only one copy is created for the whole class.
	//maxMoons, minMoons, avgMoons
	public Planet() {
		planetCount++;
		name = "Earth";
		moons = 1;
	}
	public Planet(String name, int moons) {
		planetCount++;
		this.name = name;
		this.moons = moons;
	}
	public Planet(int moons, String name) {
		planetCount++;
		this.moons = moons;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoons() {
		return moons;
	}
	public void setMoons(int moons) {
		this.moons = moons;
	}

}
