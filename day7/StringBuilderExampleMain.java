package day7;

public class StringBuilderExampleMain {

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder();//Creating an empty builder
		//Adding something using 'append()' methods.
		builder.append("Hello everyone!!, My name is James and my age is ");
		builder.append(57);
		builder.append(" years and my weight is ");
		builder.append(89.45);
		builder.append(" Kgs and my covid vaccination status is ");
		builder.append(true);
		
		System.out.println(builder);
		String data = builder.toString();
		System.out.println(data);
		
		

	}

}
