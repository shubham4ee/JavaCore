package day2;

public class MathOperations {
	int x;
	static int y;
	public void doWork() {//Non Static method can access static as well as non static members
		x = 10;
		y = 20;
		System.out.println(this);
	}
	static public  void doWorkAgain() {//Static method can access only static members
		//x = 10;  Error as 'x' is non static
		y = 20;
		//System.out.println(this);//Error: Cannot use this in a static context
	}
	//getSquare
	public static int getSquare(int num) {
		return num * num;
	}
	public static float getReciprocal(int num) {
		return 1.0f/ num;
	}
}
