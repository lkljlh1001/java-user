package project.v1b;

public class CustomerV0 {

	private String num;
	private String name;
	private String jumin;
	private String adr;
	private String phon;

	public CustomerV0() {
		// TODO Auto-generated constructor stub
	}

	public CustomerV0(String num, String name, String jumin, String adr, String phon) {
		super();
		this.num = num;
		this.name = name;
		this.jumin = jumin;
		this.adr = adr;
		this.phon = phon;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJumin() {
		return jumin;
	}

	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getPhon() {
		return phon;
	}

	public void setPhon(String phon) {
		this.phon = phon;
	}

	@Override
	public String toString() {

		return "CustomerV0 [num=" + num + ", name=" + name + ", jumin=" + jumin + ", adr=" + adr + ", phon=" + phon
				+ "]";
	}

}
