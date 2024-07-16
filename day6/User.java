package day6;

public class User {
	private String name;
	private GreetingService service;//Which service will get used is not known at this moment.
	public User() {
		name = "Jack";
		service = new HelloService();//Setting HelloService as a Default Service
	}
	
	
	public User(String name, GreetingService service) {
		this.name = name;
		this.service = service;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public GreetingService getService() {
		return service;
	}


	public void setService(GreetingService service) {
		this.service = service;
	}


	public String doGreet() {
		String serviceMessage = service.sayGreeting();
		String greetingMessage = serviceMessage + " " + name;
		return greetingMessage;
	}

}






