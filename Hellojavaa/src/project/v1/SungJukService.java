package project.v1;

interface SungJukService {
	// 성적 데이터 CRUD 처리 -저장 , 조회 ,수정 ,삭제
	void addSungJuk(SungJukV0 sj);

	String getSungJuk();

	String getSungJuk(String name);

	void modifySungJuk(SungJukV0 sj);

	void removeSungJuk(String name);
}
