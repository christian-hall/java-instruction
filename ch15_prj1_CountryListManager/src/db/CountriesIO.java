package db;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class CountriesIO {

	// This class represents I/O to and from our
	// countires.txt file.
	// We will store the countries in an ArrayList
	// named "countries" and will write that list to
	// countries.txt whenever we change the list.

	// Reference Page 481 ProductTextFile for an example.
	private List<String> countries = null;
	private Path countriesPath = null;
	private File countriesFile = null;
	// no need for a field seperator, there are only strings

	public CountriesIO() {// this is a constructor
		countriesPath = Paths.get("countries.txt");
		countriesFile = countriesPath.toFile();
		getCountries(); //populates the ArrayList if it doesn't exist

	}
	
	public List<String> getCountries(){
		//only read the countries.txt file of countries is null
		if (countries == null) {
			countries = new ArrayList<>(); //initializes an empty array
			if (Files.exists(countriesPath)) {
				try (BufferedReader in = new BufferedReader(
						                 new FileReader(countriesFile))) {
					//read countries from file into array list
					String line = in.readLine();
					while (line != null) {
						countries.add(line); //each line that is read represents a country
						line = in.readLine();
					}			
				}
				catch (IOException e) {
					e.printStackTrace(); // same thing as a sysoutprintln()
				}
			}
			else {
				//create the file
				try {
					Files.createFile(countriesPath);
					System.out.println("**countries file created**");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
			
		return countries;
	
	}
	
	public boolean saveCountries() {
		boolean success = false;
		try (PrintWriter out = new PrintWriter(
				               new BufferedWriter(
				               new FileWriter(countriesFile)))) {
			//write all countries from our list to the file
			for (String country: countries) {
				out.println(country); //prints a country on each line of text
			}
			success = true;
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return success;
	}
	
	public void addCountries(String country) {
		countries.add(country); //adds a new item to the ArrayList
		saveCountries();
	}

}
