package Day035_arrEvent;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet001 {

	public static void main(String[] args) {
		System.out.println("연습문제(1)");
		HashSet<String> ironHash = new HashSet<>();
		ironHash.add("iron"); ironHash.add("hulk"); ironHash.add("captain"); 
		System.out.println(ironHash); // [iron, captain, hulk]
		
		if(ironHash.contains("hulk")) {ironHash.remove("hulk"); ironHash.add("hulk BEST"); };
//		꺼내오기
		Iterator<String> iter = ironHash.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()); /**iron captain hulk*/
		}
		
		System.out.println("\n연습문제(2)");
		HashSet<String> fruitHash = new HashSet<>();
		fruitHash.add("apple"); fruitHash.add("banana"); fruitHash.add("coconut"); fruitHash.add("coconut");
		System.out.println(fruitHash.size()); // 3개
		System.out.println("3개인 이유는 coconut이 중복인데, HashSet은 중복허용x");
		
		Iterator<String> iter2 = fruitHash.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
	}

}
