package Day033_Collection;

import java.util.Scanner;
import java.util.Vector;

class CoffeeInfo{ //dto목적
	private String name;
	private int num;
	private int total;
	private int price;
	static int cnt = 0;
	int number;
	
	public int getPrice() { return price; } public void setPrice(int price) { this.price = price; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getNum() { return num; } public void setNum(int num) { this.num = num; }
	public int getTotal() { return total; } public void setTotal(int total) { this.total = total; }
	
	public CoffeeInfo(String name, int price, int num) {
		super();
		this.number = cnt++;
		this.name = name;
		this.price = price;
		this.num = num;
	}
	public CoffeeInfo() {
		super();
		this.number = cnt++;
	}
	public int mcalc(){
		this.total = this.price*this.num;;
		return this.total;
	}
	public void show() {
		mcalc();
		Scanner sc = new Scanner(System.in);
		System.out.println("주문정보입니다.");
		System.out.println("주문이름을 적어주세요 > "); this.name = sc.next();
		System.out.println();
		
		
	}
	@Override
	public String toString() {mcalc();
		return "ORDER" + this.number +" : "+ name+"   \t"+  price+"\t"+ num +"\t"+   total;
	}
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		CoffeeInfo.cnt = cnt;
	}


	
}
public class Collection005 {
	public static void main(String[] args) {
		CoffeeInfo info = new CoffeeInfo();
		
		Vector coffee = new Vector();
		coffee.add(new CoffeeInfo("까페라떼",1800,2));
		coffee.add(new CoffeeInfo("아메리카노",1500,3));
		coffee.add(new CoffeeInfo("에스프레소",2000,1));
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\tNAME\t\tPRICE\tNUM\tTOTAL");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		
		for(int i=0; i<coffee.size(); i++) {
			System.out.println(coffee.get(i));
			System.out.println("----------------------------------------------");
		}
		info.show();
		if(info.getName().equals("아메리카노")) {System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\tNAME\t\tPRICE\tNUM\tTOTAL");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(coffee.get(1));
		System.out.println("----------------------------------------------");}
		else if(info.getName().equals("까페라테")) {System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\tNAME\t\tPRICE\tNUM\tTOTAL");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");System.out.println(coffee.get(0));System.out.println("----------------------------------------------");}
		else if(info.getName().equals("에스프레소")) {System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\tNAME\t\tPRICE\tNUM\tTOTAL");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");System.out.println(coffee.get(2));System.out.println("----------------------------------------------");}
	}
}
