package day10;

public class Ex004 {
	public static void main(String[] args) {
		/*
		1+(-2)+3+(-4)+... 과 같은 식으로 계속더해나갔을때 , 
		몇까지 더해야 총합이 100이상이 되는지 계산하시오.
		for , while , do while문을 이용해서   처리하시오.
		
		[제일 많이 선택한 버전]
		1 + (-2) + 3 + (-4) + 5 + (-6) + ...
		
		int box = 0;
		ver-1
		for(초기값; 조건문;box가 100보다 작다면 ;증감문){
			box += 1;
			box += -2;
			box += 3;
			box += -4;
		ver-2	
		box가 100보다 작다면
			짝수라면 -1을 곱하던...
			1		 	     i
			-2		2*-1	-i
			3
			-4		4*-1	-i
		
		for(초기값; 조건문 box가 100보다 작다면; 증감문){
			짝수라면 -1곱하기
			box += i;
		}
		
		※ 힌트
		1) 전체 구조
			합이 100보다 작니?
							그러면 더해
		2) 더하는 내용
			내용
			1 + (-2) + 3 + (-4) + 5 + (-6) + ...
			홀수 	 1
			짝수		-2 or 2*(-1)
		3)
			sum += 내용
			
		sum = 합
		s = 부호 스위칭 변수(1, -1)
		num = i*s (더할 값을 구할 변수)
		100이상 : sum >= 100
		
		
		*/
		int s=1, box = 0, num = 0;		
		for(int i=1; box<100; i++) {
			num = i*s; // s *= -1;
			s = -s;
			box += num;				
			
		}
		System.out.println(num + " 까지 더해야 100이상이 된다.");

		
		int i = 1; s=1; box = 0; num = 0;
		while(box<100) {
			num = i*s; // s *= -1;
			s = -s;
			box += num;	
			i++;
		}
		System.out.println(num + " 까지 더해야 100이상이 된다.");

		
		i = 1; s=1; box = 0; s=1; num = 0;
		do {
			num = i*s; // s *= -1;
			s = -s;
			box += num;	
			i++;
		}
		while(box<100);
		System.out.println(num + " 까지 더해야 100이상이 된다.");
		
		//다른 방법
		box=0; num=0;
		for(int j=1; box<100; j++) {
			num++;
			if(j%2==0) { box-=num; }
			else { box+=num; }				
		}//end class
		System.out.println( num + " 까지 더해야 100이상이 된다.");
		
		box=0; num=0;
		int j=1;
		while(box<100) {			
			num++;
			if(j%2==0) { box-=num; }
			else { box+=num; }	
			j++;
		}//end class
		System.out.println( num + " 까지 더해야 100이상이 된다.");
		
		box=0; num=0;
		j=1;
		do{
			num++;
			if(j%2==0) { box-=num; }
			else { box+=num; }			
			j++;
		}//end class
		while(box<100);
		System.out.println( num + " 까지 더해야 100이상이 된다.");		
	}//end main
}//end class