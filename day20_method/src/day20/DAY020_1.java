package day20;

public class DAY020_1 {
	public static void main(String[] args) {
		/*
		 DAY020_1
		 for/while/do while버전으로 작성해주세요
		 class1	class2	class3
		 */
		System.out.println("for구문");
		for(int i=1; i<4; i++) {
			System.out.print("class" + i + "\t");
		}
		System.out.println("\r\rwhile 구문");
		int i=1;
		while( i<4 ) {
			System.out.print("class" + i + "\t");
			i++;
		}System.out.println();
		System.out.println("\rdo while 구문");
		i=1;
		do {
			System.out.print("class" + i + "\t");
			i++;
		}while( i<4 );
		System.out.println();
	}
}
