package DongGun.lab;

public class Lab13 {

	public static void main(String[] args) {

		// 37 Person

		Person 혜교 = new Person(); // 초기화
		System.out.println(혜교);

		Person 지현 = new Person("지현", "인천", "010 214 1231"); // 초기화 한값에 대입
		System.out.println(지현);

		// 38 Book

		Book 자바정석 = new Book();
		System.out.println(자바정석);

		Book 자바정석심화 = new Book("자바정석심화", 210, "남궁성");
		System.out.println(자바정석심화);

		// 39

		// 프린트 37, 38 , 39
	}

}

// 37 person ☆☆☆☆☆
class Person {
	// 멤버변수 선언
	private String name;
	private String adr;
	private String phnum;

	// 생성자
	public Person() {
		this("혜교", "서울", "123-4567");

	}

	public Person(String name, String adr, String phnum) {

		this.name = name;
		this.adr = adr;
		this.phnum = phnum;

	}

	// setter / getter
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

	// to String
	@Override
	public String toString() {
		return "Person [name=" + name + ", adr=" + adr + ", phnum=" + phnum + "]";
	}

}// end Person

class Customer {
	private int numofcust; // 고객 번호
	private int mils;// 마일리지
	private String name;
	private String adr;
	private String phnum;

	public Customer() {
		this(1, 1000, "혜교", "서울", "123-123"); // 초기화 값
	}

	public Customer(int numofcust, int mils, String name, String adr, String phnum) {
		super();
		this.numofcust = numofcust;
		this.mils = mils;
		this.name = name;
		this.adr = adr;
		this.phnum = phnum;
	}

	public int getNumofcust() {
		return numofcust;
	}

	public void setNumofcust(int numofcust) {
		this.numofcust = numofcust;
	}

	public int getMils() {
		return mils;
	}

	public void setMils(int mils) {
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

	@Override
	public String toString() {
		return "Customer [numofcust=" + numofcust + ", mils=" + mils + ", name=" + name + ", adr=" + adr + ", phnum="
				+ phnum + "]";
	}

}

// 프린트 38
class Book {
	private String title;// 제목
	private int page;
	private String writer;

	public Book() {

		this("자바정석", 20, "남궁성"); // 초기값
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

	@Override
	public String toString() {
		return "Book [title=" + title + ", page=" + page + ", writer=" + writer + "]";
	}

}

class Magazine {
	private String title;// 제목
	private int page;
	private String writer;
	private String ballMail;

	public Magazine() {
		this("자바정석", 20, "남궁성", "2017-12");
	}

	public Magazine(String title, int page, String writer, String ballMail) {
		super();
		this.title = title;
		this.page = page;
		this.writer = writer;
		this.ballMail = ballMail;
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

	public String getBallMail() {
		return ballMail;
	}

	public void setBallMail(String ballMail) {
		this.ballMail = ballMail;
	}

	@Override
	public String toString() {
		return "Magazine [title=" + title + ", page=" + page + ", writer=" + writer + ", ballMail=" + ballMail + "]";
	}

}

// 프린트 39
class Phone {
	private String maker;
	private int pric; // 가격
	private String cmncType; // 통신타입

	public Phone() {
		this("엘지", 10000, "4G");
	}

	public Phone(String maker, int pric, String cmncType) {
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

	public int getPric() {
		return pric;
	}

	public void setPric(int pric) {
		this.pric = pric;
	}

	public String getCmncType() {
		return cmncType;
	}

	public void setCmncType(String cmncType) {
		this.cmncType = cmncType;
	}

	@Override
	public String toString() {
		return "Phone [maker=" + maker + ", pric=" + pric + ", cmncType=" + cmncType + "]";
	}

}

class SmartPhone {

	private String maker;
	private int pric; // 가격
	private String cmncType; // 통신타입
	private String osv; // 운영체제버젼
	private String memorySize;
	private boolean isCamera;
	private boolean isBluetooth;

	public SmartPhone() {
		this("삼성", 200000, "5G", "안드로이드", "4기가", true, true);
	}

	public SmartPhone(String maker, int pric, String cmncType, String osv, String memorySize, boolean isCamera,
			boolean isBluetooth) {
		super();
		this.maker = maker;
		this.pric = pric;
		this.cmncType = cmncType;
		this.osv = osv;
		this.memorySize = memorySize;
		this.isCamera = isCamera;
		this.isBluetooth = isBluetooth;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPric() {
		return pric;
	}

	public void setPric(int pric) {
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

	public String getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(String memorySize) {
		this.memorySize = memorySize;
	}

	public boolean isCamera() {
		return isCamera;
	}

	public void setCamera(boolean isCamera) {
		this.isCamera = isCamera;
	}

	public boolean isBluetooth() {
		return isBluetooth;
	}

	public void setBluetooth(boolean isBluetooth) {
		this.isBluetooth = isBluetooth;
	}

	@Override
	public String toString() {
		return "SmartPhone [maker=" + maker + ", pric=" + pric + ", cmncType=" + cmncType + ", osv=" + osv
				+ ", memorySize=" + memorySize + ", isCamera=" + isCamera + ", isBluetooth=" + isBluetooth + "]";
	}

}
