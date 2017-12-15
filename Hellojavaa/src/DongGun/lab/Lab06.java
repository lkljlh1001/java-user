package DongGun.lab;

public class Lab06 {

	public static void main(String[] args) {

		// 자바정석 연습문제 # 3-1
		System.out.println("자바정석 연습문제 # 3-1");
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 의 문자코드는 65

		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x += 2);
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C' - c);
		System.out.println('5' - '0');
		System.out.println(c + 1);
		System.out.println(++c);
		System.out.println(c);

		// 자바정석 연습문제 3-2
		System.out.println("자바정석 연습문제 3-2");
		int numOfApples = 123;
		int sizeOfBucker = 10;
		int numOfbucket = numOfApples / sizeOfBucker;

		System.out.println("필요한 바구니의 수 : " + numOfbucket);

		// 자바정석 연습문제 3-3

		int num = 0;
		System.out.println();

	}
	// 자바정석 연습문제 3-1 3-2 3-3 4-1

}
