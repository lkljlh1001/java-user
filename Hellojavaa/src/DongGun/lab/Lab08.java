package DongGun.lab;

import java.util.Scanner;

public class Lab08 {

	public static void main(String[] args) {

		// # 교재 4-26

		int sum = 0;
		int i = 0;

		while ((sum += i) <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			++i;
		}

		// # 교재 4- 27

		int num;
		sum = 0;
		boolean flag = true;

		System.out.println("합계를 구할 수를 입력하여라.(끝내려면 0을 입력하라");

		while (flag) {
			System.out.println(">>");

			Scanner scanner = new Scanner(System.in);
			String tmp = scanner.nextLine();
			num = Integer.parseInt(tmp);

			if (num != 0) {
				sum += num;
			} else {
				flag = false;

			}
			System.out.printf("합계:%d", sum);
		}

		// 연습문제 4-4
		// 연습문제 4-8
		// 연습문제 4-13
		// 연습문제 4-14
		// 연습문제 4-15

	}
	// 교재 소스 4-26 4-27
	// 연습문제 4-4 4-8 4-13 4-14 4-15

}
