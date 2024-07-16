package day10;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExampleMain {

	public static void main(String[] args) {
		// Program to de-serialize the object of Person class from a file: person.txt
		String filePath = "./src/day10/person.txt";
		//FileInputStream ---> filePath
		//ObjectInputStream --> FileInputStream
		
		try(
				FileInputStream fin = new FileInputStream(filePath);
				ObjectInputStream oin = new ObjectInputStream(fin)
				){
			//De-serializing the Person object
			Object personObject = oin.readObject();
			System.out.println("De-serialized Object: " + personObject);
			//Displaying individual values of the object
			Person personRef = (Person)personObject;
			String name = personRef.getName();
			System.out.println(name);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}	
}
