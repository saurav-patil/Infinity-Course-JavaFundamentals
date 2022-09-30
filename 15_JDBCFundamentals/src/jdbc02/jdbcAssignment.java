package jdbc02;
import java.sql.*;

public class jdbcAssignment {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinity", "root", "Java3000");
			
			int studentScore = 20;
			String query = "DELETE FROM students WHERE STUDENT_SCORE = ?";
			PreparedStatement pstatement = connection.prepareStatement(query);
			pstatement.setInt(1, studentScore);
			pstatement.executeUpdate();
			System.out.println("Record deleted from database");

			String studentName = "MAYUR PATIL";
			String query2 = "UPDATE students SET STUDENT_NAME = ? WHERE STUDENT_SCORE = ?";
			PreparedStatement pstatement2 = connection.prepareStatement(query2);
			pstatement2.setString(1, studentName);
			pstatement2.setInt(2, studentScore);
			pstatement2.executeUpdate();
			System.out.println("Record updated in database");
					
			pstatement.close();
			pstatement2.close();
			connection.close();
			
		} catch (Exception e) {
			System.out.println("Driver Class Not Found");
		} 
	}
}
