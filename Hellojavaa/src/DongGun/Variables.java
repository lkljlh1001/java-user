package DongGun;

import java.util.Scanner;

// 변수
public class Variables {
	public static void main(String[] args) {

		/*
		 * 자바 기본자료형 int 정수 (byte , short , long) double 실수 (float) char 문자 string 문자열
		 */

		// 변수 : 자료형 변수이름 ; 으로 작성
		int a; // 정수형 변수
		double b;// 실형 변수
		char c;// 문자형 변수 (1자)
		String d; // 문자열 변수

		// 상수 : final 자료형 변수이름 ; 으로 작성
		// 변경불가 자료를 저장할 목적으로 사용
		// 변수이름은 대문자로 작성!!!!
		final int E;
		final double F;
		final char G;
		final String H;
		// --------------------------------------------
		// 자바 예약어를 변수 이름으로 사용불가!!!!
		// ex)
		// int if ;
		// double import ;
		// char System ; 비추!!
		// String String ; 비추!!
		// 회원정보 (아이디 , 비밀번호 , 이름 , 나이 )

		String UserID;
		String password;
		String name;
		// String name, passwd,name ; 동일한 자료형 변수들은 둘로 구분해서 한번에 선언가능 (비추 - 가독성문제)
		// String name = "x" , passwd = "y" ,name = "z" ; 가능
		int age;
		// -----------------------------------------------

		// 리터럴 : 컴파일러가 이해 할수 있는형식으로 작성된 데이터나 값

		// 주민번호 입력
		long Jumin = 1234561234567L; // 맨끝 L 은 롱의 타입을 인식하라는 뜻 !!

		// 변수 초기화 : 변수에 값을 대입
		// 변수명 = 값 ;

		UserID = "zzyzzy";
		password = "987654";
		name = "dong";
		age = 26;

		b = 123.456;

		float pi = 3.1456878F; // 3.1456878 은 duble 형이며 float
								// 은 인식 되지못함 F = float 변수로 인식시킨다
		// 문자
		c = '수'; // 수 는 한개의 글자로 인식되지만 su 는 그러므로 s로수정 안됨
		G = 's';

		// 변수 vs 상수

		c = '우';
		// G = 'x'; // 앞에 G=s 라고했는데 상수이므로 x로 변경불가

		// -------------------------------------------------------

		// 선언과 초기화
		int i = 132;
		double j = 987.123;
		boolean k = true; // 논리형 변수
		k = false;
		// k = 123 ;
		// k = '가' ;

		System.out.println(" 아이디:" + UserID + "password :" + password + "name :" + name + "age :" + age);

		// 서식화된 출력 - printf
		System.out.printf(" 아이디:%s \n 비밀번호:%s \n 이름:%s \n 나이:%d  ", UserID, password, name, age); // 한번에 작성

		String fmt = "\n아이디:%s \n 비밀번호:%s \n 이름:%s \n 나이:%d \n"; // 분류해서 작성가능
		System.out.printf(fmt, UserID, password, name, age);

		// double vs float : 오차범위 주의
		float avg1 = 296 / 3.0f;
		double avg2 = 296 / 3.0; // float 보다 double 이 오차범위가 커서 double 로 하는게 좋음
		System.out.println(avg1);
		System.out.println(avg2);

		// 키보드 데이터 입력 받기

		Scanner sc = new Scanner(System.in);// 컨트롤 스페이스를 누르면 Scanner 을 사용한다고 알려주는 명령어가 자동으로 작성된다
		System.out.print("아이디를 입력 하시오");
		UserID = sc.nextLine();
		System.out.print("암호를 입력 하시오");
		password = sc.nextLine();
		System.out.print("이름을 입력 하시오");
		name = sc.nextLine();
		System.out.print("나이를 입력 하시오");
		age = Integer.parseInt(sc.nextLine());

		System.out.printf(fmt, UserID, password, name, age);

		// --------------------------------------------------------------------

	}

}
