package day6;

import java.util.Scanner;

public class IF011 {
	public static void main (String[] args) {
		/*	어린이의 나이를 입력하시오(1~5세사이)   __입력하기
	1~5세사이면 어린이의나이는 해당하는 나이를 출력
	아니라면 1~5세사이가 아닙니다. */
		
		//변수
		int age = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("어린이의 나이를 입력하시오(1~5세사이)>");
		age = scanner.nextInt();
		//처리
		if(1<=age&&age<=5) { result = age + "세 입니다." ;}
		else { result = "1~5세 사이가 아닙니다.";}
		//출력
		System.out.println("ㅁ결과 : " + result );
		
	}//end main

}//end class