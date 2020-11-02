class Fruit extends Object{//####00. Object를 상속받음
	//###01. line()메서드 구현
	public static void line()
	{System.out.println("========================");}
	Fruit(){System.out.println("\n:: Fruit 생성자");}
}//end fruit

class Apple extends Fruit{
	Apple(){/*super(); 생략됨*/System.out.println("\n:::::: Apple 생성자");}
}//end Apple

class AppleJam extends Apple{
	AppleJam(){System.out.println("\n:::::: AppleJam 생성자");}
}
public class Extends005 {
	public static void main(String[] args) {
		Fruit.line(); // ========================이 출력
		Fruit fruit = new Fruit();
		Fruit.line(); // ========================이 출력
		Apple apple = new Apple();
		Fruit.line(); // ========================이 출력
		AppleJam appleJam = new AppleJam();
	}
}
/*
========================

:: Fruit 생성자
========================

:: Fruit 생성자

:::::: Apple 생성자
========================

:: Fruit 생성자

:::::: Apple 생성자

:::::: AppleJam 생성자
*/