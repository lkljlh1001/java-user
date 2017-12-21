package DongGun;

public class DefaultInterface {
	public static void main(String[] args) {
		// 인터페이스의 업캐스팅
		SportCar sc = new SportCar();
		sc.move();
		sc.openRoof();
		// Movable isc = new Movable() ; // 불가능
		Movable isc = new SportCar();
		isc.move();
		// isc.openRoof(); // SportCar 에만 존재

		// 인터페이스의 다운캐스팅
		SportCar spc = (SportCar) isc; // 형변환 하여 다운 캐스팅 한다
		spc.openRoof();

	}

}

// 업케스팅 테스트 예제
interface Movable {
	void move();

}

class SportCar implements Movable {

	@Override
	public void move() {

	}

	public void openRoof() {

	}

}

interface A {
	void sayHello(); // 추상매서드
	// void sayHello(String msg);

	default void sayHello(String msg) {
	}
	// default 메서드 - JDK 8 부터 지원
}

class X implements A {
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub

	}
}

class Y implements A {

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sayHello(String msg) {
		// TODO Auto-generated method stub

	}
}