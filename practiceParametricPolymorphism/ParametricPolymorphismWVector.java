package practiceParametricPolymorphism;

import java.util.Vector;

//1번 클래스를 Vector로 다루기

class Product3{
	int price; // 제품의 가격
	int bonusPoint; // 제품구매시 제공되는 포인트
	//
	Product3(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); // 보너스점수는 제품가격의 10%
	}
	
	public Product3() {} // 기본 생성자 추가

	//
	@Override
	public String toString() {
		return "Product3 [price=" + price + ", bonusPoint=" + bonusPoint + "]";
	}
	
}

class Tv3 extends Product3{  Tv3() { super(100); }  @Override public String toString() { return "Tv"; }  }
class Computer3 extends Product3{  Computer3(){ super(300); }  @Override public String toString() { return "Computer"; } }
class Audio3 extends Product3{  Audio3() { super(50); }  @Override public String toString() { return "Audio"; }  }

class Buyer3{ // 고객, 물건사는 사람
	int money = 1000; // 소유금액 1000원
	int bonusPoint = 0; // 보너스점수 0 초기값
//	Product3[] item = new Product3[10]; // ### 구입한 제품을 저장
	Vector<Product3> item = new Vector<>();
	//
	void buy(Product3 product) {
		if(money<product.price) { System.out.println("잔액이 부족하여 물건을 살 수 없습니다."); return; }
		money -= product.price;
		bonusPoint += product.bonusPoint;
//		item[cnt++] = product; // 제품을 Product[] item에 저장
		item.add(product); // XXX vector.add
		System.out.println(product + "를 구매하셨습니다.");
	}
	void refund(Product3 product) {
		if(item.remove(product)) {
			money += product.price;
			bonusPoint -= product.bonusPoint;
			System.out.println(product + "을/를 반품하셨습니다.");
		} else { // 제거에 실패한 경우
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	void summary() { // ### 구입한 물품에 대한 정보를 요약해서 보여준다.
		int sum = 0; // 구입한 물품의 가격합계
		String itemList = ""; // 구입한 물품목록
		
		if(item.isEmpty()) { System.out.println("구입하신 제품이 없습니다."); return; }
		/** XXX 배열버전 
		for(int i=0; i<item.length; i++) {
			if(item[i]==null) break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		*/
		for(int i=0; i<item.size(); i++) {
			Product3 product = (Product3)item.get(i); // Vector의 i번째에 있는 객체를 얻어온다.
			sum += product.price;
			itemList += (i==0)? "" + product : ", " + product;
		}
		bonusPoint = (int)(sum/10.0);
		System.out.println("구입하신 물품의 총금액은 : " + sum + "만원입니다.");
		System.out.println("구입하신 뒤 총 포인트는 : " + bonusPoint + "점입니다.");
		System.out.println("구입하신 제품은 : " + itemList + "입니다.");
	}
}
public class ParametricPolymorphismWVector {
	public static void main(String[] args) {
		Buyer3 b = new Buyer3();
		Tv3 tv = new Tv3(); 
		b.buy(tv);
		b.buy(new Computer3()); b.buy(new Audio3());
		b.summary(); 
		System.out.println();
		b.refund(tv); // 리펀드 땜에 .buy(new Tv3()); 불가 따로 객체를 만들었어야 함
		b.summary();
	}
}