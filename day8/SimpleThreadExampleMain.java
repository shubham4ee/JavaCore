package day8;

public class SimpleThreadExampleMain {

	public static void main(String[] args) {
		Thread t1 = new SimpleThreadImpl();
		//Launching the thread using 'start()'
		t1.start();

	}

}
