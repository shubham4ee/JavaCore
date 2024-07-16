package day7;

public class EqualsExampleMain {

	public static void main(String[] args) {
		int x = 100;
		int y = 100;
		System.out.println("X == Y? " + (x == y));
		
		Mobile m1 = new Mobile("Samsung", "S12");
		Mobile m2 = new Mobile("Samsung", "S12");
		Mobile m3 = m2;
		System.out.println("m1 == m2? " + (m1 == m2));
		System.out.println("m2 == m3? " + (m2 == m3));
		
		boolean equal = m1.equals(m2);
		System.out.println("m1.equals(m2) : " + equal);
		
	}

}







