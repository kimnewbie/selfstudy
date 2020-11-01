package day10;

public class For2003 {
	public static void main(String[] args) {
		/*
		1234          
	    1234
	    1234
	    1234
		*/
		System.out.println("\n\n[ver-1]");
		System.out.print(1);System.out.print(2);System.out.print(3);System.out.print(4);
		
		System.out.println("\n\n[ver-2]");
		for(int i=1; i<5; i++) {System.out.print(i);}System.out.println();
		for(int i=1; i<5; i++) {System.out.print(i);}System.out.println();
		for(int i=1; i<5; i++) {System.out.print(i);}System.out.println();
		for(int i=1; i<5; i++) {System.out.print(i);}System.out.println();
		
		System.out.println("\n\n[ver-3]");
		for(int i=1; i<5; i++){
			for(int j=1; j<5; j++) {System.out.print(j);} System.out.println();
		}
		
		/* 내꺼 오답
		for(int i=1; i<5; i++) {
			for(int j=1; j<2; j++) {
					System.out.print("1234");}System.out.println();
		}		
		*/
		
		System.out.println("\n\nwhile구문");
		int j=1; int i=1;
		while(i<5) {
			while(j<5) {
				System.out.print(j);
				j++;
			}System.out.println();
			i++;
			j=1;
		}
		System.out.println("\n\ndo while구문");
		j=1; i=1;
		do{
			do{
				System.out.print(j);
				j++;
			}while(j<5) ;
			System.out.println();
			i++;
			j=1;
		}while(i<5) ;
	}//end main
}//end class
