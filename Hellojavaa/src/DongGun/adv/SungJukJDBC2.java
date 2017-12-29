package DongGun.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import project.v3.SungJukVO;

public class SungJukJDBC2 {

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
		String selectOneSQL = "select * from sungjuk where sjno = ?";

		String insertSQL = null;
		String updateSQL = null;
		String deleteSQL = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 학생번호를 입력하세요");
		int no = sc.nextInt();

		try {
			// 1. 메모리올린다
			Class.forName(DRV);
			// 드라이버 메모리 올린후 연결
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3
			pstmt = conn.prepareStatement(selectOneSQL);
			pstmt.setInt(1, no); // 첫번째 ? 자리에 실제로 적용될 값 지정
			// 4 rs 에 담는다
			rs = pstmt.executeQuery(); // select
			// 5
			SungJukVO sj = new SungJukVO();
			if (rs.next()) {
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMat(rs.getInt("mat"));
				sj.setTot(rs.getInt("tot"));
				sj.setAvrg(rs.getDouble("avrg"));
				sj.setGrade(rs.getString("grd"));
			}
			System.out.println(sj);

			// 표준화된 방식
			// List<SungJukVO> sjlist = new ArrayList<>();
			// while (rs.next()) {
			// SungJukVO sj = new SungJukVO();
			// sj.setName(rs.getString("name"));
			// sj.setKor(rs.getInt("kor"));
			// sj.setEng(rs.getInt("eng"));
			// sj.setMat(rs.getInt("mat"));
			//
			// sjlist.add(sj);
			// }
			//
			// for (SungJukVO sj : sjlist) {
			// System.out.println(sj);
			// }

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
