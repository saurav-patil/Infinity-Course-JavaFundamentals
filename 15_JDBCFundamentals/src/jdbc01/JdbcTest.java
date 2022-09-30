package jdbc01;
import java.sql.*;

public class JdbcTest {
	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is Loaded");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo", "root", "Java3000");
			System.out.println("Connection is established");
		} catch (Exception e) {
			System.out.println("Driver Class Not Found Exception");
		}
	}
}

//jdbc:mysql://localhost:3306/Demo
//jdbc= protocol
//mysql= subprotocol
//localhost= on what machine it is present
//3306= Port
//Demo= database name