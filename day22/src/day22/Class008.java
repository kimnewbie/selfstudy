package day22;
class MyPrice002 {
	String name; int price;
	void show() {System.out.println("상품이름 : " + name + "\r\n"
			+ "상품가격 : " + price);}
	MyPrice002(){name = "갤럭시노트12"; price = 110000;}
}
public class Class008 {
	public static void main(String[] args) {
		MyPrice002 product = new MyPrice002();
	 	product.show();
		/*
		 1. MyPrice002이라는 클래스 작성
		 //1. 멤버변수
		 제품이름 : String name;
		 제품가격 : int price;
		 //2. 멤버함수
		 void show() - 이름과 가격 출력
		 
		 ㅁ 주어진 옵션
		 public static void main(String[] args) {
		 	MyPrice002 002 product = new MyPrice002();
		 	product.show();
		 }
		 
		 ㅁ 출력내용
		 상품이름 : 갤럭시노트12
		 상품가격 : 110000
		 */
	}
}
