package JDBC_project.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_In_Action {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {

			String driverClassName = System.getProperty("jdbc.driver");
			Class.forName(driverClassName);
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.118.128:1521:xe", "lkljlh1001", "456789");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select mno , name , tel , email from member");
			while (rs.next()) {
				String out = rs.getInt("mno") + "," + rs.getString("name") + "," + rs.getString("tel") + ","
						+ rs.getShort("email");
				System.out.println(out);

			}

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
			}
			try {
				stmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
	}

}
