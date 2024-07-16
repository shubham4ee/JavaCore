package day6;

public class InterfaceLooseCouplingExampleMain {

	public static void main(String[] args) {
		User user = new User();
		String message = user.doGreet();
		System.out.println(message);
		//Changing the default service (HelloService) to customized service (WelcomeService)
		GreetingService differentService = new WelcomeService();
		user.setService(differentService);
		message = user.doGreet();
		System.out.println(message);
		System.out.println("==============================");
		//Creating another user with name: Merry and service: WelcomeService
		//User user2 = new User("Merry", new WelcomeService());
		
		GreetingService welcomeServiceRef = new WelcomeService();
		User user2 = new User("Merry", welcomeServiceRef);
		message = user2.doGreet();
		System.out.println(message);
		
	}

}








