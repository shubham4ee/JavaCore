package day2;

public class MathOperationsMain {

	 static public void main(String[] args) {
		 int x;
		 x = 10;//Local variable must be initialized.
		 System.out.println(x);
		 System.out.println("Program's execution begins...");
		int square = MathOperations.getSquare(5);
		System.out.println(square);
		float rcp = MathOperations.getReciprocal(7);
		System.out.println(rcp);
		
		MathOperations mo = new MathOperations();
		System.out.println(mo.getSquare(10));
	}
	 
	 static {
		 System.out.println("Class is getting loaded");
	 }

}
