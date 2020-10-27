package day23;
class Car3{
	//멤버변수
	String color; String gearType; int door;
	//멤버함수
	@Override
	public String toString() {
		return "Car3 [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
	//생성자
	Car3(){super(); this.gearType="auto"; this.door = 4;} ///### gearType=auto, door=4
	Car3(String color, String gearType, int door){super(); this.color=color; this.gearType=gearType; this.door=door;}
	//이부분 2,4줄 바꿈
	public Car3(Car3 car) { //링크를 복사해서 가져오면 
		//System.out.println(car); //메서드할 때 확인하기 위해 사용해준다★★
		//깊은 복사 (데이터를 찾으면!!!!)
		this.color = car.color; this.gearType = car.gearType; this.door = car.door;
	}	
	
}
public class Class017 {
	public static void main(String[] args) {
		//1. Car3의 자료형으로 사용할 수 있는 인스턴스 변수 [color=, gearType=, door=]
		//2. new 공간빌려오고
		//3. Car3() 초기화를 시키면 셋팅을 해줌 Car3 [color=red, gearType=auto, door=4]
		//4. 3번에서 인스턴스변수를 사용할 수 있게 주소를 갖고 있는 것은 c1->Car3 [color=null, gearType=auto, door=4]
		Car3 c1 = new Car3(); c1.color="red"; //5. .을 이용해서 접근 함 c1(1000번째 주소)->Car3(1000번째 주소) [color=red[#], gearType=auto, door=4] red 를 넣어줌
		System.out.println(c1); //6. toString 값 확인
		//7. Car3의 자료형으로 사용하 ㄹ수 있는 인스턴스 변수 [color=, gearType=, door=]
		//8. new 공간빌려오기
		//9. Car3(c1) 초기화를 시키면 셋팅을 해 줌 Car3 [color=null, gearType=auto, door=4]
		//						c1(1000번째 주소)->Car3(1000번째 주소) [color=red[#], gearType=auto, door=4]
		Car3 c2 = new Car3(c1);				  System.out.println(c2);
		//////////// 생성자
		Car3 c3 = new Car3(); c3.color="green"; System.out.println(c3);
		Car3 c4 = new Car3(c3);				    System.out.println(c4);
		/*
		ㅁ 출력내용 : 		
		Car3 [color=red, gearType=auto, door=4]
		Car3 [color=red, gearType=auto, door=4]
		Car3 [color=green, gearType=auto, door=4]
		Car3 [color=green, gearType=auto, door=4]
		
		ㅁ 주어진 옵션
		public static void main(String[] args) {
			//////////// 생성자
			Car3 c1 = new Car3(); c1.color="red"; System.out.println(c1);
			Car3 c2 = new Car3(c1);				  System.out.println(c2);
			//////////// 생성자
			Car3 c3 = new Car3(); c3.color="green"; System.out.println(c3);
			Car3 c4 = new Car3(c3);				    System.out.println(c4);
		ㅁ class Car2를 만드시오
		1. 멤버변수
		String color; String gearType; int door;
		2. 멤버함수 : X
		3. 생성자 : 기본생성자, 파라미터생성자(this 사용하기)
		 */
	}
}
