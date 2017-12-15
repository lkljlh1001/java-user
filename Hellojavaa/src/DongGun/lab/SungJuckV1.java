package DongGun.lab;

import java.util.Scanner;

/* 성적 처리프로그램 v1
 * 간단한 성적 처리를 수행하는 프로그램
 * 입력 : 이름 ,국어 , 영어 ,수학
 * 처리 : 총점 , 평균 ,학점
 * 출력 : 이름 ,국어 , 영어, 수학, 총점 , 평균, 학점
 * 
 */
public class SungJuckV1 {
	public static void main(String[] arg) {

		// 변수선언
		// 성적처리
		// 결과출력

		String nam;
		int kor;
		int eng;
		int mat;
		int tot;
		double avg;
		char grd;
		// 성적 처리
		// 데이터 입력 - 입력 자료는 하드코딩
		nam = "혜교";
		kor = 99;
		eng = 94;
		mat = 99;
		// 총점 , 평균 , 학점계산

		tot = kor + eng + mat;
		avg = (double) tot / 3;
		grd = (avg >= 90) ? '수' : (avg >= 80) ? '우' : (avg >= 70) ? '미' : (avg >= 60) ? '양' : '가';

		// 결과 출력
		String fmt1 = "이름 : %s , 국어 : %d , 영어 :%d ,수학 %d ";
		fmt1 += "총점 : %d , 평균 :%f, 등급: %c \n";
		System.out.printf(fmt1, nam, kor, eng, mat, tot, avg, grd);

		String name;
		int g;
		int e;
		int m;

		// 스캐너를 이용한 성적 처리 프로그램
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 처리 프로그램 ");
		System.out.println("----------- ");
		System.out.print("이름을 입력 하시오");
		name = sc.nextLine();
		System.out.print("국어 성적을 입력 하시오");
		g = Integer.parseInt(sc.nextLine());
		System.out.print("영어 성적을 입력 하시오");
		e = Integer.parseInt(sc.nextLine());
		System.out.print("수학 성적을 입력 하시오");
		m = Integer.parseInt(sc.nextLine());
		// 스캐너를 닫을때
		// sc.close();
		int cho = g + e + m;
		double av = (double) cho / 3;
		char hag = (av >= 90) ? 'A' : (av >= 80) ? 'B' : (av >= 70) ? 'C' : (av >= 60) ? 'D' : 'F';

		String fmt = "\n name:%s \n g:%d \n e:%d \n m:%d \n cho:%d \n av:%f \n hag:%s \n";
		System.out.printf(fmt, name, g, e, m, cho, av, hag);

	}

}
