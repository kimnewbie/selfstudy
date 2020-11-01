package day6;

public class Ex007 {
	public static void main(String[] args) {
		
		byte a = 10;  // 1. 범위가 byte 범위(-128~127까지 포함)때문에 a에 들어감
		byte b = 20;  // 2. 범위가 byte 범위(-128~127까지 포함)때문에 b에 들어감
		byte c = (byte)(a+b);
		// byte c = a+b ;   형변환
		// a와 b는 int보다 작은 자료형(byte, short)은 
		// 기본형식이 int로 변환되기 때문에 타입캐스팅이 필요함
		
		char ch = 'A';
		ch = (char) 'A' ;
		//ch =  ch + 2 ;  형변환
		// (숫자)또는 문자 + 숫자 = 65 + 2 = 67
		// +의 연산의 의미, 한쪽이 숫자면 (문자: 아스키코드는 숫자로 변형됨) + 숫자
		// 숫자 + 숫자
		// char ch = 67 타입캐스팅이 필요함.


		//float f = 3 / 2 ;  
		float f = 3 / 2.f ; // 정수/실수 라서 .f 추가
		long l = 3000 * 3000 * 3000l;  

		float f2 = 0.1f; 
		//double d = 0.1;  
		double d = (float)0.1; // double의 값이 float보다 크기 때문에 형변환(float)
		boolean result = (float)d == f2;
		//boolean result = d == f2;

		System.out.println("c="+c); // [1] 30
		// 10 + 20 = 30 
		System.out.println("ch=" +ch); // [2] A
		// 그대로 출력
		System.out.println("f=" +f); // [3] 1.0 ★틀림★1.5인줄...
		// 3 / 2 = 1.5에서 소수점 버림
		System.out.println("l=" +l); // [4] 27000000000
		// 27,000,000,000
		System.out.println("result="+result); // [5] true
		// d == f2?
		// d = 0.1 , f = 0.1
		
		
	}//end main

}//end class
/*
byte a = 10;  
byte b = 20;  
byte c = a+b ;   

char ch = 'A';
ch =  ch + 2 ;  


float f = 3 / 2 ;  
long l = 3000 * 3000 * 3000l;  

float f2 = 0.1f; 
double d = 0.1;  
boolean result = d == f2;

System.out.println("c="+c);
System.out.println("ch=" +ch);
System.out.println("f=" +f);
System.out.println("l=" +l);
System.out.println("result="+result);		

} // end main
} // end class 
*/