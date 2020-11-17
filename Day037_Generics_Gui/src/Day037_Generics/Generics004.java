package Day037_Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

class MilkDto1{
	private int mno;
	private String mname;
	private int mprice;
	public int getMno() { return mno; } public void setMno(int mno) { this.mno = mno; }
	public String getMname() { return mname; } public void setMname(String mname) { this.mname = mname; }
	public int getMprice() { return mprice; } public void setMprice(int mprice) { this.mprice = mprice; }
	public MilkDto1() {}
	public MilkDto1(int mno, String mname, int mprice) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.mprice = mprice;
	}
	@Override
	public String toString() {
		return "MilkDto1 [mno=" + mno + ", mname=" + mname + ", mprice=" + mprice + "]";
	}	
	
}
class WildPrint<K>{ // 어떤자료형이 와도 그 형식에 맞게 출력해주는 클래스 <알파벳>
	K ob;
	public WildPrint() {}
	public WildPrint(K k) {
		super();
		this.ob = ob;
	}
	public void show(){
		
		System.out.println("======================");
		System.out.println("NO\tNAME\tPRICE");
		System.out.println("======================");
		
		if(ob instanceof ArrayList) {
			Iterator iter = ((ArrayList) ob).iterator();
			while(iter.hasNext()) {
				MilkDto1 temp = (MilkDto1)iter.next();
				System.out.println(temp.getMno()+"\t"+temp.getMname()+"\t"+temp.getMprice());
			} System.out.println();
		} 
		
		else if(ob instanceof HashSet) {
			Iterator iter = ((HashSet) ob).iterator();
			while(iter.hasNext()) {
				MilkDto1 temp = (MilkDto1)iter.next();
				System.out.println(temp.getMno()+"\t"+temp.getMname()+"\t"+temp.getMprice());
			} System.out.println();
		}
		
		else if(ob instanceof HashMap) {
			Iterator<Entry<Integer,MilkDto1>> iter = ((HashMap) ob).entrySet().iterator();
			while(iter.hasNext()) {
				Entry<Integer,MilkDto1> temp = iter.next();
				System.out.println(temp.getValue().getMno()+"\t"+temp.getValue().getMname()+"\t"+temp.getValue().getMprice());
			}
		}
	}	
}
public class Generics004 {
	public static void main(String[] args) {
//		TEST001
		System.out.println("\n■ [001] Arraylist");
		ArrayList<MilkDto1> list = new ArrayList<MilkDto1>();
		list.add(new MilkDto1(1,"white",1000));
		list.add(new MilkDto1(2,"choco",1200));
		
		System.out.println("\n■ [002] HashSet");
		HashSet<MilkDto1> set = new HashSet<MilkDto1>();
		set.add(new MilkDto1(1,"white",1000));
		set.add(new MilkDto1(2,"choco",1200));
		
		System.out.println("\n■ [003] HashMap");
		HashMap<Integer,MilkDto1> map = new HashMap<Integer,MilkDto1>();
		map.put(1, new MilkDto1(1,"white",1000));
		map.put(2, new MilkDto1(2,"choco",1200));
		
//		1. 와일드카드사용시
		WildPrint<?> print = new WildPrint<ArrayList>(list); print.show();
				 	 print = new WildPrint<HashSet>(set); print.show();
					 print = new WildPrint<HashMap>(map); print.show();
	}
}
