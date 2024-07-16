package day10;

import java.io.FileOutputStream;

public class FileWriteExampleMain {

	public static void main(String[] args) {
		//This program writes data into file using WRITE mode
		String filePath = "./src/day10/instructions.txt";
		try(FileOutputStream fout = new FileOutputStream(filePath)){
			String instructionsData = "Explore yourself using internet for new things.";
			//Converting String data into byte array
			 byte[] data = instructionsData.getBytes();
			 fout.write(data);//Writing the whole data
			 System.out.println("Data is written to file.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
