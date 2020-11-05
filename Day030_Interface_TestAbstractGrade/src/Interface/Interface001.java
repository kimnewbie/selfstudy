package Interface;
//ver-1 인터페이스는 설계클래스이다.
interface Animal{
	String name = "홍길동"; //자동으로 static final이 붙음 (공용으로쓰고 수정안되는 것들을 멤버변수로... : 회사명, 사업자등록번호 등)
	void eat(); //자동으로 abstract가 붙음
}
//ver-2 implements 구현한다라는 뜻 - [부모클래스 구현클래스]
class Saram implements Animal{//시행하는 클래스, extends 가 안됨. 인터페이스는. 그래서 implements 사용
	@Override public void eat() {  
		//name = "아이유"; //에러
		System.out.println(name+"이 밥을 먹어요. 냠냠");
	} 
}
public class Interface001 {
	public static void main(String[] args) {
		//ver-1
		//Animal ani = new Animal(); 안돼 왜? Animal void eat()에 {} 구현부가 없어서
		System.out.println(Animal.name); //sf
		//ver-2
		Animal ani = new Saram(); ani.eat();
	}
}
/**
1. 고객 : ~ 필요해요. 	[interface, 설계도] : 기능을 구현하지 않은 추상메서드의 집합.
2. 기능 구체적 회의		[class]:멤버변수, 멤버함수 정의
3. 클래스				[instance]
**/