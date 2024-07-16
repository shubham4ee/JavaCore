package day9;

public class CounterThread extends Thread {
	private Counter counterRef;
	
	public CounterThread(Counter counterRef, String threadName) {
		super(threadName);//Assigning name to the thread
		this.counterRef = counterRef;
	}

	public void run() {
		synchronized (counterRef) {
			//Obtaining handle to the currently running thread
			Thread currentRunningThread = Thread.currentThread();
			//Obtaining the name of that thread
			String currentRunningThreadName = currentRunningThread.getName();
			if(currentRunningThreadName.equals("increment")) {
				try {
					counterRef.doIncrement5Times();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				try {
					counterRef.doDecrement5Times();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
}











