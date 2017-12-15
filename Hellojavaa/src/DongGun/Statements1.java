package DongGun;

public class Statements1 {
	public static void main(String[] args) {
		// 문장 - 무엇인가를 하라는 지시를 의미
		// 문장이 모여 프로그램을 구성
		; // 빈문장에 세미클론을 달아도 적법

		/*
		 * 조건문 if if (조건식) {참일때실행할문장} if (조건식) {참일때} else {거짓일떄{ if (조건식) {참일때} else if
		 * (조건식 2) {참일떄} else if (조건식 3) {참일떄} else { 거짓일때 }
		 */

		if (3 > 5) {
			System.out.println("3은 5보다 크다 ???");
		}

		int tot = 99 + 98 + 99;
		if (tot > 270) {
			System.out.println("수");
		}

		// 어떤수가 2의 배수인지 알아보자
		int x = 13;
		if (x % 2 == 0) {

			System.out.println("2의 배수입니다");
		} else {
			System.out.println("2의 배수가 아닙니다");
		}

		// 범위 검사
		int x1 = 20;
		if ((x1 <= 100) && (x1 >= 90)) {
			System.out.println("수");
		} else {
			System.out.println("가");
		}

		String userid = "zzzzz";
		String passwd = "99299";

		// equals 는 문자를 비교할때 쓰인다
		if (userid.equals("zzzzz") && passwd.equals("99999")) {
			System.out.println("로그인성공");
		} else {
			System.out.println("로그인실패");
		}

		if (userid.equals("zzzzz")) {
			if (passwd.equals("99999")) {
				System.out.println("로그인 성공 !");
			} else {
				System.out.println("비밀번호가 틀림!");
			}
		} else {
			System.out.println("아이디가 틀림 !");
		}
		// 문자입력확인

		char ch = 'q';
		if (ch == 'q' || ch == 'Q') {

			System.out.println("프로그램 종료 ");
		}

		// 입력된 문자가 알파벳 소문자 여부 확인
		// if (ch == 'a' || ch == 'b'|| .......|| ch == 'z')
		ch = '1';

		if (!(ch >= 'a' && ch <= 'z')) {

			System.out.println("알파벳만 입력 가능");

			ch = 'X';

			if (!(ch >= 'A' && ch <= 'Z')) {

				System.out.println("대문자만 입력가능");
			} else {
				System.out.println("입력 성공");
			}

			if (!(ch >= '0' && ch <= '9')) {
				System.out.println("숫자만 입력가능");
			}

			// 다중 if 문
			double avg = (double) tot / 3; // tot = 270으로 선언됨
			char grd;
			if (avg <= 100 && avg >= 90)
				grd = '수';
			else if (avg <= 90 && avg >= 80)
				grd = '우';
			else if (avg <= 80 && avg >= 70)
				grd = '미';
			else if (avg <= 70 && avg >= 60)
				grd = '양';
			else
				grd = '가';

			System.out.println(grd);

			// 애매모호한 if문
			String grds = "";
			if (avg >= 90) {
				if (avg >= 96)
					grds = "A+";
			} else
				grds = "A0 또는 A-";

			System.out.println(grds);
			// ----------------------------------------------
			/*
			 * switch : 연산식의 결과값에 따라 분기 연산식 결과값 유형은 정수, 문자열, 열거형 중 하나이어야 함
			 * 
			 * switch(연산식){ case 값1 :실행할코드 ; break ; case 값2 :실행할코드 ; break ; case 값3 :실행할코드
			 * ; break ; default :실행할코드 ; break ;
			 */

			int userLevel1 = 1;
			switch (userLevel1) {
			case 1:
				System.out.println("관리자");
				break;
			case 2:
				System.out.println("사용자");
				break;
			case 3:
				System.out.println("매니저");
				break;
			default:
				System.out.println("비회원");
				break;
			}

			String key = "c";
			switch (key) {
			// case 가 연관이 있을때 위에다가 C 를 넣으면 데이터생성에서 멈춘다
			case "C":
			case "c":
				System.out.println("데이터 생성");
				break;
			case "r":
				System.out.println("데이터 조회");
				break;
			case "u":
				System.out.println("데이터 수정");
				break;
			case "d":
				System.out.println("데이터 삭제");
				break;
			}

			// 학점계산
			switch ((int) avg / 10) {
			case 10:
			case 9:
				grd = '수';
				break;
			case 8:
				grd = '우';
				break;
			case 7:
				grd = '미';
				break;
			case 6:
				grd = '양';
				break;
			default:
				grd = '가';
				break;
			}

			// 난수 생성

			System.out.println(Math.random());
			System.out.println(Math.random());
			System.out.println(Math.random());
			System.out.println(Math.random());

			double lucky = Math.random();
			System.out.println(lucky);
			System.out.println(lucky * 10);
			System.out.println(lucky * 100);
			// 정수형변환
			System.out.println((int) (lucky * 100));
			System.out.println(((int) (lucky * 100)) + 1);

		}

	}
}
