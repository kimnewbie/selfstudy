package Class;
class Data { int x; }

class Ch6_004_BasicParameter {
	public static void main(String[] args) { //(1) main메서드가 call stack에 올라가며 시작
		Data d = new Data(); //(2)참조변수 d생성 (3)new Data(); 객체 생성
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x); //(3)change메서드 호출
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x); //밑 change가 종료후 넘어옴
	}

	static void change(int x) {  // 기본형 매개변수
		x = 1000; //가까운 x로 간다 
		System.out.println("change() : x = " + x); //(4)x=1000 지역변수 x를 바꾼거라 사라짐
	}
}