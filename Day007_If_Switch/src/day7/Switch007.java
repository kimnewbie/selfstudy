package day7;

import java.util.Scanner;

public class Switch007 {
	public static void main (String[] args) {
	
	/*
	평균점수에 따라  90이상 수,80이상 우,70이상 미,60이상 양,나머지 가 를 처리하시오.
	평균을 입력하시오 > 88
	*/
		
		int avg = 0 ;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("평균을 입력하시오> ");
		avg = scanner.nextInt();
		
		switch ( avg/10 ) {
		case 10 : result = "수"; break;
		case 9 : result = "수"; break;
		case 8 : result = "우"; break;
		case 7 : result = "미"; break;
		case 6 : result = "양"; break;
		default : result = "가";
		}
		
		System.out.println(result);
	
	
}//end main

}//end class
