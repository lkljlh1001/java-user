package JDBC_project.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZipcodeJDBC {

	public static void main(String[] args) {

		String DRV = "oracle.jdbc.driver.OracleDriver";
		String URL = "jdbc:oracle:thin:@192.168.118.128:1521:xe";
		String USR = "hr";
		String PWD = "hr";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// sql 관련 변수 선언
		String selectSQL = "select * from zipcode_kyunggi where \"도로명\" like ?";
		System.out.println(selectSQL);

		// String insertSQL = null;
		// String updateSQL = null;
		// String deleteSQL = null;
		Scanner sc = new Scanner(System.in);
		String 도로명 = sc.nextLine(); // 까묵 ㄴ

		try {
			// 0. 접속정보를 리소스번들로부터 읽어오기

			// 1. 메모리올린다
			Class.forName(DRV);
			// 드라이버 메모리 올린후 연결
			conn = DriverManager.getConnection(URL, USR, PWD);
			// 3
			pstmt = conn.prepareStatement(selectSQL);
			pstmt.setString(1, 도로명 + "%");
			// 4 rs 에 담는다
			rs = pstmt.executeQuery(); // select

			// 표준화된 방식
			List<ZipcodeVO> sjlist = new ArrayList<>();
			while (rs.next()) {
				// 우편번호,시도,시군구,읍면,도로명,건물번호본번,건물번호부번,시군구용건물명,법정동명,리명,지번본번
				ZipcodeVO sj = new ZipcodeVO();
				sj.set우편번호(rs.getInt("우편번호"));
				sj.set시도(rs.getString("시도"));
				sj.set시군구(rs.getString("시군구"));
				sj.set읍면(rs.getString("읍면"));
				sj.set도로명(rs.getString("도로명"));
				sj.set건물번호본번(rs.getInt("건물번호본번"));
				sj.set건물번호부번(rs.getInt("건물번호부번"));
				sj.set시군구용건물명(rs.getString("시군구용건물명"));
				sj.set법정동명(rs.getString("법정동명"));
				sj.set리명(rs.getString("리명"));
				sj.set지번본번(rs.getInt("지번본번"));
				sjlist.add(sj);
			}

			for (ZipcodeVO sj : sjlist) {
				System.out.println(sj);
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				sc.close();
			} catch (Exception e) {
			}
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
