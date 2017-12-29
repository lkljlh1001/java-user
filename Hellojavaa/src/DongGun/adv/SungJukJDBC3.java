package DongGun.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SungJukJDBC3 {

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

		String insertSQL = "insert into sungjuk (sjno, name, kor , eng , mat , tot , avrg ,grd)  values(sjno.nextval,?,?,?,?,?,?,?)";
		String updateSQL = null;
		String deleteSQL = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("추가할 학생 성적을 입력하세요 (이름/국어/영어/수학)");
		String name = sc.nextLine();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();

		// 총점/평균/학점 처리
		int tot = kor + eng + mat;
		double avrg = (double) tot / 3;
		String grd = "가";

		switch ((int) avrg / 10) {
		case 10:
		case 9:
			grd = "수";
			break;
		case 8:
		case 7:
			grd = "미";
			break;
		case 6:
		case 5:
			grd = "양";
			break;
		case 4:
		case 3:
		case 2:
		case 1:
			grd = "가";
			break;

		}

		try {
			// 1. 메모리올린다
			Class.forName(DRV);
			// 드라이버 메모리 올린후 연결
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3
			pstmt = conn.prepareStatement(insertSQL);
			pstmt.setString(1, name);
			pstmt.setInt(2, kor);
			pstmt.setInt(3, eng);
			pstmt.setInt(4, mat);
			pstmt.setInt(5, tot);
			pstmt.setDouble(6, avrg);
			pstmt.setString(7, grd);
			// 4 rs 에 담는다
			int cnt = pstmt.executeUpdate(); // select
			System.out.println(cnt + "건의 데이터 추가 완료!");
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
