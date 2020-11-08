class Outer2 {
	class InstanceInner { int iv = 100; }

	static class StaticInner { //static 내부클래스 --> 객체를 만들 필요가 없다.
		int iv = 200; static int cv = 300; }

	void myMethod() { 
		class LocalInner { int iv = 400; } }	
}

class InnerClass4 {
	public static void main(String[] args) {
		// 인스턴스클래스의 인스턴스를 생성하려면
		// 외부 클래스의 인스턴스를 먼저 생성해야 한다. --> 인스턴스 = 객체를 만들어야 사용가능한 것.
		Outer2 oc = new Outer2();
		Outer2.InstanceInner ii = oc.new InstanceInner();

		System.out.println("ii.iv : "+ ii.iv); // --> InstanceInner의 iv 100;
		System.out.println("Outer2.StaticInner.cv : "+Outer2.StaticInner.cv); // 300
                                     
		// 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
		// 외부클래스 이름 Outer2의 이름을 붙여줘야 한다.
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si.iv : "+ si.iv);
	}
}