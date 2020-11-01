package day12;

public class Ex008 {
	public static void main(String[] args) {
		/*
		2x+4y=10의 해(정답)를 구하시오.
		(0<=x<=10, 0<=y<=10) 출력하는 프로그램 작성
		출력화면 :
		x=1, y=2
		x=3, y=1
		x=5, y=0
		
		※힌트
		1. (0<=x<=10, 0<=y<=10)			
		2. 2x+4y=10		
		*/
		
		for(int i=0; i<11; i++) {
			for(int j=0; j<11; j++) {
				if(2*i + 4*j==10) {System.out.print("x=" +i + ", y=" + j);}
			}System.out.println();
		}
	}//end main
}//end class