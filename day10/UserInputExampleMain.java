package day10;

import java.io.InputStream;
import java.util.Scanner;

public class UserInputExampleMain {

	public static void main(String[] args) {
		// Obtaining InputStream associated with the Input Device: Keyboard
		InputStream keyboard = System.in;
		//Obtaining a Scanner on the top of this InputStream
		try(Scanner scr = new Scanner(keyboard)){
			System.out.println("Enter name: ");
			String name = scr.nextLine();
			System.out.println("Enter age: ");
			int age = scr.nextInt();
			System.out.println("Enter weight (Kg): ");
			float weight = scr.nextFloat();
			
			System.out.println("Thanks for submitting the information, here are your details: ");
			System.out.println("Name: " + name);
			System.out.println("Age: " + age + " years");
			System.out.println("Weight: " + weight + " Kgs");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
