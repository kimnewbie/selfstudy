package day7;

import java.util.Scanner;

public class Switch001 {
	public static void main (String[] args) {
		int a = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 1,2,3 중에 입력해주세요 >");
		a =  scanner.nextInt();
		
		/* [1] if 구문
		if(a==1) { result = "1이다."; } // break; 자동으로 들어있다고 생각해
		else if(a==2) { result = "2이다."; } // break; 자동으로 들어있다고 생각해
		else if(a==3) { result = "3이다."; } // break; 자동으로 들어있다고 생각해
		else { result = "1,2,3이 아니다."; } // break; 자동으로 들어있다고 생각해
		*/
		
		switch( a ) { //처리할대상
		case 1: result = "1이다."; break; //break;를 안넣어주니까 defalut 값만 나옴
		case 2: result = "2이다."; break;
		case 3: result = "3이다."; break;
		default: result = "1,2,3이 아니다.";
		}
		
		
		System.out.println(result);
		
		
	}//end main
}//end class
