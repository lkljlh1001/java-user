package DongGun.lab;

public class Lab15 {
	// 예제 7-1 7-3
	// 연습문제 6-22, 6-23

	// 예제 7-1
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channel1Up();
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello , world");
		ctv.caption = true;
		ctv.displayCaption("Hello , world");
		// 예제 7-3
		Deck d = new Deck();
		Card c = d.pick(0);
		System.out.println(c);

		d.shuffle();
		c = d.pick(0);
		System.out.println(c);

	}
}

// 예제 7-1
class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channel1Up() {
		++channel;
	}

	void channel1Down() {
		--channel;
	}
}

class CaptionTv extends Tv {
	boolean caption;

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

// 예제 7-3
class Deck {
	final int CARD_NUM = 52;
	Card cardArr[] = new Card[CARD_NUM];

	Deck() {
		int i = 0;

		for (int k = Card.KIND_MAX; k > 0; k--)
			for (int n = 0; n < Card.NUM_MAX; n++)
				cardArr[i++] = new Card(k, n + 1);
	}

	Card pick(int index) {
		return cardArr[index];
	}

	Card pick() {
		int index = (int) (Math.random() * CARD_NUM);
		return pick(index);

	}

	void shuffle() {
		for (int i = 0; i < cardArr.length; i++) {
			int r = (int) (Math.random() * CARD_NUM);

			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}

}

class Card {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;

	static final int SPADE = 4;
	static final int DIAMIND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	int kind;
	int number;

	Card() {
		this(SPADE, 1);
	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;

	}

	public String toString() {
		String[] kinds = { "", "CLOBER", "HEART", "DIAMOND", "SPADE" };
		String numbers = "0123456789XJQK";
		return "kind :" + kinds[this.kind] + ", number :" + numbers.charAt(this.number);

	}

}