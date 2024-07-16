package day9;

public class MessageRunnable implements Runnable {
	private String message;
	private int delayTime;//Milliseconds
	
	
	public MessageRunnable(String message, int delayTime) {
		this.message = message;
		this.delayTime = delayTime;
	}


	@Override
	public void run() {
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
