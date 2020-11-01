package day12;

public class Arr003 {
	public static void main(String[] args) {
		/*
		1. 배열이름이 ch인 문자공간 5개를 만드시오
		2. 데이터를 대입하시오 : A B C D E
		3. for + length 이용해서 출력하시오
		*/
		
		char [] ch = {'A','B','C','D','E'};
		
		for(int a=0; a<ch.length; a++) {
			System.out.print(ch[a] + "\t");
		}
	}//end main
}//end class