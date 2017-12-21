package DongGun.lab;

public class Lab18 {
	// 연습문제 7-7 , 7-8 = a , 7-9 =b, c , 7-10 , 7-15 , 7-17 , 8-2 , 8-8

	// 7-7
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x=" + c.getX()); // X= 200
		// 7-10
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		t.setVolume(20);
		System.out.println(t.getChannel());
		System.out.println(t.getVolume());
		// 7-14
		SutdaCard card = new SutdaCard(1, true);

	}

}

// 7-7
class Parent {

	int x = 100;

	public Parent() {
		this(200);
	}

	public Parent(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}

class Child extends Parent {
	int x = 3000;

	public Child() {
		this(1000);
	}

	public Child(int x) {

		this.x = x;
	}

}

// 7-10

class MyTv2 {

	boolean isPowerOn;
	int channel, volume;

	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANEL = 100;
	final int MIN_CHANEL = 0;

	public MyTv2() {

	}

	public MyTv2(boolean isPowerOn, int channel, int volume) {
		super();
		this.isPowerOn = isPowerOn;
		this.channel = channel;
		this.volume = volume;
	}

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getMAX_VOLUME() {
		return MAX_VOLUME;
	}

	public int getMIN_VOLUME() {
		return MIN_VOLUME;
	}

	public int getMAX_CHANEL() {
		return MAX_CHANEL;
	}

	public int getMIN_CHANEL() {
		return MIN_CHANEL;
	}

}

// 7-14
class SutdaCard {
	int num;
	boolean isKwang;

	public SutdaCard() {
		this(1, true);
	}

	public SutdaCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;
	}

	@Override
	public String toString() {
		return "SutdaCard [num=" + num + ", isKwang=" + isKwang + "]";
	}

}
