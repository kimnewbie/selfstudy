package day23;
class Car2{
	//멤버변수
	String color; String gearType; int door;
	//멤버함수
	@Override
	public String toString() {
		return "Car2 [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
	//생성자
	Car2(){super();}	
	Car2(String color){super(); this.color=color;}
	Car2(String color, String gearType, int door){super(); this.color=color; this.gearType=gearType; this.door = door;}
}
public class Class016 {
	public static void main(String[] args) {
		//1. Car2자료형이 쓸 수있는 인스턴스 변수 : Car2 [color=null, gearType=null, door=0]
		//2. new는 공간 빌려오기
		//3. 생성자에서는 Car2 [color=null, gearType=null, door=0] 초기값을 갖고 간다
		//4. c1은 3번의 공간을 사용할 수 있게 주소를 갖고 있음
		Car2 c1 = new Car2(); System.out.println(c1);
		Car2 c2 = new Car2("white"); System.out.println(c2);
		Car2 c3 = new Car2("red","manual",2); System.out.println(c3);
		
		System.out.println("c1의 color-" + c1.color +", gearType-" + c1.gearType+ ", door-" + c1.door);
		System.out.println("c2의 color-" + c2.color +", gearType-" + c2.gearType+ ", door-" + c2.door);
		System.out.println("c3의 color-" + c3.color +", gearType-" + c3.gearType+ ", door-" + c3.door);
		/*
		ㅁ 출력내용 : 
		Car2 [color=null, gearType=null, door=0]
		Car2 [color=white, gearType=null, door=0]
		Car2 [color=red, gearType=manual, door=2]
		c1의 color-null, gearType-null, door-0
		c2의 color-white, gearType-null, door-0
		c3의 color-red, gearType-manual, door-2
		
		ㅁ 주어진 옵션
		public static void main(String[] args) {
			Car2 c1 = new Car2(); System.out.println(c1);
			Car2 c2 = new Car2("white"); System.out.println(c2);
			Car2 c3 = new Car2("red","manual",2); System.out.println(c3);
			
			System.out.println("c1의 color-" + c1.color + +, gearType-" + c1.gearType+ ", door-" + c1.door);
			System.out.println("c2의 color-" + c2.color + +, gearType-" + c2.gearType+ ", door-" + c2.door);
			System.out.println("c3의 color-" + c3.color + +, gearType-" + c3.gearType+ ", door-" + c3.door);
			
		ㅁ class Car2를 만드시오
		1. 멤버변수
		String color; String gearType; int door;
		2. 멤버함수 : X
		3. 생성자 : 기본생성자, 파라미터생성자(this 사용하기)
		 */
	}
}
