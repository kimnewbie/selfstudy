package Day036;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMap003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> site = new HashMap();
		site.put("danawa", "www.danawa.net");
		site.put("naver", "www.naver_kid.com");
		site.put("daum", "www.daum_kidco.kr");
		System.out.println(site.keySet()); // [danawa, naver, daum]
		

//		Iterator<String> iter2 = site.keySet().iterator();
//		System.out.print("[");
//		while(iter2.hasNext()) {
//			String qes = iter2.next();
//			if(iter2.hasNext()) {System.out.print((qes+","));}
//			else {System.out.print(qes);}
//		}		
//		System.out.println("]");
		
		Iterator<Entry<String,String>> iter = site.entrySet().iterator();
		System.out.println("");
		String name = "";
		System.out.print("\n사이트 키 값을 입력하세요 : "); name = sc.next();
		while(iter.hasNext()) {
			Entry<String,String> temp = iter.next();
			if(name.equals(temp.getKey())) {System.out.println("value : " + temp.getValue());}
			else {System.out.println("키 값이 존재하지 않습니다.");}
		}
	}
}
