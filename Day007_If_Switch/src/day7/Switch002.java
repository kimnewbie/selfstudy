package day7;

import java.util.Scanner;

public class Switch002 {
	public static void main (String[] args) {
		
		/*
		 숫자 1개 입력받기
		 만약에 3이라면 봄이다 출력
		 6이라면 여름이다 출력
		 9라면 가을이다 출력
		 12라면 겨울이다 출력
		 */		
		
		String result = "";
		int a = ' ';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 1개 입력받기 >");
		a = scanner.nextInt();
		
		switch( a ) {
		case 3 : result = "봄이다"; break;
		case 6 : result = "여름이다"; break;
		case 9 : result = "가을이다"; break;
		case 12 : result = "겨울이다"; break;
		default : result = "봄, 여름, 가을, 겨울이 아니다";
		}
		
		System.out.println( result );
		
		
	}//end main

}//end class
