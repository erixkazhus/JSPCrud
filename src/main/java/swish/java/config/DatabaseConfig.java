package swish.java.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
	
	 static {
	        try {
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	            throw new IllegalStateException("Could not load JDBC driver class");
	        }
	    }

    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=users;trustServerCertificate=true";
    private static final String USER = "";
    private static final String PASS = "";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
