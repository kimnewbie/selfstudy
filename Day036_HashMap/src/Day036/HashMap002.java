package Day036;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMap002 {
	public static void main(String[] args) {
		HashMap<String,String> ppl = new HashMap<>();
		ppl.put("피구왕", "통키"); ppl.put("제빵왕", "김탁구"); ppl.put("요리왕", "비룡"); 
		Iterator<String> iter = ppl.keySet().iterator();
		System.out.println("\n\n==================\n"+"KING\tNAME"+"\n==================");
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key+"\t"+ppl.get(key)+"\n------------------");
		}
		Iterator<Entry<String,String>> iter2 = ppl.entrySet().iterator();
		Scanner sc = new Scanner(System.in);
		System.out.print("KING의 정보를 제공중입니다"+"\n이름을 입력하세요 > ");
		String name = sc.next();
		while(iter2.hasNext()) {
			Entry<String,String> temp = iter2.next();
			if(name.equals(temp.getKey())) {System.out.println("\nㅁ"+temp.getKey()+" : "+temp.getValue());}
			else {System.out.println("왕의 이름을 확인해주세요");}
		}		
		System.out.println("KING 몇명? "+ppl.size());
	}
}
