package DongGun;

public class Overloads {

	public static void main(String[] args) {

		// 메서드 오버로드 = 다중정의

		System.out.println(); // 괄호 안에 ctl sp 를 누르면 오버로드가 보임

	}

}

class Calaulator {

	// 매서드 다중정의
	public int add(int a, int b) {

		return a + b;
	} // 정수 더하기

	public double add(double a, double b) {
		return a + b;
	}// 실수 더하기

	public String add(String a, String b) {
		return a + b;
	}// 문자열 더하기
}
