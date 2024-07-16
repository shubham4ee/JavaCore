package day7;

public class ToStringExampleMain {

	public static void main(String[] args) {
		int x = 100;
		System.out.println(x);
		
		Mobile m1 = new Mobile("Samsung", "S12");
		//m1.print();
		System.out.println(m1);//Implicit Call
		String mobileData = m1.toString();//Explicit Call
		System.out.println(mobileData);
	}

}
