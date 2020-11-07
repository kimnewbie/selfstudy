package Day031_Exception;

import java.util.Scanner;

public class Exception003 {
	public static void main(String[] args) {
		/* 문자를 잘못입력하면 숫자를 입력하셔야 합니다! 에러처리해주기! */
		int one = 0;
		Scanner scanner = new Scanner(System.in);		
		while(true) {
			try {			
				System.out.print(("1을 입력하세요 > "));
				one = scanner.nextInt(); //입력하기를 기다립니다. + (a+enter)
				if(one==1) {break;}
			} catch(Exception e) {
			System.out.println("숫자만 입력 가능합니다");
			scanner.next(); //문자치고남은 enter
		}
		}
	}
}
