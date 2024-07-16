package day10;

import java.util.Vector;

public class VectorExampleMain {

	public static void main(String[] args) {
		Vector vectorRef = new Vector();
		int size = vectorRef.size();
		int capacity = vectorRef.capacity();
		System.out.println("Initial Size: " + size);
		System.out.println("Initial Capacity: " + capacity);
		
		vectorRef.add("India");
		vectorRef.add("India");
		vectorRef.add("India");
		vectorRef.add("India");
		vectorRef.add("Australia");
		vectorRef.add(500);
		size = vectorRef.size();
		capacity = vectorRef.capacity();
		System.out.println("New Size: " + size);
		System.out.println("New Capacity: " + capacity);
		
		//Adding 10 more objects
		for(int num = 1; num<=10; num++)
			vectorRef.add(num);
		
		size = vectorRef.size();
		capacity = vectorRef.capacity();
		System.out.println("Final Size: " + size);
		System.out.println("Final Capacity: " + capacity);
		
		System.out.println("Printing the elements: ");
		for(Object obj : vectorRef)
			System.out.println(obj);
	}

}











