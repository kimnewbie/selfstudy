import java.util.Scanner;

public class For015 {
	public static void main(String[] args) {
		/*
		1. 정수를 하나 입력해주세요.> 10
		(숫자는 0~100사이만 입력가능하게 잘못입력하면 다시입력받게 무한반복)
		2. 정수를 하나 입력해주세요.> 3
		(숫자는 0~100사이만 입력가능하게 잘못입력하면 다시입력받게 무한반복)
		3. 연산자를 입력해주세요.(+,-,*,/)> +
		(연산자는 +,-,*,/만 입력가능하게 잘못입력하면 다시입력받게 무한반복)
		*/
		//변수
		int num1 = 0, num2 = 0 ;
		String result = "";
		char op = '\u0000';
		Scanner scanner = new Scanner(System.in);
		//입력
		for(;;) {
			System.out.print("1. 정수를 하나 입력해주세요.> ");
			num1 = scanner.nextInt();
			if(0<=num1 && num1<=100) {break;} //잘했으면 빠져나오기
		}
		for(;;) {
			System.out.print("2. 정수를 하나 입력해주세요.> ");
			num2 = scanner.nextInt();
			if(0<=num2 && num2<=100) {break;} //잘했으면 빠져나오기
		}
		for(;;) {
			System.out.print("3. 연산자를 입력해주세요.(+,-,*,/)> ");
			op = scanner.next().charAt(0);
			if(op=='+'||op=='-'||op=='*'||op=='/') {break;} //잘했으면 빠져나오기
		}
		//처리
		switch( op ) {
		case '+' : result = ""+(num1+num2); break;
		case '-' : result = ""+(num1-num2); break;
		case '*' : result = ""+(num1*num2); break;
		case '/' : result = ""+(num1/(float)num2); break;
		}
		//출력
		System.out.println(""+num1+op+num2+"="+result);
	}//end main
}//end class
