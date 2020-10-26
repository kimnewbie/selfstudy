package day22;
	
public class Day022 {
		String name;
		int price;
		
		public 			void show() {System.out.print("====== 커피 " + "\r커피명 = " + name + "\r\n"+
														"커피가격 = " + price);}
		
		//클래스명이랑 같은 이름을 호출해도 가능함 WoW!
		Day022(){System.out.println("기본생성자는 자동으로 호출되어 실질적으로 공간을 사용가능하게 초기화해줌\r\r");}
		
	public static void main(String[] args) {
		//1. Day
		Day022 test = new Day022();
	 	test.name = "아메리카노";
	 	test.price = 2000;
	 	test.show();
		/*
		 1. 멤버변수
		 제품이름 : String name
		 제품가격 : int price
		 2. 멤버함수
		 void show() - 이름과 가격출력
		 
		 ㅁ 주어진옵션
		 public static void main(String[] args) {
		 	Day022 test = new Day022();
		 	test.name = "아메리카노";
		 	test.price = 2000;
		 }
		 
		 ㅁ출력내용
		 	====== 커피 
			커피명 = 아메리카노
			커피가격 = 2000
		 */
	}
}
