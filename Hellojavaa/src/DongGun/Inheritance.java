package DongGun;

//상속
public class Inheritance {

	public static void main(String[] args) {
		// 클래스간 상속관계가 형성되면
		// 각 클래스는 is-a 관계가 만들어진다
		// 자식 클래스의 객체는 부모클래스 타입으로 처리가능

		Tiger t = new Tiger();
		Animals t2 = new Tiger(); // is-a 관계가 성립되므로 자식클래스가 부모클래스의 형식으로 객체생성이 가능
		Animals e = new Eagle();
		Animals g = new Goldfish();

	}

}

class Animals extends Object {
	protected String eye;
	protected String mouth;
	protected String hp; // protected 는 자식클래스에 보이게 만듬

	public void eat() {
	} // 누구나봐야하고 보고를 하지않아도 된다

	public void sleep() {
	}

}

class Tiger extends Animals { // 애니멀을 타이거 에 상속한다
	protected String leg;

	public void run() {
	}
}

class Eagle extends Animals {
	protected String wing;

	public void fly() {
	}
}

class Goldfish extends Animals {
	protected String fin; // 지느러미

	public void swim() {
	}

}
