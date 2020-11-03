
public class Polymorphism008 {
	public static void main(String[] args) {
		System.out.println("Q. 클래스가 다음과 같이 정의되어 있을 때 형변환을 올바르게 하지 않은 것은?");
		System.out.println("A. e");
		
		class Unit{}
		class AirtUnit extends Unit{}
		class GroundUnit extends Unit{}
		class Tank extends GroundUnit{}
		class AirCraft extends AirtUnit{}
		
		Unit u = new GroundUnit(); 
		Tank t = new Tank();		 
		AirCraft ac = new AirCraft();
		
		System.out.println("a. u = (Unit)ac;");						//a. 할머니<=손자 (O)
		System.out.println("b. u = ac;");							//b. 할머니<=손자 (O)
		System.out.println("c. GroundUnit gu = (GroundUnit)u;");	//c. 엄마<=할머니 (O) 왜? 엄마생성자를 부른적있어서 GroundUnit();
		System.out.println("d. AirCraft au = ac;");					//d. 아빠<=손자 (O)
		System.out.println("e. t = (Tank)u;");						//e. 손자<=할머니(X) 할머니는 손자 생성자Tank를 부른적이 없음
		System.out.println("f. GroundUnit gu2 = t;");				//f. 엄마<=손자(O)
		
		// Unit - AirtUnit - AirCraft
		//		- GroundUnit - Tank
		//1. 부모는 자식을 담을 수 있다.
		//2. 자식은(자식생성자를 부른) 부모를 담을 수 있다.
	}
}
