package day10;

public class Ex005 {
	public static void main(String[] args) {
		
		for(int i=1; i<12; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("while구문");
		int i=1; int j=1;
		while(i<12) {
			while(j<=i) {
				System.out.print("*");
				j++;
			}System.out.println();
			i++;
			j=1;
		}
		
		System.out.println();
		
		System.out.println("do while구문");
		i=1; j=1;
		do {
			do {
				System.out.print("*");
				j++;
			}while(j<=i); 
			System.out.println();
			i++;
			j=1;
		}while(i<12) ;
		
	}//end main
}//end class
