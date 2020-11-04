package Day029_Polymorphism_Abstract;
abstract class Milk_a{
	String name;
	public abstract void drink();
	public void welcome() {System.out.println("WELCOME! GREEN MILK");}
}
class WhiteMilk_a extends Milk_a{
	@Override public void drink() { System.out.println(super.name + "를 주문하셨습니다.");}
	public WhiteMilk_a() {this.name="흰우유";}
	public WhiteMilk_a(String name) {super.name = name;} //this.나 super사용가능
	
}
class ChocoMilk_a extends Milk_a{
	@Override public void drink() { System.out.println(super.name + "를 주문하셨습니다.");}
	public ChocoMilk_a() {this.name="초코우유";}
	public ChocoMilk_a(String name) {super.name = name;}
}
class BananaMilk_a extends Milk_a{
	@Override public void drink() { System.out.println(super.name + "를 주문하셨습니다.");}
	public BananaMilk_a () {this.name="바나나우유";}
	public BananaMilk_a (String name) {super.name = name;}
}
public class Abstract004 {
	public static void main(String[] args) {
		Milk_a m11 = null;
		m11 = new WhiteMilk_a();	m11.welcome(); m11.drink();//흰우유를 주문 출력
		m11 = new ChocoMilk_a();	m11.drink();//초코우유를 주문 출력
		m11 = new BananaMilk_a();	m11.drink(); //바나나우유 주문 출력
				
	}
}
