import java.util.Scanner;

public class For015_answer {
	public static void main(String[] args) {
		//변수
		int num1 =0, num2=0; char op='\u0000'; String result = "";
		Scanner scanner = new Scanner(System.in);
		//입력
		for(;;) {
			System.out.print("1. 정수를 하나 입력해주세요.>");
			num1 = scanner.nextInt();
			if(0<=num1 && num1<=100) { break; }
		}
		for(;;) {
			System.out.print("2. 정수를 하나 입력해주세요.>");
			num2 = scanner.nextInt();
			if(0<=num2 && num2<=100) { break; }
		}
		for(;;) {
			System.out.print("연산자를 입력해주세요.(+,-,*,/)>");
			op = scanner.next().charAt(0);
			if(op == '+' || op == '-' || op == '*' ||
					op == '/') { break; }
		}
		//처리
		switch(op) {
		case '+' : result = "" + (num1+num2); break;
		case '-' : result = "" + (num1-num2); break;
		case '*' : result = "" + (num1*num2); break;
		case '/' : result = "" + (num1/(float)num2); break;
		}
		//출력
		System.out.println(""+num1+op+num2+"="+result);
	}
}
