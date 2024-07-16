package day10;

import java.util.Stack;

public class StackExampleMain2 {

	public static void main(String[] args) {
		Stack stackRef = new Stack();
		//Adding some elements
		
		stackRef.add("Hello");
		stackRef.add("Hi");
		stackRef.add("Welcome");
		stackRef.add(true);
		stackRef.add(15);
		
		//Pushing some elements into the stack.
		stackRef.push(100);
		stackRef.push(200);
		stackRef.push(300);
		
		int size = stackRef.size();
		System.out.println("Current Size: " + size);
		
		//Popping the element
		Object poppedObject = stackRef.pop();
		System.out.println("Popped Object is " + poppedObject);
		size = stackRef.size();
		System.out.println("Current Size: " + size);
		
		//Peeking the element
		Object peekedObject =  stackRef.peek();
		System.out.println("Peeked Object is " + peekedObject);
		stackRef.size();
		System.out.println("Current Size: " + size);
	}

}






