package day8;

public class MessageThreadExampleMain {

	public static void main(String[] args) {
		Thread t1 = new MessageThread("Hello", 1000);
		Thread t2 = new MessageThread("Welcome", 500);
		t1.start();
		t2.start();

	}

}
