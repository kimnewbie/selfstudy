class TestA4{	
	int a = 10;
	public TestA4() {super();}
	@Override public String toString() { return "TestA4 [a=" + a + "]"; }
}
class TestB4 extends TestA4{	
	int b = 20;
	public TestB4() {super();}
	@Override public String toString() { return "TestB4 [b=" + b + "]"; }
}
public class Polymorphism004 {
	public static void main(String[] args) {
		TestA4 ta = new TestA4();
		TestB4 tb = new TestB4();

	}
}
