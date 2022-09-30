package jdbc02;

import java.sql.*;

public class jdbcTest4 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinity", "root", "Java3000");
			
			int studentId = 106;
			String studentName = "MAYUR";
			double studentScore = 20;
			String query = "Insert into students values (?,?,?)";
			PreparedStatement pstatement = connection.prepareStatement(query);
			
			pstatement.setInt(1, studentId);
			pstatement.setString(2, studentName);
			pstatement.setDouble(3, studentScore);
			
			pstatement.executeUpdate();
			
			System.out.println("Record inserted to database.");
			
			pstatement.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println("Driver Class Not Found");
		} 
	}

}

//Statement = Select.
//PrepareStatement = Insert, Update and Delete.
//CallableStatement = to call any stored procedure from the database.