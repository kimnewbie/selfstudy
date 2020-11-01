package day6;

public class Day006_3 {
	public static void main (String[] args) {
		byte a = 10; byte b = 20 ;  // a에 10, b에는 20 byte범위에 포함이 됨. -128~127(byte범위)
		byte e = 10 + 20 ;
		byte c = (byte)(a+b);
		// byte c = (a+c); 오류나는 이유 = 이항연산자라 형변환
		// 정수형의 기본 단위 int (a+b를 int로 인식하기 때문에 byte로 형변환)
		// 해결방법1) a+b 부분을 byte로 만들기 : add cast to byte
		// 해결방법2) change type of 'c' to 'int'
		int d = a+b ;
		
		char ch = 'A' ;
		// 수정전) ch = ch + 2 ; 오류나는 이유
		// +의 두가지 의미 1) 숫자와 숫자사이의 더하기 2) 문자열과 문자열사이에 출력
		// char : 0~65535 음수 없음
		// 1) ch + 2 => 65 + 2 = 67 (int)
		// 2) char = (char)int
		ch = (char)(ch + '2');
		
		}//end main

}//end class
