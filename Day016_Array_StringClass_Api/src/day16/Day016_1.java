package day16;

public class Day016_1 {
	public static void main(String[] args) {
		/*
		Day016_1
		for, while, do while을 이용하여 happy 3번 출력 
		*/		
		System.out.println("for 구문");
		String emotion = "happy";		
		for(int i=1; i<4; i++) {
			System.out.print(emotion + "\t");
		}
		System.out.println("\r\rwhile 구문");
		int i = 1;
		while(i<4) {
			System.out.print(emotion + "\t");
			i++;
		}
		System.out.println("\r\rdo while 구문");
		i = 1;
		do {
			System.out.print(emotion + "\t");
			i++;
		} while(i<4);
	}//end main
}//end class
