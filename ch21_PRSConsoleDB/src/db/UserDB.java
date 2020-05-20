package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import business.User;

//this connects the User class to the MySQL database. Reference 677, 687 for additional guidance
//first resolve user (was T), then resolve UserDB by adding unimplemented methods.
public class UserDB implements DAO<User> {
	private Connection getConnection() throws SQLException {
		String dbUrl = "jdbc:mysql://localhost:3306/prs?useSSL=false";
		String username = "prs_user";
		String password = "sesame";
		Connection conn = DriverManager.getConnection(dbUrl, username, password);
		return conn;
	}


	public User login(String userName, String password) {
		String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
		User u = null;
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, userName);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				u = getUserFromResultSet(rs);
				rs.close();
			}
			else {
				//no user data found for username, password
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			u = null;
		}
		return u;
	}
	
	@Override
	public User get(int id) {
		String sql = "SELECT * FROM user WHERE id = ?";
		User u = null;
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				id = rs.getInt(1);
				u = getUserFromResultSet(rs);
				
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
			u = null;
		}
		return u;
	}
	

	// this method lists all users by recalling them from the database and printing
	// them.
	@Override
	public List<User> list() {
		String sql = "SELECT * from User"; // enters SQL command to select all from the table User
		List<User> users = new ArrayList<>(); // creates a new ArrayList that will store the User class instances
		try (Connection conn = getConnection(); // tries the connection with SQL
				PreparedStatement ps = conn.prepareStatement(sql); // executes the prepared statement
				ResultSet rs = ps.executeQuery()) { // if this works, we get a result set to process
			while (rs.next()) { // while there is a row in the ResultSet(rs)
				User u = getUserFromResultSet(rs);
				users.add(u); // add user to the list, having defined user on line 28 as a list
				// this repeats for every row, adding one user for each row.
			}

		} catch (SQLException e) {
			e.printStackTrace();
			users = null; // if there is an exception, this is set to null so that it prevents others from
							// calling this statement
		}
		return users;
	}
	
	private User getUserFromResultSet(ResultSet rs) throws SQLException {
		int id = rs.getInt(1); // lists out the variables for the fields in SQL. Could have named "id"
		String userName = rs.getString(2); // could be userName instead of 2
		String password = rs.getString(3); // could be password instead of 3
		String firstName = rs.getString(4);
		String lastName = rs.getString(5);
		String phoneNumber = rs.getString(6);
		String email = rs.getString(7);
		boolean reviewer = rs.getBoolean(8);
		boolean admin = rs.getBoolean(9);
		User u = new User(id, userName, password, firstName, lastName, phoneNumber, email, reviewer, admin);
		return u;
	}

	@Override
	public boolean add(User u) {
		boolean success = false; // verifies if code was successful
		String sql = "INSERT into User (" // writing SQL commands, practice in MySQL workbench to make sure this is a
											// viable and accurate code
				+ "UserName, Password, FirstName, LastName, PhoneNumber," + " Email, IsReviewer, IsAdmin)"
				+ " values (?, ?, ?, ?, ?, ?, ?, ?)"; // the ?s are going to be what you insert the values into.
														// replacing these with the variables
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, u.getUserName()); // replace first ? with new username
			ps.setString(2, u.getPassword());
			ps.setString(3, u.getFirstName());
			ps.setString(4, u.getLastName());
			ps.setString(5, u.getPhoneNumber());
			ps.setString(6, u.getEmail());
			ps.setBoolean(7, u.isReviewer());
			ps.setBoolean(8, u.isAdmin());
			ps.executeUpdate(); // sends this statement to the database and creates new user
			success = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return success;
	}

	@Override
	public boolean update(User u) {
		return false;
	}
	

	@Override
	public boolean delete(User u) {
		boolean success = false;
		String sql = "DELETE FROM User WHERE id = ?";
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, u.getId());
			ps.executeUpdate();
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return success;
	}

}
