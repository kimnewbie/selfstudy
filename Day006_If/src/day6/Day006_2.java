package day6;

public class Day006_2 {
	public static void main (String[] args) {
	int x = 2 ; int y=5; char c = 'A';
	// ++ () > 산술(+, -, *, /) > 비교(>, <, ...) > 논리(&&, ||) > =
	System.out.println( y > 5 || x < 0 && x > 2); //[1] true
	// 1. 5>= 5		2< 0 		2 > 2
	// 2. true		false		false
	// 3. true ||	false
	// 4. true
	
	System.out.println( y += 10 - x++); //[2] 13
	// 1. x++ ++이 뒤에 있으므로; 끝나고 증가 현재는 2
	// 2. 10 - 2 값: 8
	// 3. 5 += 8 값: 13 출력
	// 4. ;이 끝난 후 x++증가 현재 이 위치에서 x는 3이 됨
	
	System.out.println( x += 2 ); //[3] 5 --------------★이거 틀림★ 4로 적음 위랑 이어서 생각 안함
	// 1. 3 += 2 값 5
	
	System.out.println( !('A' <= c && c <= 'Z')); //[4] false
	// 1. ('A' <= 'A' && 'A' <= 'Z') 값 true
	// 2. ! true					 값 false
	
	System.out.println('C'-c); //[5] 2
	// 1. 'C' - 'A' 'A'(65) 'B'(66) 'C'(67)
	// 2. 2	-는 숫자와 숫자사이에 계산
	
	System.out.println('5' - '0'); //[6] 5
	// 1. '0'	'1'	'2'	'3'	'4'	'5'
	// 2. 아스키코드를 몰라도 1씩 증가. 계산 5
	
	System.out.println(c + 1); //[7] 66 --------------★이거 틀림★ 'B'로 적음
	// 1. 'A' + 1 문자또는(숫자)	+	숫자	= 66
	// 2) +의 의미: 숫자+숫자 더하기 계산 2) 문자열+문자열 출력
	
	System.out.println(++c); //[8] 'B'
	//1. ++'A'	; 전 이므로 증가후 출력	++(문자) 문자를 1개 증가해달라고 나옴
	
	System.out.println(c++); //[9] 'B'
	// 1. ('B')++ ;후이므로 출력후 증가
	// 2. 현재위치에서 'C'
	
	System.out.println( c ); //[10] 'C' 위에께 +1되서 출력됨
	}
}
