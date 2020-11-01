package day10;

public class DAY10_3 {
	public static void main(String[] args) {
		/*
		1. for, while, do while문을 이용해서 다음과 같이 출력하시오 : 1 2 3 4 5
		2. for, while, do while문을 이용해서 다음과 같이 출력하시오 : 5 4 3 2 1
		*/
		System.out.println("1번 문제");
		
		for(int i=1; i<6; i++) {System.out.print(i + "\t");}
		
		System.out.println();
		
		int i = 1;
		while(i<6) {
			System.out.print(i + "\t");
			i++;
			}
		
		System.out.println();
		
		i =1;
		do {
			System.out.print(i + "\t");
			i++;
		} 
		while (i<6);
		
		
		System.out.println("\r\n2번 문제");
		
		
		for(int j=5; j>0; j--) {System.out.print(j + "\t");}
		
		System.out.println();
		
		int j=5;
		while(j>0) {
			System.out.print(j + "\t");
			j--;
		}
		
		System.out.println();
		
		j =5;
		do {
			System.out.print(j + "\t");
			j--;
		} 
		while (j>0);
		
			
	}//end main
}//end class
