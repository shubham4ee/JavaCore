package day6;

public class InnerClassExampleMain {

	public static void main(String[] args) {
		//Creating an object of StaticInnerClass which is enclosed within OuterClass
		OuterClass.StaticInnerClass staticInnerClassRef = new OuterClass.StaticInnerClass();
		staticInnerClassRef.show();
		
		System.out.println("==============");
		//Creating an object of NestedClass using the object of OuterClass
		OuterClass outerClassRef = new OuterClass();
		OuterClass.NestedClass nestedClassRef = outerClassRef.new NestedClass();
		//OR
		//OuterClass.NestedClass nestedClassRef = new OuterClass().new NestedClass();
		nestedClassRef.show();
		System.out.println("================");
		outerClassRef.print();
		
	}

}
