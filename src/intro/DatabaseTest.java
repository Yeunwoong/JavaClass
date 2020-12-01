package intro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseTest {
	public static void main(String[] args) {
		String jdbc_driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url = "jdbc:mysql://localhost:3306/univdb?serverTimezone=UTC";
		try {
			Class.forName(jdbc_driver).newInstance();
			Connection con = DriverManager.getConnection(jdbc_url, "root", "123456");
			Statement st = con.createStatement();
			String sql = "SELECT * FROM univdb.과목";
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				@SuppressWarnings("unused")
				String name = rs.getString("이름");
				System.out.printf("title: %s\n", name);
			}
			
			rs.close();
			st.close();
			con.close();			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
