package day23;

import java.util.Arrays;
import java.util.Scanner;

class Coffee004{
	//멤버변수	
	String name; int price; int num;
	String[] coffeeName;
	int[] coffeePrice;
	void coffee_calc() {
		if(this.name.contains("아메")||this.name.contains("아메리카노")) { this.price = this.num*1000;}
		else if(this.name.contains("라떼")||this.name.contains("카페")) { this.price = this.num*1500;}
		else if(this.name.contains("카푸")||this.name.contains("치노")) { this.price = this.num*2000;}
	}
	//멤버함수
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\r\r:::::::: COFFEE ORDER");
		for(int i=0; i<coffeeName.length; i++) {
			System.out.print(coffeeName[i] + ":" + coffeePrice[i] + "\t");
		}
				//+ "아메리카노 : 1000 카페라떼 : 1500 카푸치노 : 2000");
		System.out.print("\r::커피이름 입력 > "); this.name = sc.next();
		System.out.print("::잔수(개수)입력 > "); this.num = sc.nextInt();
		System.out.println(Arrays.toString(coffeeName));
	}
	void show() {
		
		coffee_calc();
		System.out.print("===== COFFEE_SHOW\r\n"
				+ "= 커피명 : " +this.name + "\r\n"
				+ "= 커피잔수 : " + this.num +"\r\n"
				+ "= 커피가격 " + this.price);
	}
	//생성자
	Coffee004(){
		String[] names= {"아메리카노","카페라떼","카푸치노"};
		int[] prices= {1000,1500,2000};
		coffeeName=names; coffeePrice=prices;
		 // 이 총이 this
	}
	Coffee004(String name, int num){ this(); this.name = name; this.num = num; } //this는 생성자를 의미
	
	Coffee004(String name, int num, int price){ this(); this.name = name; this.num = num; this.price = price;} // 풀버전
}
public class Class014 {
	public static void main(String[] args) {
		/*
		1. Coffee003에서 자료형으로 만들 수 있는 인스턴스 변수 [String|int|String[]|int[]]
		2. new의 역할 => 새로운 공간을 빌려옴
		3. 인스턴스변수에 ["아메리카노"|3]
		4. 인스턴스변수를 사용할 수 있게 주소를 갖고 있는 것 : a1
		*/
		Coffee004  a1 = new Coffee004("아메리카노" , 3); 
		//System.out.println(a1);
		a1.show(); 	 
		/*
		1. Coffee003에서 자료형으로 만들 수 있는 인스턴스 변수 [String|int|String[]|int[]]
		2. new의 역할 => 새로운 공간을 빌려옴
		3. 인스턴스변수에 ["아메리카노"|3]
		4. 인스턴스변수를 사용할 수 있게 주소를 갖고 있는 것 : a2
		*/
		Coffee004  a2 = new Coffee004();	
		a2.input(); 	
		a2.show(); 
		/*
		===== COFFEE_SHOW
		= 커  피 명 	: 아메리카노
		= 커피잔수 	: 3
		= 커피가격 	: 3000
	
		::::::::COFFEE ORDER
		아메리카노	: 1000		까페라떼	: 1500		카푸치노	: 2000
		::커피이름 입력 >까페라떼
		::잔수(갯수)입력 >1
	
		===== COFFEE_SHOW
		= 커  피 명 	: 까페라떼
		= 커피잔수 	: 1
		= 커피가격 	: 1500
	
		B  클래스이름 : Coffee004   - this를 이용하여 표현하시오.
		
		 *       클래스1)멤버변수  : name(커피명)          , price(가격)  , num(갯수)  , 
		 *                      String[] coffeeName; , int[] coffeePrice;
		 *       클래스2)멤버함수  :  
		 *       		void input() - 입력을 받아주는 함수 (커피명, 가격, 갯수) 
		 *       		void show() - 커피명, 가격  을 출력해주는 함수 
		 *       		void coffee_calc() - 계산해주는 함수
		 *       			아메리카노라면 1000 * 갯수
		 *       			까페라떼라면 1500 * 갯수
		 *       			카푸치노라면 2000* 갯수
		 *       클래스3)생성자	
				기본생성자
				파라미터생성자  public Coffee004(String name, int num)
	
		C 메인의 구성은 다음과 같다.
			public class  A005_scope_this {
				public static void main(String[] args) {
					Coffee004  a1 = new Coffee004("아메리카노" , 3); a1.show(); 	 
					Coffee004  a2 = new Coffee004();	a2.input(); 	a2.show(); 
		 */
	}
}
