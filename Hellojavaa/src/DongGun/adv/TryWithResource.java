package DongGun.adv;

import java.io.BufferedReader;
import java.io.FileReader;

//FileReader try-with-resource구문 간단하게 한것\\
public class TryWithResource {
	// try-with-resource 구문
	// 파일입출력 관련 코드 작성시
	// 예외처리코드를 다루기 불편한 상황 발생 - 특히 finally 블럭
	// 이런 경우 try-with-resource 구문을 사용 하면
	// 예외처리를 간편하게 할 수있고 finally 블럭 문제도 쉽게 해결
	// close메서드가 Autoclosable 인터페이스를 구현했기때문 가능
	public static void main(String[] args) {

		String fpath = "c:\\java\\data01.txt";

		try (FileReader fr = new FileReader(fpath); BufferedReader br = new BufferedReader(fr);) {
			while (br.ready()) {
				System.out.println(br.readLine());
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	} // main ed

}// class ed
