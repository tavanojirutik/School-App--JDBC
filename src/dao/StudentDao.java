package dao;

import java.sql.*;
import configuration.HelperClass;
import dto.Student;

public class StudentDao {
	HelperClass helperclass = new HelperClass();
	Connection connection = null;
	
	//save The Student Data
	
	public Student saveStudent(Student student) {
		
		connection = helperclass.getConnection();
		String sql="Insert into student values(?,?,?)";
		
			//Create Statement
		
		try {
			PreparedStatement preparedstatement = connection.prepareStatement(sql);
			preparedstatement.setInt(1,student.getSid());
			preparedstatement.setString(2,student.getSname());
			preparedstatement.setInt(3,student.getRoll());
			
			preparedstatement.execute();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("Somethis is Wrong in Connection");
				e.printStackTrace();
			}
		}
		
		
		
		return student;
		
	}
}
