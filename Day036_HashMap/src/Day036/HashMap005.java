package Day036;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class HashMap005 {
	public static void main(String[] args) {
		int total = 0; int max=0; int min = 0; double avg = 0;
		
		HashMap map = new HashMap();
		map.put("first", new Integer(90));
		map.put("second", new Integer(88));
		map.put("third", new Integer(100));
		map.put("fourth", new Integer(72));
		map.put("fifth", new Integer(94));
		
		System.out.println("참가자 명단 : " + map.keySet()); // [third, fifth, fourth, first, second]
		
		Iterator<String> iter = map.keySet().iterator(); 
		while(iter.hasNext()) {
			String key = iter.next();	
			System.out.println(map.get(key));
			total += (int)map.get(key);
			avg = (double)total/map.size();
		}
		Collection values = map.values(); // value 값만 모을 수 있음
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + String.format("%.1f", avg));
		System.out.println("최고점수 : " + Collections.max(values));
		System.out.println("최저점수 : " + Collections.min(values));
		
	}
}
