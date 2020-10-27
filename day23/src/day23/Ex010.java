package day23;
class A010{
	int a; // 인스턴스변수 (heap : new해야지만 사용이 가능)
	
	static String company = "(주)구글"; 
	//ㄴ클래스 변수([클래스명.변수명] 형식만으로 사용이 가능함/지금 당장 쓸 수 있어야 하는데 사용자가 new 한적이 없으므로 사용불가)
	
	public 		  void show(int c) {/*지역변수*/ System.out.println(this.a);}
	//public static void setCompany() {a = "(주)네이버";}
	//ㄴ클래스메서드 (지금 당장 쓸 수있어야 하는데 new 한적이 없으므로 사용불가능)
	//비교
	public static void setCompany() {company = "(주)네이버";}
	public A010() {super();}
	public A010(int a) {super(); this.a = a;}
	//this.a = 인스턴스 변수
	//a=지역변수
}
public class Ex010 {
	public static void main(String[] args) {
		System.out.println("Q10. 다음 중 this에 대한 설명으로 옳지 않은 것은?(모두 고르시오)"); 
		System.out.println("a. 객체 자신을 가리키는 참조변수이다.");
		System.out.println("b. 클래스내에서라면 어디서든 사용할 수 있다."); // 클래스 메서드 안에서는 사용 불가/ 인스턴스 메서드에서도 사용 가능하다
		System.out.println("c. 지역변수와 인스턴스 변수를 구별할 때 사용한다.");
		System.out.println("d. 클래스 메서드 내에서는 사용할 수 없다."); 
		//static 메서드는 인스턴스를 생성하지 않고도 호출될 수 있으므로 static메서드가 호출된 시점에 인스턴스가 존재하지 않을 수도 있기 때문
		System.out.println();
		System.out.println();
		System.out.println("답 : b");
		A010.setCompany();
		System.out.println("new안하고도 쓸수있는 static"+ A010.company );
	}
}
