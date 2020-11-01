package day7;

import java.util.Scanner;

public class DAY007_1 {
	public static void main (String[] args) {
		/*
		 평균을 입력하시오>
		 만약 60점 이상이라면 합격을 출력해주세요 / 아니라면 불합격을 출력해주세요
		*/
		
		//변수
		int avg = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("평균을 입력하시오> ");
		avg = scanner.nextInt();
		//처리
		if(avg>=60) {result = "합격";}
		else {result = "불합격";}
		//출력
		System.out.println("ㅁ합격여부: " +  result);
		
		
	}//end main
}//end class
