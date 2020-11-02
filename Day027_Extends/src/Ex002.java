class Product{
	//멤버변수
	int price; //제품의 가격
	int bonusPoint; //제품구매 시 제공하는 보너스 점수
	
	//멤버함수
	//생성자
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

	public Product() { super(); } //기본 생성자를 추가해야함###
	
}
///////////////////////////////////////////////////////
class Tv extends Product{
	//Tv(){}
	Tv(){super();} // super자체가 없어서 오류남 ---> 위에 조상클래스 기본생성자를 만들어~~ 
	public String toString() { return "Tv"; }
}
public class Ex002 {
//public class EX005_Code { ---> 클래스명 오류
	public static void main(String[] args) {
		Tv t = new Tv();
		System.out.println("부모클래스에 기본생성자를 추가하여 인스턴스 변수를 사용가능하게 초기화 시켜야 한다.");
		////////////////////////////////////////
		// 생성자 생성순서 : Object > Product > Tv
		// 생성자 호출순서 : Tv > Product > Object
		/////////생성자 오버로딩 : 1.default 생성자-자동으로 생성 
		/////////	2. 파라미터있는 생성자가 생기는 순간 default 생성자는 수동으로 만들어줘야해
		// 오버로딩, 상속
		
		// Object [멤버변수 | 멤버함수]
		// Product [price=0,bonusPoint=0|멤버함수 X] 			
		// Tv	   [x					|멤버함수 toString]
		/*
		Q. 다음의 코드는 컴파일하면 에러가 발생한다.
		그 이유를 설명하고 에러를 수정하시오.
		 */
	}
}
