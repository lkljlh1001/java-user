package DongGun;

public class CallSuper {
	public static void main(String[] args) {
		// 부모 클래스 생성자 호출하기 - super()
		// 부모 클래스 메서드 호출하기 - super.메서드이름
		// 자식 클래스의 생성자를 호출하면
		// 먼저 부모클래스의 생성하고
		// 그 다음 자식클래스의 그것을 호출한다

		Child c = new Child();
		Child2 c2 = new Child2();
		System.out.println(c);
		System.out.println();
		System.out.println(c2);
		System.out.println();

		// 상속관계에서 형변환 - 다형성
		Child c3 = new Child();
		Parent p3 = new Parent();

		p3 = c3; // upcasting
		p3 = new Child();

		c3 = (Child) p3; // downcasting
		// 상속관계에서 부모 / 자식 클래스 여부 확인
		System.out.println(c instanceof Parent);
		Son son = new Son();
		System.out.println();
		System.out.println(son instanceof Parent);

	}
}

class Parent {
	// super 의개념 child 를 실행하면 Parent 부터 실행되고 그담 child 가생성됨
	protected String name;

	public Parent() {
		System.out.println("parent 생성자");
	}

	public String sayName() {
		return name;
	}

	public void sayLove(Daughther d) {
		System.out.println("사랑한다 딸아");
	}

	public void sayLove(Son s) {
		System.out.println("사랑한다 아들아");
	}

	// 아들 딸 을 한번에 Parent 로 할수있음 (다형성의 예
	public void sayLove(Parent w) {
		System.out.println("사랑한다 얘들아!");
	}

}

class Child extends Parent {

	protected String name;

	public Child() {
		super(); // 컴파일러가 자동으로 추가해줌 메서드 첫번째줄에 존재해야함 안그러면 오류
		super.name = "1"; // Parent 의 name // super 는 부모클래스의 데이터를 불러올때 사용
		this.name = "2"; // Child 의 name
		super.sayName();
		System.out.println("child 생성자");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}

class Parent2 {
	protected String name;

	public Parent2(String name) {
		System.out.println("parent()/ : " + name);
	}
}

class Child2 extends Parent2 {
	public Child2() {
		// super(); // 부모클래스에 생성자가 있으면 super 는 오류
		super("혜교");
	}
}

final class Daughther extends Parent {
	// final 상속되지 않는 클래스 선언
}
// final class Daughther extends Parent {
// // 상속 불가
// }

class Son extends Parent {

}