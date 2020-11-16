package Day036;
import java.util.Vector;

import javax.swing.JOptionPane;

class UserInfo{
	private String name;
	private int age;
	
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	
	public UserInfo() { super(); }
	public UserInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; } 
}
public class Day036_1 {
	public static void main(String[] args) {
		Vector avengers = new Vector();
		UserInfo[] users = {new UserInfo("IRON",50),new UserInfo("HULK",40),new UserInfo("CAPTAIN",120)};
		for(int i=0; i<users.length; i++) {avengers.add(users[i]);}
		
		System.out.println("==============" +"\nNAME\tAGE"+"\n==============");
		String result = "";
		for(int i=0; i<users.length; i++) {
			UserInfo temp = (UserInfo) avengers.get(i);
			System.out.println(temp.getName()+"\t"+temp.getAge());
			System.out.println("--------------");
			result += temp.getName()+"\t"+temp.getAge()+"\n--------------------\n";
		}
		JOptionPane.showMessageDialog(null, result);
	}
}
