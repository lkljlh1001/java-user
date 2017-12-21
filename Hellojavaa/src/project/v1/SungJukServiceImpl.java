package project.v1;

//public class SungJukServiceImpl 

public class SungJukServiceImpl implements SungJukService {

	@Override // addSungJuk(SungJukV0 sj) 에서 자동으로 생성 private void processSungJuk(SungJukV0 sj)
	public void addSungJuk(SungJukV0 sj) {
		processSungJuk(sj); // 성적처리 - 총점 , 평균 , 학점 ;
		System.out.println("새로운 성적데이터가 추가되었습니다");

	}

	@Override
	public String getSungJuk() {
		String out = "성적이 등록되었습니다";
		return out;
	}

	@Override
	public String getSungJuk(String name) {
		System.out.println("성적이 조회 되었습니다");
		return null;
	}

	@Override
	public void modifySungJuk(SungJukV0 sj) {
		System.out.printf("%s 성적 데이터가 수정되었습니다\n", sj.getName());

	}

	@Override
	public void removeSungJuk(String name) {
		System.out.printf("%s 성적 데이터가 삭제 되었습니다\n", name);

	}

	// addSungJuk(SungJukV0 sj) 에서 자동으로 생성 private void processSungJuk(SungJukV0 sj)
	private void processSungJuk(SungJukV0 sj) {
		int tot = sj.getKor() + sj.getMat() + sj.getEng();
		double avg = (double) tot / 3;
		String grd = "가";
		switch ((int) avg / 10) {

		}

		sj.setTot(tot);
		sj.setAvrg(avg);
		sj.setGrade(grd);

	}
}
