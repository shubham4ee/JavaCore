package day9;

public class Counter {
	private int count;
	
	public void doIncrement5Times() throws InterruptedException {
		for(int a=1;a<=5;a++) {
			count++;
			System.out.println("Tick tick UP: " + count);
			Thread.sleep(1000);
		}
	}
	
	public void doDecrement5Times() throws InterruptedException {
		for(int a=1;a<=5;a++) {
			count--;
			System.out.println("Tick tick DOWN: " + count);
			Thread.sleep(1000);
		}
	}
}
