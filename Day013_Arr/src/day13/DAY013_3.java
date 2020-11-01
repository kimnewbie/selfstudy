package day13;

public class DAY013_3 {
	public static void main(String[] args) {
		/*
		for, while, do while 버전으로 출력
		100 200 300
		*/
		System.out.println("for 구문");
		for(int i=1; i<4; i++) {
			System.out.print(i*100 + "\t");
		}
		
		System.out.println("\r\rwhile 구문");
		int i=1;
		while(i<4) {
			System.out.print(i*100 + "\t");
			i++;
		}
		
		System.out.println("\r\rdo while 구문");
		i=1;
		do {
			System.out.print(i*100 + "\t");
			i++;
		} while(i<4);
		
	}//end main
}//end class
