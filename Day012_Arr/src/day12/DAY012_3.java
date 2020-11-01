package day12;

public class DAY012_3 {
	public static void main(String[] args) {
		/*
		(for - while - do while)
		JAVA1 JAVA2 JAVA3
		*/
		
		System.out.println("for 구문");
		for(int i=1; i<4; i++) {
			System.out.print("JAVA"+i+"\t");
		}System.out.println();
		
		System.out.println("\r\rwhile 구문");
		int i=1;
		while(i<4) {
			System.out.print("JAVA"+i+"\t");
			i++;
		}System.out.println();
		
		System.out.println("\r\rdo while 구문");
		i=1;
		do {
			System.out.print("JAVA"+i+"\t");
			i++;
		} while(i<4);
			System.out.println();
	}//end main
}//end class
