package day6;

public class Ex003 {
	public static void main(String[] args) {
		//삼항 연산자를 이용하여 양수, 음수, 0을 체크하는 코드를 작성
		
		int num = -10 ;
		
		System.out.println( num > 0 ? "양수" :
							(num < 0? "음수" : 0 ));
		// 조건이 남으면 else 그냥 num 안넣어줘도 됨 
		
		
	}//end main

}//end class