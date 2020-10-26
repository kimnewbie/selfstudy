package day22;

import java.util.Scanner;

class TV002{
	
	//멤버변수
	String channel; int volume; 
	
	//멤버함수	
	void show() {		
		System.out.println("===== TV\r\n"
				+ "TV채널 : "+ this.channel +"\r\n"
				+ "TV볼륨 : "+ this.volume + "\r\n"
				);
	}
	//생성자
	//파라미터가 있는 생성자 사용 시 - 기본생성자 호출이 수동으로 바뀜 (호출이 안됨)
	TV002(String channel, int volume){ 
		this.channel = channel; this.volume = volume; }
	//기본생성자
	TV002() {}// 기본생성자 안사용하더라도 만들어 놓기, 기본생성자가 있으면 자동호출
	
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("::::::::::::MYTV");
		System.out.print("::TV채널 > "); this.channel = scanner.next();
		System.out.print("::TV볼륨 > "); this.volume = scanner.nextInt();
	}
}
public class Class010 {
	public static void main(String[] args) {
		TV002 a1 = new TV002("MBC",6);
	 	a1.show();
	 	
	 	TV002 a2 = new TV002();
	 	a2.input();
	 	a2.show();

		/*
		 1. TV002이라는 클래스 작성
		 //1. 멤버변수
		 채널 : channel
		 볼륨 : volume
		 //2. 멤버함수
		 void show() - 채널과 볼륨 출력
		 
		 ㅁ 주어진 옵션
		 public static void main(String[] args) {
		 	TV002 a1 = new TV002("MBC",6);
		 	a1.show();
		 	
		 	TV002 a2 = new TV002();
		 	a2.input();
		 	a2.show();
		 }
		 
		 ㅁ 출력내용
		 ===== TV
		 TV채널 : MBC
		 TV볼륨 : 6
		 
		 ::::::::::::MYTV
		 ::TV채널 : jtbc
		 ::TV볼륨 : 9
		 */
	}
}
