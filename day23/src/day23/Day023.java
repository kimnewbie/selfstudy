package day23;

import java.util.Scanner;

class TV002{
	//1.멤버변수
	String channel; int volume;
	//2.멤버함수
	void show() {
		System.out.println("===== TV\r\n"
				+ "TV채널 : " + channel + "\r\n"
				+ "TV볼륨 : "+ volume);
	}
	void input() {		
		Scanner sc = new Scanner(System.in);
		System.out.println("::::::MYTV");
		System.out.print("::TV채널입력>"); this.channel = sc.next();
		System.out.print("::TV볼륨입력>"); this.volume = sc.nextInt();
	}
	//3.생성자
	TV002(){}
	TV002(String channel, int volume){this.channel = channel; this.volume = volume;}
}

public class Day023 {
	public static void main(String[] args) {
		//1. TV002라는 자료형으로 만들 수 있는 인스턴스 변수 [String channel|int volume]
		//2. new - 어떤 역할 : 메모리 빌려오고 객체 생성하는 역할
		//3. TV002("MBC",6) => 인스턴스변수에 ["MBC"|6]세팅됨
		//4. 인스턴스변수를 사용할 수 있게 주소를 갖고 있는 것 :a1
		TV002 a1 = new TV002("MBC",6);
		a1.show();
		
		TV002 a2 = new TV002();
		a2.input();
		a2.show();
		/*
		1. TV002이라는 클래스 작성
			//1. 멤버변수
			채널: channel
			볼륨: volume
			//2. 멤버함수
			void show() - 채널과 볼륨 출력
		
		ㅁ 출력내용
		===== TV
		TV채널 : MBC
		TV볼륨 : 6
		
		::::::MYTV
		::TV채널입력>_입력하기 JTBC
		::TV볼륨입력>_입력하기 9
		=====TV
		TV채널 : JTBC
		TV볼륨 : 9
		
		ㅁ 주어진옵션
			//1. TV002라는 자료형으로 만들 수 있는 인스턴스 변수 []
			//2. new - 어떤 역할
			//3. TV002("MBC",6) => 인스턴스변수에 [|]세팅됨
			//4. 인스턴스변수를 사용할 수 있게 주소를 갖고 있는 것 :
			TV002 a1 = new TV002("MBC",6);
			a1.show();
			
			TV002 a2 = new TV002();
			a2.input();
			a2.show();
		 */
	}
}
