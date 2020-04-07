package ui;

import java.util.List;

import business.Movie;
import db.DAO;
import db.MovieList;

public class BMDBConsoleApp {
	private static DAO<Movie> movieRepo = new MovieList();

	public static void main(String[] args) {
		// Welcome & Initialization
		System.out.println("Welcome to the BMDB Console App");
		String command = "";


		// - start loop
		while (!command.equalsIgnoreCase("exit")) {
			// get user input
			displayMenu();
			command = Console2.getString("Command?: ", true);
			
			// business calculations
			// display output
			switch (command) {
			case "get":
				getMovie();
				break;
			case "list":
				listMovies();
				break;
			case "add":
				addMovie();
				break;
			case "del":
				deleteMovie();
				break;
			case "exit":
				break;
			default:
				System.out.println("Invalid entry. Try again.");
				break;
			}

		}//- end loop
		// say goodbye
		System.out.println("Goodbye");

	}
	private static void deleteMovie() {
		// prompt user for id and get the movie
		Movie m = getIdAndReturnMovie();
		//delete the movie
		movieRepo.delete(m);
		//display confirmation message
		System.out.println("Movie has been deleted.");
		System.out.println();
		
	}
	private static void addMovie() {
		// prompt user for all movie data
		//int id = Console2.getInt("Movie ID:  ", 0, (int)Double.POSITIVE_INFINITY);
		String title = Console2.getString("Movie Title: ", true);
		int year = Console2.getInt("Release Year:  ", 0, (int)Double.POSITIVE_INFINITY);
		String rating = Console2.getString("Rating: ", true);
		String director = Console2.getString("Director(s): ", true);
		// add the movie
		Movie m = new Movie(0, title, year, rating, director); //invokes constructor for Movie class
		movieRepo.add(m);
		// display confirmation massage
		System.out.println("Movie successfully added.");
	}
	private static void listMovies() {
		// get list of all movies
		List<Movie> movies = movieRepo.list();
		// display to screen
		for (Movie m: movies) {
			System.out.println(m);
		}
		System.out.println();
		
	}
	private static void getMovie() {
		// prompt user for id
		Movie m = getIdAndReturnMovie();
		//display to screen
		System.out.println(m);
		
	}
	private static Movie getIdAndReturnMovie(){
		Movie m = null;
		while (m == null) {
			int id = Console2.getInt("Movie ID:  ", 0, (int)Double.POSITIVE_INFINITY);
			m = movieRepo.get(id);
			System.out.println();
		}
	
		
		return m;
	}
	
	private static void displayMenu() {
		StringBuilder menu = new StringBuilder("COMMAND MENU\n");
		menu.append("list   - List all movies\n");
		menu.append("get    - Get a movie by id\n");
		menu.append("add    - Add a movie\n");
		menu.append("del    - Delete a movie\n");
		menu.append("exit   - Exit the Program\n");
		System.out.println(menu);
	}


}
