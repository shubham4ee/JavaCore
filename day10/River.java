package day10;

import java.util.Objects;

public class River {
	private String name;
	private int length;
	public River() {
		// TODO Auto-generated constructor stub
	}
	public River(String name, int length) {
		this.name = name;
		this.length = length;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "River [name=" + name + ", length=" + length + "]";
	}
	@Override
	public int hashCode() {
		System.out.println("Inside hashCode()");
		return Objects.hash(length, name);
	}
	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside equals()");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		River other = (River) obj;
		return length == other.length && Objects.equals(name, other.name);
	}

}
