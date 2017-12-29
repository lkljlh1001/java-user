package DongGun.adv.lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LabDBCSoccer {
	private static String DRV = "oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.118.128:1521:xe";
	private static String USR = "lkljlh1001";
	private static String PWD = "456789";

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("선수,팀,팀연고지,포지션,등번호,생년월일,키,몸무게 순으로 작성");
		String scname = sc.nextLine();
		String tmname = sc.nextLine();
		String tmregion = sc.nextLine();
		String tmpos = sc.nextLine();
		String bkno = sc.nextLine();
		String birth = sc.nextLine();
		String height = sc.nextLine();
		String weight = sc.nextLine();

		try {

			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);

			String sql = "insert into SOCCER  VALUES " + "(cno.nextval,?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, scname);
			pstmt.setString(2, tmname);
			pstmt.setString(3, tmregion);
			pstmt.setString(5, tmpos);
			pstmt.setString(6, bkno);
			pstmt.setString(7, birth);
			pstmt.setString(8, height);
			pstmt.setString(9, weight);

			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건의 데이터가 추가됨!");
			sql = "select * from soccerplayer order by cno desc";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			StringBuffer sb = new StringBuffer();

			while (rs.next()) {
				sb.append(rs.getString(1)).append(" ").append(rs.getString(2)).append(" ").append(rs.getString(3))
						.append(" ").append(rs.getString(4)).append(" ").append(rs.getString(5)).append(" ")
						.append(rs.getString(5)).append(" ").append(rs.getString(6)).append(" ").append(rs.getString(7))
						.append(" ").append(rs.getString(8)).append(" ").append(rs.getString(9)).append("\n")
						.append(rs.getString(10)).append("\n");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
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
