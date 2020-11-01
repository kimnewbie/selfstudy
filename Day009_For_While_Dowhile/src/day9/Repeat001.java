package day9;

public class Repeat001 {
	public static void main(String[] args) {
		System.out.println("REPEAT001");
		//for 1 2 3 (출력)
		for(int i=1; i<4; i++) {System.out.print(i + "\t");} // 1 2 3
		//while
		// 1. 초기값 		2. 조건식		3. 증감문
		System.out.println();
		int i = 1; // 초기값을 바꾸면 실행이 알 될 수 있음.
		while(i<4){		System.out.print(i + "\t"); i++;	}
		
		//do while
		System.out.println();
		int j = 1;
		do{	System.out.print(j + "\t"); i++;}while(j<4);
		
	}//end main
}//end class
