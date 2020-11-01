package day6;

public class Ex002 {
	public static void main (String[] args) {
		// 123개의 사과 개수, 바구니에 담을 수 있는 사과 개수 10
		// 필요한 바구니 개수
		// 120개면 필요한 바구니수는 120/10 12개 필요
		int apples = 123 ; // 사과의 개수
		int boxes = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
		
		//System.out.println("필요한 바구니의 수 :" + apples/boxes);
		//위가 내 답인데 틀림 ㅜㅜ
		
		System.out.println("필요한 바구니의 수 :" + 
				(apples/10 + ((apples%10 > 0)? 1 : 0)));
		
	}//end main

}//end class
/*
 123개의 사과가 있고 바구니에 담을 수 있는 사과개수는 10개이다.
 다음 코드를 완성하여 필요한 바구니 개수를 적으시오.
 */
