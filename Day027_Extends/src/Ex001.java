class CA extends Object{	//★★해설다시봐

	//멤버변수
	private int a;
	//멤버함수
	public int getA() { return a; } public void setA(int a) { this.a = a; }
	@Override
	public String toString() {return "CA [a=" + a + "]";}
	//생성자
	public CA() {
			super(); 
			System.out.println("[CA()] 1. CA안의 a변수 : 인스턴스변수 a를 사용할 수 있게 생성자가 초기화");
			System.out.println("\t"+this.toString());
				
	}
	public CA(int a) { super(); this.a = a; }	
}
class CB extends CA{
	
	//멤버변수
	private int b;
	
	//멤버함수
	public int getB() { return b; } public void setB(int b) { this.b = b; }
	@Override
	public String toString() { return "CB [b=" + b + "]"; }
	
	//생성자
	public CB() {
		super(); 
		System.out.println("[CB()] 2. CB안의 b변수 : 인스턴스변수 b를 사용할 수 있게 생성자가 초기화");
		System.out.println("\t"+this.toString());
		
}
	public CB(int a) { super(a); }	
}

public class Ex001 {
	public static void main(String[] args) {
		System.out.println("1-1. 상속이란 객체를 재활용하는 것이 목적임");
		System.out.println("1-2. 상속을 하려면 기존의 어떤 클래스가 먼저 생성되어야 함");
		System.out.println("1-3. 클래스 생성순서 Object=> CA => CB");
		CB fishbread = new CB();
		//생성되는 순서 : Object > CA > CB
		//호출되는 순서 : CB > CA > Object
		//-----------------------------------
		//객체 => 클래스 : 어떤 사물을 나타낼때는 상태(멤버변수)와 행위(멤버함수)로 구분하여 표시하는 것이 가능하다.
		//	Object	 [멤버변수  		 /멤버함수	] ---> 틀만 만든 것
		//	CA		 [멤버변수 : a=0	 /멤버함수: 			--------, getA, setA	] 
		//	CB		 [멤버변수 : b=0	 /멤버함수: @Override toString, getB, setB	] 
		//										Override되서 CA부분 String이 덮이게됨
	}
}
