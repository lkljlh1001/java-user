package DongGun.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class HelloJDBC {

	public static void main(String[] args) {
		// JDBC 접속 테스트 - 오라클 데이터베이스 이용
		Connection conn = null;
		String URL = "jdbc:oracle:thin:@192.168.118.128:1521:xe";
		String USR = "lkljlh1001";
		String PWD = "456789";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클관련 메모리를 불러오고
			conn = DriverManager.getConnection(URL, USR, PWD); // 드라이버 매니저에서 URL USR PWD 가져온다

			if (!conn.isClosed())
				System.out.println("오라클접속 성공!!");

			Statement stmt = conn.createStatement();
			String sql = "insert into CUSTOMER   VALUES (88, '박지성'   ,'810101-1xxxxx', '영국 런던'    , '000-5000-0001')";

			stmt.executeUpdate(sql); // 실행
			// update = c u d 만쓰면 됨

			sql = "INSERT into book (bno,   bkname  ,publisher  ,bkprice) values (bno.nextval,'축구의 역사','굿스포츠',7000)";

			stmt.executeQuery(sql);
			// select

			try {
				stmt.close();
			} catch (Exception ex) {
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception ex) {
			}
		}

	}

}
