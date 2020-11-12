package Day035_arrEvent;

import java.util.HashSet;
import java.util.Iterator;

class Milk{
	private String mname;
	private int mprice;
	
	public String getMname() { return mname; } public void setMname(String mname) { this.mname = mname; }
	public int getMprice() { return mprice; } public void setMprice(int mprice) { this.mprice = mprice; }
	
	public Milk() { super(); }
	public Milk(String mname, int mprice) { super(); this.mname = mname; this.mprice = mprice; }
	
	@Override public String toString() { return "Milk [mname=" + mname + ", mprice=" + mprice + "]"; }	
}
public class HashSet002 {
	public static void main(String[] args) {
		HashSet<Milk> menu = new HashSet<Milk>();
//		menu.add(new Milk("바나나우유",1300));
//		menu.add(new Milk("메론맛우유",1800));
//		menu.add(new Milk("커피우유",1500));
//		menu.add(new Milk("커피우유",1500));
		Milk[] milks = {new Milk("바나나우유",1300),new Milk("메론맛우유",1800),new Milk("커피우유",1500),new Milk("커피우유",1500)};
		for(int i=0; i<milks.length; i++) {menu.add(milks[i]);}
		System.out.println(menu.size());
		System.out.println("4개, new를 해서 주소를 생성했으므로 커피우유의 주소가 각각 다르다");
		
		System.out.println("----------------------------");
		System.out.println("NAME\tPRICE");
		System.out.println("----------------------------");
		
		Iterator<Milk> iter = menu.iterator();
		while(iter.hasNext()) {
			Milk temp = (Milk) iter.next();
			System.out.println(temp.getMname()+"\t"+temp.getMprice()+"\n----------------------------");
		}
	}
}
