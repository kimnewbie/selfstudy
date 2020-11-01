package day7;

import java.util.Scanner;

public class Switch011 {
	public static void main (String[] args) {
		
		/*
		가위(1),바위(2), 보(3) 중 하나를 입력하세요.>_입력받기 
   		당신은 1입니다.
   		컴은  2입니다.
   		당신이 졌습니다.
      
   힌트!) 랜덤하게 숫자받기
   
   		System.out.println("1: 0~1사이의 난수 : " + Math.random());
   		System.out.println("2: 0,1,2 중 출력 : " + (int)(Math.random() * 3));
   		System.out.println("3: 1,2,3 중 출력 : " + (int)(Math.random() * 3) + 1);   
   		   
   		System.out.println( Math.random()); //0~0.9999
		System.out.println( (Math.random()*3)); //0~2.9999 (1~3중에 입력할거라서)
		System.out.println( (int)(Math.random()*3)); //0,1,2중 출력
		System.out.println( (int)(Math.random()*3)); //1,2,3중 출력
		//경우의 수
   		user - com 을 했을 때
   		case 0 : 무승부
   		case -1: case 2: 컴승
   		case -2: case 1: 유저승
		 */	
		//변수
		int user = 0, com = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		//입력 (컴퓨터의 원하는 값: 1,2,3)				
		System.out.print("가위(1),바위(2), 보(3) 중 하나를 입력하세요.>");
		user = scanner.nextInt();
		com = (int)(Math.random()*3)+1; //컴퓨터가 1,2,3 랜덤하게 숫자처리
		//처리 2-1 1-2 1-1
		switch ( user - com ) {
			case -2 : case 1 : result = "유저승"; break;
			case -1 : case 2 : result = "컴승";break;
			case 0 :		   result = "무승부.";break;
		}
		//출력
		System.out.println("당신은 " + user + "입니다.");
		System.out.println("컴은 " + com + "입니다.");
		System.out.println(result);
		
		
		
		
		
	}//end main

}//end class