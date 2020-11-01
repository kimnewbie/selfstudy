package day12;

public class Arr004 {
	public static void main(String[] args) {
		/*
		1. 배열이름이 name인 문자열공간 3개 만드시오
		2. 데이터를 대입하시오 : 아이언맨, 헐크, 캡틴
		3. for + length 이용해서 출력하시오
		*/
		
		String [] name = {"아이언맨", "헐크", "캡틴"};
			for(int i=0; i<name.length; i++) {
				System.out.print(name[i] + "\t");
			}
	}//end main
}//end class