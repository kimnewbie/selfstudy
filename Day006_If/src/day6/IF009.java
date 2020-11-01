package day6;

import java.util.Scanner;

public class IF009 {
	public static void main (String[] args) {
		/*	문자가 대문자이면 소문자로 ,소문자면 대문자로 변경해서 출력하시오
	알파벳을 입력하시오 > _입력받기 예) A
	대문자 A의 소문자는 a*/
		
		//변수
		char a = ' ';
		String result = "";
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("알파벳을 입력하시오 >");
		a = scanner.next().charAt(0);
		//처리
		if ('a' <= a && a <= 'z') { result = "의 대문자 변환 " + ((char)( a - 32));}
		else if ('A' <= a && a <= 'Z') { result = "의 소문자 변환 " + ((char)( a + 32)); }		
		//출력
		System.out.println("ㅁ결과 : " + a + result);

	}//end main

}//end class