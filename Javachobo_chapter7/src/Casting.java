class Casting {
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe;    // car = (Car)fe;에서 형변환이 생략됨
//		부모		자식		업캐스팅
//		car.water(); // car라는 리모콘으로는 FireEngine fe의 모든 객체 사용 불가
					 // 자기가 가진 것만 사용가능하다
		
		
		fe2 = (FireEngine)car; // 자손타입 ← 조상타입. 형변환 생략 불가
		fe2.water();
		fe = (FireEngine)car;
		fe.water();
		
		FireEngine fe3 = (FireEngine)car; 
		Car car2 = (Car)fe2;
		car2.drive();
	}
}

class Car {
	String color;
	int door;

	void drive() { 	// 운전하는 기능
		System.out.println("drive, Brrrr~");
	}

	void stop() {  	// 멈추는 기능	
		System.out.println("stop!!!");	
	}
}

class FireEngine extends Car {	// 소방차
	void water() {	// 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}