package day6;

import java.util.Scanner;

public class IF007 {
	public static void main (String[] args) {
		/*
		 년도가 윤년,평년인지 출력하시오
	원하는 년도를 입력해주세요 > _입력받기
	2019년도는  평년입니다.
		 */
		
		int year = 0 ;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원하는 년도를 입력해주세요. >");
		year = scanner.nextInt();
		
		if (year%4== 0 && year%100 != 0 || year%400 == 0) { result = "윤년" ;}
		else { result = "평년";}
		
		System.out.println(year + "년도는 " + result + "입니다.");
		
	}//end main

}//end class