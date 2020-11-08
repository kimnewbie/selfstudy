class AAA{ //AAA는 BBB의 외부클래스
	int i;
	BBB b = new BBB();
	
	class BBB{// BBB는 AAA의 내부클래스
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i); //객체 생성없이 외부 클래스의 외부 접근가능
		}
	}
	
}

//class CCC{ //BBB가 AAA안에 들어갔으므로 CCC는 사용 불가
//	BBB b = new BBB();
//}

public class InnerTest {
	public static void main(String[] args) {
//		BBB b = new BBB();
//		b.method(); 더이상 독립클래스가 아니라 객체생성 안됨
	}
}
