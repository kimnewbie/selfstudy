package day7;

import java.util.Scanner;

public class Switch003 {
	public static void main (String[] args) {
		
		/*
		문자 1개 입력받기
		만약에 a라면 apple   출력
	    b라면 banana  출력
	    c라면 coconut 출력
		 */
		
		char a = ' ' ;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원하는 알파벳 a,b,c 중에 입력해주세요 >"); 
		a = scanner.next().charAt(0);
		
		switch ( a ) {
		case 'a' : result = "apple" ; break ;
		case 'b' : result = "banana" ; break ;
		case 'c' : result = "coconut" ; break ;
		default : result = "입력하신 값은 a, b, c가 아닙니다.";
		}
		
		System.out.println( result );
		
	}//end main
}//end class


