package day4;

public class OverridingExampleMain {

	public static void main(String[] args) {
		
		OfflineTraining offTrg = new OfflineTraining("OOP using Java", 11, "YCP AIT, Mumbai");
		OnlineTraining onTrg = new OnlineTraining("Web Based Java", 10, "https://www.zoom.us/38743");
		
		offTrg.conductTraining();
		onTrg.conductTraining();
		
		

	}

}
