package day13;

import java.util.Scanner;

public class DAY013_1 {
	public static void main(String[] args) {
		/*
		10,20,30 중에 입력하세요.
		10이면 ten, 20이면 twenty, 30이면 thirty 출력
		*/
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("10,20,30 중에 입력하세요 > ");
		num = scanner.nextInt();
		
		if(num==10) {System.out.print("ten");}
		else if(num==20) {System.out.print("twenty");}
		else if(num==30) {System.out.print("thirty");}
	
	}//end main
}//end class
