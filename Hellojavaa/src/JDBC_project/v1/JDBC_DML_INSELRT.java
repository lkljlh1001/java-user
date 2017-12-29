package JDBC_project.v1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_DML_INSELRT {
	public static void main(String[] args) throws Exception {
		// Oracle JDBC 드라이버의; 정보를 다루는 객체를 생성한다.
		oracle.jdbc.driver.OracleDriver oracleDriver = new oracle.jdbc.driver.OracleDriver();

		// oracle JDBC ㄷ,링;발,ㄹ " 드라이버 관리자" 에 등록한다

		DriverManager.registerDriver(oracleDriver);

		// 드라이버 관리자를 통해 DBMS 와 연결한다.
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.118.128:1521:xe", "lkljlh1001",
				"456789");
		// sql을 실행할 statement 객체 열기
		java.sql.Statement stmt = conn.createStatement();

		// insert, update, delete sql 문을 dbms 에 보낸다.
		String sql = "insert into member(name,tel,email,pwd)"
				+ "values('홍길동','1212-1313','hong100@test.com',password('1111'))";

		int count = stmt.executeUpdate(sql);
		System.out.println(count);

		sql = "update member set name = '호호호 ' where email = 'hong101@test.com'";
		count = stmt.executeUpdate(sql);
		System.out.println(sql);

		sql = "delete from mamber where email = 'hong100@test.com'";

		// 지금까지 사용한 jdbc관련 객체의 자원을 해제한다.
		stmt.close();
		conn.close();

	} // main ed

}
