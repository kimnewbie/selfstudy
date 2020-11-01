package day13;

public class Ex007 {
	public static void main(String[] args) {
		/*
		su[4] 요소의 등수를 구하시오 // -7은 4등
		int[] su={-3, -5, -1, -9, -7};
		int rank = 0;
		int size=su.length; //5
		
		※힌트
		1)
		1등. 	-1
		2등.. 	-3
		3등... 	-5
		4등.... 	-7
		5등..... -9
		
		2)
		-7과 -3을 비교해서 -7이 작다면 등수늘리기 rank++; -7 : 2등
		-7과 -5를 비교해서 -5이 작다면 등수늘리기 rank++; -7 : 3등
		-7과 -1을 비교해서 -1이 작다면 등수늘리기 rank++; -7 : 4등
		-7과 -9를 비교해서 -9이 작다면 등수늘리기 rank++; -7 : 5등
		-7과 -7을 비교해서 -7이 작다면 등수늘리기 rank++; -7 : 5등
		
		if(-7 < -3){rank++}
		
		3)
		if(-7과 -7을 비교해서 -7이 작다면)
		if(su[4]과 su[0]을 비교해서 -7이 작다면){ rank++ }
		if(su[4]과 su[1]을 비교해서 -7이 작다면){ rank++ }
		if(su[4]과 su[2]을 비교해서 -7이 작다면){ rank++ }
		*/
		
		int[] su={-3, -5, -1, -9, -7};
		int rank = 0;
		for(int i=0; i<su.length; i++) {
			if(su[4]<=su[i]) { // <= 아니라 < 할꺼면 rank=0; 을 rank=1; 로
				rank++;
				System.out.print(su[i] + "\t");
			}
		}System.out.println("\r\rsu[4] 요소의 등 수 : " +rank);
	}//end main
}//end class