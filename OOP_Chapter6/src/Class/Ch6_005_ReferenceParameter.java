package Class;
class Data2 { int x; }

class Ch6_005_ReferenceParameter {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x); //d가 가리키는 x의 값 10

		change(d); //change 메서드를 부름
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(Data2 d) { // Data - 참조형 매개변수 , 객체의 주소를 받음
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}