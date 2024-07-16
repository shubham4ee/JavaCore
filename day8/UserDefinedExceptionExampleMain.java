package day8;

public class UserDefinedExceptionExampleMain {

	public static void main(String[] args) {
		try {
			int position = NamesRepository.getPosition("Anushka");
			System.out.println(position);
		} catch (NameNotFoundException nxRef) {
			// TODO Auto-generated catch block
			String message = nxRef.getMessage();
			System.out.println(message);
		}

	}

}
