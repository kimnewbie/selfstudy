import java.util.Scanner;

public class For012_etc {
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0, sum = 0;
		boolean  first = true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두수사이의 합을 구하시오\r\n");
		System.out.print("숫자1입력 : "); num1 = scanner.nextInt();
		System.out.print("숫자2입력 : "); num2 = scanner.nextInt();
		
		
		if(num1<num2) {
			/////// 2+3+4+5=14		num1=2 / num2=5
			for(int i=num1; i<=num2; i++) { 
				if(first) { first = false; }
				else {System.out.print("+");}
				System.out.print(i);
				sum += i;
			}
			System.out.println("=" + sum);			
			/////// 5+4+3+2+=14 	num1=5 / num2=2
			// 초기화		숫자바꾸기
			// backup[2] num1[2] num2[5] => int backup=num1;
			// backup[2] num1[5] num2[5] => num1=num2;
			// backup[2] num1[5] num2[2] => num2=backup;
			sum = 0; first = true;
			int backup=num1; num1=num2; num2=backup;
			
			for(int j=num1; j>=num2; j--) { 
				if(first) { first = false; }
				else {System.out.print("+");}
				System.out.print(j);
				sum += j;
			}
			System.out.println("=" + sum);
		}
	}

}
