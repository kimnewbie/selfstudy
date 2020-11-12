package Day035_arrEvent;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet000 {
	public static void main(String[] args) {
		System.out.println("\n001. List");
		ArrayList<String> milks = new ArrayList<>();
		milks.add("WHITE"); milks.add("WHITE"); milks.add("CHOCO"); milks.add("BANANA");
		System.out.println("1-1 : " + milks); // [WHITE, WHITE, CHOCO, BANANA]
		System.out.println("1-2 순서가 있기 때문에 get 사용 가능 : " + milks.get(0));
		System.out.println("1-3 개수 : " + milks.size()); // 4개
		
		System.out.println("\n0002. Set : 순서[X], 데이터 중복허용 [X]");
		HashSet<String> milks2 = new HashSet<>();
		milks2.add("WHITE"); milks2.add("WHITE"); milks2.add("CHOCO"); milks2.add("BANANA");
		System.out.println("2-1 : " + milks2); // [WHITE, CHOCO, BANANA]
		System.out.println("2-2 꺼내오기에서 get 있나?: get을 이용해서 꺼내오는 방법이 없음" /** + milks2.get(0) */);
		System.out.println("2-3 개수 : " + milks2.size()); // 3개
//		remove()인덱스x순서가x 그래서 이름
		System.out.println("2-4 삭제 : " + milks2.remove("BANANA") + "\t" + milks2); //true	[WHITE, CHOCO]
		System.out.println("2-5 get대신에 쓸 수 있는 것. 포함하고 있다 - contains: "+milks2.contains("WHITE"));
		System.out.println("2-6 get대신에 쓸 수 있는 것. literator"); // iterator 반복자
		Iterator<String> iter = milks2.iterator(); //[1] set모으기
//		1. 												set에 들어가 있는 것 (요소, WHITE, CHOCO, ..) 들 모아서 iter가 가리키게
//						 iter →	[WHITE, CHOCO,BANANA]
		while(iter.hasNext()) { //[2] hasNext() 처리할 대상있는지 확인 - true
			System.out.println(iter.next()); //[3] 꺼내오기
		}
		
	}
}
