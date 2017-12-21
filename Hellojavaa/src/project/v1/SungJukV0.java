package project.v1;

public class SungJukV0 {

	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avrg;
	private String grade;

	// 생성자
	public SungJukV0() {
		// TODO Auto-generated constructor stub
	}

	public SungJukV0(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// setter / getter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvrg() {
		return avrg;
	}

	public void setAvrg(double avrg) {
		this.avrg = avrg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	// toString - 소스창에 제너레이트
	// String fmt // return String.format(fmt, name, kor, eng, mat, tot, avrg,
	// grade); 를 사용하면 간단하게 코드를 작성
	@Override
	public String toString() {
		String fmt = "[name=%s, kor=%d, eng=%d, mat=%d, tot=%d, avrg=%.1f, grade=%s]"; // %.1f 는 소수점 한자리수 만 보이게 만듬
		return String.format(fmt, name, kor, eng, mat, tot, avrg, grade);

	}
}