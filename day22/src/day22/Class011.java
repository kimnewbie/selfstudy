package day22;

import java.util.Scanner;

class Animal002{	
	//멤버변수
	String name; int age;
	//멤버함수
	void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("::이름입력 > "); this.name = scanner.next();
		System.out.print("::나이입력 > "); this.age = scanner.nextInt();
	}
	
	void show() {
		System.out.println(":::::::::::::::::::::::::");		
		System.out.println("이름 : " + this.name
							+"\r나이 : " + this.age);
	}
	Animal002(){this.name = "USERNAME"; this.age=0;}

	@Override
	public String toString() {
		return "Animal002 [name=" + name + ", age=" + age + "]";
	}
	
}
public class Class011 {
	public static void main(String[] args) {
		Animal002 a1 = new Animal002(); System.out.println(a1);
	 	a1.show();
	 	
	 	Animal002 a2 = new Animal002(); System.out.println(a2);
	 	a2.input();
	 	a2.show();
	 	
		/*
		 1. Animal002이라는 클래스 작성
		 //1. 멤버변수
		 이름 : String name;
		 나이 : int age;
		 //2. 멤버함수
		 void input() - 이름과 나이를 입력받아준다
		 void show() - 이름과 나이를 출력해준다
		 
		 ㅁ 주어진 옵션
		 public static void main(String[] args) {
		 	Animal002 a1 = new Animal002();
		 	a1.show();
		 	
		 	Animal002 a2 = new Animal002();
		 	a2.input();
		 	a2.show();
		 }
		 
		 ㅁ 출력내용
		 :::::::::::::::::::::::::::::::::::::::::::::::::::
		 ::이름 : USERNAME
		 ::나이 : 0
		 
		 ::이름입력 > _입력하기 홍길동
		 ::나이입력 > _입력하기 10
		 
		 :::::::::::::::::::::::::::::::::::::::::::::::::::
		 ::이름 : 홍길동
		 ::나이 : 10
		 
		 */
	}
	
}
