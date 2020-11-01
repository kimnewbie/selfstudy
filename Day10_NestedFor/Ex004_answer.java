package day10;

public class Ex004_answer {
	public static void main(String[] args) {
		int box = 0 ;
		int i = 0;
		boolean first = true;
		for(i=1; box<100; i++) { //box의 합이 100보다 작다면 계속 반복해서 더하기
			//1. 짝수라면 음수로 만들기 (i%2==1)? i: i*-1 or -i
			//2. 더하기
			if( first) {first=false;}
			else {System.out.print("+");}
			box += (i%2==1)? i:-i;	
			System.out.print( box );
			//System.out.println( i + "\t" + box); 결과 확인하는 출력구문 만들어주세요
			if(box>=100) {System.out.println("="+i);}
		}
		
		box=0; i=1; 
		while(box<100) {
			box += (i%2==1)? i:-i;						
			if(box>=100) {System.out.println(i);}
			i++;
		}//end class
		
		
		box=0; i=1; 
		
		do{
			box += (i%2==1)? i:-i;						
			if(box>=100) {System.out.println(i);}
			i++;
		}//end class
		while(box<100); 
		
	}//end main
}//end class
