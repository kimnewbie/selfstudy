package Day032;
class Outer{
	//멤버변수
	static int oi=10;	// static - method area [메모리상에 먼저 올라가 있음]
	int oa;
	//멤버함수
	void show0() {System.out.println(oi + "-" + this.oa );}	// heap area[new 한다음에]
//	static void show1() {System.out.println(oi + "-" + this.oa );}
	@Override public String toString() { return "Outer [oa=" + oa + "]"; } 
	//생성자
	public Outer() { super(); }
	///////////////////////////////////////////////////////
	class Inner1{
		int ii1 = 20;
		public void show2() {System.out.println(ii1);}
	}
	class Inner2{
		int ii2 = 20;
		public void show3() {System.out.println(ii2);}
		public Inner2() {}
	}	
}
public class Inner001 {
	public static void main(String[] args) {
		System.out.println("[ver-1]");
		Outer o1 = new Outer();
		System.out.println("1.객체(toString) : " + o1); //Outer [oa=0] --> 인스턴스 변수만 잡힘(클래스는 이미 올라가있어서 x)
		System.out.println("2.static변수 : " + Outer.oi); // 10
		System.out.println("3.인스턴스변수 : " + o1.oa); // 0 | Outer o1 = new Outer();인스턴스변수는 꼭 new를 해야해~ 
		o1.show0(); // 10-0
		
		System.out.println("\n\n[ver-2]");
		Outer.Inner1 inner = new Outer().new Inner1(); // 공간빌리기 생성자 빌리고 공간 빌리고 생성자 빌리고
		System.out.println("4.내부클래스멤버 : " + inner.ii1); // 20
		inner.show2(); // 20
		
		System.out.println("\n\n[ver-3]");
		Outer o2 = new Outer();
		Outer.Inner1 inner2 = o2.new Inner1();
		inner2.show2(); // 20
		System.out.println("\nQ1) Outer 안에 Inner2 클래스의 show3() 호출하기!");
		Outer o3 = new Outer();
		Outer.Inner2 inner3 = o3.new Inner2();
		inner3.show3(); // 20
	}
}
