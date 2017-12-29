package DongGun.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import project.v3.SungJukVO;

public class SungJukJDBC {

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
		String updateSQL = null;
		String deleteSQL = null;

		try {
			// 1. 메모리올린다
			Class.forName(DRV);
			// 드라이버 메모리 올린후 연결
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3
			pstmt = conn.prepareStatement(selectSQL);
			// 4 rs 에 담는다
			rs = pstmt.executeQuery(); // select
			// 5
			// StringBuffer out = new StringBuffer();
			// while (rs.next()) {
			// out.append(rs.getString("sjno")).append("\t").append(rs.getString("sjno")).append("\t")
			// .append(rs.getString("name")).append("\t").append(rs.getString("kor")).append("\t")
			// .append(rs.getString("eng")).append("\t").append(rs.getString("mat")).append("\t")
			// .append(rs.getString("regdate")).append("\n");
			// }
			// System.out.println(out.toString());

			// 표준화된 방식
			List<SungJukVO> sjlist = new ArrayList<>();
			while (rs.next()) {
				SungJukVO sj = new SungJukVO();
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMat(rs.getInt("mat"));

				sjlist.add(sj);
			}

			for (SungJukVO sj : sjlist) {
				System.out.println(sj);
			}

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
