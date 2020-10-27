package day23;

import java.util.Scanner;

class Coffee003{
	//멤버변수
	String name; int price; int num;
	//멤버함수
	void coffee_calc() {
		if(this.name.contains("아메")) { this.price = this.num*1000;}
		else if(this.name.contains("라떼")||this.name.contains("카페")) { this.price = this.num*1500;}
		else if(this.name.contains("카푸")||this.name.contains("치노")) { this.price = this.num*2000;}
	}
	
	@Override
	public String toString() {
		return "Coffee003 [name=" + name + ", price=" + price + ", num=" + num + "]";
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\r\r:::::::: COFFEE ORDER\r\n"
				+ "아메리카노 : 1000 카페라떼 : 1500 카푸치노 : 2000");
		System.out.print("::커피이름 입력 > "); this.name = sc.next();
		System.out.print("::잔수(개수)입력 > "); this.num = sc.nextInt();
	}
	void show() {
		coffee_calc();
		System.out.print("===== COFFEE_SHOW\r\n"
				+ "= 커피명 : " +this.name + "\r\n"
				+ "= 커피잔수 : " + this.num +"\r\n"
				+ "= 커피가격 " + this.price);
	}
	//생성자
	Coffee003(){ super(); }
	Coffee003(String name, int num, int price){ super(); this.name = name; this.num = num;  this.price = price;} //전체
	Coffee003(String name, int num){ super(); this.name = name; this.num = num; }
}
public class Class013 {
	public static void main(String[] args) {
		/*
		1. Coffee003에서 자료형으로 만들 수 있는 인스턴스 변수 [name|num|price]
		2. new의 역할 => 새로운 공간을 빌려옴
		3. 초기화Coffee003 [name=null, price=0, num=0]
		4. a1은 인스턴스변수 사용가능한 주소를 갖고 있음
		5. a1.show(); .를 이용해서 접근해 사용
		*/
		Coffee003 a1 = new Coffee003("아메리카노",3);
		//System.out.println(a1); //[출력]Coffee003 [name=아메리카노, price=0, num=3]
		a1.show();
		/*
		1. Coffee003에서 자료형으로 만들 수 있는 인스턴스 변수 [name|num|price]
		2. new의 역할 => 새로운 공간을 빌려옴
		3. 초기화Coffee003 [name=null, price=0, num=0]
		4. a2은 인스턴스변수 사용가능한 주소를 갖고 있음
		5. a2.show(); .를 이용해서 접근해 사용
		*/
		Coffee003 a2 = new Coffee003();
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
