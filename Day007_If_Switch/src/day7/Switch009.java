package day7;

import java.util.Scanner;

public class Switch009 {
	public static void main (String[] args) {
		
		/*
	 클래스명 : Switch009 
	계산기를 만드시오.
	예시1)
	정수한개 입력 > 10
	정수한개 입력 > 3
	연산자한개 입력 (+,-,*,/)> *      ※ SWITCH를 이용하여 원하는 연산을 한다.
	10*3=30
	
	예시2)	
	정수한개 입력 > 10
	정수한개 입력 > 3
	연산자한개 입력 (+,-,*,/)> /
	10/3=3.3333333333333335	

		 */
		
		int a, b = 0;
		char op = ' ';
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수한개 입력 > ");
		a = scanner.nextInt();
		System.out.print("정수한개 입력 > ");
		b = scanner.nextInt();
		System.out.print("연산자한개 입력 (+,-,*,/) > ");
		op = scanner.next().charAt(0);
		
		switch ( op ) {
		case '+' : result = "" + (a + b)	;	break;
		case '-' : result = "" + (a - b)	;	break;	
		case '*' : result = "" + (a * b)	;	break;	
		case '/' : result = "" + (double) a / b	;	break;
		// (double)a/b 부분은 15자리까지보장, (float)a/b 부분은 7자리까지보장
		// string.format("%.2f", (double) a / b	) ; break; 로도 사용가능
		}
		
		System.out.println( result );
		
	}//end main

}//end class
