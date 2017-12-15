package DongGun.lab;

import java.util.Scanner;

public class Lab04 {

	public static void main(String[] args) {

		// # 16 if 문

		int n = 1;
		int k = 2; // r= 1;
		int r = n;// 2 < 1

		if (k < n)
			r = k;
		System.out.printf("%d %d %d\n", n, k, r);
		// -----------------------

		int r1;

		if (n < k) {
			r1 = k;
		} else {
			r1 = k + n;
			System.out.printf("%d %d %d\n", n, k, r);
		}
		// ------------------------------

		int r2 = k;

		if (r2 < k) {
			n = r2;

		} else {
			k = n;
			System.out.printf("%d %d %d\n", n, k, r);
		}

		int r3 = 3;

		if (r < n + k) {
			r = 2 * n;

		} else {
			k = 2 * r;
			System.out.printf("%d %d %d\n", n, k, r);
		}

		// 17
		int x = 1;
		int y = 1;

		// if (x && y == 0) { // x && y = true
		// x=1 ;
		// y=1 ;
		// }

		// if (1 <= x <= 10) {
		// System.out.println(""); // x =>1 && x <= 10
		// }

		// # 18
		int number = 30;
		if (number % 2 == 0) {
			System.out.println(number + "는 짝수.");
			System.out.println(number + "는 홀수.");
		}

		number = 35;
		if (number % 2 == 0) {
			System.out.println(number + "는 짝수.");
			System.out.println(number + "는 홀수.");
		}
		number = 30;
		if (number % 2 == 0) {
			System.out.println(number + "는 짝수.");
		} else {
			System.out.println(number + "는 홀수.");
		}

		number = 35;
		if (number % 2 == 0) {
			System.out.println(number + "는 짝수.");
		} else {
			System.out.println(number + "는 홀수.");
		}

		// # 19

		int x1 = 3;
		int y1 = 2;
		int z1;

		//
		if (x1 > 2) {
			if (y1 > 2) {
				z1 = x1 + y1;
				System.out.println("z1 is" + z1);
			} else {
				System.out.println("x1 is" + x1);
			}
		}
		x1 = 3;
		y1 = 4;

		if (x1 > 2) {
			if (y1 > 2) {
				z1 = x1 + y1;
				System.out.println("z1 is" + z1);

			} else {
				System.out.println("x1 is" + x1);
			}
		}

		x1 = 2;
		y1 = 4;

		if (x1 > 2) {
			if (y1 > 2) {
				z1 = x1 + y1;
				System.out.println("z1 is" + z1);
			} else {
				System.out.println("x1 is" + x1);
			}
		}
		// # 20

		int a = 3;

		if (a++ == 3)
			System.out.println("3");
		else
			System.out.println("4");

		if (++a == 3)
			System.out.println("3");
		else
			System.out.println("4");

		a = a++;

		if (a == 3)
			System.out.println("3");
		else
			System.out.println("4");

		// # 21
		// 결혼여부 ismaried = "Y" , "N"
		// 결혼여부 ismaried = "true" , "false"
		// 결혼여부 ismaried = 0, 1
		Scanner sc = new Scanner(System.in);
		System.out.println("결혼여부를 입력하세여 (미혼 : 0 , 기혼  : 1");
		int ismaried = sc.nextInt();
		System.out.println("연봉을 입력하세요");
		int salary = sc.nextInt();
		int tax = 0;

		if (ismaried == 0) {
			if (salary < 3000)
				tax = (int) (salary * 0.1);

			else
				tax = (int) (salary * 0.25);

		}
		System.out.println(ismaried);

		if (ismaried == 1) {
			if (salary > 3000)
				tax = (int) (salary * 0.1);

			else
				tax = (int) (salary * 0.25);

		}
		System.out.println(ismaried);

		// 프린트 문제 16- 20

	}

}
