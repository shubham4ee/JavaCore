package day10;

import java.util.Stack;

public class StackExampleMain {

	public static void main(String[] args) {
		Stack stackRef = new Stack();
		//Adding some elements
		
		stackRef.add("Hello");
		stackRef.add("Hi");
		stackRef.add("Welcome");
		stackRef.add(true);
		stackRef.add(15);
		
		//Printing the elements
		int size = stackRef.size();//Retrieving size of this Stack (No of elements available)
		//System.out.println(size);
		
		for(int index = 0; index < size; index++) {
			Object obj = stackRef.get(index);
			System.out.println(obj);
		}
		

	}

}






