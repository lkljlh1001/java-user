package DongGun.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SungJukJDBC5 {

	public static void main(String[] args) {
		// 성적 처리 JDBC
		// 오라클 접속 정보 설정
		String DRV = "oracle.jdbc.driver.OracleDriver";
		String URL = "jdbc:oracle:thin:@192.168.118.128:1521:xe";
		String USR = "lkljlh1001";
		String PWD = "456789";

		// JDBC 관련 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// sql 관련 변수 선언
		String selectSQL = "select sjno,name,kor,eng,mat,regdate from sungjuk  order by sjno desc";
		String selectOneSQL = " select *from sunghuk where sjno = ?";

		String insertSQL = null;
		String updateSQL = "update sungjuk set name = ?,kor = ?,eng = ?,mat = ?  where sjno = ?";
		String deleteSQL = "delete from sungjuk where sjno = ?";

		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);

			pstmt = conn.prepareStatement(selectSQL);

			rs = pstmt.executeQuery();

			List<SungJukVO2> sjlist = new ArrayList<>();
			while (rs.next()) {
				SungJukVO2 sj = new SungJukVO2();
				sj.setSjno(rs.getString("sjno"));
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMat(rs.getInt("mat"));
				sj.setRegdate(rs.getString("regdate"));
				sjlist.add(sj);
			}

			for (SungJukVO2 sj : sjlist) {
				System.out.println(sj);
			}

			Scanner sc = new Scanner(System.in);
			System.out.println("삭제할 학생번호를 입력하세요");
			int no = sc.nextInt();

			pstmt = conn.prepareStatement(deleteSQL);
			pstmt.setInt(1, no);

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건의 데이터 삭제 완료!");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				rs.close();
			} catch (Exception e) {
			}
			try {
				pstmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception e) {
			}
		}

	}

}
