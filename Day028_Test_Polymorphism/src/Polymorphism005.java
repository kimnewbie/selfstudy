class Papa extends Object{
	int money = 10000; //명시적초기화!
	public Papa() {super();}
	public void sing() {System.out.println("남행열차");}
}
///
class Son extends Papa{
	int money = 1500;
	public Son() {super();}
	//main 클래스에서 Papa mypapa = new Son(); 파라미터 없는 아이를 불렀으니께~
	
	@Override public void sing() {System.out.println("안녕 - 폴킴");}
	
	public Son(int money) {
		super();
		this.money = money;
	}
	
}
///
public class Polymorphism005 {
	public static void main(String[] args) {
		Papa mypapa = new Son();
		System.out.println(((Son)mypapa).money);
		mypapa.sing();
		/*1500 출력할 것*/
	}
}
