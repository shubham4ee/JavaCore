package day10;

import java.util.ArrayList;

public class TypeSafeCollectionExampleMain {

	public static void main(String[] args) {
		ArrayList<String> cartoons = new ArrayList<>();//Declaring the collection type-safe for type: String
		cartoons.add("tom and jerry");
		cartoons.add("micky and donald");
		cartoons.add("Doraemon");
		cartoons.add("Pink panther");
		//cartoons.add(200);Error as cannot accept objects other than String
		
		
		//Printing all the cartoon names in Uppercase
		for(String cartoon : cartoons)
			System.out.println(cartoon.toUpperCase());

	}

}
