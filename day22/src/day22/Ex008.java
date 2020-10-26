package day22;

public class Ex008 {
	public static void main(String[] args) {
		/*
		 클래스변수, 인스턴스변수, 지역변수로 구분하시오
		 class PlayingCard{			
		 	int kind; int num;		//(3)(4)
		 	static int width;		//(1)
		 	static int height;		//(2)
		 	
		 	//멤버함수
		 	public PlayingCard(){ super(); }
		 	public PlayingCard(int k, int n){ super(); this.kind=k; this.num = n;}
		 	//					(5)		(6)
		 */
		System.out.println("클래스 변수(static): (1),(2)"); // main에서 사용 가능 static 붙어서
		System.out.println("인스턴스 변수: (3)(4)");
		System.out.println("지역변수 : (5)(6)");
		System.out.println("main(args), card1, card2");
	}
}
/*
변수의 종류		선언위치			생성시기
클래스변수			클래스영역			클래스가 메모리에 올라갈 때
인스턴스변수		클래스영역			인스턴스가 생성될 때
지역변수			메서드영역			변언 선언문이 수행될 때
 */