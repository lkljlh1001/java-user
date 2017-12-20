package DongGun;

import DongGun.lab.SungJuckMain;
import DongGun.lab.SungJuckService;

//import DongGun.lab.SungJuckMain;

//import DongGun.lab.SungJuckService;
//import DongGun.lab.*; // lab  의 패키지를 모두 쓴다 , 필요없는거까지 불러옴  // 비효율 

public class OtherClass {
	public static void main(String[] args) {
		// 다른클래스 사용하기
		// 같은 패키지 내 다른 클래스는 별다른 과정없이 바로 사용 가능
		Overloads o = new Overloads();
		Overloads r = new Overloads();

		// 다른 패키지 클래스 사용하기
		// 해당 클래스가 존재하는 패키지 경로를 모두 기술해야만 사용가능
		DongGun.lab.SungJuckV1 sj = new DongGun.lab.SungJuckV1();

		// 다른 패키지 클래스 사용하기
		// import 문을 사용하면 편리하게 다른 패키지 상의
		// 클래스를 사용할 수 있음
		// ctl shift o 를 누르면 import 를 다 찾아줌
		SungJuckService sjsrv = new SungJuckService(); /// ctl 스페이스 누르면 위에 import 나옴
		SungJuckMain sjm = new SungJuckMain();

	}
}
