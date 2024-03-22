package swish.java.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import swish.java.config.DatabaseConfig;
import swish.java.entity.User;

public class UsersModel {
	public List<User> listuser() {	
		
		List<User> listusers = new ArrayList<User>();
		
		Connection connect = DatabaseConfig.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		
		String query = "Select * from users";
		
		try {
			stmt = connect.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {				
				listusers.add(new User(rs.getInt("userid"), rs.getString("username"), rs.getString("Email")));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		return listusers;
	}

	
	public void addUser(User newUser) {
		Connection connect = null;
		PreparedStatement statement = null;
		
		try {
			connect = DatabaseConfig.getConnection();
			String username = newUser.getUsername();
			String email = newUser.getEmail();
			
			String query = "insert into users (username, Email) values (?,?)";
			statement = connect.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			statement.execute();
			
		}catch (SQLException e){
			
			e.printStackTrace();
		}
	}
	
	public void updateUser(User updatedUser) {
		Connection connect = null;
		PreparedStatement statement = null;
		
		try {
			connect = DatabaseConfig.getConnection();
			int userId = updatedUser.getUserid();
			String username = updatedUser.getUsername();
			String email = updatedUser.getEmail();
			
			String query = "update users set username = ?, email = ? where userid = ?";
			statement = connect.prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, email);
			statement.setInt(3, userId);
			statement.execute();
			
		}catch (SQLException e){
			
			e.printStackTrace();
		}
	}
	
	public void deleteUser(int userId) {
		Connection connect = null;
		PreparedStatement statement = null;
		
		try {
			connect = DatabaseConfig.getConnection();			
			
			String query = "delete from users where userid = ?";
			statement = connect.prepareStatement(query);			
			statement.setInt(1, userId);
			statement.execute();
			
		}catch (SQLException e){
			
			e.printStackTrace();
		}
	}
	
	
	
	
}
