package day10;

import java.util.Scanner;

public class DAY10_2 {
	public static void main(String[] args) {
		/*
		switch 버전으로 문제를 풀으시오.
		1,2,3 중에 한개의 숫자를 입력하시오 >
		1이라면 1이다.
		2이라면 2이다.
		3이라면 3이다.
		1,2,3이 아니라면 유효하지 않은 숫자입니다.
		*/
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1,2,3 중에 한개의 숫자를 입력하시오 > ");
		num = scanner.nextInt();
		
		switch (num) {
		case 1 : System.out.println("1이다."); break;
		case 2 : System.out.println("2이다."); break;
		case 3 : System.out.println("3이다."); break;
		default : System.out.println("유효하지 않은 숫자입니다."); break;
		}
	}
}
