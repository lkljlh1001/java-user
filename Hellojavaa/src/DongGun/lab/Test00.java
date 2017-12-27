package DongGun.lab;

import java.io.IOException;

public class Test00 {

	public static void main(String[] args) throws IOException {

		//  입출력 (I/O)는 컴퓨터 프로그램에 의해 수행하는
		// 가장 일반적인 작업 중 하나임
		//
		// 파일을 작성하거나 삭제
		//  파일에서 읽거나 파일 또는 네트워크 소켓에 쓰기
		//  저장소에 persistent 하기 위해 객체를 직렬화(저장)하고
		// 저장된 객체를 검색

		// 자바는 I/O를 java.io 패키지의 I/O API의 형태로
		// JDK 1.0부터 제공하고 있음
		// JDK 1.4에서는 성능향상을 위해 버퍼 관리, 네트워크 확장 및
		// 파일 I/O의 제공하는 새로운 I/O (NIO) API를 추가함
		// 자바 NIO API는 java.nio 패키지 및 하위 패키지의 일부임

		// JDK 7은 기존의 기술을 보완하기 위해 NIO.2라는 패키지의
		// 새로운 세트를 소개함
		// 이것들은 java.nio2 라는 패키지 대신에,
		// java.nio.file 패키지와 그것의 하위 패키지에서 찾을 수 있음
		// NIO.2 의 새로운 기능 중 하나는 지금은 열악한 것으로
		// 간주되는 java.io.File 를 대체하기 위해
		// Path 인터페이스를 도입했음

		// JDK7의 또 다른 추가사항은 I/O 와 NIO APIs에 영향을
		// 줄 수 있는 java.lang.AutoCloseable 인터페이스임
		// java.io 의 대부분은 try-with-resources 를 지원하기 위해
		// 이 인터페이스를 구현함
		// 하지만, java.io.File 은 아직도 JDK7 이전에서 많이 사용

		//  JDK6 의 자바 IO 프로그래밍을 배우기 위해
		// 12개의 인터페이스와 50개의 클래스,
		// 16개의 예외 클래스 등의 java.io 패키지의 구성원을
		// 하나씩 훑는 것은 별로 좋지 않음
		//  핵심 주제는 java.io.File 임

		//  하지만, File 클래스는 파일의 내용을 쓰거나
		// 읽는 기능을 제공하지 않음
		//  이것을 하려면 스트림stream을 이용해야 함
		//  스트림에는 4가지 종류가 있음
		// InputStream, OutputStream, Reader, Writer
		//  좀 더 좋은 성능을 위해 Buffered~로 시작하는 클래스로
		// wrapper 하기도 함

		/// 스트림(Stream) \\\

		// 자바 IO 스트림은 (수도관에 비유)할 수 있음
		// 수도관은 물 저수지에 도시의 주택을 연결하는 것처럼,
		// 자바 스트림은 (데이터 저수지에 자바 코드를 연결한 것임)
		// 자바 용어로 데이터 저수지를 개수대sink 라 하며
		// 이것은 파일이나 네트워크 socket 이나 메모리 등이
		// 될 수 있음

		// 스트림의 좋은 예는 서로 다른 sink 로 데이터를 전송하거나
		// sink에서 데이터를 가져오는 방법을 일원화해서
		// 코드를 간단하게 작성할 수 있게 해 줌
		// 단지 올바르게 스트림을 생성하기만 하면 됨

		// 데이터는 이진 데이터와 인간이 읽을 수 있는 문자로
		// 분류되기 때문에, 입력/출력 스트림에도 2가지 종류가 존재

		// Reader - sink에서 문자를 읽는 스트림
		// Writer - sink 에 문자를 쓰는 스트림
		// InputStream - sink 에서 이진 데이터를 읽는 스트림
		// OutputStream - sink 에 이진 데이터를 쓰는 스트림

	}
}