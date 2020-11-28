package practiceParametricPolymorphism;
// Product 클래스는 Tv,Computer,Audio의 [조상클래스]
// Tv,Computer,Audio,Buyer 클래스가 정의

class Product{
	int price; // 제품의 가격
	int bonusPoint; // 제품구매시 제공되는 포인트
	//
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); // 보너스점수는 제품가격의 10%
	}
	//
	@Override
	public String toString() {
		return "Product [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	
}

class Tv extends Product{

	Tv() { // 조상클래스의 생정자 Product(int price)를 호출한다.
		super(100); // Tv의 가격을 100만원으로 한다.
	}

	@Override public String toString() { return "Tv"; }
	
}
class Computer extends Product{

	Computer(){ // 조상클래스의 생정자 Product(int price)를 호출한다.
		super(200);
	}
	@Override public String toString() { return "Computer"; }
}
class Audio extends Product{

	Audio() { // 조상클래스의 생정자 Product(int price)를 호출한다.
		super(50);
	}
	@Override public String toString() { return "Audio"; }
	
}

class Buyer{ // 고객, 물건사는 사람
	int money = 1000; // 소유금액 1000원
	int bonusPoint = 0; // 보너스점수 0 초기값
	
//	물건을 구입하는 기능의 메서드 추가
//	구입할 대상이 필요 > 매개변수로 구입할 제품을 넘겨받기
	void buy(Product product) {
//		Buyer가 가진 money에서 제품의 가격 product.price만큼 뺀다.
//		money = money-product.price;
//		Buyer의 보너스점수(bonusPoint)에 제품의 보너스점수(product.bonusPoint)를 더한다.
//		bonusPoint = bonusPoint + product.bonusPoint;
		if(money<product.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다."); return;
		}
		money = money-product.price;
		bonusPoint += product.bonusPoint;
		System.out.println(product + "를 구매하셨습니다.");
	}
}
public class ParametricPolymorphism {
	public static void main(String[] args) {
		Buyer b = new Buyer();
//		Tv t = new Tv(); b.buy(t);
		b.buy(new Tv());
//		Computer c = new Computer(); b.buy(c);
		b.buy(new Computer());
		System.out.println("현재남은 돈은 : " + b.money + "만원입니다.");
		System.out.println("현재 보너스 점수는 : " + b.bonusPoint + "점입니다.");
	}
}
