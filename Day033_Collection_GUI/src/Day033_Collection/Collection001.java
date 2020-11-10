package Day033_Collection;

import java.util.Vector;

public class Collection001 {
	public static void main(String[] args) {
		System.out.println("\n[001] Vector");
		System.out.println("[1-1] CRUD : add, get, size, remove"); // --> 남이 만든거 사용하긔~~
		
		// 도라에몽 요술주머니   ༼ʘ̅͜ʘ̅༽'☂ 
		Vector vec = new Vector(); // ctrl+shitft + o --> import java.util.Vector;
		vec.add(100); // vec.add(object e)
		vec.add(new Integer(100)); // 아직까진 호환 가능하지만 위에껄 씀
		vec.add(3.14);				vec.add("abc"); // 오토박싱
		vec.add(new Double(3.14));	vec.add(new String("abc"));
		
		System.out.println("1.요술주머니 : " + vec);
		System.out.println("2.요술주머니에 create - 데이터삽입은 add");	//임의의 숫자 0을 넣어줌
		System.out.println("3.get을 이용해서 데이터 꺼내오기 : " + vec.get(0)); // get 순서가 있을 때만 사용 가능해 index라 번호
		System.out.println("4.size는 개수 : "+ vec.size());
		System.out.println("5.remove는 삭제 : "+ vec.remove(1) + " / " + vec.remove("abc")); // 100 / true
		System.out.println(vec);
	}
}
