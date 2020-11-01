package day13;

public class Ex008 {
	public static void main(String[] args) {
		/*
		최대값, 최소값을 구하시오		
		int[] su={-3, -5, -1, -9, -7};
		int size=su.length; //5
		
		※ 힌트
		int max=-99999, min=99999;
		1) 만약 -3이 max보다 크다면 max에 담기 if(-3이 max보다 크다면){max=-3;}//-3
		   만약 -5이 max보다 크다면 max에 담기 if(-5이 max보다 크다면){max=-5;}//-3
		   만약 -1이 max보다 크다면 max에 담기 if(-1이 max보다 크다면){max=-1;}//-1
		*/
		
		int[] su={-3, -5, -1, -9, -7};
		int max = su[0]; // 최대값
		int min = su[0]; // 최소값
		
		for(int i=0; i<su.length; i++) {
			if(max<su[i]) { // max의 값보다 su[i]이 크면 max = su[i]
				max = su[i];
			}
			if(min>su[i]) {
				min = su[i];
			}
		}System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}//end main
}//end class