package Day035_arrEvent;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

class UserInfo{ // DTO
	private String name;
	private int age;
	//
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	//
	public UserInfo() {  }
	public UserInfo(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
//	@Override
//	public String toString() {
//		return  name + age;
//	}	
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + "]";
	}
	
}
public class ArrayList003 {

	public static void main(String[] args) {
		UserInfo user = new UserInfo(); System.out.println(user); //UserInfo [name=null, age=0]
		ArrayList users = new ArrayList();
		
		UserInfo[] data = {new UserInfo("IRON",50),new UserInfo("HULK",40),new UserInfo("CAPTAIN",120)};
		
		for(int i=0; i<data.length; i++) {users.add(data[i]);}
		
		String result = "";
		System.out.println("===============");
		System.out.println("NAME\tAGE");
		System.out.println("===============");
		for(int i=0; i<users.size(); i++) {
			UserInfo temp = (UserInfo)users.get(i);
			System.out.println(temp.getName()+"\t"+temp.getAge());
			System.out.println("--------------------");
			result += temp.getName()+"   \t"+temp.getAge()+"\n--------------------\n";
		}
//		for(int i=0; i<data.length; i++) { System.out.println(data[i].getName()+"     \t"+data[i].getAge()); }
		JOptionPane.showMessageDialog(null, result);
	}

}
