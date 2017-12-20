package DongGun.lab;

public class Lab17 {
	// 다형성의 예제
	public static void main(String[] args) {

		Buyer b = new Buyer();

		b.buy(new Tvs());
		b.buy(new Computer());

		System.out.println("현재 남은돈은" + b.money + "만원 입니다");
		System.out.println("현재 보너스점수는" + b.bonusPoint + "점입니다");

	}

}

class Product {
	int price, bonusPoint;

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);

	}
}

class Tvs extends Product {
	Tvs() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {

	public Computer() {
		super(200);
	}

	@Override
	public String toString() {
		return "Computer";
	}
}

class Buyer {

	int money = 1000;
	int bonusPoint = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다");
	}

}
