package day10;

public class Practice001 {
	public static void main(String[] args) {
		/*
		
		*
		**
		***
		****
		*****
		
		*/
		//i=1,2,3,4,5번 {}안의 내용을 반복
		for(int i=1; i<6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
