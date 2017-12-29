package JDBC_project.v1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_PreparsStatement {

	public static void main(String[] args) {
		String DRV = "oracle.jdbc.drver.OracleDriver";
		String URL = "jdbc:oracle:thin:@192.168.118.128:1521:xe";
		String USR = "lkljlh1001";
		String PWD = "456789";

		String name = "홍길동102";
		String email = "hong105@xyz.com";
		String tel = "123-4567-8912";
		String password = "123456";

		try (Connection conn = DriverManager.getConnection(URL, USR, PWD);
				PreparedStatement pstmt = conn
						.prepareStatement("insert into member (name,tek,email,pwd)" + "values(?,?,?,password(?)");) {
			pstmt.setString(1, name);
			pstmt.setString(2, tel);
			pstmt.setString(1, email);
			pstmt.setString(1, password);

			int count = pstmt.executeUpdate();
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
