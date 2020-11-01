package day7;

import java.util.Scanner;

public class Switch010 {
	public static void main (String[] args) {
		
		/*
	당신의 주민번호를 입력하세요.(011231-1111222)>
		SWITCH사용하기
		조건1) 1,3 이면 남자 출력
		      2,4이면 여자 출력
		조건2)추가    
		    1이면 남자-1900년대생입니다.
		    2이면 여자-2000년대생입니다.
		    3이면 남자-1900년대생입니다.
		    4이면 여자-2000년대생입니다.
		 그 이외이면 유효하지 않은 주민등록번호입니다.
		 */
		
		char a = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 주민번호를 입력하세요.(011231-1111222)> ");
		a = scanner.next().charAt(7);
		// switch 구문안에 switch 구문이 들어갈 수 있다.
		
		switch ( a ) { // a의 자료형 - char 그래서 1,2,3,4에 '' 작은따옴표로 표시
			case '1' : case '3': { result = "남성";
				switch( a )	{
				case '1' : result += "-1900년대생"; break;
				case '3' : result += "-2000년대생"; break;
				}
			}break;
			case '2' : case '4' : {result = "여성" ;
				switch( a ) {
				case '2' : result += "-1900년대생"; break;
				case '4' : result += "-2000년대생"; break;
				}
			}break;		
			default : result = "유효하지 않은 주민등록번호입니다.";
		}
		System.out.println( result );
		/*
		case '1' : result = "남자-1900년대생입니다."; break;		
		case '3' : result = "남자-2000년대생입니다."; break;
		case '2' : result = "여자-1900년대생입니다."; break;
		case '4' : result = "여자-2000년대생입니다."; break;
		default :  result = "유효하지 않은 주민등록번호입니다."; 
		*/
			
	
	}//end main

}//end class