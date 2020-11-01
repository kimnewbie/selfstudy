package day10;

public class For2002 {
	public static void main(String[] args) {
		/*
		이중for를 이용하여 구구단 2~4단 출력하시오
		*/
		
		System.out.println("이중for를 이용하여 구구단 2~4단 출력하시오");
		for(int i=2; i<5; i++) {
			for(int j=1; j<10; j++) {
				System.out.println( i + "*" + j + "=" + i*j);
			}System.out.println();
		}
		
		System.out.println("\nwhile구문");
		int i =2; int j = 1;
		while(i<5) {
			while(j<10) {
				System.out.println( i + "*" + j + "=" + i*j);
				j++;
			}System.out.println();
			i++;
			j=1;
		}
				
		System.out.println("\ndo while구문");
		i =2; j = 1;
		do{
			do{
				System.out.println( i + "*" + j + "=" + i*j);
				j++;
			}while(j<10) ;
				System.out.println();
			i++;
			j=1;
		}while(i<5) ;
	}//end main
}//end class
