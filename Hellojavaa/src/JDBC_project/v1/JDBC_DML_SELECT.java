package JDBC_project.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_DML_SELECT {

	public static void main(String[] args) throws Exception {
		oracle.jdbc.driver.OracleDriver oracleDriver = new oracle.jdbc.driver.OracleDriver();
		// 2 ) 드라이버 관리자 등록
		DriverManager.registerDriver(oracleDriver);
		// 3 ) 드라이버 관리자를 통해 dbms와 연결
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.118.128:1521:xe", "lkljlh1001",
				"456789");

		// 4 sql을 실행할 statement 객체 열기
		Statement stmt = conn.createStatement();

		// 5 SELECT SQL 문을 DBMS에 보낸다

		String sql = "select mno,name,tel,email from member";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			String out = rs.getInt("mno") + "," + rs.getString("name") + "," + rs.getString("tel") + ","
					+ rs.getString("email");

			System.out.println(out);
		}

		rs.close();
		stmt.close();
		conn.close();
	}
}
