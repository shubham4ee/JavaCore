package day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExampleMain2 {//Using try-with-resources

	public static void main(String[] args) {
		// A program that reads the contents of the file and displays them
		String filePath = "./src/day9/messages.txt";
		try (FileInputStream fin = new FileInputStream(filePath)){
			
			while(true) {
				int data = fin.read();
				if(data == -1)//Checking for EOF
					break;
				char ch = (char)data;//Type casting from int to char
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File does not exist.");
		}
		catch(IOException ex) {
			System.out.println("IO Error");
		}		
	}
}















