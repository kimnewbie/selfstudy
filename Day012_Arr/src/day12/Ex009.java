package day12;

public class Ex009 {
	public static void main(String[] args) {
		/*
		문자열12345을 1+2+3+4+5 더하기 프로그램 작성
		ㅁ 주어진 옵션
		String str = "12345";
		
		※ str에서 '1'문자 뽑기 - str.charAt(0)
		숫자처리 - str.charAt(0)
				'5' - '0' = 숫자로 5
				'1' - '0' =                                                          
		*/
		
		String str ="12345";
		int sum = 0;	
		boolean first = true;
		
		for(int i=0; i<5; i++) {
			if(first) {first=false;}
			else {System.out.print("+");}
			System.out.print(str.charAt(i));
			
			sum+=str.charAt(i)-'0'; //-'0' 을 안하면 255
			
		}System.out.println("=" + sum);
		
		/*
		문자열.length()
		for(int i=0; i<str.length();){
			sum+=str.charAt(i)-'0';
		}
		System.out.println(sum);
		*/
		
	}//end main
}//end class