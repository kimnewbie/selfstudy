package day6;

import java.util.Scanner;

public class IF012 {
	public static void main (String[] args) {
		/*	문자 a 또는 A , b 또는 B, c또는 C를 입력하시오 >   __입력하기
	a또는 A이면 apple이다 출력
	b또는 B이면 banana이다 출력
	c또는 C이면 coconut이다 출력
	그 이외이면 a,b,c가 아니다 출력*/
		
		//변수
		char alpha = 0; // int사용했었음... char 사용하삼
		String result = "";
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("문자 a 또는 A , b 또는 B, c또는 C를 입력하시오");
		alpha = scanner.next().charAt(0);
		//처리
		if(alpha == 'a' || alpha == 'A') { result = "apple이다.";}
		else if(alpha == 'b' || alpha == 'B') { result = "banana이다.";}
		else if(alpha == 'c' || alpha == 'C') { result = "coconut이다.";}
		else { result = "a,b,c가 아니다.";}
		//출력
		System.out.println( result );

	}//end main

}//end class
/*		//GIGO
//변수
char fruit = 0;
String result = "";
Scanner scanner = new Scanner(System.in);
//입력
System.out.println("문자 a 또는 A , b 또는 B, c또는 C를 입력하시오.");
fruit = scanner.next().charAt(0);

//처리
if (fruit == 'a' || fruit == 'A') {result = fruit + "는 apple이다";}
else if (fruit == 'b' || fruit == 'B') {result = fruit + "는 banana이다";}
else if (fruit == 'c' || fruit == 'C') {result =fruit +  "는 coconut이다";}
else {System.out.println( result );}
//출력
System.out.println( result );*/