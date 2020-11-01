package day9;

import java.util.Scanner;

public class DAY009_2 {
	public static void main(String[] args) {
		/*
		1을 입력받을 때까지 무한반복처리하기
		1을 입력해주세요> _입력받기
		*/
		int num = 0;
		Scanner scanner = new Scanner(System.in);		
		
		for(;;) {
			System.out.println("1을 입력해주세요> ");
			num = scanner.nextInt();
			if(num==1) {break;}
		}
		
	}//end main
}//end class
