package Class;
class MyMath2{
	
	long a, b;			//iv
	
	long add() {//인스턴스매서드
		return a + b;	//iv (왜? 매개변수(파라미터)x & 가까운 쪽이 iv)
	}
	
	static long add(long a, long b) { //클래스메서드(static),lv
		return a + b;	//lv 파라미터가 lv라서!
	}
}
public class StaticMethod_IM {
	public static void main(String[] args) {		 //class_name.Method
		System.out.println(MyMath2.add(200L, 100L)); //MyMath2클래스에 호출, 객체 생성없이 호출 가능
		MyMath2 mm = new MyMath2(); //인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;	//▼참조변수사용해서 호출
		System.out.println(mm.add()); //인스턴스메서드에서 호출
	}//end main
}//end class
