package day22;

class Coffee002{
	String name; int price; int num;
	void show() {System.out.println(" ===== 커피\r\n"
			+ "커피명 : "+name+"\n"
			+ "커피잔수 : "+ num + "\n"
			+ "커피가격 : " + price);}
	Coffee002(String a, int b, int c){this.name = a; this.num = b; this.price = c;}
	Coffee002(){this.name = "아메리카노"; this.num = 1; this.price = 2000;} //이게 없으며 상속때 오류가 남
}
public class Class009 {
	public static void main(String[] args) {
		Coffee002 a1 = new Coffee002("카페라떼",2,4000); //생성자 오버로딩시 디폴트 생성자는 수동으로 호출됨
	 	a1.show();
	 	Coffee002 a2 = new Coffee002(); //디폴트 생성자
	 	a2.show();
		/*
		 1. Coffee002이라는 클래스 작성
		 //1. 멤버변수
		 커피이름 : String name;
		 커피가격 : int price;
		 커피잔수 : int num;
		 //2. 멤버함수
		 void show() - 이름과 가격 출력
		 
		 ㅁ 주어진 옵션
		 public static void main(String[] args) {
		 	Coffee002 a1 = new Coffee002("카페라떼",2,4000);
		 	a1.show();
		 	Coffee002 a2 = new Coffee002();
		 	a2.show();
		 }
		 
		 ㅁ 출력내용
		 ===== 커피
		 커피명 : 까페라떼
		 커피잔수 : 4000
		 커피가격 : 2
		 
		 ===== 커피
		 커피명 : 아메리카노
		 커피잔수 : 1
		 커피가격 : 2000
		 */
	}
}
