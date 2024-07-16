package day10;

import java.util.HashSet;
import java.util.Set;

public class HashSetExampleMain {

	public static void main(String[] args) {
		Set<String> rivers = new HashSet<>();
		rivers.add("Jhelum");
		rivers.add("Raavi");
		rivers.add("Godavari");
		rivers.add("Ganga");
		rivers.add("Yamuna");
		rivers.add("Sharayu");
		rivers.add("Yamuna");
		rivers.add("Yamuna");
		rivers.add("Yamuna");
		rivers.add("Yamuna");
		rivers.add("Yamuna");
		
		for(String river : rivers)
			System.out.println(river);
		System.out.println(rivers.size());
	}

}
