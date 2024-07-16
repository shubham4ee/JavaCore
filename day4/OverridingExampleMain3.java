package day4;

public class OverridingExampleMain3 {

	public static void main(String[] args) {
		Training trg;
		trg = new OnlineTraining("Web Based Java", 10, "https://www.zoom.us/38743");
		System.out.println(trg.getDetails());
		
		trg = new OfflineTraining("OOP using Java", 11, "YCP AIT, Mumbai");
		System.out.println(trg.getDetails());
		
		
		
		
		
	}

}
