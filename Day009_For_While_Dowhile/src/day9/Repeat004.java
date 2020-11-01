package day9;

public class Repeat004 {
	public static void main(String[] args) {
		/*
		for, while, do while문을 이용해서 다음과 같이 처리하시오.
		1~10까지 3의 배수의 합을 출력하시오.
		1~10까지 3의 배수의 합 : 3+6+9 = 18
		*/
		//[for]
		int hap = 0;
		boolean first = true;
		
		for(int i=1; i<11; i++) {
			if(i%3==0) {
				if(first) { first = false; }
				else { System.out.print("+");}
				System.out.print(i);
				hap += i;
			}//end if
		}//end class
		System.out.println("=" + hap);
		
		//while
		hap = 0; first = true; 	int i=1;
		while(i<11) {
			if(i%3==0) { 
				if(first) { first = false; }
				else { System.out.print("+");}
				System.out.print(i);
				hap += i;	
			}//end if
			i++;
		}//end calss
		System.out.println("=" + hap);
		
		//do while
		hap = 0; first = true; i=1;
		do {
			if(i%3==0) { 
				if(first) { first = false; }
				else { System.out.print("+");};
				System.out.print(i);
				hap += i;
			}//end if
			i++; 
		}//end class
		while(i<11);
		System.out.println("=" + hap);
		
	
	
	}//end main
}//end class
