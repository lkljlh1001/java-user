package DongGun.adv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// 스트림(Stream) -----------------------------
//											//
// 자바 IO 스트림은 (수도관에 비유)할 수 있음			//
// 수도관은 물 저수지에 도시의 주택을 연결하는 것처럼,		//
// 자바 스트림은 (데이터 저수지에 자바 코드를 연결한 것임)	//
// 자바 용어로 데이터 저수지를 개수대sink 라 하며		//
// 이것은 파일이나 네트워크 socket 이나 메모리 등이		//
// 될 수 있음									//
//											//
// 스트림의 좋은 예는 서로 다른 sink 로 데이터를 전송하거나  //
// sink에서 데이터를 가져오는 방법을 일원화해서	 		//
// 코드를 간단하게 작성할 수 있게 해 줌 				//
// 단지 올바르게 스트림을 생성하기만 하면 됨				//
//											//
// 데이터는 이진 데이터와 인간이 읽을 수 있는 문자로		//
// 분류되기 때문에, 입력/출력 스트림에도 2가지 종류가 존재   //
//										 	//
// Reader - sink에서 문자를 읽는 스트림				//
// Writer - sink 에 문자를 쓰는 스트림				//
// InputStream - sink 에서 이진 데이터를 읽는 스트림   //
// OutputStream - sink 에 이진 데이터를 쓰는 스트림	//
//--------------------------------------------
public class FileWriters {
	public static void main(String[] args) throws IOException {
		// 파일 입출력 - 문자기반 스트림
		// 파일 쓰기 테스트 - 키보드로 입력한 문자를 파일에 저장

		String fpath = "c:/java/data01.txt"; // 입력받은 문자를 저장할 파일 위치 지정

		// FileWriter fw = new FileWriter(fpath);
		FileWriter fw = new FileWriter(fpath, true); // true(boolean append) 는 데이터를
		// 누적시켜주는 기능)
		// 스트림 생성 - 지성된 경로에 파일을 만들고
		// 입력한 문자를 파일로 저장할 수 있도록 데이터 통로 생성

		BufferedWriter bw = new BufferedWriter(fw);
		// 빠른 입출력 처리를 위해 buffer 기능이 있는 Writer클래스 사용

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요(종료는 q:)");
			String msg = sc.nextLine();

			if (msg.equals("q:")) { // 입력한 문자가 q라면 // 문자타입은 equals 로 비교함 까먹 ㄴㄴ
				break;
			} else {
				// fw.write(msg + "\r\n"); // 파일에 내용 저장
				bw.write(msg + "\r\n"); // 파일에 내용 저장
			}
		}

		bw.close(); // 나중에 만든것을 먼저 닫는다
		fw.close();
		// 파일에 입력한 내용을 완전히 저장하려면 반드시 필요

		sc.close();

	}
}
