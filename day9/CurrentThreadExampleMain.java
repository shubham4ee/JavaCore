package day9;

public class CurrentThreadExampleMain {

	public static void main(String[] args) {
		//Obtaining a handle to the currently running thread i.e. main thread
		Thread mainThread = Thread.currentThread();
		String mainThreadName = mainThread.getName();
		int mainThreadPriority = mainThread.getPriority();
		System.out.println("Main thread details: ");
		System.out.println("Name: " + mainThreadName);
		System.out.println("Priority: " + mainThreadPriority);
		//Stopping this main thread
		mainThread.stop();
		System.out.println("This message will not get printed");
	}

}
