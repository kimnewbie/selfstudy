package day6;

import java.util.Scanner;

public class IF006 {
	public static void main (String[] args) {
		/*
		 세개의 수중에서 최대값을 구하시오
		 숫자1을 입력해주세요.> _입력받기 예) 3
		 숫자2을 입력해주세요.> _입력받기 예) 7
		 숫자3을 입력해주세요.> _입력받기 예) 53
		 */
		//변수 - 수를 세개 받을 거라서 a,b,c 변수로 잡아주기
		int a= 0, b= 0, c = 0, max = -9999 ; // ★왜 max의 범위는 -9999로 잡았을까?★
		Scanner scanner = new Scanner(System.in);		
		//입력
		System.out.println("숫자1을 입력해주세요.>"); a = scanner.nextInt();
		System.out.println("숫자2을 입력해주세요.>"); b = scanner.nextInt();
		System.out.println("숫자3을 입력해주세요.>"); c = scanner.nextInt();
		//처리
		max = a;
		if(max < b) { max = b; } // a보다 b가 더 크다면 max에 b담기 / 아니라면 a가 담겨있음
		if(max < c) { max = c; }
		//출력
		System.out.println("ㅁ" + a + "," + b + ","+ c + " 중 최대값 : " + max);
		
	}//end main

}//end class
