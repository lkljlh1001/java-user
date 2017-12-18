package DongGun.lab;

public class Lab13 {

	// 프린트 37, 38 , 39

}

class Person {

	String name;
	String adr;
	String phnum;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String adr, String phnum) {
		super();
		this.name = name;
		this.adr = adr;
		this.phnum = phnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getPhnum() {
		return phnum;
	}

	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}

}// end Person

class Customer {
	String name;
	String adr;
	String phnum;
	String numofcust; // 고객 번호
	String mils;// 마일리지

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String adr, String phnum, String numofcust, String mils) {
		super();
		this.name = name;
		this.adr = adr;
		this.phnum = phnum;
		this.numofcust = numofcust;
		this.mils = mils;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public String getPhnum() {
		return phnum;
	}

	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}

	public String getNumofcust() {
		return numofcust;
	}

	public void setNumofcust(String numofcust) {
		this.numofcust = numofcust;
	}

	public String getMils() {
		return mils;
	}

	public void setMils(String mils) {
		this.mils = mils;
	}
}

class Book {
	String title;// 제목
	int page;
	String writer;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, int page, String writer) {
		super();
		this.title = title;
		this.page = page;
		this.writer = writer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
}

class Magazine {
	String title;// 제목
	int page;
	String writer;
	String ballmail;

	public Magazine() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getBallmail() {
		return ballmail;
	}

	public void setBallmail(String ballmail) {
		this.ballmail = ballmail;
	}
}

class Phone {
	String maker;
	String pric; // 가격
	String cmncType; // 통신타입

	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public Phone(String maker, String pric, String cmncType) {
		super();
		this.maker = maker;
		this.pric = pric;
		this.cmncType = cmncType;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getPric() {
		return pric;
	}

	public void setPric(String pric) {
		this.pric = pric;
	}

	public String getCmncType() {
		return cmncType;
	}

	public void setCmncType(String cmncType) {
		this.cmncType = cmncType;
	}

}

class SmartPhone {

	String maker;
	String pric; // 가격
	String cmncType; // 통신타입
	String osv; // 운영체제버젼
	boolean isCamera;
	boolean isTooth; // 블루투스

	public SmartPhone() {
		// TODO Auto-generated constructor stub

	}

	public SmartPhone(String maker, String pric, String cmncType, String osv, boolean isCamera, boolean isTooth) {
		super();
		this.maker = maker;
		this.pric = pric;
		this.cmncType = cmncType;
		this.osv = osv;
		this.isCamera = isCamera;
		this.isTooth = isTooth;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public String getPric() {
		return pric;
	}

	public void setPric(String pric) {
		this.pric = pric;
	}

	public String getCmncType() {
		return cmncType;
	}

	public void setCmncType(String cmncType) {
		this.cmncType = cmncType;
	}

	public String getOsv() {
		return osv;
	}

	public void setOsv(String osv) {
		this.osv = osv;
	}

	public boolean isCamera() {
		return isCamera;
	}

	public void setCamera(boolean isCamera) {
		this.isCamera = isCamera;
	}

	public boolean isTooth() {
		return isTooth;
	}

	public void setTooth(boolean isTooth) {
		this.isTooth = isTooth;
	}

}
