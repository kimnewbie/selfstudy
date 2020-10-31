package ClassArr005;

public class ClassArr005 {
	public static void main(String[] args) {
		Money_ver1[] users = new Money_ver1[]
				{new Money_ver1("aaa",10000), new Money_ver1("bbb",20000),new Money_ver1("ccc",30000)};
		
		MoneyShow_ver1 print = new MoneyShow_ver1();
		print.show(users[0]); //리턴값 void,메서드명 show, 파라미터 MoneyShow_ver1[] users--> 자동생성했을 때 파라미터 값이 이럼..
		print.show(users); //리턴값 void,메서드명 show, 파라미터 MoneyShow_ver1 users
	}
}
