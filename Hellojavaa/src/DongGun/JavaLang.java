package DongGun;

import project.v1.SungJukV0;

public class JavaLang {
	public static void main(String[] args) throws Exception {
		// 정적으로 객체 생성
		// 생성할 객체의 클래스를 직접 기술
		SungJukV0 sj = new SungJukV0();
		Parent p = new Parent();
		Son s = new Son();
		// 동적으로 객체 생성 ---------------------------------------
		Class obj1 = new SungJukV0().getClass();
		Class obj2 = SungJukV0.class;
		// 클래스 를 변수로 이용해서 만들수있음
		Class obj3 = Class.forName("project.v1.SungJukV0");

		String[] cls = { "project.v1.SungJukV0", "DongGun.Parent", "DongGun.Son" };

		Class[] clsBase = new Class[3];
		for (int i = 0; i < 3; ++i) {
			clsBase[i] = Class.forName(cls[i]);
		}
		// 동적으로 생성한 클래스 이름 확인
		System.out.println(clsBase[0].getName());
		System.out.println(clsBase[1].getName());
		System.out.println(clsBase[2].getName());
		// 클래스의 정보를 확인 - reflection -------------------------

		// 문자열 클래스 - Stirng
		String a = "abc";
		// 실제로 들어가는 공간 예 char [] a ={ 'a' ,'b' ,'c' } '
		System.out.println(a);
		a = "xyz"; // abc 의공간 의 처음 abc 값은 그대로 남고 xyz 는 다른공간에서 생성되므로 변경이 불가한것
		System.out.println(a);

		// + 연산자로 문자열 연결시 심각한 리소스 낭비가 발생
		a = "1" + "2" + "3 " + "4" + "5"; // 1+2 /100번지 1+2+3 /200번지 1+2+3+4 // 300 번지 ~~ 리소스 낭비 발생

		// 따라서 StringBuffer 클래스를 사용할것을 추천한다

	}// main 끝

}
