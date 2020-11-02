class Parent extends Object {///////// super()에 마우스대면 보임
	int i, j;

	public Parent() { super(); } //1) 누구 호출한 것인지 : object() 호출

	public Parent(int i, int j) { 
		super(); //2) 누구 호출한 것인지 : object() 호출
		//this(); //5) super, this()는 함께 사용할 수 없음
		this.i = i;
		this.j = j;
		//super(); // super()는 밑에 올 수 없다!
	}
	
}
class Child extends Parent{
	int k;
	public Child() {
		super(); //3) 누구 호출한 것인지 : Parents()의 생성자
	}
	public Child(int i, int j, int k) {
		super(i,j); //4) 누구 호출한 것인지 : Parents()의 int i, int j 생성자
		this.k = k;
	}
}
public class Extends007 {
	public static void main(String[] args) {
		Child child = new Child(10,20,30);
		System.out.println(child.i); //6)결과 출력 : 10
		System.out.println(child.j); //6)결과 출력 : 20
		System.out.println(child.k); //6)결과 출력 : 30
	}//end  main
}//end class
