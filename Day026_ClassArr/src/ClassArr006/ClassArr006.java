package ClassArr006;

public class ClassArr006 {
	public static void main(String[] args) {
		Money_ver2[] users = new Money_ver2[]
				{new Money_ver2("aaa",10000), new Money_ver2("bbb",20000),new Money_ver2("ccc",30000)};
		
		MoneyShow_ver2 print = new MoneyShow_ver2();
		print.show(users[0]); //리턴값 void,메서드명 show, 파라미터 Money_ver2[] users--> 자동생성했을 때 파라미터 값이 이럼..
		print.show(users); //리턴값 void,메서드명 show, 파라미터 Money_ver2 users
	}
}
