package Class;

class MyMath123{
	long a, b; // this.a, this.b ---> iv의 진짜 이름
	
	MyMath123(int a, int b){//생성자
		this.a = a; //---> = a 는 lv(매서드 안에 든 변수)
		this.b = b; //---> = b 는 lv(매서드 안에 든 변수)
	}
	long add() { //인스턴스 메서드
		return a + b; // return this.a + this.b; (파라미터 없는 메서드 변수--->iv)
	}
	static long add(long a, long b) { // 클래스 메서드(static메서드)
		return a + b; // lv라서 this(객체자신 iv) 붙이기 불가함!
	}
}
public class Ch6_009_this {

}
