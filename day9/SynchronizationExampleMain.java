package day9;

public class SynchronizationExampleMain {

	public static void main(String[] args) {
		Counter counterObject = new Counter();
		Thread t1 = new CounterThread(counterObject, "increment");
		Thread t2 = new CounterThread(counterObject, "decrement");
		t1.start();
		t2.start();

	}

}
