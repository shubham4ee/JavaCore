package day10;

import java.util.HashSet;
import java.util.Set;

public class HashSetExampleMain2 {

	public static void main(String[] args) {
		//Declaring a HashSet which holds objects of type: River only.
		River river = new River("Ganga", 10);
		River river2 = new River("Brahmaputra", 7);
		River river3 = new River("Yamuna", 6);
		River river4 = new River("Yamuna", 6);
		River river5 = new River("Yamuna", 6);
		
		Set<River> allRivers = new HashSet<>();
		allRivers.add(river);
		allRivers.add(river2);
		allRivers.add(river3);
		allRivers.add(river4);
		allRivers.add(river5);
		
		for(River currentRiver : allRivers)
			System.out.println(currentRiver);
	}

}
