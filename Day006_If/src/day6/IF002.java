package day6;

import java.util.Scanner;

public class IF002 {
	public static void main (String[] args) {
		/*
		평균을 입력하시오>
		만약 60점이상이면 합격을 출력해주세요 / 아니라면 불합격을 출력해주세요
		*/
		
		//GIGO
		//변수
		int avg = 0;
		String result = "불합격" ;
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("평균을 입력하시오>");
		avg = scanner.nextInt();
		//처리
		if(avg>=60) {result = "합격" ;}
		//출력
		System.out.println("ㅁ점수 : " + avg + "\nㅁ합격여부 : " + result );
		

		
	}//end main

}//end class
