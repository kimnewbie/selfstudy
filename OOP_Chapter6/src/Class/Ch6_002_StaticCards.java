package Class;

class Ch6_002_StaticCards {
	public static void main(String args[]) {
		System.out.println("Card.width = " + Card.width);	//cv는 객체 생성없이 바로 사용가능, 자동으로 생성
		System.out.println("Card.height = " + Card.height);	//cv는 객체 생성없이 바로 사용가능, 자동으로 생성

		Card c1 = new Card(); // iv는 객체 생성
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card(); // iv는 객체 생성
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		System.out.println("c1의 width와 height를 각각50, 80으로 변경합니다.");
		c1.width = 50;	// 참조변수로 보이지만 클래스임 ---> card.width
		c1.height = 80;	// 참조변수로 보이지만 클래스임 ---> card.height

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는(" + c2.width + ", " + c2.height + ")");
	}
}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}