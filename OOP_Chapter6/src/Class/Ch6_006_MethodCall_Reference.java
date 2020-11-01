package Class;
class TestClass2{
	int iv;			//인스턴스 변수
	static int cv;	//클래스 변수
	
	void instanceMethod() {		//인스턴스 메서드
		System.out.println(iv);	//인스턴스 변수를 사용할 수 있음
		System.out.println(cv);	//클래스 변수를 사용할 수 있음
	}
	
	static void staticMethod() {	//static 메서드
		//System.out.println(iv); 에러!!! 인스턴스 변수를 사용할 수 없음
		System.out.println(cv);	//클래스 변수는 사용가능
	}
}
public class Ch6_006_MethodCall_Reference {
	public static void main(String[] args) {
		System.out.println("Q. static 메서드는 static 메서드 호출 가능?");
		System.out.println("A. CAN");
		System.out.println("Q. static 메서드는 인스턴스 변수 사용가능?");
		System.out.println("A. CAN'T");
		System.out.println("Q. static 메서드는 인스턴스 메서드 호출 가능?");
		System.out.println("A. CAN'T");
		System.out.println("Q. 왜? static 메서드는 인스턴스 멤버를 쓸 수 없나요?");
		System.out.println("A. static 메서드 호출 시 객체(iv묶음)가 없을 수도 있어서");
	}
}
