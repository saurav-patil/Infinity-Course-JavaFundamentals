package jdbc02;

import java.sql.*;

public class jdbcTest3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinity", "root", "Java3000");
			Statement statement = connection.createStatement();
			int studentId = 105;
			String studentName = "PRIYASH";
			double studentScore = 80;
			String query = "INSERT INTO students VALUES ("+studentId+",'"+studentName+"',"+studentScore+")"; //TDS Job using statement
			System.out.println(query);
			statement.executeUpdate(query);
			System.out.println("Record inserted...");
		} catch (Exception e) {
			System.out.println("Driver Class Not Found");
		} 
	}

}


//Statement = Select.
//PrepareStatement = Insert, Update and Delete.
//CallableStatement = to call any stored procedure from the database.