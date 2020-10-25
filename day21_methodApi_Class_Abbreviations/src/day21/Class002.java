package day21;

class MyPrice001{
	//1. 멤버변수
	String name ;
	int price;
	//2. 멤버함수
	public void show() {System.out.println("이름 : " + name + ",\t가격 : " +  + price);} //static 넣으면 syso에서 오류남
}

public class Class002 {
	public static void main(String[] args) {
		MyPrice001 phone = new MyPrice001();
		phone.show();
		phone.name = "노트20";
		phone.price = 100000;
		
		phone.show();
		/*
		1. MyPrice001라는 클래스 작성
		//1. 멤버변수
		제품이름 : String name
		제품가격 : int price
		//2. 멤버함수
		void show() - 이름과 가격 출력
	
		ㅁ 출력내용
			노트: 20, 가격 : 100000
		*/		
	}//end main
}//end class
