package day23;
class Mobile003{
	//멤버변수
	String company; int price; String product;
	//멤버함수
	void sale() {
		this.price = (int)(price*0.9);
	}
	void show() {
		System.out.println("=== Mobile_ver3===\r\n"
				+ "회사 : "+company+"\r\n"
				+ "제품 : "+product + "\r\n"
				+ "가격 : "+price+"원");
	}
	//생성자 : 메모리에 특정 값으로 초기화하는 역할을 한다
//	Mobile003(){}
	Mobile003(){
		this.company = "Sansung"; this.price = 1200000; this.product = "NOTE9";
	}
	Mobile003(String company, int price, String product){
		this.company = company; this.price = price; this.product = product;
	}
}
public class Class012 {
	public static void main(String[] args) {
		/*
		1. Mobile003에서 자료형으로 만들 수 있는 인스턴스 변수 [company|price|product/show()|sale()]
		2. new의 역할 => 새로운 공간을 빌려옴
		3. 인스턴스변수에 ["Samsung"|10000|NOTE20/show()|sale()]
		4. 인스턴스변수를 사용할 수 있게 주소를 갖고 있는 것 : mobile3
		5. .을 이용해서 접근해서 사용함
		*/
		Mobile003 mobile3 = new Mobile003("Samsung", 10000, "NOTE20"); 
		mobile3.show();
		/*
		1. Mobile003에서 자료형으로 만들 수 있는 인스턴스 변수 [company|price|product/show()|sale()]
		2. new의 역할 => 새로운 공간을 빌려옴
		3. 인스턴스변수에 ["Samsung"|1200000|NOTE9/show()|sale()]
		4. 인스턴스변수를 사용할 수 있게 주소를 갖고 있는 것 : mobile2
		5. .을 이용해서 접근해서 사용함
		*/
		Mobile003 mobile2 = new Mobile003();
		mobile2.show();
		/*
		1. Mobile003에서 자료형으로 만들 수 있는 인스턴스 변수 [company|price|product/show()|sale()]
		2. new의 역할 => 새로운 공간을 빌려옴
		3. 인스턴스변수에 ["Samsung"|100000|NOTE20/show()|sale()]
		4. 인스턴스변수를 사용할 수 있게 주소를 갖고 있는 것 : mobile1
		5. .을 이용해서 접근해서 사용함
		*/
		Mobile003 mobile1 = new Mobile003();
		mobile1.company = "Samsung";	//회사명 지정
		mobile1.price = 1000000;		//가격 지정
		mobile1.product = "NOTE20";		//제품명 지정
		mobile1.sale(); //10프로세일		//10프로 할인
		mobile1.show();					//제품명 지정
		/*
		ㅁ 출력된화면
		=== Mobile_ver3===
		회사 : Samsung
		제품 : NOTE20
		가격 : 10000원
		=== Mobile_ver3===
		회사 : Samsung
		제품 : NOTE9
		가격 : 1200000원
		=== Mobile_ver3===
		회사 : Samsung
		제품 : NOTE20
		가격 : 900000원
		
		B	클래스 이름 : Mobile003
				클래스1) 멤버변수 : company, price, producet
				클래스2) 멤버함수
					void show() - 회사명, 가격, 제품명을 출력해주는 함수
					void sale() - 가격에서 10%할인해주는 함수
				클래스3) 생성자
		C	메인의 구성은 다음과 같다.
		public class Class012 {
			public static void main(String[] args) {
				Mobile003 mobile3 = new Mobile003("Samsung", 10000, "NOTE20");
				mobile3.show();
				
				Mobile003 mobile2 = new Mobile003();
				mobile2.show();
				
				Mobile003 mobile1 = new Mobile003();
				mobile1.company = "Samsung";
				mobile1.price = 1000000;
				mobile1.product = "NOTE20";
				mobile1.sale(); //10프로세일
				mobile1.show();
		 */
	}
}