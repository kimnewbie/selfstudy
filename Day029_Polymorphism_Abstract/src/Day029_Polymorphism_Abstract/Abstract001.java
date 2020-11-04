package Day029_Polymorphism_Abstract;
abstract class Animal0{ //설계클래스
	String name; int age;
	public Animal0(String name, int age) { super(); this.name = name; this.age=age;}
	public Animal0() {}
	public abstract void eat(); //{} 구현부가 있으면 안되용. 그래서 ()로, 추상메서드가 들어가면 클래스도 abstract 클래스로 ㄱㄱ
	public abstract void sleep();
	public abstract void poo(); // 고양이, 개, 사람은 먹는 방식이 달라요. (구체적으로 적을 수 없음) => 일반화
}
///
class Cat0 extends Animal0{	
	// abstract 에서 구현이 안되서 이거 해줘야해! 맞게 어떻게 하는지를 적어 {}
	@Override public void eat() {System.out.println(super.name + " ㅁCAT 냠냠!");}
	@Override public void sleep() {System.out.println(super.name + " ㅁCAT 코오!");}
	@Override public void poo() {System.out.println(super.name + " ㅁCAT 시원해!");}
	
}
///
class Dog0 extends Animal0{
	// abstract 에서 구현이 안되서 이거 해줘야해! 맞게 어떻게 하는지를 적어 {}
	@Override public void eat() {System.out.println(super.name +" ㅁDOG 냠냠!");}
	@Override public void sleep() {System.out.println(super.name +" ㅁDOG 코오!");}
	@Override public void poo() {System.out.println(super.name +" ㅁDOG 시원해!");}
}
///

public class Abstract001 {
	public static void main(String[] args) {
	//실습1. abstract 키워드가 붙으면 new를 못함
	//Animal0 myani = new Animal0(); new를 못하는 건 구현부가 없어서 그래. 저건 그저 설계도 (실제 존재x)
	Cat0 mycat = new Cat0();	mycat.name="sally";	mycat.age=10;
	mycat.eat(); mycat.sleep();	mycat.poo();
	Dog0 mydog = new Dog0();	mydog.name="alpha";	mydog.age=15;
	mydog.eat(); mydog.sleep();	mydog.poo();
	}
}
