package DongGun;
//인터페이스는 다중상속이가능 //클래스는 다중상속 ㄴㄴ

public class Interfaces {

	public static void main(String[] args) {
		// 인터페이스 - 객체화 불가 클래스
		// 인터페이스를 구현한 클래스를 통해 객체화 가능
		// ISungJukService isjsrv =
		// new ISungJukService () ;
		SungJukServiceImpl sjsrv = new SungJukServiceImpl();
		sjsrv.gettotal();
		sjsrv.getAverage();
		sjsrv.getGrade();
		// 인터페이스 타입 업/다운 캐스팅 가능
		// 인터페이스 타입 변환
		// 인터페이스의 참조변수로
		// 구현한 클래스의 객체를 할당할 수 있음
		ISungJukService isjsrc = new SungJukServiceImpl();

		// 추상클래스 객체 생성가능?
		// 추상 메서드를 포함한 클래스를 의미 -객체화 불가!
		// AbstractClass ac = new AbstractClass(); // 오류
		// 추상 클래스의 객체화는 상속을 통해 가능 !!!
		AbstractClass cc = new CompleteClass();
	}
}

interface ISungJukService { // 맨앞 I 는 인터페이스를 의미 // 인터페이스 인터페이스명

	int TOT = 0; // 상수 (초기화 필요!!!!!!!!!!!!!) // 대문자로 작성 // public static final 이 생략 되므로 상수취급을 받음
	double AVG = 0.0;

	abstract void gettotal(); // 추상 메서드

	void getAverage();

	void getGrade();
}

class SungJukServiceImpl implements ISungJukService { // 클래스명에 마우스를 가까이하면 자동으로 메서드를 추가해준다 // implements(인터페이스) 는
														// extends(상속) 랑 같은의미

	@Override
	public void gettotal() {

	}

	@Override
	public void getAverage() {

	}

	@Override
	public void getGrade() {

	}

}

abstract class AbstractClass { // abstract 는 추상을 의미

}

class CompleteClass extends AbstractClass {

	public CompleteClass() {
	}

}

class Unit {

}

interface Fightable {
	void move(int x, int y);

	void attack(Unit u);
}
// 미완된 메서드 포함

class Firebat implements Fightable {

	@Override
	public void move(int x, int y) {

	}

	@Override
	public void attack(Unit u) {
	} // 완전한 메서드 포함

}
// 인터페이스를 구현 하는중
// 인터페이스의 모든 추상메서드를 구현할 필요가 없으면
// 추상클래스로 만들면 된다!!

abstract class Medic implements Fightable {

	@Override
	public void move(int x, int y) {
		// 일부 완저한 메서드 포함
	}
}