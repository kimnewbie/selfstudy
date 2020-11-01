package day6;

import java.util.Scanner;

public class IF010 {
	public static void main (String[] args) {
		/*	홀수를 입력받으면 남자,  짝수면 여자를 출력하시오  
	숫자를 입력하시오 (홀수면남자/짝수면여자)  >   _입력하기  예) 4
	여자*/
		
		//변수
		int gender = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("숫자를 입력하시오. (홀수면 남자/짝수면 여자) >");
		gender = scanner.nextInt();
		//처리
		if(gender%2 == 0) { result = "여자" ;}
		else {result = "남자";}
		//출력
		System.out.println( "ㅁ결과 : " + gender + "이고 결과는 : " + result + "입니다.");

	}//end main

}//end class