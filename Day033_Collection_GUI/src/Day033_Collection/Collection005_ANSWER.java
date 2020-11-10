package Day033_Collection;

import java.util.Scanner;
import java.util.Vector;

class CoffeeInfo1{ //dto목적
	private String name;
	private int num;
	private int total;
	private int price;
	
	@Override public String toString() { return "CoffeeInfo1 [name=" + name + ", num=" + num + ", total=" + total + ", price=" + price + "]"; }
	public int getPrice() { return price; } public void setPrice(int price) { this.price = price; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getNum() { return num; } public void setNum(int num) { this.num = num; }
	public int getTotal() { return total; } public void setTotal(int total) { this.total = total; }
	
	//
	public CoffeeInfo1(String name, int price, int num) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
		this.mcalc(); // 실제로 쓰는 애는 얘라서 여기에 넣어준다
	}
	public CoffeeInfo1(String name, int num, int total, int price) {
		super();
		this.name = name;
		this.num = num;
		this.total = total;
		this.price = price;
//		this.mcalc(); --> 여기엔 필요가 없었어~~~~~~
	}
	public CoffeeInfo1() { super();}
	//
	
	public int mcalc(){ // 생성자에 넣어주면 mcalc() 가능
		this.total = this.price*this.num;;
		return this.total;
	}	
}
public class Collection005_ANSWER {
	public static void main(String[] args) {		
		System.out.println("[ver-1]");
		CoffeeInfo1 test = new CoffeeInfo1("까페라떼",1800,2); test.mcalc(); System.out.println("my "+test); // [name=까페라떼, num=2, total=3600, price=1800]
		
		System.out.println("[ver-2]");
		Vector coffees = new Vector(); System.out.println(coffees); // [] 빈공간
		
		System.out.println("[ver-3]");
		coffees.add(new CoffeeInfo1("까페라떼",1800,2));
		coffees.add(new CoffeeInfo1("아메리카노",1500,3));
		coffees.add(new CoffeeInfo1("에스프레소",2000,1));
		System.out.println(coffees); // [CoffeeInfo1 [name=까페라떼, num=2, total=3600, price=1800], CoffeeInfo1 [name=아메리카노, num=3, total=4500, price=1500], CoffeeInfo1 [name=에스프레소, num=1, total=2000, price=2000]]

		
		System.out.println("[ver-4] for + size");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\tNAME\t\tPRICE\tNUM\tTOTAL");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");
		for(int i=0; i<coffees.size(); i++) {
		CoffeeInfo1 temp = (CoffeeInfo1)coffees.get(i); // ★타입캐스팅★ toString만 출력하는 --> coffees.get(i).getName() 이런게 안되서 temp에 넣어준거야..
		System.out.println("ORDER"+(i+1)+"\t"+temp.getName()+"    \t"+temp.getPrice()+"\t"+temp.getNum()+"\t"+temp.getTotal());
		}
		System.out.println("[ver-5]");	
		Scanner sc = new Scanner(System.in);
		int find = -1; // 배열은 0부터 시작하니까 -1은 절대로 담길 수 없는 숫자이다
		String order = ""; // 위에 name을 사용하려면 객체를 만들어줘야되서 그냥 새로운 변수사용
		System.out.print("주문이름을 적어주세요 > "); order = sc.next();
		for(int i=0; i<coffees.size(); i++) {
			CoffeeInfo1 temp = (CoffeeInfo1)coffees.get(i); // 커피정보담기
			if(temp.getName().equals(order)) {find=i; break;} // 커피 정보 중 이름이 주문이름과 같다면
		}
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\tNAME\t\tPRICE\tNUM\tTOTAL");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");
		CoffeeInfo1 temp = (CoffeeInfo1)coffees.get(find);
		System.out.println("ORDER"+(find+1)+"\t"+temp.getName()+"    \t"+temp.getPrice()+"\t"+temp.getNum()+"\t"+temp.getTotal());
		System.out.println("-----------------------------------------------");
	}
}