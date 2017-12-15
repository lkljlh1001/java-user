package DongGun.lab;

import java.io.IOException;
import java.util.Scanner;

public class Test00 {

	public static void main(String[] args) throws IOException {
		// lap 07

		Scanner scanner = new Scanner(System.in); // 스캐너 초기화

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

	}

}
