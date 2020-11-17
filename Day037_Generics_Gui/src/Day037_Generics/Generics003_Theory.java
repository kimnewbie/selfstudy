package Day037_Generics;

import java.util.ArrayList;

class Wild001<Integer>{ //<Integer> 자료형 붙이니까 없어짐
	private int a;
	public Wild001() {}
	public Wild001(int a) { super(); this.a = a; }
	public int getA() { return a; } public void setA(int a) { this.a = a; }	
	
}
class Wild002<String>{
	private String a;
	public Wild002() {}
	public Wild002(String a) { super(); this.a = a; }
	public String getA() { return a; } public void setA(String a) { this.a = a; }	
}
class Wild<Object>{
	private Object a;
	public Wild() {}
	public Object getA() { return a; } public void setA(Object a) { this.a = a; }
	public Wild(Object a) {
		super();
		this.a = a;
	}	
}
class Wild2<K>{ // <>안에 원하는 알파벳 써보기
	private K a;
	public Wild2() {}
	public Wild2(K a) { super(); this.a = a; }
	public K getA() { return a; }  public void setA(K a) { this.a = a; }	
}	
public class Generics003_Theory {
	public static void main(String[] args) {
		System.out.println("\n[ver-0]제네릭0");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		
		System.out.println("\n[ver-1]제네릭1");
		Wild001<Integer> t1 = new Wild001<Integer>(100);
		System.out.println("1-1) 기본제네릭스 이용 : " + t1.getA());
		Wild002<String> t2 = new Wild002<String>("abc");
		System.out.println("1-2) 기본제네릭스 이용 : " + t2.getA() + "\n\n\n");
		
		System.out.println("\n[ver-2]제네릭2 => TEST");
		Wild<Integer> w1 = new Wild<Integer>(100);
		System.out.println("1) 와일드카드를 이용 : " + w1.getA());
		Wild<String> w2 = new Wild<String>("씨리얼");
		System.out.println("2) 와일드카드를 이용 : " + w2.getA());
		Wild<Double> w3 = new Wild<Double>(3.14);
		System.out.println("3) 와일드카드를 이용 : " + w3.getA());
		
		System.out.println("\n[ver-3]제네릭3 => TEST");
		Wild2<Object> w20 = new Wild2<Object>(100);
		System.out.println("0) 와일드카드를 이용 : " + w20.getA());
		Wild2<Integer> w21 = new Wild2<Integer>(100);
		System.out.println("1) 와일드카드를 이용 : " + w21.getA());
		Wild2<String> w22 = new Wild2<String>("씨리얼");
		System.out.println("2) 와일드카드를 이용 : " + w22.getA());
		Wild2<Double> w23 = new Wild2<Double>(3.14);
		System.out.println("3) 와일드카드를 이용 : " + w23.getA());
		
		System.out.println("\n[ver-4]제네릭4 => TEST");
		Wild2<?> q1 = w21; // 만들어놓은 거 w21 대입 <부모는 자식을 담을 수 있다>
		System.out.println("1) 와일드카드를 이용 : " + q1.getA());
		Wild2<?> q2 = new Wild2<String>("씨리얼");
		System.out.println("2) 와일드카드를 이용 : " + q2.getA());
		Wild2<?> q3 = new Wild2<Double>(3.14);
		System.out.println("3) 와일드카드를 이용 : " + q3.getA());
		

		System.out.println("\n[ver-5]제네릭5 - 변수의 제한(extends '하위'타입만 지정 가능/super '상위'타입만 지정 가능");
		Wild2<? extends Number> ten = w21;// 제약 걸기 밑에만 쓸거야!Number 엄마 INTEGER 자식 그래서 w21 인티져 삽입가능
		System.out.println(ten.getA());
		ten = w23;
		System.out.println(ten.getA());
//		ten = w20; // w20은 object(부모)라서 노노
		
		Wild2<? super Number> ten2 = w20; // Number의 부모만 => Object - Number - Integer
		System.out.println(ten2.getA());
		ten2 = w20; // 얘는 가능해 super라서
//		ten2 = w21; // error Integer는 자식
		
	}
}
/**

*/