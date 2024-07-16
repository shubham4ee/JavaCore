package day7;

public class WithoutExceptionHandlerExampleMain {

	public static void main(String[] args) {
		//Program that accepts 2 numbers as command line arguments and prints sum
		//java WithoutExceptionHandlerExampleMain 10 20
		int n1 = Integer.parseInt(args[0]);
		int n2= Integer.parseInt(args[1]);
		int result = n1 + n2;
		System.out.println(result);

	}

}
