package day6;

import java.util.Scanner;

public class IF005 {
	public static void main (String[] args) {
		/*
		 숫자 1개를 입력해주세요> _입력받기 예) -10
		 -10 절대값 : 10
		 */
		
		//변수
		int num = 0, abs =0  ; // ★abs의 존재를 자꾸 잊음★
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("숫자 1개를 입력해주세요>");
		abs = num = scanner.nextInt(); //★이부분 놓침★
		//처리 - 무조건 양수로 만들기
		if(num <0) { abs = num * (-1) ;}
		//출력
		System.out.println("ㅁ입력한 값 : " + num + "\nㅁ절대값 : " + abs);
		
	}//end main

}//end class