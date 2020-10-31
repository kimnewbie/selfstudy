package ClassArr003;

public class ClassArr003 {
	public static void main(String[] args) {
		Apple[] user1 = new Apple[3]; //[null|null|null]
		user1[0] = new Apple();	//user1[0].setName("APPLE"); user1[0].setNum(1); user1[0].setPrice(1000); user1[0].setOrder("홍길동");
		user1[1] = new Apple(); 
		user1[2] = new Apple();
		//System.out.println(user1[0]); Apple [order=홍길동, name=APPLE, num=1, price=1000]
		
		Apple_Print1 print = new Apple_Print1(); //출력을 따로 해주는 클래스
		print.show(user1[0]); //리턴값 void, 메서드명 show, 파라미터 Apple
		print.show(user1); //리턴값 void, 메서드명 show, 파라미터 Apple[] user1
	}
}
