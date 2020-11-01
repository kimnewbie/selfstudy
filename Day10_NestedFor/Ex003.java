package day10;

public class Ex003 {
	public static void main(String[] args) {
		/*
		1+(1+2)+(1+2+3)+.....(1+2+3+....+10)=220의 결과를 계산하시오. 
		for , while , do while문을 이용해서   처리하시오.
		
		※ [힌트1]
					subSum(중간계산)		sum(전체계산)
		1			1					1
		2			3=1+2				4=1+3					
		3			6=1+2+3				10=1+3+6
		...
		9
		10
		
		※ [힌트2]
		int subSum = 0, sum = 0;
		subSum = subSum+1;			sum = sum + 1; => sum + subSum;
		// subSum = 1				sum = 1
		subSum = subSum+2;			sum = sum + 2; => sum + subSum;
		// subSum = 1+2;			sum 1 + (1+2);
		*/
		int sum = 0;
		int subSum = 0;
		boolean first = true;
		
		//ver-1
		//회차		subSum		sum
		//1			1			1			
		//			sub+=1;		sum+=sub;
		//2			1+(2)		1+(1+(2))
		//			sub+=2;		sum+=sub;
		
		for(int i=1; i<11; i++) { // 10회 처리	
			if(first) { first = false; }
			else {System.out.print("+");}
			subSum += i;
			System.out.print(subSum);
			sum += subSum;			
		}
		System.out.print("=" + sum );
		
		System.out.println();
		
		sum = 0; subSum=0; first = true;
		int i = 1;
		while(i<11) {
			if(first) { first = false; }
			else {System.out.print("+");}
			subSum += i;
			System.out.print(subSum);
			sum += subSum;	
			i++;
		}//end class
		System.out.println("=" + sum );
		
		sum = 0; subSum=0; first = true;
		i = 1;
		do{
			if(first) { first = false; }
			else {System.out.print("+");}
			subSum += i;
			System.out.print(subSum);
			sum += subSum;	
			i++;
		}//end class
		while(i<11); 
		System.out.println("=" + sum );
	}//end main
}//end class