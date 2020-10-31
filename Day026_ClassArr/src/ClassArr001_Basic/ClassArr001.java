package ClassArr001_Basic;

import java.util.Arrays;

public class ClassArr001 {
	public static void main(String[] args) {
		//클래스 사용
		//int a;
		//1. a1=null; A[name=, age=] --> 이러한 공간을 사용할 수 있는 자료형
		//2. new 공간을 빌려오기
		//3. 생성자를 불러서 초기화 : A [name=null, age=0]
		//4. 사용할 수 있게 a1이 주소를 갖고 있다.
		//--> 지역변수 만들어야해. 지역변수는 무조건 초기화 해야해.
		A a1 = new A(); 
		a1.setName("sally");//a1.name=""; 프라이빗이라 에러 
		a1.setAge(10);
		System.out.println(a1); // [name=sally, age=10]
		
		//2. 클래스 배열
		//int[] a = new int[3];
		//(0)	a2 = [a2[0]=null|a2[1]=null|a2[2]=null]3개 빌려옴
		A[] a2 = new A[3]; //-->묶음을 빌려올게!, '공간'만 빌려온 것 땅만! 아파트를 지은 적은 없어
		System.out.println(a2); //주소 잘 들어가있음 [LClassArr001.A;@1175e2db 
		//오류나는이유1) System.out.println(Arrays.toString(a2)); //[null, null, null]
		//오류나는이유2) System.out.println(a2[0]); // null이 들어가있음
		//오류발생) a2[0].setName("s1"); System.out.println(a2[0]); 사용할 수 있는 코드지만, 한단계를 더 걸쳐야함
		//(1) a2[0]=null, A[name=,age=] 이러한 인스턴스를 공간을 만들 수 있음! 을 안내한 것
		//(2) new 공간빌려오기
		//(3) A();생성자를 불러서 초기화 : A[name=null,age=0] --> ★클래스 초기화 시켜야해★
		//(4) a2[0]는 new해서 빌려온 공간의 주소를 갖고 있음
		//a2[0].setName("s1");
		//(5) .을 이용해서 접근해 s1데이터 셋팅이 가능함
		a2[0] = new A(); a2[0].setName("s1"); System.out.println(a2[0]);//[name=s1, age=0]
		a2[1] = new A(); a2[1].setName("s2"); System.out.println(a2[1]);//[name=s2, age=0]
		a2[2] = new A(); a2[2].setName("s3"); System.out.println(a2[2]);//[name=s3, age=0]
	}
}
/*
1. 클래스 배열 만들기 
		- 클래스들의 묶음
		- [null|null|null] 공간만 만든 것
		A[] a = new A[3];
		
2. 각각의 클래스 초기화하기 - 클래스를 초기화한적이 없기 때문에 생성자를 불러서 초기값을 셋팅해야함
		a2[0] = new A();
		a2[1] = new A();
		a2[2] = new A();
*/