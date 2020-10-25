package day21;

import java.util.Scanner;

class Animal001{
	//1.멤버변수
	String name = "";
	int age = 0;
	//2.멤버함수
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("::::이름입력 > ");
		name = scanner.next();
		System.out.print("::::나이입력 >");
		age = scanner.nextInt();
	}
	public void show() {
		System.out.println("::이름 : " + name + "\r::나이 : " + age);}	
	
}
public class Class005 {
	public static void main(String[] args) {
		Animal001 a1 = new Animal001();
		a1.input();
		a1.show();
		/* 
		1. Animal001이라는 클래스 작성
		//1. 멤버변수
		이름 : String name
		나이 : age
		//2. 멤버함수
		void input() - 이름과 나이를 입력받아준다
		void show()	 - 이름과 나이를 출력해준
		
		ㅁ 출력내용
					::이름입력 > _입력하기 홍길동
					::나이입력 > _입력하기 10
					
					:::::::::::::::::::::::::::::::::::::::
					::이름 : 홍길동
					::나이 : 10
		ㅁ 주어진옵션
		public static void main(String[] args) {
			Animal a1 = new Animal();
			a1.input();
			a1.show();
		 */
	}
}
