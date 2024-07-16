package day8;

public class MessageThread extends Thread {
	private String message;
	private int delayTime;//Milliseconds
	
	public MessageThread(String message, int delayTime) {
		this.message = message;
		this.delayTime = delayTime;
	}

	public void run() {
		//Print the message 10 times using the time gap
		for(int a=1;a<=10;a++) {
			System.out.println(message);
			//Introducing a time gap using Thread's sleep() method.
			try {
				Thread.sleep(delayTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	 
}











