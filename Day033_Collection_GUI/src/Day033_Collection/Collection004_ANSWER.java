package Day033_Collection;

import java.util.Vector;

class UserInfo1{ // dto
	private String name;
	private int age;
	//
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	
	//
	public UserInfo1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public UserInfo1() { super();}
	@Override
	public String toString() {
		return "UserInfo1 [name=" + name + ", age=" + age + "]";
	}
	
}
public class Collection004_ANSWER {
	public static void main(String[] args) {
		System.out.println("[ver-1]");
		UserInfo1 test = new UserInfo1("아이언맨",50); System.out.println("test "+test); // [name=아이언맨, age=50]
		
		System.out.println("[ver-2]");
		Vector users = new Vector(); System.out.println(users); // [] 빈공간

		users.add(new UserInfo1("아이언맨",50));
		users.add(new UserInfo1("헐크",40));
		users.add(new UserInfo1("캡틴",120));
		for(int i=0; i<users.size(); i++) {
			System.out.println("USER"+(i+1)+users.get(i));
		}
		System.out.println("[ver-4]");
		for(int i=0; i<users.size(); i++) {
		UserInfo1 temp = (UserInfo1)users.get(i);
		System.out.println("USER" + (i+1) + "\t" +  temp.getName()+ "\t" + temp.getAge());
		}
	}
}
