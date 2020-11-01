package day12;

public class Ex007 {
	public static void main(String[] args) {
		/*
		1~6사이의 임의의 정수 출력하는 프로그램 작성
		
		※ 힌트
		1. 랜덤하게 0~0.9999 사이 숫자 출력 Math.random()
		2. 곱하기 6해서 나오는 수치 확인 
			0~0.9999*6+1 사이 숫자 출력 Math.random()*6+1
		*/
		System.out.println("1.  0~0.9999  : " + Math.random());
		System.out.println("2.  0~0.9999*6 (5.9...)  : " + Math.random()*6);
		System.out.println("3. (int)0~0.9999*6 (5)  : " + (int)(Math.random()*6));
		System.out.println("4. (int)0~0.9999*6+1 (6)  : " + (int)(Math.random()*6)+1);
		
		System.out.println((int)((Math.random()*6)+1));
		
	}//end main
}//end class