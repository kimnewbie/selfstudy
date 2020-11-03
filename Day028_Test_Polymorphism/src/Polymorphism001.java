class TestA{
	
	int a = 10;
	public TestA() {super();}
	@Override public String toString() { return "TestA [a=" + a + "]"; } // 추가적으로 추가
	
}
///
class TestB{
	
	int a = 20;
	public TestB() {super();}
	@Override public String toString() { return "TestB [a=" + a + "]"; }
	
}
///
public class Polymorphism001 {
	public static void main(String[] args) {
		TestA ta = new TestA(); System.out.println(ta); // 출력: [a=10]
		TestB tb = new TestB(); System.out.println(tb); // 출력: [a=20]
		//TestB tb = ta; => 자료 클래스 자체가 다름. TestB = TestA(X)
		tb.a = ta.a; //=>둘다 int라서 가능 신장이식<-(돼지신장) int <-> int
		//System.out.println(tb.a);
	}
}
/*
실행을 해보고 어떤 코드에서 오류나는 지와 이유를 적으시오.
TestB tb = ta; > ta 부분이 오류가 남
*/