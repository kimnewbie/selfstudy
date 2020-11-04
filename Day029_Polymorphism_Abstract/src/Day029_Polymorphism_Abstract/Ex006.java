package Day029_Polymorphism_Abstract;
class Product {
	int price;	
	public Product() {}
	public Product(int price) { this.price = price; }
}
class Tv extends Product{
	@Override public String toString() { return "Tv"; }

	public Tv() {super(100);}
	
}
class Computer extends Product{
	@Override public String toString() { return "Computer"; }

	public Computer() {super(200);}
	
}
class Audio extends Product{
	@Override public String toString() { return "Audio"; }

	public Audio() {super(50);}
	
}
class Buyer {
	static int cnt = 0; //count는 0번째부터
	int money;
	Product[] cart;
	
	public Buyer() { money=1000; cart = new Product[6]; }
	public Buyer(int money) { super(); }
	
	public void buy(Product product) { //★파라미터 출력해봐
		System.out.println(product+"\t"+product.price);
		//(3)만약 가진돈이 물건의 가격보다 적다면 바로 종료
		if(money<product.price) { System.out.println("1. 잔액이 부족하여 "+product+"를 살 수 없습니다."); return; }
		
		
		//(1)가진돈에서 물건의 가격을 빼고 money-100=>money		
		money -= product.price;
		//(2)장바구니에 담고
		cart[cnt++] = product;
		
	}	
	public void summary() {
		String item="";//아이템
		int total = 0; //사용한 금액
		
		for(int i=0; i<cart.length; i++) {
			item += cart[i] + ",";
			total += cart[i].price;
		}
		
		System.out.println("2. 구입한 물건 : "+ item);
		System.out.println("3. 사용한 금액 : " + total);
		System.out.println("4. 남은 금액 : " + money);
	}
}
///
public class Ex006 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}
}
