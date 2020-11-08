class Anonymous {
	Object iv = new Object/*조상이름*/() { void method() { } /* 클래스내용 */}; // 익명 클래스
	static Object cv = new Object(){ void method(){} };  // 익명 클래스

	void myMethod() {
		Object lv = new Object(){ void method(){} };      // 익명 클래스
	}
}