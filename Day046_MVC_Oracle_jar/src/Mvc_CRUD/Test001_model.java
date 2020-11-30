package Mvc_CRUD;

import java.util.ArrayList;
import java.util.Iterator;

class YJ_Dto{
	public static int cnt = 0;
	private int no;
	private String name;
	//
	public YJ_Dto(String name ) { super(); this.no = ++cnt; this.name = name; }
	public YJ_Dto() { super(); }
	public YJ_Dto(int no, String name) { super(); this.no = no; this.name = name; }
	//
	@Override public String toString() { return "YJ_Dto [no=" + no + ", name=" + name + "]"; }
	//
	public int getNo() { return no; } public void setNo(int no) { this.no = no; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
}
public class Test001_model {
	public static void main(String[] args) {
//		model
//		1-1. dto : no, name
		YJ_Dto user = new YJ_Dto(1, "aaa@gmail.com"); System.out.println("1-1. dto" + user);
		YJ_Dto user2 = new YJ_Dto("bbb@gmail.com"); System.out.println("1-2. dto" + user2);
//		1-2. arrayList
		ArrayList<YJ_Dto> users = new ArrayList<YJ_Dto>();
		System.out.println("2.ArrayList : " + users);
		
//		1-3. crud
//		c : Create 사용자에게 이메일 입력받아서 리스트에 등록
		users.add(new YJ_Dto("ccc@gmail.com"));
		users.add(new YJ_Dto("ddd@gmail.com"));
		System.out.println(users);
//		r : Read전체 사용자 출력
		Iterator<YJ_Dto> iter = users.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
//		u : Update 사용자에게 번호 입력받아서 일치하는 번호가 있다면 입력받은 사용자 이메일 업데이트 시키기
		/* Iterator<YJ_Dto> */iter = users.iterator();
		while(iter.hasNext()) {
			YJ_Dto temp = iter.next();
			if(temp.getNo()==2) {
				iter.remove(); users.add(new YJ_Dto(2, "abc@gmail.com")); break;
			}
		} System.out.println(users);
//		d : Delete 사용자 번호 받아서 삭제하기 
		users.remove(1);
		System.out.println(users);
	}
}
