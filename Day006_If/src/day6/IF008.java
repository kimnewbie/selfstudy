package day6;

import java.util.Scanner;

public class IF008 {
	public static void main (String[] args) {
		/* 문자가 대문자,소문자인지 출력하시오
	알파벳을 입력하시오 > _입력받기 예) A
	A는 대문자입니다.
		 */
		//변수
		char a = ' ';
		String result = "";
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("알파벳을 입력하시오 >");
		a = scanner.next().charAt(0);
		//처리
		if( 'a'<= a && a<='z') { result = "소문자"; }
		else if( 'A'<=a && a<='Z') { result = "대문자"; }
		//출력
		System.out.println("ㅁ결과 : " + a + "는 " + result + "입니다.");
		

	}//end main

}//end class
/*
//GIGO
//변수
char a = ' ';
String result = "";
Scanner scanner = new Scanner(System.in);
//입력
System.out.println("알파벳을 입력하시오>");
a = scanner.next().charAt(0);
//처리
if('A'<= a && a<='Z') 
	{System.out.println( result + "대문자");}
else if('a'<= a && a <='z') 
	{System.out.println( result + "소문자");}

//출력
System.out.println("ㅁ 결과 : " + a + "는 " + result);*/