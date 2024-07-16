package day4;

public class OnlineTraining extends Training {
	private String meetingLink;

	public OnlineTraining() {
		
	}

	public OnlineTraining(String moduleName, int duration, String meetingLink) {
		super(moduleName, duration);
		this.meetingLink = meetingLink;
	}

	public String getMeetingLink() {
		return meetingLink;
	}

	public void setMeetingLink(String meetingLink) {
		this.meetingLink = meetingLink;
	}
	
	public void conductTraining() { 
		System.out.println("Conducting the training by accessing the meeting link: " + meetingLink);
	}
	
	public String getDetails() {
		String finalDetails = super.getDetails() + ", " + meetingLink;
		return finalDetails;
	}
	
}



