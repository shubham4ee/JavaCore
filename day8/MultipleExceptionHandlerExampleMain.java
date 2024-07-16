package day8;

public class MultipleExceptionHandlerExampleMain {

	public static void main(String[] args) {
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2= Integer.parseInt(args[1]);
			int result = n1 / n2;
			System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			//Here reference 'ex' refers to the object of type: ArrayIndexOutOfBoundsException which
			//is created by JRE
			System.out.println("Please enter at least 2 numbers...");
		}
		catch(ArithmeticException ex) {
			System.out.println("Enter 2nd value as non-zero...");
		}

	}

}
