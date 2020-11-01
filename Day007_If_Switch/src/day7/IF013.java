package day7;

import java.util.Scanner;

public class IF013 {
	public static void main (String[] args) {
		/*
		1. 정수를 하나 입력해주세요.>  10
	 2. 정수를 하나 입력해주세요.>  3
	 3. 연산자를 입력해주세요.(+,-,*,/)>  +
	      
	 * 예) 해당하는 연산자에 맞게 처리하시오.   
	 *     10 + 3 = 13			+라면 +계산한 결과를 출력하시오.
	 *     10 - 3 = 7			-라면 -계산한 결과를 출력하시오.
	 *     10 * 3 = 30			*라면 *계산한 결과를 출력하시오.
	 *     10 / 3 = 3.333333		/라면 /계산한 결과를 출력하시오.	 */
		
		//변수
		int num1 =0, num2 = 0; char op = ' '; float result = 0.0f;
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("1. 정수를 하나 입력해주세요.> "); num1 = scanner.nextInt();
		System.out.println("2. 정수를 하나 입력해주세요.> "); num2 = scanner.nextInt();
		System.out.println("3. 연산자를 입력해주세요.(+,-,*,/)> "); 
		op = scanner.next().charAt(0);		
		//처리 
		if(op=='+') {result = num1+num2;}
		else if(op=='-') {result = num1-num2;}
		else if(op=='*') {result = num1*num2;}
		else if(op=='/') {result = num1/(float)num2;}
		
		//출력
		
		// ver-1) if - 만약에 /가 아니라면 정수로 출력 /라면 실수로 출력 
		/*
		if(op!='/') {System.out.println("" + num1 + op + num2 + "=" + (int)result);}
		else {System.out.println( "" + num1 + op + num2 + "=" + result);}
		
		if(op!=='+'|| op == '-' || op =='*') 
		{System.out.println( "" + num1 + op + num2 + "=" + (int)result);}
		else {System.out.println( "" + num1 + op + num2 + "=" + result);}
		*/
		// ver-2) 삼항연산자 - 만약에 /가 아니라면 정수로 출력 /라면 실수로 출력
		System.out.println(
				(op == '/')?
	            ("" + num1 + '/' + num2 + "=" + result)
	            :("" + num1 + '/' + num2 + "=" + (int)result));
		
		//본 값
		//System.out.println( "" + num1 + op + num2 + "=" + result);

		//변수
		//입력
		//처리
		//출력
		
		
		
		

	}//end main

}//end class
/*[내가한거]
//GIGO
//변수
int a, b = 0;
char c = ' ' ;
Scanner scanner = new Scanner(System.in);
//입력
System.out.println("정수를 하나 입력해주세요.>"); a = scanner.nextInt();
System.out.println("정수를 하나 입력해주세요.>"); b = scanner.nextInt();
System.out.println("연산자를 입력해주세요.(+,-,*,/)>"); 
c = scanner.next().charAt(0);
//처리
if(c=='+') {System.out.println(a + " + " + b + " = " + (a+b));}
else if(c=='-') {System.out.println(a + " - " + b + " = " + (a-b));}
else if(c=='*') {System.out.println(a + " * " + b + " = " + (a*b));}
else if(c=='/') {System.out.println(a + " / " + b + " = " + (a/b));}
//출력*/