class Casting2 {
	public static void main(String args[]) {
		Car3 car = new Car3(); // Car3 car=null 상관없이 f가 water() 호출 가능
		FireEngine2 f = new FireEngine2(); // FireEngine2 f =  null 이면 오류
		car = f; //이 부분이 없으면 f.water(); 오류
		f = (FireEngine2)car;
		f.water();
		
		// 참조형 5개 -> 4개(조상) -> 5개로 바꾸는 건 가능한데,
		// 4개(조상) -> 5개로는 불가하다
	}
}

class Car3 {
	String color;
	int door;

	void drive() { 	// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// 멈추는 기능	
		System.out.println("stop!!!");	
	}
}

class FireEngine2 extends Car3 {	// 소방차
	void water() {	// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}