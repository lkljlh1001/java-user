package DongGun.lab;

import java.util.Scanner;

public class Lab05 {

	// 자바정석 예제 4-6, 4-7 , 4-8
	// # 4-6
	public static void main(String[] args) {

		System.out.print("현재월 월을 입력하세요.>");

		Scanner scanner = new Scanner(System.in);

		int month = scanner.nextInt(); // 화면을 통해 month 에 저장

		switch (month) {
		case 3:
		case 4:
		case 5:

			System.out.print("현재의 계절은 봄입니다.>\n");
			break;

		case 6:
		case 7:
		case 8:

			System.out.print("현재의 계절은 여름입니다.>\n");
			break;

		case 9:
		case 10:
		case 11:

			System.out.print("현재의 계절은 가을입니다.> \n");
			break;
		default:
			// case 12 :
			// case 1 :
			// case 2 :

			System.out.print("현재의 계절은 봄입니다.>\n");
			break;

		}

		// # 4-7

		System.out.print("가위(1) , 바위(2) , 보(3) 중 하나를 입력하시오.>");

		Scanner scanner1 = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int) (Math.random() * 3) + 1;

		System.out.println("당신은" + user + "입니다.");
		System.out.println("컴은" + com + "입니다.");

		switch (user - com) {
		case 2:
		case -1:
			System.out.println("당신은 졌습니다\n");
			break;
		case 1:
		case -2:
			System.out.println("당신이 이겼습니다\n");
			break;
		case 0:
			System.out.println("비겼습니다\n");
			// break ; //마지막 문장은 break 를 사용할 필요없음
		}

		// 예제 4-8

		System.out.println("당신의 주민번호를 입력 하세요. (921025 - 10xxxxxx");

		Scanner scanner2 = new Scanner(System.in);
		String regNo = scanner.nextLine();
		char gender = regNo.charAt(7); // 입력받은 번호의 8번째 문자를 gender 에 저장

		switch (gender) {

		case 1:
		case 3:
			System.out.println("당신은 남자입니다\n");
			break;

		case 2:
		case 4:
			System.out.println("당신은 여자입니다 \n");
			break;
		default:
			System.out.println("유효하지않는 주민등록 번호 입니다\n");
		}

		// 예제 4-15

	}

}
