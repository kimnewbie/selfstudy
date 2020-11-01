package day16;

import java.util.Scanner;

public class Day016_2 {
	public static void main(String[] args) {
		/*
		Day016_2
		birthday를 입력받을 때까지 출력
		birthday 입력시 생일축하합니다 출력
		아니라면 생일 영단어를 입력하시오 출력
		
		생일의 영단어를 입력하세요. _
		성공: 생일축하합니다
		실패: 생일 영단어를 입력하세요.
		*/
		
		String day = "";
		Scanner scanner = new Scanner(System.in);
		for(;;) {
		System.out.print("생일의 영단어를 입력하세요. > ");
		day = scanner.next();
		
		if(day.equals("birthday")||day.equals("BIRTHDAY")) {System.out.println("생일축하합니다!"); break;}
		else {System.out.println("생일 영단어를 입력하세요.");}
		}
	}//end main
}//end class
