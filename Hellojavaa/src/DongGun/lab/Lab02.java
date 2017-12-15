package DongGun.lab;

public class Lab02 {
	public static void main(String[] arg) {

		// 3 다음 수학식들을 자바 표현식으로 바꿔보세요

		int x = 3;
		int y = 4;
		int z = 2;
		int result1 = 0;

		result1 = 3 * x; // 3x
		result1 = 3 * x + y; // 3x + y
		result1 = (x + y) / 7;
		result1 = (3 * x + y) / (z + 2);

		// System.out.printf("3x = %d \n", 3 * x);
		// System.out.printf("3x+y = %d \n", 3 * x + y);
		// System.out.printf("(x+y) / 7 = %d \n", (x + y) / 7);
		// System.out.printf("(3x+y) / (z+2) = %d \n", (3 * x + y) / (z + 2));

		// 4 다음 문장의 실행결과는 무엇인지 서술하세요

		double number = ((double) 1 / 3) * 3; // 결과는 언제나 정수로 나온다 1 과 3이 정수이므로 double 형식으로 바꿔준다 !!
		System.out.printf("(1/3)*3 = %f", number);

		System.out.printf("\n");
		// 5 다음 문장의 실행결과는 무엇인지 서술하세요

		int quotient, remainder;

		quotient = 7 / 3;
		remainder = 7 % 3;

		System.out.printf("%d , %d", quotient, remainder);
		System.out.printf("\n");
		// 6 다음 문장의 실행결과는 무엇인지 서술하세요

		int result2 = 11;
		result2 /= 2; // r = r / 2 를 줄임

		System.out.printf("%d", result2);
		System.out.printf("\n");

		// 7 다음 변수에 정의된 값을 이용해서 자바 표현식의 실행결과는 무엇인지 서술하세요 // 연산자 우선순위
		double x2 = 2.5;
		double y2 = -1.5;
		int m = 18;
		int n = 4;
		// System.out.printf (x + n * y - (x + n) * y )
		// System.out.printf (m / n + m & n)
		// System.out.printf (5 * x - n / 5)
		// 1 - (1 - (1 - ( 1 - (1 -n))))

		// # 8 - 논리 연산자의 단축 평가

		System.out.println(3 + 4.5 * 2 + 27 / 8);
		System.out.println(true || false && 3 < 5 || !(5 == 7));
		System.out.println(!true || (3 > 5 && 6 >= 2));
		// System.out.println(!true > 'A') ;
		System.out.println(7 % 4 + 3 - 2 / 6 * 'Z');
		System.out.println('D' + 1 + 'M' % 2 / 3);
		System.out.println(5.0 / 3 + 3 / 3);
		System.out.println(53 % 21 < 45 / 18);
		System.out.println((4 < 6) || true && false || false && (2 > 3));
		System.out.println(7 - (3 + 8 * 6 + 3) - (2 + 5 * 2));
		System.out.printf("\n");
		// # 9 문자열로 처리

		System.out.println("May 13, 1988 fell on day number ");
		System.out.println(
				((13 + (13 * 3 - 1) / 5 + 1988 % 100 + 1988 % 100 / 4 + 1988 / 400 - 2 * (1988 / 100)) % 7 + 7) % 7);
		// 특정일의 요일을 알아내는 수식
		// System.out.println(( Year + (Year /4 ) - (Year / 100) + (Year / 400 ) + ( 13
		// * Month + 8) / 5
		// +day) % 7 );
		System.out.println((1998 + (1998 / 4) - (1998 / 100) + (1998 / 400) + (13 * 12 + 8) / 5 + 12) % 7);
		System.out.println("check out this line ");
		System.out.println("// hello there " + '9' + 7);
		System.out.println('H' + 'L' + "is" + 1 + " more example"); // H 는 문자지만 숫자로 인식된다 'H'
		// System.out.println("Print both of us", " Me too"); -잘못된 코드 중간에 콤마 ㄴㄴ

		System.out.println("Reverse" + 'I' + "T");
		System.out.println("No! Here is " + 1 + " more example");
		// System.out.println ("Here is " + 10*10)) ; =괄호가 안맞음
		System.out.println("Not x is" + true);
		// System.out.println();
		// System.out.println;
		System.out.printf("\n");
		// System.out.println("How about this one " ++'?' + 'Huh?'); ++ 증감연산자의 잘못쓰임

		// # 10 - 단축연산
		System.out.println(true && false && true || true);
		System.out.println(true || false && true && true);
		System.out.println(true || true && false);
		System.out.println((true && false) || (true && !false) || (false && !false));
		System.out.println((2 < 3) || (5 > 2) && !(4 == 4) || 9 != 4);
		System.out.println(6 == 9 || 5 < 6 && 8 < 4 || 4 > 3);
		System.out.printf("\n");
		// # 11 - 우선순위 데이터 유형
		System.out.println(27 / 13 / +4);
		System.out.println(27 / 13 / +4.0);
		System.out.println(42.7 % 3 + 8);
		// System.out.println ((3<4)&& 5/8 );
		System.out.println(2.0 + 'a');
		System.out.println('a' + 'b');
		System.out.println('a' / 'b');
		// System.out.println('a'&& !'b');
		System.out.println((double) 'a' + 'b');
		System.out.printf("\n");
		// # 12 - 형변환 : 축소형

		int n1 = (int) 3.9; // double 형태에서 int 형태로
		System.out.println("n1==" + n1);
		System.out.printf("\n");
		// # 13 -

		int n2 = 3;
		n2++;
		System.out.println("n3==" + n2);
		n2--;
		System.out.println("n3==" + n2);
		n2 = 3;
		System.out.println("n3==" + n2++);

		System.out.println("n3==" + n2);
		// # 14 문자연산자
		System.out.println("2+2=" + (2 + 2));
		System.out.println("2+2 =" + 2 + 2);
		System.out.printf("\n");
		// #15

		char a, b;
		a = 'b';
		System.out.println(a);
		System.out.println((int) a); // 형변환 숫자로 표기됨
		b = 'c';
		System.out.println(b);
		a = 'b';
		System.out.println(a);
		System.out.printf("\n");
	}
}
