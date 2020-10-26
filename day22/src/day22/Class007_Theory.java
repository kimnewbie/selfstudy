package day22;


class User002{
	String name; int age;
	void show() {System.out.println("이름 : " +  name + "\n나이 : " + age);}
	User002(){name="아이언맨"; age=55;}//★★초기화내용 비워놔도 되니까 무조건 쓰는 버릇 들이기
}
public class Class007_Theory {
	public static void main(String[] args) {
		//1. 객체 만들기  - 붕어빵틀(클래스, object)로 붕어빵(실체화 된 것) 만들기
		//클래스를 사용하는 어떤 곳에서 4.new를 이용하여 객체를 만들기(공간 빌려오기)
		//						3.User002() 실질적으로 유저가 사용하는 공간을 instance변수 user가 사용할 수 있도록 생성자가 초기화 해줌
		//4. user는 참조하는 곳에 주소를 갖음
		//						
		User002 user 	=		  new User002(); //user = [name:"아이언맨"|age:55|show]
		user.show();
		
		User002 user2 = new User002();			 //user = [name:"아이언맨"|age:55|show]
		user2.name = "헐크"; user2.age = 10;		 //user2 = [name:"헐크"|age:10|show]
		user2.show();
		/*
		 1. User002이라는 클래스 작성 [ class(설계도: staruml) -
		 							object(실체화 가능한 것: interface, abstract class) - 
		 							instance(실체화한 것 new) ]
		 //1.멤버변수
		 이름 : String name;
		 나이 : int age;
		 //2.멤버함수
		 void show() - 이름과 나이 출력
		 //3. 생성자
		 ㅇ
		 */
	}
}
