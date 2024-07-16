package day11;

import java.util.Comparator;

public class FruitNameWiseAscendingComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit f1, Fruit f2) {
		// TODO Auto-generated method stub
		String firstName = f1.getName();
		String secondName = f2.getName();
		int comparison = firstName.compareTo(secondName);
		return comparison;
	}

}
