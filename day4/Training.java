package day4;

public class Training {
	private String moduleName;
	private int duration;//Days
	public Training() {
		// TODO Auto-generated constructor stub
	}
	public Training(String moduleName, int duration) {
		this.moduleName = moduleName;
		this.duration = duration;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public void conductTraining() { }//Empty Implementation
	
	public String getDetails() {
		String details = moduleName + ", " + duration;
		return details;
	}

}





