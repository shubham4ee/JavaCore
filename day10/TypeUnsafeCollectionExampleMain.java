package day10;

import java.util.ArrayList;

public class TypeUnsafeCollectionExampleMain {

	public static void main(String[] args) {
		ArrayList cartoons = new ArrayList();
		cartoons.add("tom and jerry");
		cartoons.add("micky and donald");
		cartoons.add("Doraemon");
		cartoons.add("Pink panther");
		
		//Printing all the cartoon names in Uppercase
		for(Object obj : cartoons) {
			String cartoon = (String)obj;
			System.out.println(cartoon.toUpperCase());
		}

	}

}
