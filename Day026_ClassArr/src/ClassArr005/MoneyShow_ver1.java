package ClassArr005;

public class  MoneyShow_ver1{ // 출력기능을 하는 역할입니당~~
	
	public void show(Money_ver1 users) {
		this.greeting();
		System.out.println("[USER] "+users.getUser_name()+"고객님의 정보입니다.");
		System.out.println("잔액 : "+users.getUser_won()+"원");
	}
	public void show(Money_ver1[] users) {
		this.greeting();			
		System.out.println("[USER]	NAME	BALANCE");
		for(int i=0; i<users.length; i++) {
		System.out.println("--------------------------------");
		System.out.println("USER" +"\t"+ users[i].getUser_name()+"\t"+ users[i].getUser_won()+"원");
		}
	} 
	void greeting() { //위에 반복됨
		System.out.println("=======================================");
		System.out.println(":::::::::::::: WELCOME! GREEN BANK");
		System.out.println("=======================================");		
	}
	//생성자
		public MoneyShow_ver1() { super(); }
}
