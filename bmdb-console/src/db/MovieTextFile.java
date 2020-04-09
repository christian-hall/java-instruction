package db;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

import business.Movie;

public class MovieTextFile implements DAO<Movie> {
	private List<Movie> movies = null;
	private Path moviesPath = null;
	private File moviesFile = null;
	private final String FIELD_SEP = "\t";

	public MovieTextFile() {
		moviesPath = Paths.get("movies.txt");
		moviesFile = moviesPath.toFile();
		movies = this.list();
	}

	@Override
	public Movie get(int id) {
		for (Movie m : movies) {
			if (m.getId() == id) {
				return m;
			}
		}
		return null;
	}

	@Override
	public List<Movie> list() {
		// if the products file has already been read, don't read it again
		if (movies != null) {
			return movies;
		}

		movies = new ArrayList<>();
		if (Files.exists(moviesPath)) {
			try (BufferedReader in = new BufferedReader(new FileReader(moviesFile))) {

				// read products from file into array list
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(FIELD_SEP);// separates fields in the line into an array
					String idString = fields[0]; // id is normally an int, but it is a String for the array
					int id = Integer.parseInt(idString); // this turns the string into an int
					String title = fields[1];
					String yearString = fields[2];
					int year = Integer.parseInt(yearString);
					String rating = fields[3];
					String director = fields[4];

					Movie m = new Movie(id, title, year, rating, director);
					movies.add(m);// this adds the movie into the arraylist of movies

					line = in.readLine();
				}
			} catch (IOException e) {
				System.out.println(e);
				return null;
			}
		} else {
			System.out.println(moviesPath.toAbsolutePath() + " doesn't exist.");
			// create a file if it doesn't already exist
			try {
				Files.createFile(moviesPath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return movies;
	}

	@Override
	public boolean add(Movie m) {
		// if movie id is 0, generate an id
		if (m.getId() == 0)
			m.setId(generateId());
		movies.add(m);
		return this.saveAll();
	}

	private boolean saveAll() {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(moviesFile)))) {

			// write all movies in the array list
			// to the file
			for (Movie m : movies) {
				out.print(m.getId() + FIELD_SEP);
				out.print(m.getTitle() + FIELD_SEP);
				out.print(m.getYear() + FIELD_SEP);
				out.print(m.getRating() + FIELD_SEP);
				out.println(m.getDirector());// the println adds the \n character at the end
			}
			return true;
		} catch (IOException e) {
			System.out.println(e);
			return false;
		}
	}

	@Override
	public boolean update(Movie t) {
		// feature not yet implemented
		return false;
	}

	@Override
	public boolean delete(Movie m) {
		movies.remove(m);
		return this.saveAll();
	}

	private int generateId() {
		int id = 0;
		for (Movie m : movies) {
			id = Math.max(id, m.getId());
		}
		return (id + 1);
	}

}
