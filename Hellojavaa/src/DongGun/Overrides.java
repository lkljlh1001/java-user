package DongGun;

public class Overrides {
	public static void main(String[] args) {

	}

}

// 성적처리 오버라이드
class SungJuk2 {

	protected String name;
	protected int kor;
	protected int eng;
	protected int mat;

	public int getTotal() { // 총점
		return kor + eng + mat;
	}

	public double getAverage() {
		double avg = ((double) kor + eng + mat) / 3;
		return avg;

		// return (double)getTotal() / 3 ;

	}

	public String getGrade() {
		double avg = ((double) kor + eng + mat) / 3;
		String grd = "가";
		// switch((int)getTotal() / 10) {
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = "수";
			break;
		case 8:
		case 7:
			grd = "미";
			break;
		case 6:
		case 5:
			grd = "양";
			break;
		}

		return grd;
	}

}

class MidSungJuck2 extends SungJuk2 {
	protected int sci;
	protected int art;

	@Override // 매서드 재정의
	public int getTotal() {

		// return kor + eng + mat + sci + art;
		int tot = super.getTotal() + sci + art; // super. 은 부모클래스의 매서드를 부를때
		return tot;
	}

	@Override
	public double getAverage() {
		// double avg = (double) (kor + eng + mat + sci + art) / 5;
		double avg = getTotal() / 5;

		return avg;
	}

	@Override
	public String getGrade() {
		// double avg = (double) (kor + eng + mat + sci + art) / 5;
		int avg = (int) getAverage() / 10;
		String grd = "가";
		switch (avg / 10) {
		case 10:
		case 9:
			grd = "수";
			break;
		case 8:
		case 7:
			grd = "미";
			break;
		case 6:
		case 5:
			grd = "양";
			break;
		}

		return grd;
	}

}