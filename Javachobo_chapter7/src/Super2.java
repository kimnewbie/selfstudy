class Super2 {
	public static void main(String args[]) {
		Child2 c = new Child2();
		c.method();
	}
}

class Parent2 { int x=10; /* super.x 와 this.x 둘 다 기능 */}

class Child2 extends Parent2 { //여기엔 x가 없음
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
}