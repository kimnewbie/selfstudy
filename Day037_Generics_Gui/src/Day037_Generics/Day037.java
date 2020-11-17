package Day037_Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

class Milk{
	private String milk;
	private int price;
	private int no;
	
	public String getMilk() { return milk; } public void setMilk(String milk) { this.milk = milk; }
	public int getPrice() { return price; } public void setPrice(int price) { this.price = price; }
	public int getNo() { return no; } public void setNo(int no) { this.no = no; }
	
	public Milk() { super(); }
	public Milk(int no, String milk, int price) {
		super();
		this.no = no;
		this.milk = milk;
		this.price = price;
	}
	public Milk(String milk, int price) {
		super();
		this.milk = milk;
		this.price = price;
	}
	@Override public String toString() { return "milk [milk=" + milk + ", price=" + price + "]"; }
}
public class Day037 {
	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList milk = new ArrayList<>();
		Milk[] milks = {new Milk(1,"white",1000),new Milk(2,"choco",1200),new Milk(3,"banana",1300)};
		for(int i=0; i<milks.length; i++) {milk.add(milks[i]);}
		Iterator iter = milk.iterator();
		System.out.println("=========================");
		System.out.println("NO\tNAME\tPRICE");
		System.out.println("=========================");
		while(iter.hasNext()) {
			Milk temp = (Milk) iter.next();
			System.out.println(temp.getNo() +"\t"+temp.getMilk()+"\t"+temp.getPrice());			
		}
		
		
		System.out.println("\nHashSet");
		HashSet<Milk> set = new HashSet<>();
		for(int i=0; i<milks.length; i++) {set.add(milks[i]);}
		Iterator<Milk> iter2 = set.iterator();
		System.out.println("\n=========================");
		System.out.println("NO\tNAME\tPRICE");
		System.out.println("=========================");
		while(iter2.hasNext()) {
			Milk temp = iter2.next();
			System.out.println(temp.getNo() +"\t"+temp.getMilk()+"\t"+temp.getPrice());
		}
		
		
		System.out.println("\nHashMap");
		HashMap<Integer,Milk> map = new HashMap<>();
		System.out.println("\n=========================");
		System.out.println("NO\tNAME\tPRICE");
		System.out.println("=========================");
//		map.put(0,milks[0]); -- > for 구문으로
		for(int i=0; i<milks.length; i++) {map.put(i, milks[i]);}
		Iterator<Entry<Integer,Milk>> iter3 = map.entrySet().iterator();
		while(iter3.hasNext()) {
			Entry<Integer, Milk> temp = iter3.next();
			System.out.println(temp.getValue().getNo()+"\t"+temp.getValue().getMilk()+"\t"+temp.getValue().getPrice());
		}
	}
}
/**
List :	순서(O), 중복허용(O)
	=> 사용가능메서드 add, get, size, remove 
Set :	순서(X), 중복허용(X)
	=> 사용가능메서드 add, get(X), size, remove
Map :	key, value의 쌍으로 이뤄져 있음
	=> add(X: put), get(key), size, remove
*/