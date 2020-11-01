import java.util.Scanner;

public class For012 {
	public static void main(String[] args) {
		/*
		두수사이의 합을 구하시오
		숫자1입력 : 2
		숫자2입력 : 5
	    2+3+4+5=14
	    5+4+3+2=14
		 */
		int num1 = 0, num2 = 0, sum = 0;
		boolean  first = true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("두수사이의 합을 구하시오\r\n");
		System.out.print("숫자1입력 : "); num1 = scanner.nextInt();
		System.out.print("숫자2입력 : "); num2 = scanner.nextInt();
		
//		if(num1<num2) {
//			for(int i=num1; i<=num2; i++) { // num1<num2
//				if(first) { first = false; }
//				else {System.out.print("+");}
//				System.out.print(i);
//				sum += i;
//			}
//			System.out.println("=" + sum);
//		} else {
//			for(int j=num1; j>=num2; j--) { // num1>num2
//				if(first) { first = false; }
//				else {System.out.print("+");}
//				System.out.print(j);
//				sum += j;
//			}
//			System.out.println("=" + sum);
//		}
		
		//ver-2 for문 하나로 줄이기! [도전]
		
		for(int i=num1, j=num1; i<=num2 || j>=num2; i++, j--) {		
			if(first) { first = false; }
			else {System.out.print("+");}
			
			if(num1<num2) {System.out.print(i); sum += i ; }
			else if(num1>num2) {System.out.print(j); sum += j ; }			
		}
		System.out.print("=" + sum);

	}//end main
	
}//end class
