package Day037_Generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics001 {
	public static void main(String[] args) {
		int total = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10); list.add(20); list.add(30);
		
		Iterator<Integer> iter = list.iterator(); // <Integer> 써줘야만 실행
		while(iter.hasNext()) {
			total += iter.next();
		} 
		System.out.println("평균 : " + total/list.size()); // 20
	}
}
