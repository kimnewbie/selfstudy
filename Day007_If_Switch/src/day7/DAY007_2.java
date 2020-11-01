package day7;

import java.util.Scanner;

public class DAY007_2 {
	public static void main (String[] args) {
		/*
		 숫자 한개 입력받기
		 양수라면 양수 출력, 음수라면 음수출력, 0이라면 zero출력, 그 이외의 수라면 기타
		 */
		
		//변수
		int a = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);		
		//입력
		System.out.println("숫자 한개 입력받기> ");
		a = scanner.nextInt();
		//처리
		if(a>0) {result = "양수";}
		else if(a<0) {result = "음수";}
		else if(a==0){result ="zero";}
		else {result="기타";}
		//출력
		System.out.println("ㅁ결과 : " +  result );
		
		
	}//end main
}//end class
