package day4;

public class Player {
	private String name;
	private int age;
	
	public Player() {
		System.out.println("Player()");
	}
	public Player(String name, int age) {
		System.out.println("Player(String, int)");
		this.name = name;
		this.age = age;
	}
	public Player(int age, String name) {
		System.out.println("Player(int, String)");
		this.age = age;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
