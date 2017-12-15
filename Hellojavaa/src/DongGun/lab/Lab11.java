package DongGun.lab;

import java.util.Scanner;

public class Lab11 {

	// 프린 31 , 32 ,33

	public static void main(String[] args) {

		// # 31 - 은행 정보와 카드 정보 출력
		Scanner sc = new Scanner(System.in); // Scanner // 변수이름 :sc
		System.out.println("6가지 카드번호를 입력:");
		String card = sc.nextLine();
		String ctmsg = "카드정보 없음 ";

		// 카드정보 판별
		char ctype = card.charAt(0);

		if (ctype == '3' && card.charAt(1) == '5') // 카드 두자리를 확인 3 과 5
			ctmsg = "JCB 카드";
		else if (ctype == '4')
			ctmsg = "BC 카드";
		else if (ctype == '5')
			ctmsg = "Maestro 카드";

		// 은행정보 판별
		String bank = "은행정보 없음 ";
		switch (card) {
		case "356317":
			bank = "NH 농협카드";
			break;
		case "356901":
			bank = "신한카드";
			break;

		}

		System.out.printf("%s %s \n", ctmsg, bank);

		// # 32 - 주민번호 검증하기

		String jumin = "1111111111118"; // 마지막자리수는 검증
		// a. b 가중치 적용및 합산
		int sum = 0;
		// i j
		// sum += (jumin.charAt(0) - 48) * 2; // 아스키코드 1 은 49
		// sum += (jumin.charAt(1) - 48) * 3;
		// sum += (jumin.charAt(2) - 48) * 4;
		// sum += (jumin.charAt(3) - 48) * 5;
		// sum += (jumin.charAt(4) - 48) * 6;
		// sum += (jumin.charAt(5) - 48) * 7;
		// sum += (jumin.charAt(6) - 48) * 8;
		// sum += (jumin.charAt(7) - 48) * 9;
		// sum += (jumin.charAt(8) - 48) * 2;
		// sum += (jumin.charAt(9) - 48) * 3;
		// sum += (jumin.charAt(10) - 48) * 4;
		// sum += (jumin.charAt(11) - 48) * 5;
		int jcode = 0;
		for (int i = 0, j = 2; i <= 11; ++i, ++j) { // j =2 ++ j j 가 2 부터 증감

			if (i == 8) // i가 8일때 j 는 2로 돌아가
				j = 2; //

			jcode = jumin.charAt(i) - 48;
			sum += jcode * j;
		}

		// 나머지 계산
		// int check = sum % 11;

		// 마지막 자릿수와 비교
		String msg = "주민번호 검증 실패!";

		// if (check > 9) {
		// if (check % 10 == jumin.charAt(12) - 48)
		// msg = "주민번호 검증성공";
		// } else if (11 - check == jumin.charAt(12) - 48)
		// msg = "주민번호 검증성공";

		// 11로 나눈 나머지구한후
		// 11에서 이것을빼고
		// 맨마지막 자리를 빼냄 위에 주석 간단하게함
		int check = (11 - (sum % 11)) % 10;

		if (check == jumin.charAt(12) - 48)
			msg = "주민번호 검증성공";
		// 결과 출력
		System.out.println(msg);

	}

}
