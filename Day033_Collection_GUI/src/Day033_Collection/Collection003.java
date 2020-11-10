package Day033_Collection;

import java.util.Vector;

class ColorInfo{ //DTO 목적이라 접근자를 private으로 하는 게 좋다.
	private int no;
	public static int no_cnt=0;
	private String name;
	private int price;
	public ColorInfo() { this.no = ++no_cnt;} // '호출'할 때마다 cnt 자동 증가
	public ColorInfo(String name, int price) {
		super();
		this.no=++no_cnt;
		this.name = name;
		this.price = price;
	}
	public int getNo() { return no; } public void setNo(int no) { this.no = no; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getPrice() { return price; } public void setPrice(int price) { this.price = price; }
	@Override public String toString() { return "ColorInfo [no=" + no + ", name=" + name + ", price=" + price + "]"; }
}
public class Collection003 {
	public static void main(String[] args) {
		System.out.println("\n[ver-1] DTO");
//		ColorInfo test1 = new ColorInfo("PINK",1200);
//		System.out.println(test1);
		
		System.out.println("\n[ver-2] Vector");
		Vector mycolor = new Vector();
		System.out.println(mycolor); // []
		
		System.out.println("\n[ver-3] Vecto + add 이용해서 데이터 넣기");
		mycolor.add(new ColorInfo("RED",1000));
		mycolor.add(new ColorInfo("YELLOW",1200));
		mycolor.add(new ColorInfo("GREEN",1500));
		System.out.println(mycolor); 
		// [ColorInfo [no=1, name=RED, price=1000], ColorInfo [no=2, name=YELLOW, price=1200], ColorInfo [no=3, name=GREEN, price=1500]]
		
		System.out.println("\n[ver-4] for+size를 이용해서 출력하기");
		for(int i=0; i<mycolor.size(); i++) {
			System.out.println(mycolor.get(i));
		}
	}
}
