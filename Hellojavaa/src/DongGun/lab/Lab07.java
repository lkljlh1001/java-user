package DongGun.lab;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Lab07 {
	public static void main(String[] args) throws IOException {
		// 프린트 22 번부터 30 번
		// #22 윤년 여부 확인
		// 현재 연도가 400으로 나눠 떨어지거나
		// 현재 연도가 4로 나눠 떨어지지만 //100으로 나눠 떨어지지 않는다.
		System.out.println("!!!!!!!!!!!!!!!!22번 문제");
		GregorianCalendar gc = new GregorianCalendar(); // 달력 불러오는 알고리즘

		// int year = 2000;
		String welcome = "윤년 확인할 연도 입력\n";
		System.out.printf(welcome);
		Scanner sc = new Scanner(System.in); // 입력 을 사용하기위한 것 SCANNER
		int year = sc.nextInt();

		String fmt1 = "%d 는 윤년 입니다\n";
		String fmt2 = "%d 는 윤년이 아닙니다\n";

		if (gc.isLeapYear(year)) {

			System.out.printf(fmt1, year);
		} else {
			System.out.printf(fmt2, year);

		}

		System.out.println("\n");

		if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) { // 400 으로 나눠 떨어지거나 // 현재연도가 4로 나눠 떨어지지만 //
																			// 100으로 나눠 떨어지지 않는다

			System.out.printf(fmt1, year);

		} else {
			System.out.printf(fmt2, year);
		}

		// System.out.println(gc.isLeapYear(2000)); //
		// System.out.println(gc.isLeapYear(1999)); //
		// System.out.println(gc.isLeapYear(1998)); //
		// System.out.println(gc.isLeapYear(2017)); //

		// # 23 문제 복권 문제 // 난수 생성 있음
		// 특정 범위를 포함하는 난수 생성
		// 정수난수갑 % ((마지막값)- 시작값) +1) + 시작값 : 난수생성 공식 ☆☆☆☆☆☆☆☆☆
		// 복권 숫자 범위 100 - 999
		// lotto : 657 , lucky : 452 = 1일치
		// lotto : 657 , lucky : 524 = 1일치
		// lotto : 657 , lucky : 123 = 0일치
		// lotto : 657 , lucky : 726 = 2일치 // 6,7

		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!23번 복권문제 난수생성 있는파트");
		int rand = (int) (Math.random() * 100000); /// 3 자리를 랜덤으로 int 형으로 변환 rand 가 인트 형임으로
		int lotto = rand % ((999 - 100) + 1) + 100;
		System.out.println(lotto);
		Scanner scanner = new Scanner(System.in);
		String lucky = scanner.nextLine();
		// 문자 추출
		// char lucky1 = lucky.charAt(0);
		// char lucky2 = lucky.charAt(1);
		// char lucky3 = lucky.charAt(2);
		//
		// char lotto1 = ("" + lotto).charAt(0); // 문자를 숫자로 인식하게 만든다 (""+ char
		// char lotto2 = ("" + lotto).charAt(1);
		// char lotto3 = ("" + lotto).charAt(2);

		// 비교

		int match = 0;
		// if ((lotto1 == lucky1) || (lotto1 == lucky2) || (lotto1 == lucky3))
		//
		// ++match;
		// if ((lotto2 == lucky1) || (lotto2 == lucky2) || (lotto2 == lucky3))
		// ++match;
		//
		// if ((lotto3 == lucky1) || (lotto3 == lucky2) || (lotto3 == lucky3))
		// ++match;
		String lotto4 = "" + lotto;
		int size = lotto4.length();
		for (int i = 0; i < size; ++i)
			for (int j = 0; j < size; ++j)

				if (lucky.charAt(i) == lotto4.charAt(j))
					++match;

		String msg = "꽝이군요 ! 다음기회 !";
		switch (match) {
		case 3:
			msg = " 모두일치 ! 상금 100만원";
			break;
		case 2:
			msg = " 2개일치 ! 상금 만원";
			break;
		case 1:
			msg = " 1개일치 ! 상금 오천원";
			break;
		}
		System.out.println(msg);

		// # 24 문제
		System.out.println("!!!!!!!!!!!!!!24번 문제");

		sc = new Scanner(System.in); // 스캐너 초기화
		String fmt = " 1 - 9 의 숫자를 입력 하세요\n";
		System.out.println(fmt);

		String fmt4 = " %d * %d = %d 입니다\n";
		String fmt5 = "%d 는 1-9의숫자 가 아닙니다\n";

		int ggDan = sc.nextInt();

		if (!(ggDan >= 1 && ggDan <= 19)) {
			System.out.printf(fmt5, ggDan);

		} else {
			String fmtA = "%2d * %2d = %3d \n"; // 앞 2 나 3은 출력을 더 갈끔하게 해줌
			for (int i = 1, j = ggDan; i <= 19; ++i) {

				System.out.printf(fmtA, j, i, j * i);

			}
		}

		// #23/

		// #25 못건드림
		System.out.println("!!!!!!!!!!!!!!!!25번 문제");
		// 소문자 a : 97 , 대문자 A :65
		System.out.println("소문자 알파벳을 대문자로 바꿔드림");
		System.out.println("소문자 알파벳 입력");
		int ch = System.in.read();

		// 소문자 이외의 문자가 입력되면 경고메세지 출력
		if (ch > 97 || ch < 122) {
			System.out.println("소문자가 아닙니다!");
		} else {

			// 소문자를 대문자로 변환하기 위해 입력한 문자에서 32만큼 빼고 처리
			ch = ch - 32;
			System.out.println((char) ch);
		}
		// #26 - 숫자 맞추기
		sc = new Scanner(System.in); // 스캐너 초기화

		int num2 = (int) (Math.random() * 100) + 1; // 1~ 100 ;

		// 키보드로부터 데이터를 입력받을 준비를함

		while (true) {
			int num1 = scanner.nextInt();

			if (num1 > num2)
				System.out.println("추측한 숫자가 큽니다");
			else if (num1 < num2)
				System.out.println("추측한 숫자가 작다");
			else if (num1 == num2) {
				System.out.println("빙고 ! 숫자를 맞췄습니다");
				break;

			}
		}

		// #27
		System.out.println("!!!!!!!!!!!!27번 문제");

		int number = 0;
		int sum = 0;

		while (number <= 20) {
			number++;
			sum += number;
			if (sum >= 100)
				break;
			fmt = "num : %d , sum : %d \n";
			System.out.printf(fmt, number, sum);
		}

		// #28
		sum = 0;
		number = 0;

		while (number < 20) {
			number++;

			if (number == 10 || number == 11)
				continue;

			sum += number;

			fmt = "num = %d , sum = %d \n";
			System.out.printf(fmt, number, sum);
		}
		// #29 /
		// #30 - 구구단 차트

		System.out.println("!!!!!!!!!!!!!!!!!30번 문제");

		System.out.println("                                 Multiplication Table");
		System.out.printf("\t  1\t  2\t  3\t  4\t  5\t  6\t  7\t  8\t  9\t  10\n");
		System.out.printf("------------------------------------------------------------------------------------\n");
		fmt = " %d |     %2d \t %2d \t %2d \t %2d \t %2d \t %2d \t %2d \t %2d \t %2d \t  %2d \n";

		for (int i = 1; i <= 9; i++) {
			System.out.printf(fmt, i, i, i * 2, i * 3, i * 4, i * 5, i * 6, i * 7, i * 8, i * 9, i * 10);
		}

		System.out.println("              Multiplication Table");
		System.out.printf("         1   2   3   4   5   6   7   8   9  \n");
		System.out.printf("------------------------------------------\n");
		// fmt = " %d | %2d \t %2d \t %2d \t %2d \t %2d \t %2d \t %2d \t %2d \t %2d \t
		// %2d \n";

		for (int i = 1; i <= 9; i++) {
			System.out.printf("  %d |  %3d", i, i);
			for (int j = 2; j <= 9; ++j) {
				System.out.printf(" %3d ", i * j);
			}
			System.out.println();
		}

	}
}