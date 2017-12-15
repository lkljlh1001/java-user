package DongGun;

import java.util.Scanner;

public class statements03 {

	public static void main(String[] args) {

		// 반복문 while

		int i = 1; // 초기화
		while (i <= 5) { // 조건식
			System.out.println("너무 추워여");
			++i; // 증감식
		}

		// 무한 루프
		//
		// while (true) {
		// System.out.println("너무 추워여");
		//
		// }

		// 구구단

		String fmt = "%d * %d = %d \n";
		int dan = 5;
		i = 1;

		while (i <= 9) {
			System.out.printf(fmt, dan, i, dan * i);
			++i;
		}

		// 한번도 실행 안된다고 ?
		i = 9;

		while (i > 10) { // i 가 9이므로 참 이 아님 그래서 노실행
			System.out.println("while 이글이 보이냐?");
		}

		// 하지만 , 이건다르다

		i = 9;
		do {
			System.out.println("do-while 이글이 보이냐?");
		} while (i > 10);

		// 별출력

		// *****
		// *****
		// *****
		// *****
		// *****

		i = 1;
		while (i <= 5) {
			System.out.println("*****");
			++i;
		}

		int j = 1;
		i = 1;

		while (i <= 5) {

			while (j <= 5) {
				System.out.print("*");
				++j;
			}
			++i;
			j = 1;
			System.out.print("\n");
		}

		// i = 1;
		// while (i <= 5) {
		// System.out.println("*****");
		// ++i;
		// }
		/*
		 **
		 ***
		 ****
		 *****
		 ******	
		 *****
		 ****
		 ***
		 **
		 */

		j = 1;
		i = 1;

		while (i++ <= 5) {

			while (j++ <= i) {
				System.out.print("*");
				// ++j;
			}
			// ++i;
			j = 1;
			System.out.print("\n");
		}
		i = 1;
		j = 5;

		while (i <= 5) {

			while (j >= i) {
				System.out.print("*");
				--j;
			}
			++i;
			j = 5;
			System.out.print("\n");
		}

		// 반복의 중단 - break
		i = 1;
		int sum = 0;
		fmt = "i : %d , sum : %d \n";
		while (true) {
			if (sum > 100) {
				System.out.printf(fmt, i, sum);
				break;
			}
			sum += i;
			++i;

		}

		// 반복의 재시작 - continue
		i = 1;
		while (i <= 100) {
			++i;
			if (i % 2 != 0)
				continue;
			System.out.println(i);

		}

		// while 의 조금 다른 용도

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("작업할 코드를 입력하라");
			System.out.println("c) reate : 회원등록");
			System.out.println("r) ead : 회원 조회");
			System.out.println("u) pdate : 회원 수정");
			System.out.println("d) delete : 회원 삭제");
			System.out.println("q) uit : 프로그램 종료");
			System.out.println(">>>>");

			String job = sc.nextLine();

			// q 가 입력되면 while 에서 나감
			// if (job.equals("q"))
			// break; // equals 문자를 비교할때는 명령어

			// }
			switch (job) {
			case "c":
				System.out.println("<회원등록 메뉴를 선택>");
				break;
			case "r":
				System.out.println("<회원 조회 메뉴를 선택>");
				break;
			case "u":
				System.out.println("<회원 수정 메뉴를 선택>");
				break;
			case "d":
				System.out.println("<회원  삭제 하시겠습니까 ?>");
				break;
			case "q":
				System.exit(0);
				break; // 종료

			}
		}

	}
}
