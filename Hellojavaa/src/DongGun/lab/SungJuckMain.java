package DongGun.lab;

public class SungJuckMain {

	public static void main(String[] args) {

		// 학생 데이터 생성

		SungJuckV0 혜교 = new SungJuckV0("혜교", 20, 81, 23);

		// 성적처리
		SungJuckService sjsrv = new SungJuckService();
		//// 데이터수 만큼 인수로 전달하는것은 왠지 비효율적
		// int tot = sjsrv.getTotal(혜교.getKor(), 혜교.getEng(), 혜교.getMat());

		// 메서드 다중정의를 통해 새로운 유형의 getTotal 메서드 작성
		int tot = sjsrv.getTotal(혜교);

		double avg = sjsrv.getAverage();
		String grd = sjsrv.getGrade();

		혜교.setTot(tot);
		혜교.setAvrg(avg);
		혜교.setGrade(grd);
		// 결과출력
		System.out.println(혜교);

	}
}
