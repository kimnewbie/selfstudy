package day6;

import java.util.Scanner;

public class IF013_1 {
public static void main(String[] args) {
	//변수
	int num1 =0, num2 = 0, result = 0; char op = ' '; float result2 = 0.0f;
	Scanner scanner = new Scanner(System.in);
	//입력
	System.out.println("1. 정수를 하나 입력해주세요.> "); num1 = scanner.nextInt();
	System.out.println("2. 정수를 하나 입력해주세요.> "); num2 = scanner.nextInt();
	System.out.println("3. 연산자를 입력해주세요.(+,-,*,/)> "); 
	op = scanner.next().charAt(0);		
	//처리 
	if(op=='+') {result = (num1+num2);}
	else if(op=='-') {result = (num1-num2);}
	else if(op=='*') {result = (num1*num2);}
	else if(op=='/') {result2 = (num1/(float)num2);}
	
	System.out.println((op == '/')?
							(""+ num1 + op + num2 + "=" + result)
							:(""+num1 + op + num2 + "=" + (int)result));


}
}
