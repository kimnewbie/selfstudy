package Day036;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMap004 {

	public static void main(String[] args) {
		String id = ""; String pass= "";
		Scanner sc = new Scanner(System.in);
		HashMap map = new HashMap();
		map.put("first", "1111"); map.put("second", "2222"); map.put("third", "3333"); 
		while(true) {
			System.out.println("id와 password를 입력해주세요."); 
			System.out.print("id > "); id = sc.next();
			System.out.print("pass > "); pass = sc.next();
			if(map.containsKey(id)) {
				if(map.get(id).equals(pass)) { // 키를 줄게 값을 다오 --- 사용자가 입력한 값이 같다면
					System.out.println("id와 비밀번호가 일치합니다.");
				} else {System.out.println("비밀번호를 확인해주세요. 다시 입력해주세요");}
			} else {
				System.out.println("입력한 유저는 존재하지 않습니다.\n다시 입력해주세요");
			}
		}
//		Iterator<Entry<String,String>> iter = map.entrySet().iterator();
//		while(iter.hasNext()) {
//			Entry<String,String> temp = iter.next();
//			if(id.equals(temp.getKey())&&pass.equals(temp.getValue())) {
//				System.out.println("id와 pass같음");}
//			else if(id.equals(temp.getKey())&&!pass.equals(temp.getValue())) {
//			System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");}
//			else if (!(id.equals(temp.getKey()))&&pass.equals(temp.getValue())) {
//				System.out.println("입력하신 유저는 존재하지 않습니다. 다시 입력해주세요.");}//				
//			
//		}
	}	
}
