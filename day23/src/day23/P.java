package day23;

import java.util.Scanner;

class Coffee00333{
	String name; int price; int num;
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println(":::::::: COFFEE ORDER\r\n"
				+ "		아메리카노 : 1000 카페라떼 : 1500 카푸치노 : 2000");
		System.out.print("::커피이름 입력 > "); this.name = sc.next();
		System.out.print("::잔수(개수)입력 > "); this.num = sc.nextInt();
		
	}
	void show() {
		coffee_calc();
		System.out.println("===== COFFEE_SHOW\r\n"
				+ "= 커피명 : "+this.name+"\r\n"
				+ "= 커피잔수 : "+this.num+"\r\n"
				+ "= 커피가격 : "+this.price);
	}
	void coffee_calc() {
		if(this.name.contains("아메")||this.name.contains("리카")) {this.price = 1000;}
		else if(this.name.contains("카페")||this.name.contains("라떼")) {this.price = 1500;}
		else if(this.name.contains("카푸")||this.name.contains("치노")) {this.price = 2000;}
	}
	Coffee00333(){}
	Coffee00333(String name,int num){this.name=name; this.num = num;}
}
public class P {
	public static void main(String[] args) {
		Coffee00333 a1 = new Coffee00333("아메리카노",3);
		a1.show();
		Coffee00333 a2 = new Coffee00333();
		a2.input();
		a2.show();
		/*
		===== COFFEE_SHOW
		= 커피명 : 아메리카노
		= 커피잔수 : 3
		= 커피가격 : 3000
		
		:::::::: COFFEE ORDER
		아메리카노 : 1000 카페라떼 : 1500 카푸치노 : 2000
		::커피이름 입력 > 카푸치노
		::잔수(개수)입력 > 2
		
		===== COFFEE_SHOW
		= 커피명 : 카푸치노
		= 커피잔수 : 2
		= 커피가격 : 4000
		
		B 클래스이름 : Coffee003
			클래스1) 멤버변수 : name, price, num
			클래스2) 멤버함수 
				void input()
				void show()
				void coffee_calc() - 계산해주는 함수
					아메리카노라면 1000 * 개수
					카페라떼라면 1500 * 개수
					카푸치노라면 2000 * 개수
			클래스3) 생성자
			기본생성자
			파라미터 생산자 public Coffee003(String name, int num)
		
		C 메인의 구성은 다음과 같다
		public static void main(String[] args) {
			Coffee003 a1 = new Coffee003("아메리카노",3);
			a1.show();
			Coffee003 a2 = new Coffee003();
			a2.input();
			a2.show();
		 */
	}
}
