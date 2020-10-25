package day21;
class Coffee {
	//1. 멤버변수
		String name ;
		int price;
		//2. 멤버함수
		public void show() {System.out.println("===== 커피\r제품이름 : " +name + "\r커피가격 : " + price);} //static 넣으면 syso에서 오류남
}
public class Class003 {
	public static void main(String[] args) {
		Coffee drink  = new Coffee();
		drink.name = "아메리카노";
		drink.price = 2000;
		drink.show();
		/* 
		1. Coffee라는 클래스 작성
		//1. 멤버변수
		제품이름 : String name
		제품가격 : int price
		//2. 멤버함수
		void show() - 이름과 가격 출력
		
		ㅁ 출력내용
		===== 커피
		커피명 : 아메리카노
		커피가격 : 2000
		 */
	}
}
