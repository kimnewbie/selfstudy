package day6;

public class IF001_basic {
	public static void main (String[] args) {
		int a = 0 ;
		
		// 1형식		if(조건식){ 조건식이 맞을 때 처리 }
		// 단점: 조건식이 맞아야지만 처리가 됨. 처리가 됐는지 판단하기 힘듬.
		if( a == 0 )	{System.out.println("zero");}
		
		
		// 2형식 ※ else 뒤에는 조건식이 못옴
		/* if(	조건식	){	조건식이 맞을 때 처리	}
		 * else{	조건식이 틀릴 때 처리	}
		 */
		
		if( a == 0 ) {System.out.println("zero");}
		else {System.out.println("zero가 아니다.");}
		
		// 3형식
		/* if(	조건식1	){	조건식1이 맞을 때 처리	}
		   else if (	조건식2	){	조건식2가 맞을 때 처리	}
		   else if (	조건식3	){	조건식3가 맞을 때 처리	}
		   else					 {	조건식이 틀릴 때	}
		 */
		
			     if( a == 1 ) {System.out.println("1이다");}
			else if( a == 2 ) {System.out.println("2이다");}
			else if( a == 3 ) {System.out.println("3이다");}
			else  			  {System.out.println("1,2,3이 아니다");}
		
	}//end main

}//end class
/*
- 프로그램 위=> 아래, 왼쪽 => 오른쪽
- 프로그램의 흐름을 변경하는 것
- 제어문: if, switch (비교> , 논리 & |)
- 반복문: for, while, do while

- 1) if: 1형식, 2형식, 중첩 if
- 2) switch
﻿*/
