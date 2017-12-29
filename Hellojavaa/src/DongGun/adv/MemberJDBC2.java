package DongGun.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MemberJDBC2 {

	private static String DRV = "oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.118.128:1521:xe";
	private static String USR = "lkljlh1001";
	private static String PWD = "456789";

	public static void main(String[] args) {
		// JDBC 를 이용한 CRUD 예제
		Connection conn = null; // db 연결
		PreparedStatement pstmt = null; // sql문
		ResultSet rs = null; // select 결과 처리

		// 데이터 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("이름/주민번호/주소/전화번호 순으로 입력");
		String name = sc.nextLine();
		String jumin = sc.nextLine();
		String addr = sc.nextLine();
		String hp = sc.nextLine();

		try {
			// 1. 데이터베이스 드라이버 메모리에 올림
			Class.forName(DRV);
			// 2. 지정한 URL로 데이터베이스 서버에 접속
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3. 실행할 sql문을 생성

			String sql = "insert into CUSTOMER   VALUES " + "(cno.nextval,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			// placeholder 에 실제 값 지정
			pstmt.setString(1, name);
			pstmt.setString(2, jumin);
			pstmt.setString(3, addr);
			pstmt.setString(4, hp);

			// 4 작성된 sql문을 실행
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건의 데이터가 추가됨!");
			// 3b. 실행할 SQL문을 생성 - select
			sql = "select * from customer order by cno desc";
			pstmt = conn.prepareStatement(sql);

			// 4b. sql문을 실핼하고 결과집합 저장
			rs = pstmt.executeQuery();

			// 4c. 결과집합 처리
			StringBuffer sb = new StringBuffer();

			while (rs.next()) {
				sb.append(rs.getString(1)).append(" ").append(rs.getString(2)).append(" ").append(rs.getString(3))
						.append(" ").append(rs.getString(4)).append(" ").append(rs.getString(5)).append("\n");
				// System.out.print(rs.getString(1));
				// System.out.print(rs.getString(2));
				// System.out.print(rs.getString(3));
				// System.out.print(rs.getString(4));
				// System.out.println(rs.getString(5));
			}
			System.out.println(sb.toString());

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			// 5. 사용한 객체들을 모두 정리
			try {
				rs.close();
			} catch (Exception ex) {
			}
			try {
				pstmt.close();
			} catch (Exception ex) {
			}
			try {
				conn.close();
			} catch (Exception ex) {
			}

		}

	}

}
