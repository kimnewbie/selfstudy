package day12;

public class Ex010 {
	public static void main(String[] args) {
		/*
		숫자12345을 1+2+3+4+5 더하기 프로그램 작성
		ㅁ 주어진 옵션
		int num = "12345";
		
		ver-2
		1. 5추출하고
		2. sum에 5더하기
		3. 1234로 만들기
		
		1. 4추출하고
		2. sum에 4더하기
		3. 123로 만들기
		*/
		System.out.println("for 구문");		
		int sum=0;			
		for(int num=12345; num>0; num/=10) {
			sum+=num%10;
			// sum = 5/ 9(4+5)/ 12(3+4+5)/ 14(2+3+4+5)/ 15(1+2+3+4+5)
			// num = 1234/ 123/ 12/ 1	
		}System.out.println(sum);
		
		System.out.println("\r\rwhile 구문");
		int num = 12345;
		sum = 0;
		while(num>0) {
			sum+=num%10; 
			// sum = 5/ 9(4+5)/ 12(3+4+5)/ 14(2+3+4+5)/ 15(1+2+3+4+5)			
			num/=10;	 
			// num = 1234/ 123/ 12/ 1			
		}System.out.println(sum);
		
		System.out.println("\r\rwhile 구문");
		num = 12345;
		sum = 0;
		do {
			sum+=num%10; 
			// sum = 5/ 9(4+5)/ 12(3+4+5)/ 14(2+3+4+5)/ 15(1+2+3+4+5)			
			num/=10;	 
			// num = 1234/ 123/ 12/ 1			
		} while(num>0);
		System.out.println(sum);
		
	}//end main
}//end class