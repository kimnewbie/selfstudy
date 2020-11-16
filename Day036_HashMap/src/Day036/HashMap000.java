package Day036;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMap000 {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("일","ONE"); map.put("이","TWO"); map.put("삼","THREE"); 
		System.out.println(map.get("일")); // ONE
		System.out.println(map.size()); // 3
		System.out.println(map); // {이=TWO, 일=ONE, 삼=THREE}
		System.out.println(map.remove("삼")); // THREE
		System.out.println(map); // {이=TWO, 일=ONE}
		
		System.out.println("\n\n==================\n"+"KEY\tVALUE"+"\n==================");
//		iterator 사용법 키를 먼저 모을건지, 밸류값까지 모아져있는 걸 구해줄건지
//		map.keySet().iterator(); 1. map에 key들 모은 다음 리스트로 만들기
		Iterator<String> iter = map.keySet().iterator(); 
		while(iter.hasNext()) { // 2. 처리할 대상의 처리유무 : 키 있어? 없어?
			String key = iter.next();
			System.out.println(key + "\t" + map.get(key));	// 3. 키뽑아오기
//			==================
//			KEY	VALUE
//			==================
//			이	TWO
//			일	ONE
		}
		System.out.println("\n\n==================\n"+"KEY\tVALUE"+"\n==================");
//		map.entrySet().iterator(); // Entry<키, 값>
		Iterator<Entry<String,String>> iter2 = map.entrySet().iterator(); // Entry<키, 값>
//		1. map에 <Entry<키,값>>들 모은다음 리스트로 만들기
		while(iter2.hasNext()) { // 2. 처리할 대상의 처리 유무
			Entry<String,String> temp = iter2.next();
			System.out.println(temp.getKey()+"\t"+temp.getValue());
//			==================
//			KEY	VALUE
//			==================
//			이	TWO
//			일	ONE
		}
	}	
}
