package day9;

import java.util.Scanner;

public class For016 {
	public static void main(String[] args) {
		/*
		1. 정수를 하나 입력해주세요.>  10    
		(숫자는 0~100사이만 입력가능하게 잘못입력하면 다시입력받게 무한반복)
   		2. 정수를 하나 입력해주세요.>  3     
    	(숫자는 0~100사이만 입력가능하게 잘못입력하면 다시입력받게 무한반복)
    	3. 연산자를 입력해주세요.(+,-,*,/)>  +  
    	(연산자는  +,-,*,/만 입력가능하게   잘못입력하면 다시입력받게 무한반복)
   
    	예) 10 + 3 = 13
  		10 - 3 = 7
    	10 * 3 = 30
    	10 / 3 = 3.333333    
     	4. 다시 시작하시겠습니까? ( yes라면 다시 연산시작 / no라면 프로그램 종료 )
       	yes, no가 아니라면 다시 무한반복
		*/
		//변수
		int num1=0, num2=0;
		String result = "", answer= "";
		char op = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		//입력
		for(;;) {
			for(;;) {
				System.out.print("1. 정수를 하나 입력해주세요.> ");
				num1 = scanner.nextInt();
				if(0<=num1 && num1<=100) {break;}
			}
			for(;;) {
				System.out.print("2. 정수를 하나 입력해주세요.> ");
				num2 = scanner.nextInt();
				if(0<=num2 && num2<=100) {break;}
			}
			for(;;) {
				System.out.print("3. 연산자를 입력해주세요.(+,-,*,/)> ");
				op = scanner.next().charAt(0);
				if(op=='+'||op=='-'||op=='*'||op=='/') {break;}
			}
			if(op=='+') {result = ""+(num1+num2);}
			else if(op=='-') {result = ""+(num1-num2);}
			else if(op=='*') {result = ""+(num1*num2);}
			else if(op=='/') {result = ""+(num1/(float)num2);}
			
			System.out.println(""+num1+op+num2+"="+result);
			
			for(;;) {
				System.out.print("\n다시 시작하시겠습니까? yes or no > ");
				answer = scanner.next();   //nextLine 줄바꿈  앞에서 입력받고 + 엔터
				if(answer.equals("no")) {System.out.print("프로그램 종료");break;}
				else if(answer.equals("yes")) {break;}
				 
			}
		if(answer.equals("yes")) {continue;}
		else {break;}
		}
	}//end main
}//end class
