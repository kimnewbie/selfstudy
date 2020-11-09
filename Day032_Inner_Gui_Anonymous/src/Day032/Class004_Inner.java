package Day032;
class Outer004{
	int value = 10;
	class Inner{
		int value = 20;
		void method1() {
			int value = 30; // value
			System.out.println(				 	   value); // 30
			System.out.println(			  	  this.value); // 20 | 인스턴스 변수는 this로 구분하기로 했었으니까
			System.out.println(Outer004.Inner.this.value); // 20 | 인스턴스 변수는 this로 구분하기로 했었으니까
			System.out.println(			Inner.this.value); // 20 | 인스턴스 변수는 this로 구분하기로 했었으니까
			System.out.println(		new Outer004().value); // 10 |
			System.out.println(		 Outer004.this.value); // 10 |  
		}
	}	
}
public class Class004_Inner {
	public static void main(String[] args) {
		System.out.println("다음과 같은 실행결과를 얻도록 코드를 완성하시오.");
		
		System.out.println("[ver-1]");
		Outer004 outer = new Outer004();
		Outer004.Inner inner = outer.new Inner();
		inner.method1();
		
		System.out.println("\n[ver-2]");
		Outer004.Inner inner2 = new Outer004().new Inner();
		inner2.method1();
	}
}
