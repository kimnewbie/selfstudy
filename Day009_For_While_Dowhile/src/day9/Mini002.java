package day9;

import java.util.Scanner;

public class Mini002 {
	public static void main(String[] args) {
		//1. 변수
		int num = -1;
		int id=1, pass=1;
		float balance = 1000f;
		Scanner scanner = new Scanner(System.in);
		
		//2. 입력
		System.out.print("========BANK=========\r\n"
				+ "1. 추가\r\n"
				+ "2. 조회\r\n"
				+ "3. 입금\r\n"
				+ "4. 출금\r\n"
				+ "5. 삭제\r\n"
				+ "9. 종료\r\n"
				+ "입력>>> " );	
		num = scanner.nextInt();
		//3. 처리
		switch(num) {
		case 1: System.out.println("ㅁ추가기능입니다.");
				System.out.println("");
		break;
		}
		//4. 출력
	}//end main
}//end class
