package day13;

public class Ex006 {
	public static void main(String[] args) {
		/*
		다음 1차원 배열에서 양수중에서 홀수의 합을 구하시오
		int[] su={-3, 5, -1, 9, -7, 2, -11};
		int size=su.length; //5
		
		※ 힌트
		if(-3>0 && -3%2==1){ hap += -3; }
		if(5>0 && -5%2==1){ hap += 5; }
		if(su[0]>0 && su[0]%2==1){ hap += su[0]; }
		if(su[1]>0 && su[1]%2==1){ hap += su[1]; }
		*/
		int[] su={-3,5,-1,9,-7};
		int sum = 0;
		
		for(int i=0; i<su.length; i++) {
			if(su[i]>0 && su[i]%2!=0) { sum += su[i]; }
		}System.out.println("양수중에서 홀수의 합 = " + sum);
	}//end main
}//end class