package DongGun;

import DongGun.lab.SungJuckV0;

public class classes {

	public static void main(String[] args) {

		// 클래스 - 객체를 만들기 위한 틀 , 설꼐도

		// 객체 특성
		Animal tiger = new Animal(); // new 연산자를 이용해서 클래스를 불러온다
		tiger.name = "호순이";// .(닷)을 누르면 아래 객체모델링이 뜸
		tiger.weight = 45;
		tiger.type = "호랑이";
		tiger.gender = "여자";
		// 객체 행동
		tiger.move();
		tiger.eat();

		System.out.println(tiger.name);
		System.out.println(tiger.weight);
		System.out.println(tiger.type);
		System.out.println(tiger.gender);

		System.out.println();
		// shark
		Animal shark = new Animal();
		shark.name = "샤크";
		shark.weight = 90;
		shark.type = "상어";
		shark.gender = "남자";
		// shark 행동
		shark.move();
		shark.eat();

		System.out.println(shark.name);
		System.out.println(shark.weight);
		System.out.println(shark.type);
		System.out.println(shark.gender);

		System.out.println();
		// eagle

		Animal eagle = new Animal();
		eagle.name = "이글";
		eagle.weight = 45;
		eagle.type = "독수리";
		eagle.gender = "남자";
		// 객체 행동
		eagle.move();
		eagle.eat();

		System.out.println(eagle.name);
		System.out.println(eagle.weight);
		System.out.println(eagle.type);
		System.out.println(eagle.gender);

		System.out.println();

		Animal tiger2 = new Animal();
		System.out.println(tiger.name);
		System.out.println(tiger.gender);
		System.out.println(tiger.weight);
		System.out.println(tiger.type);

		System.out.println();

		Animal cat = new Animal();
		System.out.println(cat.name);
		System.out.println(cat.type);
		// 인수
		cat = new Animal("고순이", 25, "여자", "고양이");
		System.out.println(cat.name);
		System.out.println(cat.type);

		// 회원가입
		// Member m = new Member();
		// m = new Member("lee donggun", "121212", "dong gun", "ehdrjs558@naver.com", "
		// 2017-12-15");

		// SungjukV0 클래스를 이용하기
		// getter setter 을이용한
		SungJuckV0 sj = new SungJuckV0("혜교", 99, 98, 78);
		System.out.printf("%s,%d,%d,%d \n", sj.getName(), sj.getKor(), sj.getEng(), sj.getMat());

		// to string 을이용함
		System.out.println(sj);

	}// main

}

class Animal { // 동물 클래스

	// 필드(멤버변수)
	String name; // 객체 모델링
	int weight;
	String gender;
	String type;

	// 생성자에 기본생성자 를 생성하고 매개 변수가 있는 생성자를 생성한다음 적용가능
	// 기본생성자
	public Animal() {
	} // 기본생성자 ctl 스페이스

	// 매개변수가 있는 생성자

	// Animal() {
	// name = "호순이";
	// type = "호랑이";
	// gender = "여자";
	// weight = 45;
	// }; // ( () 매개 변수 paramater 없는)생성자 ,,,,, private : 클래스를 캡슐화 시킴, 접근 제한자

	// Animal(String name, int weight, String gender, String type) {
	// this.name = name; // this 는 멤버변수를 가르킴
	// this.weight = weight;
	// this.gender = gender;
	// this.type = type;

	void move() {
		System.out.println(name + "움직인다");
	}

	// 매개변수가 있는 생성자
	// 메서드 (행동)
	public Animal(String name, int weight, String gender, String type) {

		this.name = name;
		this.weight = weight;
		this.gender = gender;
		this.type = type; // 위에 소스 창에서 using feild ㄱㄱ

	}

	void eat() {
		System.out.println(name + "가 먹이를 먹었다");
	}
	// setter / getter // 위의 소스창에 ㄱㄱ getter /setter 창이 있음

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

class Car {
	String name;
	int size;
	// 클래스는 클래스의 멤버변수로 사용 가능
	Engin engin;
	Door door;
	Wheel wheel;

}

class Engin {
}

class Door {
}

class Wheel {
}

class Member {
	String userid;
	String passwd;
	String name;
	String email;
	String regdate;

	public Member() {
	} // 기본생성자

	// 매개변수 있는 생성자 // 대도록이면 기본생성자 생성후 매개변수있는 생성자를 선언
	public Member(String userid, String passwd, String name, String email, String regdate) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		this.regdate = regdate;
	}

}
