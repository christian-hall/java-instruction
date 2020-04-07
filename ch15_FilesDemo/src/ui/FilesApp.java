package ui;

import java.io.*;
import java.nio.file.*;

public class FilesApp {

	public static void main(String[] args) throws IOException {
		// p. 463 create directory (folder)

		String dirString = "c:/temp"; // create a string that
		Path dirPath = Paths.get(dirString); // creates a path to a file
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath); // creates a path and creates the file
			System.out.println("Directory created!!!");

		} else {
			System.out.println("directory " + dirString + " already exists.");
		}
		// gets a directory and creates a text file
		String fileString = "products.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			System.out.println("Created a file");
			Files.createFile(filePath);
		} else {
			System.out.println("file already exists");
		}
		System.out.println("File name:     "+filePath.getFileName());
		System.out.println("Absolute Path: "+filePath.toAbsolutePath());
		System.out.println("Is writeable:  "+Files.isWritable(filePath));
		
		//display files in a directory
		
		if (Files.exists(dirPath) &&Files.isDirectory(dirPath)) { //makes sure this path is a directory
			System.out.println("Directory: " +dirPath.toAbsolutePath());
			System.out.println("Files:");
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath); //calls new stream
			for (Path p: dirStream) {
				if (Files.isRegularFile(p)) {
					System.out.println("      " +p.getFileName()); //sees what is inside of the stream
				}
			}
			
		}
		//p. 467 - write and read data
		//open output stream
		Path productsPath = Paths.get("products.txt"); //create a path variable for the file
		File productsFile = productsPath.toFile();
		
		//write data to the file
		PrintWriter out = new PrintWriter(
						  new BufferedWriter(
						  new FileWriter(productsFile)));
		out.println("java\tMurach's Java Programming\t57.50");
		//close the output stream to free system resources
		out.close();
		
		//read data from a file
		BufferedReader in = new BufferedReader(
			                new FileReader(productsFile));
		System.out.println("Read data from the file...");
		String line = in.readLine();
		System.out.println(line);
		
		//close the input stream
		in.close();
		
	}

}
