package day8;

public class DefaultExceptionHandlerExampleMain {

	public static void main(String[] args) {
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2= Integer.parseInt(args[1]);//abc
			int result = n1 / n2;
			System.out.println(result);
		}
		//Handling Multiple Exceptions using single 'catch' block:
		catch(ArithmeticException | ArrayIndexOutOfBoundsException ex) {
			if(ex instanceof ArrayIndexOutOfBoundsException)
				System.out.println("Please enter at least 2 numbers...");
			else
				System.out.println("Enter 2nd value as non-zero...");
		}
		/*catch(ArithmeticException ex) {
			System.out.println("Enter 2nd value as non-zero...");
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			//Here reference 'ex' refers to the object of type: ArrayIndexOutOfBoundsException which
			//is created by JRE
			System.out.println("Please enter at least 2 numbers...");
		}*/
		catch(RuntimeException rx) {
			
		}
		catch(Exception exRef) {
			System.out.println("General Error");
		}
		catch(Throwable t) {
			
		}

	}

}
