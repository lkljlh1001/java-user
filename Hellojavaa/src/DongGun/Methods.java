package DongGun;

public class Methods {

	public static void main(String[] args) {

		// ; // 빈문장도 적법
		//
		// { // 블럭 시작
		// // 블럭 내 에있는변수는 기본적으로 지역변수
		// // 지역변수는 블럭 안에서만 유효
		// // 해당 블럭을 벗어나면 사용불가!
		// // 변수의 유효범위 scope 를 주의할것 !!!!!!!!
		// String name = "혜교";
		// int kor = 89;
		// } // 블럭 끝
		// // name = "지현" ; // 지역변수가 적용되지않음 블럭 밖에 있으므로 오류
		//
		// {// 1 블럭 시작
		// String name = "혜교";
		//
		// {// 2 블럭 시작
		//// String name = "혜교"; // 1괄호 안에 2괄호 가 있으므로 지역변수가 적용되므로 중복이 되어 오류 가 난다
		//
		// }// 2 블럭 끝
		// }// 1 블럭 끝
		// String name ="혜교" ; // 1괄호에 선언된 name 변수의 유효범위는 해당블럭내이므로 블럭 바깥에 선언한 변수와 겹치지 않음

		// 메서드
		// --------------------------------------------------------------------------------------------
		// 어떤 기능을 하는 문장들을 블럭으로 정의하고 그것에 이름을 붙인것
		// 가독성과 코드 재사용성을 높이기 위해 사용
		// 접근수정자 반한값 메서드이름(매개변수 목록){ 매서드를 구성하는 문장 } == 메서드 선언방법

		int a = 3, b = 4;
		// int c = a+b ;
		int c = add(a, b); // add를 불러오고 괄호 안에 인수 a b 를 적용시킨다는 의미
		a = 10;
		b = 15;
		c = add(a, b);
		a = 20;
		b = 30;
		c = add(a, b);

		// 클래스 인스턴스 변수

		System.out.println(Cars.count);
		System.out.println();

		Cars 스포츠카 = new Cars(); // 객체화
		스포츠카.name = "페라리";
		스포츠카.type = "스포츠";
		++스포츠카.count;
		System.out.println(스포츠카.count);
		System.out.println(Cars.count);
		스포츠카.printCarinfo();

		System.out.println();
		Cars 트럭 = new Cars();
		++트럭.count;
		System.out.println(트럭.count);
		System.out.println(Cars.count);
		트럭.printCarinfo();

	} // main ed

	// 메서드 선언
	public static int add(int a, int b) { // int add 는 a 와 b 가 int 타입이므로 반환값이 없으면 void
		return a + b; /// ☆☆☆☆ return 은 다른곳에 적용 시킨다
	}

}// Methods ed

class Cars {
	String name; // 클래스변수
	String type;
	static int count; // 인스턴스 변수

	public void printCarinfo() { // return 갑이 없으면 void

		System.out.println(name + "/" + count);

	}

	public static void ShowCount() {
		System.out.println(count);
	}

	public static void ShowName() {

		// 멤버변수 name 을 출력하기 위해
		// showName 메서드 작성
		// 하지만 showName 메서드는
		// static 이므로 멤버변수는 사용 불가
		// System.out.println(name); // count 는 인스터슨변수이지만 name 클래스 변수 그러므로 오류
	}
}
