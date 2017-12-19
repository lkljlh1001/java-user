package DongGun.lab;

//메서드 베이스     , 메인이 존재하지 않는다 
public class SungJuckService { // class 이름 맨끝 서비스는 메서드 값만 넣을때 사용

	private int tot = 0;
	private double avg = 0;
	private String grd = "가";

	// getTotal
	public int getTotal(int kor, int eng, int mat) {

		tot = kor + eng + mat;
		return tot;

	}

	// 객체지향 특성중 다형성 main//메서드 다중정의를 통해 새로운 유형의 getTotal 메서드 작성
	public int getTotal(SungJuckV0 sj) {

		tot = sj.getKor() + sj.getEng() + sj.getMat();

		return tot;
	}

	// 또다른 유형의 getTotal _ex
	public void getTotal() {
	}
	// getAverage

	public double getAverage() {
		// public double getAverage(int kor, int eng , int mat) {
		// return ((kor+eng+mat)/ 3);

		avg = (double) tot / 3;
		return avg;

	}
	// getGrade

	public String getGrade() {

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
		case 4:
		case 3:
		case 2:
		case 1:
			grd = "가";
			break;

		}
		return grd;

	}
}
