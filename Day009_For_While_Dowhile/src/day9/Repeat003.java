package day9;

public class Repeat003 {
	public static void main(String[] args) {
		/*
		for, while, do while문을 이용해서 다음과 같이 처리하시오.
		1~10까지 3의 배수 갯수를 출력하시오.
		1~10까지 3의 배수 : 3
		*/

		int num = 0;
		for(int i=1; i<11; i++) {
			if(i%3==0) { num++; }			
			} System.out.println("1~10까지 3의 배수 : " + num );
		
		num = 0;
		int i=1;
		while(i<11) {
			if(i%3==0) { num++; }	
			i ++;
		} System.out.println("1~10까지 3의 배수 : " + num );
		
		num = 0; i=1;
		do{if(i%3==0) { num++; } i++; }while(i<11);
		System.out.println("1~10까지 3의 배수 : " + num );
	}//end main
}//end class
