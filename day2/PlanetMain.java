package day2;

public class PlanetMain {

	public static void main(String[] args) {
		Planet ourPlanet = new Planet();
		Planet biggestPlanet = new Planet("Jupiter", 16);
		Planet secondBiggestPlanet = new Planet(14, "Saturn");
		
		System.out.println("No. of planets: " + Planet.planetCount);
		System.out.println("---------Creating 5 more Planet objects");
		for(int a=1;a<=15;a++) {
			new Planet();
		}
		System.out.println("No. of planets: " + Planet.planetCount);

	}

}
