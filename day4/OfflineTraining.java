package day4;

public class OfflineTraining extends Training {
	private String venueDetails;

	public OfflineTraining() {
	
	}

	public OfflineTraining(String moduleName, int duration, String venueDetails) {
		super(moduleName, duration);
		this.venueDetails = venueDetails;
	}

	public String getVenueDetails() {
		return venueDetails;
	}

	public void setVenueDetails(String venueDetails) {
		this.venueDetails = venueDetails;
	}
	
	public void conductTraining() { 
		System.out.println("Conducting the training by visiting the venue: " + venueDetails);
	}
	public String getDetails() {
		String finalDetails = super.getDetails() + ", " + venueDetails;
		return finalDetails;
	}
	
}





