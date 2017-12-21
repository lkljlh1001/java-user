package project.v1;

// 커서를 두고 f3 을누르면 찾아줌 
public class SungJukMain {

	public static void main(String[] args) {
		// 성적 프로그램 관련 객체 생성

		SungJukService sjsrv = new SungJukServiceImpl();
		// 성적 객체 생성
		SungJukV0 sj = new SungJukV0("혜교", 99, 98, 99);

		// 성적 추가
		sjsrv.addSungJuk(sj);
		System.out.println(sj);

		// 성적 수정 -이름으로 검색 후 성적 수정
		sj = new SungJukV0("혜교", 55, 87, 12);
		sjsrv.modifySungJuk(sj);

		// 성적 삭제

		sjsrv.removeSungJuk("혜교");

	}

}
