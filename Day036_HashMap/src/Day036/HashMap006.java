package Day036;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap006 {
	public static void main(String[] args) {
		String[] data = {"A","D","A","D","B","D","A","D","E","C","B"};
		HashMap<String,Integer> map = new HashMap<>();
		for(int i=0; i<data.length; i++) {
			if(map.containsKey(data[i])) {map.put(data[i], (int)(map.get(data[i]))+1);}
			else {map.put(data[i], 1);} // int 까먹지마~
		}
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String temp = iter.next();
			System.out.print(temp + " : ");
			for(int i=0; i<map.get(temp); i++) {System.out.print("#");}
			System.out.println(" "+map.get(temp));
		}
//		System.out.println(map.containsKey("A")); // "A"가 없다면 키등록 map.put("A",1);
//													 "A"가 있다면 키등록 map.put("A",map.get("A")+1);
	}
}
/**
		int a = 0; int b=0; int c=0; int d=0; int e = 0;
		String sharp1 = "";
		
		for(int i=0; i<data.length; i++) {
			if(data[i].equals("A")) {a++;}
			else if(data[i].equals("B")) {b++;}
			else if(data[i].equals("C")) {c++;}
			else if(data[i].equals("D")) {d++;}
			else if(data[i].equals("E")) {e++;}
		}
		for(int i=0; i<a; i++) {
			sharp1 += "#";
		}
		System.out.println(shap1 + a);
*/