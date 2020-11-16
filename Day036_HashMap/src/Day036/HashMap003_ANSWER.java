package Day036;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMap003_ANSWER {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,String> site = new HashMap();
		site.put("danawa", "www.danawa.net");
		site.put("naver", "www.naver_kid.com");
		site.put("daum", "www.daum_kidco.kr");
		System.out.println(site.keySet()); // [danawa, naver, daum]

		String name = "";
		System.out.print("사이트 키값을 입력하세요 > ");
		name = sc.next();
			if(site.containsKey(name)) {System.out.println("value : " + site.get(name));}
			else {System.out.println("키 값이 존재하지 않습니다.");}
	}
}
