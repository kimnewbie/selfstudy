package day12;

public class Ex006 {
	public static void main(String[] args) {
		/*
		두개의 주사위를 던졌을 때 눈의 합이 6이 되는 
		모든 경우의 수를 출력하는 프로그램 작성
		출력화면 :
		1+5=6
		2+4=6
		3+3=6
		4+2=6
		5+1=6
		
		※힌트
		1. 만약 x + y =6 => (x+y)==6
		2. 첫번째 주사위 : 1~6	1 2 3 4 5 
		   두번째 주사위 : 1~6	5 4 3 2 1
		*/
		
		for(int i=1; i<7; i++) { // 1번째 주사위의 경우의 수
			for(int j=1; j<7; j++) { // 2번째 주사위의 경우의 수 
				if(i+j==6) {System.out.print(i + "+" + j + "=" + (i+j));}
			}System.out.println();
		}//end for
		
	}//end main
}//end class
