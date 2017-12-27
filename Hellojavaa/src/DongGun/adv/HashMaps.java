package DongGun.adv;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import project.v1.SungJukV0;

public class HashMaps {

	@SuppressWarnings({ "unused", "unlikely-arg-type", "deprecation" }) // 노란경고줄 없애는 기능 (main 전체)
	public static void main(String[] args) {
		// 해시맵 - 데이터 저장은 느리지만 , 많은 양의 데이터 검색시 유리
		// 키와 값으로 데이터를 저장 - 키는 중복x ,값은 중복 허용

		HashMap<Integer, String> hmap1 = new HashMap<>(); // 헤쉬맵 - 헤쉬맵 숫자형과 문자형을
		// hmap1 의 이름으로 객체 생성하겠다
		// 키는 숫자형 , 값은 문자형인 HashMap 객체 생성
		HashMap<String, SungJukV0> hmap2 = new HashMap<>();
		// 키는 문자형 , 값은 SungJulV0인 HashMap 객체 생성

		hmap1.putIfAbsent(11, "혜교");
		hmap1.putIfAbsent(23, "지현");
		hmap1.putIfAbsent(35, "수지");
		hmap1.putIfAbsent(49, "중기");

		// hashMap에 각 요소 추가

		System.out.println("키 23 : " + hmap1.get(23));
		System.out.println("키 49 : " + hmap1.get(49));
		// 특정키로 검색 하기
		System.out.println("키11 :" + hmap1.get(11));
		hmap1.remove(11);
		System.out.println("키11 :" + hmap1.get(11));

		// 모든 내용 출력

		Iterator<Integer> it = hmap1.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + "/" + hmap1.get(key));
		}

		SungJukV0 sj1 = new SungJukV0("혜교 ", 98, 78, 56);
		SungJukV0 sj2 = new SungJukV0("지현 ", 78, 78, 54);
		SungJukV0 sj3 = new SungJukV0("수지 ", 68, 71, 55);
		SungJukV0 sj4 = new SungJukV0("중기 ", 92, 71, 36);

		hmap2.put("혜교", sj1);
		hmap2.put("지현", sj2);
		hmap2.put("수지", sj3);
		hmap2.put("중기", sj4);

		System.out.println("혜교 /" + hmap2.get("혜교"));

		Iterator<String> it1 = hmap2.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println(key + "/" + hmap2.get(key));
		}

		// 간단한 검색
		Integer key1 = 11;
		Integer key2 = 35;
		Integer key3 = 23;
		String key4 = "지현";
		String key5 = "중기";
		String key6 = "수지";

		if (hmap1.containsKey(key1))
			System.out.println(key1 + "/" + hmap1.get(key1));
		else
			System.out.println("데이터가 없습니다 !");

		if (hmap2.containsKey(key2))
			System.out.println(key2 + "/" + hmap1.get(key2));
		else
			System.out.println("데이터가 없습니다 !");

		@SuppressWarnings("rawtypes") // 노란경고줄 없애는 기능 (부분)
		Iterator it3 = hmap2.keySet().iterator();
		it3.next();

		Date today = new Date();
		today.getDay(); // "deprecation"
		today.getMonth();

	}
}
