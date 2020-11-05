package Interface;
import java.util.Arrays;
import java.util.Calendar;

interface Lunch{ int money = 10000; void eat();  }

class Burger implements Lunch{
	int price ;
	public Burger() { this.price=3900; }
	@Override public void eat() {System.out.println("Burger 냠냠!");}
	@Override public String toString() { return "Burger "; } 
}

class KimchiStew implements Lunch{
	int price ;
	public KimchiStew() { this.price=4000; }
	@Override public void eat() {System.out.println("KimchiStew 냠냠!");}
	@Override public String toString() { return "KimchiStew "; }
}

class User {
	int money;
	Lunch[] plate;
	int cnt = 0;
	User(){money=Lunch.money; plate=new Lunch[3];}

	void order(Lunch lunch) {  
		int balance = -1; //의미없는 수를 넣어준다
		if(lunch instanceof Burger) {balance=((Burger)lunch).price;}
		else if(lunch instanceof KimchiStew) {balance=((KimchiStew)lunch).price;}
		
		// 잔액(money) 음식가격 빼기
		if(money<balance) {System.out.println("잔액이 부족해 더 이상 " + lunch + "를 구매할 수 없습니다."); return;}
		money-=balance;
		plate[cnt++] = lunch;
	}
	
	//10000을 넘으면 잔액이 부족합니다.
	void show() {  
		String items="";
		int total = 0;
		Calendar today = Calendar.getInstance();
		
		for(int i=0; i<plate.length; i++) {
			if(plate[i]==null) {break;}//만약 plate[2]가 null이라면 빠져나오기
			items += plate[i] + " , ";
			int temp=0;
			if(plate[i] instanceof Burger) {temp=((Burger)plate[i]).price;}
			else if(plate[i] instanceof KimchiStew) {temp=((KimchiStew)plate[i]).price;}
			total += temp;
		}		
		
		System.out.println("주문 : "+items);
		System.out.println("주문금액 : " + total);
		System.out.println("잔액 : " + money);
		System.out.println("주문시간 : " + today.get(1)+"년"+(today.get(2)+1)+"월"+today.get(5)+"일");

		for(int i=0; i<plate.length; i++) {
			if(plate[i]==null) {break;}
			plate[i].eat();
		}
	}	
}

public class Interface002 {
	public static void main(String[] args) {
		User lunchorder = new User();
		lunchorder.order(new Burger());
		lunchorder.order(new KimchiStew());
		lunchorder.order(new Burger());
		lunchorder.show();
	}
}
