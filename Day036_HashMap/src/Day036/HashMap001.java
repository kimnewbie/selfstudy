package Day036;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap001 {
	public static void main(String[] args) {
		System.out.println("[ver-1. KeySet]");
		
		HashMap<String,String> std = new HashMap<>();
		std.put("스타", "혁재"); std.put("샤인", "지예"); std.put("큐티", "유진"); std.put("낄낄", "하늘"); std.put("GOD", "준홍"); 
		Iterator<String> iter = std.keySet().iterator();
		System.out.println("\n\n==================\n"+"KEY\tVALUE"+"\n==================");
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key+"\t"+std.get(key)+"\n------------------");
		}
		System.out.println("\n[ver-2. Entry]");
		Iterator<Entry<String,String>> std2 = std.entrySet().iterator();
		System.out.println("\n\n==================\n"+"KEY\tVALUE"+"\n==================");
		while(std2.hasNext()) {
			Entry<String,String> temp = std2.next();
			System.out.println(temp.getKey()+"\t"+temp.getValue()+"\n------------------");
		}
	}
}
