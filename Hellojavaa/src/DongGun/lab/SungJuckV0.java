package DongGun.lab;

// 데이터 베이스

public class SungJuckV0 {
	// vo클래스 만들기
	// vo클래스 - value object
	// 값만 저장하는 특수한 클래스

	// 멤버변수 (private 으로 선언!!!!!)
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avrg;
	private String grade;

	// 생성자
	public SungJuckV0() {
		// TODO Auto-generated constructor stub
	}

	public SungJuckV0(String name, int kor, int eng, int mat) {
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

	@Override
	public String toString() {
		return "SumgJuckV0 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot=" + tot
				+ ", avrg=" + avrg + ", grade=" + grade + "]";
	}

}
