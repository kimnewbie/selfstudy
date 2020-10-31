package day10;

import java.util.Scanner;

public class Practice008 {
	public static void main(String[] args) {
		/*
		(1) square
		(2) square root
		(3) log
		원하는 메뉴(1~3)를 선택하세요.(종료:0)>1
		선택하신 메뉴는 1번입니다.
		(1) square
		(2) square root
		(3) log
		원하는 메뉴(1~3)를 선택하세요.(종료:0)>
		*/
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)> ");
			int num = scanner.nextInt();
			if(1<=num&&num<3) {
			System.out.println("선택하신 메뉴는 "+num+"번입니다."); continue;}
			else if(num==0) {System.out.println("종료합니다"); break;}
			else {System.out.println("다시 입력해주세요"); continue;}
			
			
		}//end for
	}//end main
}//end class
