package day8;

public class NameNotFoundException extends Exception {
	private String invalidName;
	public NameNotFoundException(String errorMessage, String invalidName) {
		super(errorMessage);
		this.invalidName = invalidName;
	}
	//Overriding getMessage()
	@Override
	public String getMessage() {
		String message = super.getMessage();
		String finalMessage = message + " ==> " + invalidName;
		return finalMessage;
	}
}
