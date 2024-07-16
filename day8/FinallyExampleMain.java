package day8;

public class FinallyExampleMain {

	public static void main(String[] args) {
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2= Integer.parseInt(args[1]);
			int result = n1 / n2;
			System.out.println(result);
		}		
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			if(ex instanceof ArrayIndexOutOfBoundsException)
				System.out.println("Please enter at least 2 numbers...");
			else
				System.out.println("Enter 2nd value as non-zero...");
		}		
		catch(Exception exRef) {
			System.out.println("General Error");
		}
		//finally {
			System.out.println("Done !!");
		//}	

	}

}
