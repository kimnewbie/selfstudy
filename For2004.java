package day10;

public class For2004 {
	public static void main(String[] args) {
		/*
		[기본] 클래스명 : For2004
	    1
	    22
	    333
	    4444
		System.out.println("\n\n[ver-1]");
		System.out.print(1);											System.out.println();
		System.out.print(2);System.out.print(2);						System.out.println();
		System.out.print(3);System.out.print(3);System.out.print(3);	System.out.println();
		
		System.out.println("\n\n[ver-2]");
		for(int i=0; i<1; i++) {System.out.print(1);} System.out.println();
		for(int i=0; i<2; i++) {System.out.print(2);} System.out.println();
		for(int i=0; i<3; i++) {System.out.print(3);} System.out.println();
		for(int i=0; i<4; i++) {System.out.print(4);} System.out.println();
		*/
		
		System.out.println("\n\n[ver-3]");		
		for(int i=1; i<5; i++) {
			for(int a=1; a<=i; a++) {
				System.out.print(i);
			}System.out.println();
		}
		
		System.out.println("\n\nwhile구문");	
		int i=1; int a=1;
		while(i<5) {
			while(a<=i) {
				System.out.print(i);
				a++;
			}System.out.println();
			i++;
			a = 1;
		}
		
		System.out.println("\n\ndo while구문");	
		i=1; a=1;
		do{
			do{
				System.out.print(i);
				a++;
			}while(a<=i) ;
			System.out.println();
			i++;
			a = 1;
		}while(i<5) ;
		
	}//end main
}//end class
