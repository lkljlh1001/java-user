package DongGun;

public class statements2 {

	public static void main(String[] args) {

		// 단순무식하게 복붙 코드로 반복작업을 수행하는것은 유지보수 측면으로 볼때 좋은 방법은 아님
		// System.out.println("하이") ;
		// System.out.println("하이") ;
		// System.out.println("하이") ;
		// System.out.println("하이") ;
		// 반복문
		// for - 지정한 횟수만큼 어떤작업을 반복

		// for i j k l m 변수이름으로 지정
		for (int i = 1; i <= 5; ++i) {

			System.out.println("오늘은 너무 추워");

		}
		// --------------------------------------
		for (int i = 1; i <= 5; ++i) {

			System.out.println(i);

		}

		for (int i = 1; i <= 10; ++i) {
			System.out.println(i);
		}

		for (int i = 1; i <= 10; i += 2) { // 홀수 이게 더쉽내
			System.out.println(i);
		}

		for (int i = 2; i <= 10; i += 2) { // 짝수
			System.out.println(i);
		}

		// 구구단 5 * 1 =5
		// 5 * 2 =10
		//
		//

		String fmt = "%d * %d = %d \n";
		for (int i = 1, j = 9; i <= 9; ++i) {

			System.out.printf(fmt, j, i, j * i); // fmt = %d * %d = %d \n

		}

		// 중첩 for 문

		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= 10; ++j) {
				System.out.printf("*");
			}
			System.out.print("\n");
		}

		// 직각 삼각형 그리기
		/*
		 **
		 ***
		 ****
		 *****
		*/

		for (int i = 1; i <= 5; ++i) {
			for (int j = 1; j <= i; ++j) {
				System.out.printf("*");
			}
			System.out.print("\n");
		}

		/*****
		 ****
		 ***
		 **
		 *
		 */

		for (int i = 1; i <= 5; ++i) {
			// for (int j = 5; j >= i; j -= 1) {
			for (int j = 1; j <= (6 - i); ++j) {
				System.out.printf("*");
			}
			System.out.print("\n");
		}

	}

}
