package Class033;

public class Class033 {
	public static void main(String[] args) {
		Car44 c1 = new Car44();
		/// 아래 3중 오류나는 것을 고치시오. 데이터 셋팅!
		c1.setColor("white");//c1.color = "white";
		c1.setGearType("auto");//c1.gearType = "auto";
		c1.setDoor(4);//c1.door = 4;
		
		Car44 c2 = new Car44("white","auto",4);
		System.out.println(c1);
		System.out.println(c2);
	}
}
/*
ㅁ 출력된 화면
c1의 color=while, gearType=auto, door=4
c2의 color=while, gearType=auto, door=4

ㅁ 주어진옵션"
#### class Car4를 만드시오
	1. 멤버변수 - private으로 변경하시오
		String color; //색상
		String gearType; //변속기 종류 - auto, manual
		int door; //문의 개수
	2. 멤버함수 : X
	3. 생성자 : 기본생성자, 파라미터생성자(this 사용하기)
		public class Class033 {
			public static void main(String[] args) {
				Car4 c1 = new Car4();
				/// 아래 3중 오류나는 것을 고치시오. 데이터 셋팅!
				c1.color = " whilte ";
				c1.gearType = "auto";
				c1.door = 4;
				
				Car4 c2 = new Car4("white","auto",4);
				System.out.println(c1);
				System.out.println(c2);
*/