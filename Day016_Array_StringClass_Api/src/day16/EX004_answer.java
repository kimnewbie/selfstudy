package day16;

public class EX004_answer {
	public static void main(String[] args) {
		/*
		EX004
		2차원 배열에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오
		
		int[][] arr = {
		{ 5, 5, 5, 5, 5},
		{10,10,10,10,10},
		{20,20,20,20,20},
		{30,30,30,30,30} };
		
		ㅁ 출력된 화면
		total = 325
		average = 16.25
		*/
		
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30} };
		
		int total = 0;
		double average = 0;
		for(int f=0; f<arr.length; f++) {
			for(int r=0; r<arr[f].length; r++) { total += arr[f][r]; }}
		average = (double)total/(arr.length*arr[1].length);
		
		System.out.println(total);
		System.out.println(average);
	}//end main
}//end class
