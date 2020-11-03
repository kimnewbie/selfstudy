class TestA2{
	
	int a = 10;
	public TestA2() {super();}
	@Override public String toString() { return "TestA2 [a=" + a + "]"; }

}
///
class TestB2 extends TestA2{
	
	int b = 20;
	public TestB2() {super();}
	@Override public String toString() { return "TestB2 [b=" + b + "]"; }

}
///
public class Polymorphism002 {
	public static void main(String[] args) {
		System.out.println("\n\n---------------------------------------------");
		TestA2 ta = new TestA2();
		System.out.println(ta); //TestA2 [a=10]
		
		System.out.println("\n\n---------------------------------------------");
		TestB2 tb = new TestB2();
		System.out.println(tb); //TestB2 [b=20]
		System.out.println(tb.a + "\t"+tb.b+"\t"+tb.toString()); //10	20	TestB2 [b=20]
		
		System.out.println("\n\n---------------------------------------------");
		TestB2 test = (TestB2) ta; //자식<=부모 형변환해야함! 하지만 컴파일 돌릴 때 에러남
		System.out.println(test.a+ "\t"+test.b+ "\t"+test.toString());
	}
}
