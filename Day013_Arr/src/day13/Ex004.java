package day13;

public class Ex004 {
	public static void main(String[] args) {
		/*
		대소문자 서로 바꿔서 출력하시오		
		char ch[] = {'B', 'a', 'n', 'a', 'n', 'a'}; 
		출력된 결과 : bANANA!
		
		※ 힌트
		1) 만약 'B'가 대문자의 범위라면 소문자로 변경 - 'a'(97) = 'A'(65) + 32
		   만약 'B'가 소문자의 범위라면 대문자로 변경 - 'A'(65) = 'a'(97) + 32
		*/
		
		System.out.println((int)'a');				//97
		System.out.println((int)'A');				//65
		System.out.println('a'-'A');				//32
		System.out.println((char)('A'+32));			//a
		System.out.println((char)('A'+('a'-'A')));	//a
		
		char ch[] = {'B', 'a', 'n', 'a', 'n', 'a'};
		for(int i=0; i<ch.length; i++) {
			if('A'<=ch[i] && ch[i]<='Z') {
				ch[i] =(char)(ch[i]+32); //아스키코드 32만큼 차이
				System.out.print(ch[i]);
			}
			else if('a'<=ch[i] && ch[i]<='z') {
				ch[i] =(char)(ch[i]-32);
				System.out.print(ch[i]);
			}
		}System.out.println("!");
	}//end main
}//end class

		/*[답]
		char ch[] = {'B', 'a', 'n', 'a', 'n', 'a'};
		for(int i=0; i<ch.length; i++) {
			if('A'<=ch[i] && ch[i]<='Z') { ch[i]+=('a'-'A'); } //ch[i]+=32;
			else if('a'<=ch[i] && ch[i]<='z') { ch[i]-=('a'-'A'); } //ch[i]-=32;
		} // else if 대신 if를 사용하면 모든 문자가 대문자로 출력 : BANANA!
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
		System.out.print("!");
		*/