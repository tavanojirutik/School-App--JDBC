package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {
	
	String url ="jdbc:mysql://localhost:3306/students";
	String username = "root";
	String password = "root";
	Connection connection = null;
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,username,password);
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("Somethis is Wrong");
		}
		return connection;
	}

}
