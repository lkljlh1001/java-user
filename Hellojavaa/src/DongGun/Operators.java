package DongGun;

public class Operators {
	public static void main(String[] args) {
		// 연산자 -각종 작업을 간단하게 표시한 기호
		// 산술 연산자 : + , - , * , / , %

		int x = 10, y = 4;

		System.out.printf("10 + 4 = %d \n", x + y);
		System.out.printf("10 - 4 = %d \n", x - y);
		System.out.printf("10 * 4 = %d \n", x * y);
		System.out.printf("10 / 4 = %d \n", x / y);
		System.out.printf("10 %% 4 = %d \n", x % y);

		System.out.printf("\n");

		// 비교 연산자 : > ,< , == ,!=

		System.out.printf("10 > 4 = %b \n", x > y);
		System.out.printf("10 < 4 = %b \n", x < y);
		System.out.printf("10 == 4 = %b \n", x == y);
		System.out.printf("10 != 4 = %b \n", x != y);

		System.out.printf("\n");

		String a = "Hello";
		String b = "hello";
		String c = "Hello";
		String d = new String("Hello");

		System.out.printf("a == b = %b \n", a == b);
		System.out.printf("b == c = %b \n", a == c);
		System.out.printf("c == d = %b \n", a == d); // a 와 c 는 같지만 new의 연산자의 차이때문에 a 와 c 는 다르다
		System.out.printf("c.equals(d) = %b \n", c.equals(d)); // 같게 해주려면 equals() 를 입력한다

		System.out.printf("\n");

		// 논리연산자 : &&, ||, !
		// && , || 등은 단축 논리연산이 지원 된다.

		int i = 5;
		int j = 13;
		System.out.printf("(i > 4 || j < 10) = %b  ;\n", i > 4 || j < 10);
		System.out.printf("(i < 5 && j > 10) = %b  ;\n", i < 5 && j > 10);

		System.out.printf("\n");

		// -------------------------------------------------------------------------------
		// 대입 연산자 : = , += , -= , *= , /=

		int z = x + y;
		z += x; // z = z + x ;
		z += y; // z = z + y ;

		// 증가/감소 연산자 : ++, --
		++z; // z = z + 1 ;
		--z; // z = z - 1 ;

		z++; // 후치
		z--; // 전치

		i = 5;
		j = 5;
		j = ++i;
		System.out.printf("i = 5 ; j = 5 ; j = ++i :%d", j); // 증가 하면서 입력

		System.out.printf("\n");

		i = 5;
		j = 5;
		j = i++;
		System.out.printf("i = 5 ; , j = 5 ; j = i++ :%d", j); // 중가 하기전 입력

		System.out.printf("\n");
		System.out.printf("\n");
		// 삼황연산자 - ?
		// (논리식) ? (참일때처리):(거짓일때처리)
		double avg = 296 / 3.0;
		// char grd = (avg <= 100 && avg >= 90) ? '수' : '우';
		// char grd = (avg >= 90) ? '수' : '우';
		// char grd = (avg >= 80) ? '우' : '미';
		char grd = (avg >= 90) ? '수' : (avg >= 80) ? '우' : (avg >= 70) ? '미' : (avg >= 60) ? '양' : '가';

		System.out.println(grd);

		// 연산자 우선순위
		// 표현식의 계산순서를 결정

		// z = x + y * 2 ;
		// z = (x + y) * 2 ;
		int k = 1, l = 2, m = 3;
		int n = k + l + m;
		int o = (k + l) * m;

		System.out.printf("k = %d \n n = %d \n o= %d \n", k, n, o);

		System.out.printf("\n");
		// 형변환
		// 이미 선언된 변수의 자료형은 형변환cast 연산자인 ()를 이용해 명시적으로 변환 가능

		double avg2 = 296 / 3; // 정수와 정수로 나누어서 정수의 결과값을 출력한다
		System.out.printf("296 /3 =%f \n", avg2);

		avg2 = (double) 296 / 3;
		System.out.printf("296 /3 =%f \n", avg2);

		// 정수 연산의 기본단위 : int
		byte p = 10;
		byte q = 10;
		// p = p + 10 ; // 정수 값이 출력됨 그러므로 byte로 변환
		p = (byte) (p + q);
		p = (byte) (p + 10);

		// 확대변환
		int s = p; // byte -> int

		// 축소변환(명시적으로 기술)
		// 데이터 소실의 위험성 감수
		s = 130;
		p = (byte) s;
		System.out.println(p);

	}
}
