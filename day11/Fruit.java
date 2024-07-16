package day11;

import java.util.Objects;

public class Fruit implements Comparable<Fruit>{
	private String name;
	private int marketSize;
	public Fruit() {
		// TODO Auto-generated constructor stub
	}
	public Fruit(String name, int marketSize) {
		this.name = name;
		this.marketSize = marketSize;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarketSize() {
		return marketSize;
	}
	public void setMarketSize(int marketSize) {
		this.marketSize = marketSize;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", marketSize=" + marketSize + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(marketSize, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return marketSize == other.marketSize && Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Fruit secondFruit) {
		//This method provides default sorting algorithm as per the following:
		//marketSize wise Descending
		Integer firstMarketSize = marketSize;// = this.marketSize
		Integer secondMarketSize = secondFruit.marketSize;
		int comparison = secondMarketSize.compareTo(firstMarketSize);
		return comparison;
	}

}








