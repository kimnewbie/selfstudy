package day13;

public class Ex003 {
	public static void main(String[] args) {
		/*
		알파벳에서 모음의 개수를 구하시오
		1. char ch []; 배열만들기
		for문을 이용해서 대문자와 소문자 데이터 삽입하기
		
		2. 알파벳에서 모음이 개수를 구하시오 a e i o u A E I O U
		
		※ 힌트
		1) char[] ch = new char[52];
		   ch[0] = 'A'; ch[1] = 'B'; .... ch[25]='Z'; 
		   ★★만약 25번이라면 소문자로 초기화
		   ★★만약 data가 Z라면 그 다음 데이터를 소문자로 초기화
		   ch[26] = 'a';
		
		2)  char data = 'A';
			for(int i=0; i<ch.length; i++){
			★★만약 25번이라면 소문자 'a'로 초기화
		    ★★만약 data가 Z라면 그 다음 데이터를 소문자 'a'로 초기화
		    if(data=='Z'){ data='a'; }
		    
		3)
		char data ='A'
		ch[0] = data++;	ch[1] = data++;	ch[2] = data++;	
		for(int i=0; i<ch.length; i++){
			ch[i] = data++;
			//1. 'Z' 라면 데이터 삽입후 데이터를 'a'로 처리
			  2. 알파벳모음의 범위라면 카운트 증가
		} 
		*/
		
		char[] ch = new char[52];
		char data = 'A';
		int count = 0 ;
		
		for(int i=0; i<ch.length; i++) {
			ch[i] = data++;
			if(ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||
					ch[i]=='U'||ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||
					ch[i]=='o'||ch[i]=='u') {
				count++;
			}
			if(i==25) {
				data='a';
			}
		}System.out.println("모음의 개수 : " + count);
	
	}//end main
}//end class

/* [선생님 답]
char[] ch = new char[52];
char data = 'A';  // 'A'부터 시작하기 위해서
int cnt = 0;

for(int i=0; i<ch.length; i++) {
	ch[i] = data++;
	if(i==25) { data = 'a'; } // i==25면 ch[25] 0부터 시작이라 26번째부터 시작!
	switch(ch[i]) {
	case 'a': case 'i': case 'u': case 'e': case 'o':
	case 'A': case 'I': case 'U': case 'E': case 'O': cnt++;
	}
}
for(int i=0; i<ch.length; i++) {
	System.out.print(ch[i]);
}
System.out.println("\r\n알파벳모음 개수 : " + cnt);
*/