package DongGun;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions2 {

	public static void main(String[] args) {
		// 예외처리 2 - 멀티 catch 블럭
		// 각각의 코드에 try-catch 를 사용 하는것보다
		// 하나의 try-catch 블럭을 사용하고
		// 여러개의 catch 블럭을 사용하고
		// 여러개의 catch 문으로 예외를 처리하는 것이 효율적
		try {
			int[] intArray = { 9, 8, 7, 6, 5 };
			System.out.println(intArray[5]);

			int x = 1000 / 0;

			FileReader fr = new FileReader("");
			DriverManager.getConnection("");
		} catch (ArrayIndexOutOfBoundsException aiod) {
			System.out.println("잘못된 배열 사용");
		} catch (ArithmeticException ae) {
			System.out.println(" 잘못된 수식 사용");
		} catch (FileNotFoundException ffe) {
			System.out.println("파일경로를 제대로 설정");
		} catch (SQLException se) {
			System.out.println("데이터베이스 서버주소를 설정");
		} catch (Exception ex) {
			System.out.println("예상치 못한 예외발생!");
		}

		// 예외 던지기 -throws
		MakeException me = new MakeException();
		try {
			me.exception1();
			me.exception2();
			me.exception3();
		} catch (ArrayIndexOutOfBoundsException aioe) {
			System.out.println("잘못된 배열 사용");
		} catch (ArithmeticException ae) {
			System.out.println("잘못된 수식 사용");
		} catch (InputMismatchException ime) {
			System.out.println("잘못된 입력 사용");
		}
		// finally 블럭
		// 오류가 발생해서 예외처리시 나머지 코드를 실행하지 않고 넘어감
		// 이런 코드들 중 반드시 실행해야 할 경우
		// fially 블럭에 작성하면 됨
		try {
			// 데이터베이스 서버연결
			// SQL 처리 밒 기타작업

		} catch (Exception ex) {
			System.out.println("예외처리함");
		} finally {
			// 데이터베이스 서버 연결 끊음
		}
	}// main ed

} // class ed

class MakeException {
	public void exception1() throws ArrayIndexOutOfBoundsException { // 배열 주소가 잘못될때 ArrayIndexOutOfBoundsException
		int[] intArray = { 9, 8, 7, 6, 5 };
		System.out.println(intArray[5]);
	}

	public void exception2() throws ArithmeticException { // 수식이 잘못됬을때 ArithmeticException
		int x = 1000 / 0;
	}

	// import java.util.InputMismatchException;
	public void exception3() throws InputMismatchException { // 잘못된 입력값을 넣었을때 InputMismatchException
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
	}
}
