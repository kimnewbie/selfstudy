class Parent_Ex1{
	int x = 100;
	Parent_Ex1() { this(200); 	System.out.println("ㅁ Parent_Ex1() 디폴트생성자 : x=" + this.x);}	
	Parent_Ex1(int x){this.x=x;	System.out.println("ㅁ Parent_Ex1(int x) 파라미터가 있는 생성자 : x=" + this.x);}
	int getX() {return x;}	
}

/////////////////////////////////////////////////
class Child_Ex1 extends Parent_Ex1{
	int x = 3000;
	Child_Ex1(){this(1000);		System.out.println("ㅁ Child_Ex1() 디폴트생성자 : x=" + this.x);}		//##1
	Child_Ex1(int x){/*super(); 생략*/this.x=x; System.out.println("ㅁ Child_Ex1(int x) 파라미터가 있는 생성자 : x=" + this.x);}		//##2
}

/////////////////////////////////////////////////
public class Ex004 {
	public static void main(String[] args) {
		//생성되는 순서 : Object > Parent_Ex1 > Child_Ex1
		//호출되는 순서 : 
		//1) Child_Ex1▼()디폴트생성자 > 2) hild_Ex1(int x) 파라미터가 있는 생성자
		//3) Parent_Ex1()디폴트생성자 > 4) Parent_Ex1(int x) 파라미터가 있는 생성자
		Child_Ex1 c = new Child_Ex1();
		System.out.println("x="+c.getX());
	}
}