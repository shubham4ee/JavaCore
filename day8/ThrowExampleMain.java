package day8;

public class ThrowExampleMain {
	private static int divide(int x, int y) {
		//Throwing RuntimeException with some message if the 2nd value is 0
		if(y == 0) {
			RuntimeException rx = new RuntimeException("Enter 2nd value as non zero...");
			throw rx;//Throwing RuntimeException
		}
		int division = x / y;
		return division;
	}
	public static void main(String[] args) {
		try {
			int result = divide(10, 0);
			System.out.println(result);
		}
		catch(RuntimeException rxRef) {
			String errorMessage = rxRef.getMessage();
			System.out.println("ERROR: " + errorMessage);
		}
		

	}

}
