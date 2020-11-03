class Parent{
	int x = 100;
	void method() {System.out.println("Parent Method");}
}
///
class Child extends Parent{
	int x = 200;
	void method() {System.out.println("Child Method");}
	
	void method1() {super.method();}
}
///
public class Polymorphism007 {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		System.out.println("p.x = " + p.x); //100
		p.method(); //Child Method --> Parent Method 불러오고싶을땐???
					//((Child)p).method(); --> 안됨 ㅠ,.ㅠ
		////////////////////////////////////////////////////////
		((Child)p).method1(); // --> Parent Method
		c.method1();
		////////////////////////////////////////////////////////
		System.out.println("c.x = " + c.x); //200
		c.method(); //Child Method
	}
}
