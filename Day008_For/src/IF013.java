import java.util.Scanner;

public class IF013 {
	public static void main(String[] args) {
		
		int a = 0 , b = 0 ;
		char op = ' ';
		float result =  0.f ;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력해주세요.> ");
		a = scanner.nextInt();
		System.out.println("정수를 하나 입력해주세요.> ");
		b = scanner.nextInt();
		System.out.println("연산자를 입력해주세요.(+,-,*,/)> ");
		op = scanner.next().charAt(0);
		
		switch(op) {
		case '+' : result = a + b; break;
		case '-' : result = a - b; break;
		case '*' : result = a * b; break;
		case '/' : result = a / b; break;
		}
	
		System.out.println((op == '/')?
				""+ a + op + b + "=" + result
				:""+a + op + b + "=" + (int)result);

	}//end main

}//end class
