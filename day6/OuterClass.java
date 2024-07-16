package day6;

public class OuterClass {
	
	private int x = 10;
	private static int y = 20;
	
	public void print() {
		class Message {//This class is local to the method: print()
			String getMessage(String name, String greeting) {
				return greeting + " " + name;
			}
		}
		//Creating Message class object
		Message messageRef = new Message();
		String greeting = messageRef.getMessage("John", "Welcome");
		System.out.println(greeting);
	}
	public static class StaticInnerClass {
		public void show() {
			//System.out.println(x); Error: x is non-static and therefore it is not accessible.
			System.out.println(y);
		}
	}
	
	public class NestedClass {
		public void show() {
			System.out.println(x);
			System.out.println(y);
		}
	}
	
}
