package day9;

public class MessageRunnableExampleMain {

	public static void main(String[] args) {
		Runnable r1 = new MessageRunnable("Hello", 1000);
		Runnable r2 = new MessageRunnable("Welcome", 500);
		Thread t1 = new Thread(r1);//Setting Runnable as a target
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thank you !!");

	}

}
