package day13;

public class Ex002 {
	public static void main(String[] args) {
		/*
		char ch[] = {'B', 'a', 'n', 'a', 'n', 'a'};
		대문자와 소문자의 개수를 출력하시오
		*/
		char ch[] = {'B', 'a', 'n', 'a', 'n', 'a'};
		int upper = 0;
		int lower = 0;
		
		for(int i=0; i<ch.length; i++) {
			if('A'<=ch[i] && ch[i]<='Z') {
				upper++;
			}
			else if('a'<=ch[i] && ch[i]<='z') {
				lower++;
			}
		}System.out.println("대문자 개수 : " +  upper + "\t소문자 개수 : " + lower);
	}//end main
}//end class