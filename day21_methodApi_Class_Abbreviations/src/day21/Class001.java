package day21;
//접근할 때 main 먼저 접근해야 함. 그래서 User 클래스에는 public을 사용하지 않음 or 클래스를 따로 ctrl+n > class 만듬
//starUML 프로그램으로 한 거 사용

// 클래스는 멤버변수와 멤버함수로 구성된다.
class User001{
	//1. 멤버변수
	String name ;
	int age;
	//2. 멤버함수
	public void show() {System.out.println(name + "\t" + age);} //static 넣으면 syso에서 오류남
	public static void nexttime() {System.out.println("메모리할때 안내해드릴게요!");}
}

//////////////////////////////////////////////////////
public class Class001 {
	public static void main(String[] args) {
		//형식	자료형	변수명
		//		int 	a;
		//클래스도 자료형이다.	[name/age/show()] 을 묶어준 것이다. String은 참조형
			//★user1★이 인스턴스가 된 것!
		
			System.out.println("1. 클래스도 자료형 - new 공간을 빌려오고 User001() 청소해서 사용할 준비해 주기");
			User001 user1 = new User001();						
			// new => 공간 빌려오기// User001() => [name:null/age:0/show()]
			System.out.println("2. user1은 여기에서 쓰세요라는 주소를 가지고 있음");
			System.out.println("3. '.'으로 이용하여 접근해 사용가능함 예) user1.name, user1.age, user1.show ");
			System.out.println(user1.name + "\t" +user1.age); //[null 0 ] 사용할 수 있도록 초기화해줌
			user1.show(); //[null 0 ] 사용할 수 있도록 초기화해줌
			/// public (오늘은 skip)
			user1.name="sally"; //String name 앞에 [private] String name 을 사용하면 name 사용 불가해짐
			user1.age=10;
			user1.show(); // 위에 것들을 출력할거예요! 해서 불러주는 애가 show
			/// static (오늘은 skip)
			User001.nexttime();
	}
}
