class Super {
	public static void main(String args[]) {
		Child c = new Child();
		c.method();
	}
}

class Parent { int x = 10; /* super.x */}

class Child extends Parent { //x가 두개있다. 조상꺼랑 자손꺼
	int x=20;

	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
}