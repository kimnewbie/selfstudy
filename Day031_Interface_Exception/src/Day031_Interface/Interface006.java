package Day031_Interface;

import java.util.Arrays;
import java.util.Scanner;

class UserInfo{ //model의 역할
	public static int ucnt = 0;
	private int uno; private String uid, upass;

	public static int getUcnt() { return ucnt; }  public static void setUcnt(int ucnt) { UserInfo.ucnt = ucnt; }
	public int getUno() { return uno; }  public void setUno(int uno) { this.uno = uno; }
	public String getUid() { return uid; }  public void setUid(String uid) { this.uid = uid; }
	public String getUpass() { return upass; }  public void setUpass(String upass) { this.upass = upass; }
	
	public UserInfo() { super(); this.uno=++ucnt;}
	public UserInfo(String uid, String upass) {		
		this.uid = uid;
		this.upass = upass;
	}
	public UserInfo(int uno, String uid, String upass) {
		super();
		this.uno = ++ucnt; // 설정 1,2,3 올라가게
		this.uid = uid;
		this.upass = upass;
	}
	@Override // System.out.println(Arrays.toString(users)); 이거 땜에
	public String toString() {
		return "UserInfo [uno=" + uno + ", uid=" + uid + ", upass=" + upass + "]";
	} 	
	
}
interface Menu{
	void menu();
	void create();
	void read();
}
class Using001 /* extends UserInfo */implements Menu{ //이때 호출해서 cnt가 처음에 1로 변한거였음
	UserInfo[] users;
	static int usercnt = 0;
	Scanner scanner;
	int num = 0;
	
	public Using001() { users = new UserInfo[3]; scanner = new Scanner(System.in); }
	
	
	@Override public void menu() { //메뉴만
		while(true) {
				System.out.println(Arrays.toString(users)); //입력잘받았는지 써줌
				System.out.println("=== 메뉴를 선택하시오.");
				System.out.println("1. 추가");
				System.out.println("2. 조회"); 
				System.out.println("9. 종료"); 
				System.out.print("= 선택 >> "); num = scanner.nextInt();		
				switch(num) {
					case 1 : create(); break;
					case 2 : read(); break;
				} if(num==9) {break;}
		} //end while
	}
	@Override public void create() { //유저입력받아주는 기능
		//												UserInfo의 길이가 달라질 수 있네!!!!!
		if(usercnt>2) {System.arraycopy(users, 0, users = new UserInfo[users.length+1], 0, usercnt);} //입력하는 대로 계속 받기
	//if(usercnt>users.length) 로 사용가능
			users[usercnt] = new UserInfo();			
			System.out.println("===========================");
			System.out.println("유저정보 입력");
			System.out.println("==========================="); 
			System.out.print("ID 입력 : "); users[usercnt].setUid(scanner.next());
			System.out.print("PASS 입력 : "); users[usercnt].setUpass(scanner.next()); 
			usercnt++;
		
	}
	@Override public void read() { //출력
		
		System.out.println("===========================");
		System.out.println("NO\tID\tPASS");
		System.out.println("===========================");
		for(int i=0; i<usercnt; i++) { //i<users.length; 로 했더니 오류나서 (무조건3개 차있어야해서) usercnt로 했더니 오류 x
			System.out.println(users[i].getUno()+"\t"+users[i].getUid()+"\t"+users[i].getUpass());
		}
	}
}
public class Interface006 {
	public static void main(String[] args) {
		Using001 user = new Using001();
		user.menu();
	}
}
