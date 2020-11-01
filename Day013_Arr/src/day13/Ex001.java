package day13;

public class Ex001 {
	public static void main(String[] args) {
		/*
		char ch[] = {'B', 'a', 'n', 'a', 'n', 'a'};
		a의 개수를 출력하시오
		
		※ 힌트
		1) 만약 'B'가 a라면 카운트 증가 - 카운트할변수필요
		   만약 'a'가 a라면 카운트 증가 - 카운트할변수필요
		   
		2) 위의 구문을 for로 줄이기
		*/
		System.out.println("char ch[] = {'B', 'a', 'n', 'a', 'n', 'a'}; \r\n"
				+ "a의 개수를 출력하시오");
		char ch[] = {'B', 'a', 'n', 'a', 'n', 'a'};
		int cnt = 0;
		// 위까지가 설명
		System.out.println(ch.length);		 // 6 배열의 개수 출력
		System.out.println(ch[ch.length-1]); // a 배열의 가장 마지막요소 출력
		System.out.println(ch[0]);			 // B 배열의 첫번째 요소 출력
		
		for(int i=0; i<ch.length; i++) {				
			if(ch[i]=='a') {cnt++;}
		}System.out.println("a의 개수 = " + cnt++);
		
	}//end main
}//end class
