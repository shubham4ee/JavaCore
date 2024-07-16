package day4;

public class OverridingExampleMain2 {

	public static void main(String[] args) {
		Training trg;
		trg = new OnlineTraining("Web Based Java", 10, "https://www.zoom.us/38743");
		trg.conductTraining();
		
		trg = new OfflineTraining("OOP using Java", 11, "YCP AIT, Mumbai");
		trg.conductTraining();
		System.out.println(trg.getModuleName());
		//trg.getVenueDetails();
		
		OfflineTraining offTrgRef = (OfflineTraining)trg;
		System.out.println(offTrgRef.getVenueDetails());
		System.out.println(((OfflineTraining)trg).getVenueDetails());
		
		
		//The following code is illegal
		//OfflineTraining ref = new Training();
		//OfflineTraining ref = new OnlineTraining();
		
	}

}
