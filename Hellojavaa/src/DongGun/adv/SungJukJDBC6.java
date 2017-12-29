package DongGun.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import project.v3.SungJukVO;

public class SungJukJDBC6 {

	public static void main(String[] args) {
		// 성적 처리 JDBC
		// ResourceBundle를 이용해서 JDBC 관련정보를
		// 특정파일에서 키=값 형태로 읽어서 처리
		String sbPath = "DongGun.adv.oracle"; // 패키지 명.파일 명
		// 리소스번들 파일경로 지정 : 패키지.파일명
		// (.properties 는 제외!)
		String DRV = null;
		String URL = null;
		String USR = null;
		String PWD = null;

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
			// 0. 접속정보를 리소스번들로부터 읽어오기
			ResourceBundle rd = ResourceBundle.getBundle(sbPath);
			DRV = rd.getString("DRV");
			URL = rd.getString("URL");
			USR = rd.getString("USR");
			PWD = rd.getString("PWD");

			// 1. 메모리올린다
			Class.forName(DRV);
			// 드라이버 메모리 올린후 연결
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3
			pstmt = conn.prepareStatement(selectSQL);
			// 4 rs 에 담는다
			rs = pstmt.executeQuery(); // select

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
