package Day036;
import java.util.HashSet;
import java.util.Iterator;

class UserInfo1{
	private String name;
	private int age;
	
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	
	public UserInfo1() { super(); }
	public UserInfo1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }	
}
public class Day036_2 {	
	public static void main(String[] args) {
		HashSet avengers = new HashSet();
		UserInfo1[] users = {new UserInfo1("IRON",50),new UserInfo1("HULK",40),new UserInfo1("CAPTAIN",120)};
		for(int i=0; i<users.length; i++) {avengers.add(users[i]);}
		System.out.println("==============" +"\nNAME\tAGE"+"\n==============");
		
		Iterator<UserInfo1> iter = avengers.iterator();
		while(iter.hasNext()) {
			UserInfo1 temp = (UserInfo1) iter.next();
			System.out.println(temp.getName()+"\t"+temp.getAge());			
		}		
	}
}
