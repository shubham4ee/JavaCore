package day6;

public class AnonymousInnerClassExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		String message = user.doGreet();
		System.out.println(message);
		//Changing the service to WelcomeService
		user.setService(new WelcomeService());
		message = user.doGreet();
		System.out.println(message);
		//Changing the service further to something else which is not available.
		/*
		 * user.setService(new GreetingService() { public String sayGreeting() { return
		 * "Hi"; } });
		 */
		user.setService(new GreetingService() {
			
			@Override
			public String sayGreeting() {
				// TODO Auto-generated method stub
				return "Hi";
			}
		});
		message = user.doGreet();
		System.out.println(message);
		
		user.setService(new GreetingService() {
			
			@Override
			public String sayGreeting() {
				// TODO Auto-generated method stub
				return "Bye";
			}
		});
		message = user.doGreet();
		System.out.println(message);
	}

}
