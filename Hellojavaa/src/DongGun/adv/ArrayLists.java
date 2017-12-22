package DongGun.adv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import project.v1.SungJukV0;
// 				ArtayList
//	List 는 Collection의 가장 인기 있는 하위 인터페이스이고,
//	ArrayList는 List 의 가장 자주 사용하는 구현체임
//	sequence라고 List는 순서 있는 collection 임
//	위치값index을 사용하여 요소에 접근할 수 있으며
//	정확한 위치에 요소를 삽입할 수도 있음

// 			collection Interface

public class ArrayLists {

	public static void main(String[] args) {
		// 배열 위치 마다 표시 하지만 / 컬렉션 프레임은 표시하지 않아도 순차적으로 들어간다
		int[] intArray = new int[5];
		intArray[0] = 1;
		intArray[1] = 2;

		// 컬렉션 프레임 워크
		// 동일한 자료형의 여러 객체의 묶음을 손쉽게 다루게 해줌
		// List L : 순차구조 , 순서있는 객체 다룸 , 중복허용

		List list = new ArrayList();// java.utill.List 생성
		list.add("혜교");
		list.add(94);
		list.add(123.456);
		list.add(true);
		list.add(new SungJukV0());

		for (int i = 0; i < 4; ++i)
			System.out.println(list.get(i));
		// ArrayList 에 저장된 내용들은 Object 형
		// 따라서 , 그것을 get 해서 각각의 변수에 저장하려할때
		// 불필요한 형봔이 발생 - 성능 저하 요인
		String name = (String) list.get(0); // string 형변환 / 오류 부분을 마우스로 ! 하면 해결
		int va = (int) list.get(1);
		double va2 = (double) list.get(2);
		boolean va3 = (boolean) list.get(3);
		SungJukV0 sj = (SungJukV0) list.get(4);

		// 지네릭스 Generic
		// 컬렉션 프레임 워크를 사용할때
		// 타입을 지정하지 않고 객체를 저장하면
		// 그것을 출력시 불필요한 형변환이 발생하는데
		// JDK5에서는 이것을 막고자 지네릭을 도입
		// 컬렉션을 선언할때 어떤 종류의 객체를 저장할지
		// 미리 결정해야하는데 그것을 <> 기호로 정의
		List cage1 = new ArrayList();
		cage1.add(new Tiger());
		cage1.add(new Zibra());
		cage1.add(new Lion());

		Tiger t = (Tiger) cage1.get(0);
		// Zibra z = (Tiger) cage1.get(1);
		// Lion l = (Zibra) cage1.get(2);

		List<Tiger> cage2 = new ArrayList<Tiger>(); // 마지막 Tiger 생략 가능
		List<Zibra> cage3 = new ArrayList<Zibra>();
		List<Lion> cage4 = new ArrayList<>();

		cage2.add(new Tiger());
		t = cage2.get(0);
		// cage2.add(new Zibra()); // 타이거만 넣는 케이스 이므로 지브라는 넣을수없음

		// ArrayList CRUD
		// 타입
		List<String> names = new ArrayList<>();
		names.add("혜교");
		names.add("수지");
		names.add("지현");
		// 조회 get
		// System.out.println(names.get(0));
		// System.out.println(names.get(1));
		// System.out.println(names.get(2));

		// 검색 : indexOf(값)
		int pos = name.indexOf("수지");
		System.out.println("수지의 위치" + pos);

		// 갯수 : size
		System.out.println(names.size());
		// 삭제 :
		names.remove(2);
		System.out.println(names.size());

		// 수정 : Set (위치, 값)
		System.out.println(names.get(0));
		names.set(0, "중기");
		System.out.println(names.get(0));

		// 모두 제거 ㅣ clear
		names.clear(); // 모두 제거
		System.out.println(names.size());
		// 걍 for 문
		for (int i = 0; i < names.size(); ++i) {
			System.out.println(names.get(i));
		}
		// 향상된 for문을 이용함
		for (String val : names) {
			System.out.println(val);
		}

		// 순환자를 이용해서 컬렉션의 모든요소 출력
		// 모든 컬렉션 클래스로 선언된 요소들을
		// 하나씩 읽어오기 위한 표준화된 방식을 제공 -속도느림 ㅡㅡ
		// hasNext : 컬렉션에 요소가 존재하는지 여부 검사
		// next : 요소를 읽어 올수 있는지 여부 검사
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {

			String val = it.next();
			System.out.println(val);
		}

	}// main ed

}// ArrayLists ed

class Tiger {
}

class Zibra {
}

class Lion {
}
