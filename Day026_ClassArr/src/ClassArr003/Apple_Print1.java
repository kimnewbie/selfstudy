package ClassArr003;

public class Apple_Print1 {
	//멤버변수 X
	//멤버함수 O
	public void show(Apple[] user) { 
		//System.out.println(user); [LClassArr003.Apple;@36aa7bc2
		for(int i=0;i<user.length;i++) {
		System.out.println(":::::: APPLE ORDER\nORDER\t: "+user[i].getOrder()+
				"\nNAME\t: "+user[i].getName()+"\nNUM\t: "+user[i].getNum()+
				"\nPRICE\t: "+user[i].getPrice()); }
	}
	
	public void show(Apple user) { 
		System.out.println(":::::: APPLE ORDER\nORDER\t: "+user.getOrder()+"\nNAME\t: "+user.getName()
		+"\nNUM\t: "+user.getNum()+"\nPRICE\t: "+user.getPrice());
	}
	
	//생성자 O
	public Apple_Print1() { super(); }
	
}