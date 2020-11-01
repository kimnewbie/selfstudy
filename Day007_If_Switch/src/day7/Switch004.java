package day7;

import java.util.Scanner;

public class Switch004 {
	public static void main (String[] args) {	
	/*
	현재월을 입력하시오   __입력하기
	     3,4,5 월이면 현재계절은 봄입니다. 출력
	     6,7,8 월이면 현재계절은 여름입니다. 출력
	     9,10,11 월이면 현재계절은 가을입니다. 출력
	     12,1,2 월이면 현재계절은 겨울입니다. 출력 
	 */
		
		int a = 0 ;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("현재 월을 입력하시오> ");
		a = scanner.nextInt();
		
		switch ( a ) {
		case 3: case 4: case 5:
			result = "현재 계절은 봄입니다." ; break;
		case 6: case 7: case 8:
			result = "현재 계절은 여름입니다." ; break;
		case 9: case 10: case 11:
			result = "현재 계절은 가을입니다." ; break;
		case 12: case 1: case 2:
			result = "현재 계절은 겨울입니다." ; break;	
		}
		
		System.out.println( result );
		
}//end main

}//end class
