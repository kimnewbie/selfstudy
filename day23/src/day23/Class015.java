package day23;
class Car1{
	//멤버변수
	String color; String gearType; int door;
	@Override
	public String toString() {
		return "Car1 [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
	//생성자
	Car1(){super();}	
	Car1(String color, String gearType, int door){
		this(); this.color = color; this.gearType = gearType; this.door = door;}
}
public class Class015 {
	public static void main(String[] args) {
		//1. Car1자료형이 쓸 수있는 인스턴스 변수 : Car1 [color=null, gearType=null, door=0]
		//2. new는 공간 빌려오기
		//3. 생성자에서는 Car1 [color=null, gearType=null, door=0] 초기값을 갖고 간다
		//4. c1은 3번의 공간을 사용할 수 있게 주소를 갖고 있음
		Car1 c1 = new Car1(); System.out.println(c1);
		c1.color ="red"; c1.gearType="auto"; c1.door=4; // 5. .을 사용해서 접근해 데이터 셋팅을 할 수 있음
		System.out.println(c1); //6. toString을 이용해서 객체 출력
		//1. Car1자료형이 쓸 수있는 인스턴스 변수 : Car1 [color=red, gearType=auto, door=4]
		//2. new는 공간 빌려오기
		//3. 생성자에서는 Car1 [color=null, gearType=null, door=0] 초기값을 갖고 간다
		//4. c1은 3번의 공간을 사용할 수 있게 주소를 갖고 있음
		Car1 c2 = new Car1("white","auto",2); 
		System.out.println(c2);
		/*
		ㅁ 출력내용
		Car1[color=null, gearType=null, door=0]
		Car1[color=red, gearType=auto, door=4]
		Car1[color=white, gearType=auto, door=2]
		
		ㅁ 주어진옵션
		public static void main(String[] args) {
			Car1 c1 = new Car1(); System.out.println(c1);
			c1.color ="red"; c1.gearType="auto"; c1.door=4; System.out.println(c1);
			Car1 c2 = new Car1("white","auto",2); System.out.println(c2);
		
		ㅁ class Car1을 만드시오
		1. 멤버변수
		String color;
		String gearType;
		int door;
		2. 멤버함수 : X
		3. 생성자 : 기본생성자, 파라미터생성자(this 사용하기)
		 */
	}
}
