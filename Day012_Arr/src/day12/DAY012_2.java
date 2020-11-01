package day12;

import java.util.Scanner;

public class DAY012_2 {
	public static void main(String[] args) {
		/*
		숫자1개 입력받기
		1을 입력받으면 1이다
		2을 입력받으면 2이다
		3을 입력받으면 3이다
		*/
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자1개 입력받기 > ");
		num = scanner.nextInt();
		
		switch(num) {
		case 1: {System.out.println("1이다"); break;}
		case 2: {System.out.println("2이다"); break;}
		case 3: {System.out.println("3이다"); break;}
		}
		
	}//end main
}//end class
