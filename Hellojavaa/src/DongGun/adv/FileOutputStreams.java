package DongGun.adv;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FileOutputStreams {

	public static void main(String[] args) {
		// 바이트기반 스트림 -파일쓰기
		// 객체를 바이트기반 스트림으로 파일에 저장
		// 즉, 클래스에 대한 객체를 직렬화해서 파일에 저장함

		String name = "지현";
		Users u = new Users("zzyzzy", "123456", "혜교", 29);
		String fpath = "c:/java/data01.dat";
		int age = 57;

		try (FileOutputStream fos = new FileOutputStream(fpath); // 위치
				ObjectOutputStream oos = new ObjectOutputStream(fos);) { // 이전의 객체를 받는다
			oos.writeUTF(name);// 직렬화로 문자형을 파일에 저장
			oos.writeObject(u); // 직렬화로 객체를 파일에 저장
			oos.writeInt(age); // 직렬화로 숫자를 파일에 저장
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

// 클래스를 직렬화해서 파일에 저장하려면
// 해당클래스는 Serializable 인터페이스를 구현해야함
class Users implements Serializable {

	private static final long serialVersionUID = -7634266186845882638L;
	String userid;
	String passwd;
	String name;
	int age;

	public Users() {
	}

	public Users(String userid, String passwd, String name, int age) {
		this.userid = userid;
		this.passwd = passwd;
		this.name = name;
		this.age = age;
	}

}