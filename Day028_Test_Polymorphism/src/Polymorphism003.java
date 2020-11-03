class TestA3{	
	int a = 10;
	public TestA3() {super();}
	@Override public String toString() { return "TestA3 [a=" + a + "]"; }
}
///
class TestB3 extends TestA3{	
	int b = 20;
	public TestB3() {super();}
	@Override public String toString() { return "TestB3 [b=" + b + "]"; }
}
public class Polymorphism003 {
	public static void main(String[] args) {
		TestA3 ta = new TestA3();
		System.out.println(ta + "\t" + System.identityHashCode(ta)); // 출력 : TestA3 [a=10]	
		 
		TestB3 tb = new TestB3();
		System.out.println(tb + "\t" + System.identityHashCode(tb)); // 출력 : TestB3 [b=20]	
		System.out.println(tb.b + "\t" + tb.a + "\t" + tb.toString());
		ta = tb; //---> 부모클래스 <- 자손클래스 (업캐스팅 : 자손클래스는 부모클래스에 담길 수 있다)
		//System.out.println(ta.a+"/"+ta.b); ta.b=> ta는 b 변수를 사용할 수 없음
		// 생성자를 호출한 적이 있는지 확인 유무 : tb = new TestB3() - TestB3(b=20)=>TextA3(a=10)
		System.out.println(System.identityHashCode(tb)+ "\t" +System.identityHashCode(ta)); // 주소가 같아졌다....
		//tb = ta; 자식클래스가 조상클래스를 참조할 때 형변환해야함
		//			자식은 부모를 담을 수 없다.
		//tb = new TestB3() - TestB3()[b=20#|toString#] => TestA3()[a=10#|--------]
		//ta2 = new TestA3() 만 불렀기 때문에  ------------- 이부분은 할 수 없음...
		//					X X X X X [b=	|		]	=>	TestA3()[a=10#|--------]
		//타입캐스팅이라 공간은 빌려왔지만 생성자를 부른적없어서 초기화가 될 수가 없다.
		
		System.out.println("\t\t------------------------------------------------");
		TestB3 tb3 = new TestB3(); //0. TestB() 호출하면 => TestA()를 호출하기 때문에 가능!
		
		
	}
	

}
