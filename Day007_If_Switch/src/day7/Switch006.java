package day7;

import java.util.Scanner;

public class Switch006 {
	public static void main (String[] args) {
		
		/*
	당신의 주민번호를 입력하세요.(011231-1111222)>
		만약 1,3 이면 남자 출력
		    2,4이면 여자 출력
		 그 이외이면 유효하지 않은 주민등록번호입니다.
		 
		 ※ 힌트 
		 //변수
		 char gender = "";
		 //입력 011231-(6)1(7)111222
		 gender = scanner.next()charAt() (-뒤에 있는 문자 번호 넣기)
		 //처리
		 gender = scanner.next()charAt(0); //0
		 gender = scanner.next()charAt(1); //1
		 gender = scanner.next()charAt(2); //1
		 gender = scanner.next()charAt(3); //2
		 gender = scanner.next()charAt(4); //3
		 gender = scanner.next()charAt(5); //1
		 */
		
		char gender = 0 ;
		String result = "" ;				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 주민번호를 입력하세요.(011231-1111222)> ");
		gender = scanner.next().charAt(7);
		//// 문자처리
		switch (gender) {
			case '1': case '3': result = "납자"; break;
			case '2': case '4': result = "여자"; break;
			default : result = "유효하지 않은 주민등록번호입니다.";
		}
		
		System.out.println( result );
		
	}//end main

}//end class
