package Day032;

import java.util.Calendar;

class Outer005{
	String user; //private이 아니어도 getter/setter가 가능했다..
	public String getUser() { return user; } public void setUser(String user) { this.user = user; } 
	
	class Inner1{
		public final static String NAME = "(주) COMPANY";
		String COMPANY_NUM = "2020-05-"+(int)(Math.random()*9)+(int)(Math.random()*9)+(int)(Math.random()*9)+
				(int)(Math.random()*9)+(int)(Math.random()*9);
		
		
	}
	class Inner2{
		private String Serial = "P-" + (int)(Math.random()*9)+(int)(Math.random()*9)+(int)(Math.random()*9)+
				(int)(Math.random()*9)+(int)(Math.random()*9);
		//public Inner2(){this.serial="P-"; for(int i=0; i<5; i++){this.serial += (int)(Math.randon()*10);}
		public String getSerial() { return Serial; }  public void setSerial(String serial) { Serial = serial; } 
	}
}
public class Class005_Inner {
	public static void main(String[] args) {
		Outer005 user1 = new Outer005(); user1.setUser("홍길동");
		Outer005.Inner1 inner1 = new Outer005().new Inner1();
		Outer005.Inner2 inner2 = new Outer005().new Inner2();
		System.out.println("- 사용자명 : " + user1.getUser());
		System.out.println("- 회사명 : "+Outer005.Inner1.NAME);
		System.out.println("- 사업자등록번호 : "+inner1.COMPANY_NUM);
		System.out.println("- 제품시리얼번호 : "+inner2.getSerial());
	}
}
