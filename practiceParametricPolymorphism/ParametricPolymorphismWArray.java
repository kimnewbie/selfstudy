package practiceParametricPolymorphism;
// 1번 클래스를 배열로 다루기

class Product2{
	int price; // 제품의 가격
	int bonusPoint; // 제품구매시 제공되는 포인트
	//
	Product2(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); // 보너스점수는 제품가격의 10%
	}
	
	public Product2() {} // 기본 생성자 추가

	//
	@Override
	public String toString() {
		return "Product [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	
}

class Tv2 extends Product2{

	Tv2() { super(100); } // 조상클래스의 생성자(int)를 부름

	@Override public String toString() { return "Tv"; }
	
}
class Computer2 extends Product2{

	Computer2(){ super(200); }
	
	@Override public String toString() { return "Computer"; }
}
class Audio2 extends Product2{

	Audio2() { super(50); }
	
	@Override public String toString() { return "Audio"; }
	
}

class Buyer2{ // 고객, 물건사는 사람
	int money = 1000; // 소유금액 1000원
	int bonusPoint = 0; // 보너스점수 0 초기값
	Product2[] item = new Product2[10]; // ### 구입한 제품을 저장
	int cnt = 0; // ### Product 배열에 사용될 카운터
	
	void buy(Product2 product) {
		if(money<product.price) { System.out.println("잔액이 부족하여 물건을 살 수 없습니다."); return; }
		money -= product.price;
		bonusPoint += product.bonusPoint;
		item[cnt++] = product; // 제품을 Product[] item에 저장
		System.out.println(product + "를 구매하셨습니다.");
	}
	
	void summary() { // ### 구입한 물품에 대한 정보를 요약해서 보여준다.
		int sum = 0; // 구입한 물품의 가격합계
		String itemList = ""; // 구입한 물품목록
//		반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0; i<item.length; i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] + ", "; // Tv, Computer, Audio,
//			itemList += (i==2)? item[i] : item[i] + ", "; // Tv, Computer, Audio
//			itemList += (i>=item.length-1)? item[i] : item[i] + ", "; // 실패
		}
		bonusPoint = (int)(sum/10.0);
		System.out.println("구입하신 물품의 총금액은 : " + sum + "만원입니다.");
		System.out.println("구입하신 뒤 총 포인트는 : " + bonusPoint + "점입니다.");
		System.out.println("구입하신 제품은 : " + itemList + "입니다.");
	}
}

public class ParametricPolymorphismWArray {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		b.buy(new Tv2()); b.buy(new Computer2()); b.buy(new Audio2());
		b.summary();
	}
}