package day7;

import java.util.Scanner;

public class Switch005 { 
	public static void main (String[] args) {
		
		/*
	문자 1개 입력받기
	만약에 a 또는 A 라면 apple   출력
	     b 또는 B 라면 banana  출력
	     c 또는 C 라면 coocnut 출력
		 */
		
		char a  = ' ';
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자 1개 입력받기 > ");
		a = scanner.next().charAt(0);
		
		switch ( a ) {
		case 'a' : case 'A' :
		result = "apple" ; break ;
		
		case 'b' : case 'B' :
		result = "banana" ; break ;
		
		case 'c' : case 'C' :
		result = "coconut" ; break ;
		
		default :  result = "a,b,c,A,B,C가 아닙니다";
		}
		
		System.out.println( result );
		
		
		

		
	}//end main

}//end class