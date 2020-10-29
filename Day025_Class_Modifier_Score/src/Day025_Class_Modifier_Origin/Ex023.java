package Day025_Class_Modifier_Origin;

public class Ex023 {
	public static void main(String[] args) {
		System.out.println(Math.random()); 
		//지구본으로 넘어가면 constructor링크가 안걸려있음
		//public final class Math extends Object
		//final이 붙어서 [수정 불가능]한 클래스
	}
}
/*
Q Math클래스의 생성자는 private 접근 제어자이다. 그 이유는?
인스턴스 생성이 무의미하기 때문에 아예 사용하지 못하도록 생성자를 private으로 선언
생성자를 선언하지 않는 경우에 자바 컴파일러는 기본적으로 default 생성자를 만들기
때문에 객체가 생성 가능한 클래스가 됨!
답:
Math클래스의 모든 메서드가 static이고 인스턴스변수가 존재하지 않기때문에 객체를 생성할 피룡가 없다.
그래서 생성자가 필요없다.
Math a = new Math(); !!!!!Error!!!!
*/