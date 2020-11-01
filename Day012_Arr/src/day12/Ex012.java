package day12;

public class Ex012 {
	public static void main(String[] args) {
		/*
		문자열이 숫자인지 판별하는 프로그램 작성하시오.
		ㅁ 주어진옵션
			String value = "12o34";
			char ch = ' ';
			boolean num = true;
		ㅁ 출력된 화면
			12o34는 숫자가 아닙니다.
		*/
		String value = "12o34";
		char ch = ' ';
		boolean num = true;
				
		for(int i=0; i<5; i++) {
			ch = value.charAt(i);
			if('0'<=ch&&ch<='9') {
				num = false;}
			
		}System.out.println(num);
	
	}//end main
}//end class