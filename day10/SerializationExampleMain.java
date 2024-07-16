package day10;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExampleMain {

	public static void main(String[] args) {
		// Program to serialize the object of Person class within a file: person.txt
		String filePath = "./src/day10/person.txt";
		//FileOutputStream --> filePath
		//ObjectOutputStream ---> FileOutputStream
		try(
				FileOutputStream fout = new FileOutputStream(filePath);
				ObjectOutputStream oout = new ObjectOutputStream(fout)
				){
			//Creating Person class object
			Person pers = new Person("Micky", 34);
			//Serializing the object
			oout.writeObject(pers);
			System.out.println("Person object is serialized.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
