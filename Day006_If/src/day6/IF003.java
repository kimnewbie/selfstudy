package day6;

import java.util.Scanner;

public class IF003 {
	public static void main (String[] args) {
		/*
		 숫자 한개 입력받기
		 양수라면 양수 출력, 음수라면 음수 출력
		 0이라면 zero 출력, 그 이외의 수라면 기타
		 */
		
		//변수
		int num = 0;
		String result = "기타";
		Scanner scanner = new Scanner(System.in);		
		//입력
		System.out.println("숫자 한개 입력>");
		num = scanner.nextInt();
		//처리
		if(num>0) { result = "양수";}
		else if(num<0) { result = "음수";}
		else if(num==0) { result = "zero";}
		// 또는 String result = "기타"; 로 사용 가능
		//출력
		System.out.println("ㅁ입력한 숫자 : " + num + "\nㅁ결과 : " + result);

		
	}//end main

}//end class
