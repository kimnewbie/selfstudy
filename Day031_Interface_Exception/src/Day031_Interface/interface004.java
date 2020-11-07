package Day031_Interface;

//abstract, interface 공통점 : 설계를 목적으로 하므로, 자손클래스에서 구현해야 함
/*	
	클래스는 단일상속이므로 두개를 상속받지 못한다
	TestA<<class>>	TestB<<class>>
		↑				↑(X) 그래서 하나를 빼야해
			TestC<<class>>
*/
abstract class TestA{}
abstract class TestB{}
abstract class TestC extends TestA/*, TestB*/{} //실패한 이유. class는 단일상속
/*	
인터페이스는 다중상속이 가능하다.
Order<<interface>>	Best<<interface>> OTime<<interface>>
		↑				↑				↑ ---- 점선 화살표들
		  	Using1<<interface>> [extends] Order, Best, OTime{}
		  	MyMilk1<<class>> implements Using1{인터페이스가 상속한 친구들 다 구현해야함}
*/
interface Order{void order();}	//주문
interface Best{void best();}	//베스트
interface OTime{void otime();}	//시간
interface Using1 extends Order, Best, OTime{} //-->다중상속 가능
//interface Using2 implements Order, Best, OTime{}  --> implements 사용 안돼~

class MyMilk1 implements Using1{
	 @Override public void best() {  }
	 @Override public void order() {  }
	 @Override public void otime() {  } 
}
/*	
Order<<interface>>	Best<<interface>> OTime<<interface>>
		↑				↑				↑ ---- 점선 화살표들
	MyMilk2<<class>> implements Using1{인터페이스가 상속한 친구들 다 구현해야함}
*/
class MyMilk2 implements Order, Best, OTime{
	 @Override public void best() {  }
	 @Override public void order() {  }
	 @Override public void otime() {  } 
}
/*	
TestA<<class>>	Order<<interface>>	Best<<interface>>
		↑				↑				↑
	MyMilk3<<class>> extends TestA implements Order, Best
*/
class MyMilk3 extends TestA implements Order, Best{
	 @Override public void best() {  }
	 @Override public void order() {  }
}
public class interface004 {
	public static void main(String[] args) {
		MyMilk3 milk = new MyMilk3();
		if(milk instanceof MyMilk3) {System.out.println("1. MyMilk3");}
		if(milk instanceof TestA) {System.out.println("2. TestA");}
		if(milk instanceof Order) {System.out.println("3. Order");}
		if(milk instanceof Best) {System.out.println("4. Best");}
		if(milk instanceof Using1) {System.out.println("5. Using1");} //Using1을 사용한적없어서 출력x
	}
}
