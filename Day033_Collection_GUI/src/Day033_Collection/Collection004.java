package Day033_Collection;

import java.util.Vector;

class UserInfo{ // dto
	private String name;
	private int age;
	//
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	@Override public String toString() { return  ":" + name + " / "+ age ; }
	//
	public UserInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public UserInfo() { super();}
	
}
public class Collection004 {
	public static void main(String[] args) {
		Vector USER = new Vector();
		int no_cnt=0;
		USER.add(new UserInfo("아이언맨",50));
		USER.add(new UserInfo("헐크",40));
		USER.add(new UserInfo("캡틴",120));
		for(int i=0; i<USER.size(); i++) {
			System.out.println("USER"+(i+1)+USER.get(i));
		}
	}
}
