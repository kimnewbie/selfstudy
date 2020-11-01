import java.util.Scanner;

public class For003 {
	public static void main(String[] args) {
		/*
		 구구단 프로그램입니다.
		 원하는 단을 입력해주세요 > _입력받기 예) 2
		 2*1 = 2
		 2*2 = 4
		 2*3 = 6
		 ...
		 2*9 = 18
		 */
		
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("구구단 프로그램입니다.\r\n" 
							+"원하는 단을 입력해주세요 > ");
		num = scanner.nextInt();
		
		for(int i=1; i<=9; i++)
		{System.out.println(num + "*" + i + " = " + (num*i));}		

	}//end main
}//end class
