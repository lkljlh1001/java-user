package JDBC_project.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_SQL_INJECTION {

	public static void main(String[] args) throws Exception {

		String DRV = "oracle.jdbc.drver.OracleDriver";
		String URL = "jdbc:oracle:thin:@192.168.118.128:1521:xe";
		String USR = "lkljlh1001";
		String PWD = "456789";
		String email = "hong1-2@test.com'or email like('hong1%') or email='ㅋㅋ";

		try {
			Class.forName(DRV);

		} catch (Exception e) {
			e.printStackTrace();
		}
		try (Connection conn = DriverManager.getConnection(URL, USR, PWD); Statement stmt = conn.createStatement();) {
			String name = "";
			String tel = "123-4567-8912";
			String sql = "insert into member (name,tel,email,pwd) values(" + "'" + name + "', '" + tel
					+ "',','xyz@abc.com'.password('123456'))";

		}

	}

}
