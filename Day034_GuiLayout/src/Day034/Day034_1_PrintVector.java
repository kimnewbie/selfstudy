package Day034;

import java.util.Vector;

class ColorInfor{
	//
	private int no;
	private String name;
	private int price;
	//
	@Override public String toString() { return "ColorInfor [no=" + no + ", name=" + name + ", price=" + price + "]"; }
	public int getNo() { return no; } public void setNo(int no) { this.no = no; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getPrice() { return price; } public void setPrice(int price) { this.price = price; }
	//
	public ColorInfor() { super(); } // 기본생성자는 꼭 사용한다
	public ColorInfor(int no, String name, int price) { super(); this.no = no; this.name = name; this.price = price; }
	public ColorInfor(String name, int price) { super(); this.name = name; this.price = price; }
	
}
public class Day034_1_PrintVector {
	public static void main(String[] args) {
		Vector<ColorInfor> color = new Vector<ColorInfor>();
		color.add(new ColorInfor("Red",1000));
		color.add(new ColorInfor("Yello",1200));
		color.add(new ColorInfor("Green",1500));
		//System.out.println(color); //toString 출력		
		System.out.println(":::::::::::::::::::::::");
		System.out.println("\tNAME\tPRICE");
		System.out.println(":::::::::::::::::::::::");
		for(int i=0; i<color.size(); i++) {
			ColorInfor temp = (ColorInfor)color.get(i);
		System.out.println("ORDER"+(i+1)+" : "+temp.getName()+"\t"+temp.getPrice());
		System.out.println("-----------------------");
		}
	}
}
/**
1)[배열]의 단점을 개선한 클래스로 2)[객체 클래스]만 저장할 수 있음
3)[오토박싱] int => Integer 자동변환해서 저장해줌
ㅁ 핵심인터페이스
가.4)[List]순서가 있는 데이터의 집합, 중복허용(O)
나.5)[Set]순서가 없는 데이터의 집합, 중복허용(X)
다.6)[Map]순서대신에 key, value 쌍으로 이뤄져 있음.
				key 중복허용 (X), value 중복허용(O)
7)[Vector] 컬렉션 프레임워크가 만들어지기 이전부터 존재.
프레임 워크 명명법을 따지지 않음.
호환을 위해 남겨두었지만 가능한한 권장하지는 않음.
*/