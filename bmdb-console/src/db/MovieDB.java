package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.Movie;

public class MovieDB implements DAO<Movie> {
	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/bmdb_hall?useSSL=false";
		String username = "bmdb_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, password);
		return conn;
	}

	@Override
	public Movie get(int id) {
		String sql = "SELECT * FROM movie WHERE id = ?";
		Movie m = null;
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				id = rs.getInt(1);
				String title = rs.getString(2);
				int year = rs.getInt(3);
				String rating = rs.getString(4);
				String director= rs.getString(5);
				m = new Movie (id, title, year, rating, director);
				rs.close();
				System.out.println();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			m = null;
		}
		return m;
	}

	@Override
	public List<Movie> list() {
		System.out.println();
		String sql = "SELECT * from Movie"; 
		List<Movie> movies = new ArrayList<>(); 
		try (Connection conn = getConnection(); 
				PreparedStatement ps = conn.prepareStatement(sql); 
				ResultSet rs = ps.executeQuery()) { 
			while (rs.next()) { 
				int id = rs.getInt(1);
				String title = rs.getString(2);
				int year = rs.getInt(3);
				String rating = rs.getString(4);
				String director= rs.getString(5);
				// create an instance of Movie
				Movie m = new Movie (id, title, year, rating, director);
				movies.add(m); // add user to the list, having defined user on line 28 as a list
				// this repeats for every row, adding one user for each row.
			}

		} catch (SQLException e) {
			e.printStackTrace();
			movies = null; // if there is an exception, this is set to null so that it prevents others from
							// calling this statement
		}
		return movies;
	}

	@Override
	public boolean add(Movie m) {
		boolean success = false;
		String sql = "INSERT into Movie (Title, Year, Rating, Director) values (?, ?, ?, ?)"; 
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, m.getTitle()); 
			ps.setInt(2, m.getYear());
			ps.setString(3, m.getRating());
			ps.setString(4, m.getDirector());
			ps.executeUpdate();
			success = true;

		} catch (SQLException e) {
			e.printStackTrace();
			success = false;
		}

		return success;
	}

	@Override
	public boolean update(Movie m) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Movie m) {
		boolean success = false;
		String sql = "DELETE FROM Movie WHERE id = ?";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps. setInt(1, m.getId());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
			success = false;
		}
		return success;
	}

}
