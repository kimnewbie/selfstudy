class Outer1{
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner{
		int iiv = outerIv;	// 외부 클래스의 private멤버도 접근 가능하다.
		int iiv2 = outerCv; 
	}
	
	static class StaticInner{
//		int siv = outerIv; // static 클래스는 외부 클래스의 인스턴스멤버에 접근할 수 없다.
		static int scv = outerCv;
	}
	
	void myMethod() {
		final int lv = 0; // 값이 바꾸지 않는 변수는 상수로 간주
		final int LV = 0; // JDK1.8부터 final 생략 가능
		
//		내부 클래스의 객체가 지역변수보다 더 오래갈 수 있어서
//		내부 클래스에서 지역변수(메서드 내 변수, lv) 사용이 불가하다.
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;			
//	외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
			int liv3 = lv; //에러!!!(JDK1.8부터 에러 아님)
			int liv4 = LV; //OK
		}
	}
}
public class InnerClass3 {
	public static void main(String[] args) {
		System.out.println("1. 외부 클래스의 private 멤버도 접근 가능하다.");
		System.out.println("2. 지역 내부 클래스를 감싸고 있는 메서드는 상수만 사용가능하다.");
	}
}
