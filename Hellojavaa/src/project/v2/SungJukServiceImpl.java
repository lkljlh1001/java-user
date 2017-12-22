package project.v2;

import java.util.ArrayList;
import java.util.List;

import project.v1.SungJukV0;
//public class SungJukServiceImpl 

public class SungJukServiceImpl implements SungJukService {
	// 성적 데이터를 저장하기위해 ArrayList 객체 사용
	private List<SungJukV0> sjdb = null;

	public SungJukServiceImpl() {
		sjdb = new ArrayList<>();
	}

	@Override // addSungJuk(SungJukV0 sj) 에서 자동으로 생성 private void processSungJuk(SungJukV0 sj)
	public void addSungJuk(SungJukV0 sj) {
		processSungJuk(sj);
		sjdb.add(sj);

	}

	@Override
	public String getSungJuk() {
		StringBuffer sb = new StringBuffer();
		String fmt = "%s %d %d %d \n";

		for (SungJukV0 sj : sjdb) {
			sb.append(String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat()));
		}
		return sb.toString();
	}

	@Override
	public String getSungJuk(int no) {
		if (checkSungJukNo(no, sjdb.size()))
			return "\n 잘못된 값 입력 !!";
		SungJukV0 sj = sjdb.get(no - 1);
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("\n\n%d : %s %d %d %d", no, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat()));

		return sb.toString();
	}

	private boolean checkSungJukNo(int no, int size) {
		return false;
	}

	@Override
	public void modifySungJuk(SungJukV0 sj, int no) {
		System.out.printf("%s 성적 데이터가 수정되었습니다\n");

	}

	@Override
	public void removeSungJuk(int no) {
		System.out.printf("%s 성적 데이터가 삭제 되었습니다\n");

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
