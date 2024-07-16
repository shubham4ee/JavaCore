package day8;

public class ThrowsExampleMain {
	private static void doTest() throws Exception {
		//This method is telling compiler that its code may fire some exception: Exception but not willing to
		//handle it. Rather its caller should handle it.
	}
	
	private static void doSomeTest() {
		//Invoking doTest() and handling the exception
		try {
			doTest();
		}
		catch(Exception ex) {
			
		}
	}
	
	private static void doAnotherTest() throws Exception{
		//Invoking doTest() but not handling the exception; rather delegating the responsibility to its caller
		doTest();
	}

	private static void doSimpleTest() throws RuntimeException {
		
	}
	public static void main(String[] args) {
		// Invoking doSomeTest()
		doSomeTest();
		//Invoking doAnotherTest();
		try {
			doAnotherTest();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//Use this option when the project is in DEVELOPMENT phase or TESTING phase.
			//Do not use this option when the project is in PRODUCTION phase.
		}
		
		//Invoking doSimpleTest();
		doSimpleTest();
	}

}




