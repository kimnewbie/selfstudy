package Day037_Generics;

import java.util.ArrayList;
import java.util.Iterator;

class GUserInfo{
	private String name;
	private int age;
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	public GUserInfo() { super(); }
	public GUserInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override public String toString() { return "GUserInfo [name=" + name + ", age=" + age + "]"; }	
}
public class Generics002 {
	public static void main(String[] args) {
		ArrayList<GUserInfo> list = new ArrayList<>(); // GUserInfo 자료형만 입력받겠다
		list.add(new GUserInfo("아이언맨",50));
		list.add(new GUserInfo("헐크",40));
		list.add(new GUserInfo("캡틴",120));
		
		Iterator<GUserInfo> iter = list.iterator();
		int total = 0;
		while(iter.hasNext()) {
			GUserInfo temp = iter.next(); // Iterator<GUserInfo> iter <GUserInfo> 없으면 형변환해줘야해~
			total += temp.getAge();
		}
		System.out.println("평균나이 : " + total/list.size() +"살");
	}
}
