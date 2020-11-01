package day10;

public class Ex001 {
	public static void main(String[] args) {
		/*
		다음문장들을 조건식으로 출력하시오.
		q1-1 int형 변수 x가 10보다 크고 20보다 작을때 true인 조건식 
		q1-2 char형 변수 ch가 공백이나 탭이 아닐때  true인 조건식 
		q1-3 char형 변수 ch가 'x' 또는 'X'일때   true인 조건식    
		q1-4 char형 변수 ch가 숫자('0'~'9')일때   true인 조건식     
		q1-5 char형 변수 ch가 영문자(대문자 또는 소문자) 일때   true인 조건식
		q1-6 윤년의 조건식
		q1-7 boolean형 변수 powerOn가 false일때   true인 조건식  
		q1-8 문자열 참조변수 str이 \"yes\" 일때  true인 조건식	 
		*/
		
		System.out.println("q1-1 int형 변수 x가 10보다 크고 20보다 작을때 true인 조건식");
		int x = 15; System.out.println("if(x>10 && x20);");
		
		System.out.println("q1-2 char형 변수 ch가 공백이나 탭이 아닐때  true인 조건식 식");
		char ch = ' ';System.out.println(!(ch==' ' || ch=='\t'));
		
		System.out.println("q1-3 char형 변수 ch가 'x' 또는 'X'일때   true인 조건식");
		ch = 'x';System.out.println(ch=='x'||ch=='X');
		
		System.out.println("q1-4 char형 변수 ch가 숫자('0'~'9')일때   true인 조건식");
		ch = '0'; System.out.println('0'<=ch && ch<='9');
		
		System.out.println("q1-5 char형 변수 ch가 영문자(대문자 또는 소문자) 일때   true인 조건식");
		ch = 'Z';System.out.println('a'<=ch && ch<'z'||'A'<=ch && ch<='Z');
		
		System.out.println("q1-6 윤년의 조건식");
		int year = 2020; System.out.println(x%4==0&&x%100!=0||x%400==0);
		
		System.out.println("q1-7 boolean형 변수 powerOn가 false일때   true인 조건식");
		boolean powerOn = false; System.out.println(powerOn != true);
								 System.out.println(powerOn == false);
								 
		System.out.println("q1-8 문자열 참조변수 str이 \\\"yes\\\" 일때  true인 조건식");						 
		String str = ""; System.out.println(str.equals("yes"));
		
	}//end main
}//end class
