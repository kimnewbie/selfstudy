package day6;

import java.util.Scanner;

public class IF004 {
	public static void main (String[] args) {
		/*
		 1,2,3 중 좋아하는 숫자를 입력해주세요.>
		 만약 1을 입력했다면 1 - one 출력
		 만약 2을 입력했다면 2 - two 출력
		 만약 3을 입력했다면 3 - three 출력
		 다른 값을 입력했다면 1,2,3이 아니다. 출력
		 */		
		
		//변수
		int num ;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("1,2,3 중 좋아하는 숫자를 입력해주세요.>");
		num = scanner.nextInt();
		//처리
		if(num==1) {result = "one";}
		else if(num==2) {result = "two";}
		else if(num==3) {result = "three";}
		else {result = "1,2,3이 아니다.";}
		//출력
		System.out.println( "ㅁ결과 : " + result );
		
	}//end main

}//end class
