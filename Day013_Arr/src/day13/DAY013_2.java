package day13;

import java.util.Scanner;

public class DAY013_2 {
	public static void main(String[] args) {
		/*
		switch
		10,20,30 중에 입력하세요.
		10이면 ten, 20이면 twenty, 30이면 thirty 출력
		*/	
		int num = 0;
		String result ="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("10,20,30 중에 입력하세요 > ");
		num = scanner.nextInt();
		
		switch(num) {
		case 10: result = "ten"; break; 
		case 20: result = "twenty"; break;
		case 30: result = "thirty"; break;		
		}
		System.out.println(result);
	}//end main
}//end class
