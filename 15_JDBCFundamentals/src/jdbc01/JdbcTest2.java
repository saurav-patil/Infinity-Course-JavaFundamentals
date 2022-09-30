package jdbc01;
import java.sql.*;

public class JdbcTest2 {
	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infinity", "root", "Java3000");
			Statement st = connection.createStatement();
			String sql = "SELECT * FROM Students";
			ResultSet res = st.executeQuery(sql);
			while(res.next()) {
				int id = res.getInt("STUDENT_ID");
				String name = res.getString("STUDENT_NAME");
				double score = res.getDouble("STUDENT_SCORE");
				System.out.println(id+" , "+name+" , "+score);
			}
			st.close();
			connection.close();
		} catch (Exception e) {
			System.out.println("Driver Class Not Found Exception");
		}
	}
}
//Create a database with the respective fields and then execute
//jar  -> holds many java classes together
//jar file will be provided by the respective database vendor