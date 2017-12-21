package DongGun;

import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Execptions {

	public static void main(String[] args) throws SQLException {

		int[] intArray = { 9, 8, 7, 6, 5 };
		System.out.println(intArray[2]);

		try {
			System.out.println(intArray[5]);// 오류가나도 이거만 오류발생 이라는 멘트가 뜨고 밑에꺼 쭉 실행됨 //예외처리
		} catch (Exception ex) {
			System.out.println("!오류발생!@");

			// System.out.println(ex.getMessage());
			// ex.printStackTrace();
		}
		// uncheked 예외 - 개발자가 직접 인지하고 예외처리
		try {
			int x = 100 / 0;
		} catch (Exception ex) {
			System.out.println("0으로 나누면 안됨");
			System.out.println(ex.getMessage());
		}
		// checked 예외 - 컴파일러가 미리 예외처리에 대한 정보 알림

		String fpath = "c:/Java/abc.dat";
		try {
			FileReader fr = new FileReader(fpath);
		} catch (Exception ex) {
			System.out.println("파일관련 예외 발생");
		}

		// 예외처리 좋은 예
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("숫자만 입력해라");

			try {
				int key = sc.nextInt();
				if (key == 0)
					break;
			} catch (Exception ex) {
				System.out.println("문자는 입력불가!!");
				// 무한반복 방지용 Scanner 초기화
				sc = new Scanner(System.in);
			}
		}

		sc.close();
		// 데이터베이스 서버 접속 코드 -checked 예외
		// throws 구문으로 이 메서드를 호출한 상위 메서드로
		// 예외처리를 던짐(처리를 대신해달라고 떠넘김)
		// public static void main(String[] args) throws SQLException { 가 위에생김

		DriverManager.getConnection("...");

		System.out.println("이글이보이나여?");

	}
}