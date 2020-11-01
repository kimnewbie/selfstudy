package day16;

public class EX004 {
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
		float total = 0.0f;
		float average = 0.0f;
		int count = 0;
		
		for(int f=0; f<arr.length; f++) {
			for(int r=0; r<arr[f].length; r++) { 
				total += arr[f][r]++; 
				count++;
				//average = (float)(total/(4*5)); // 어떻게 배열..... ㅠㅡㅠ 20을 구할까?..... int count를 만들어준다
				//average = (float)total/ (arr.length * arr[0].length); 2층 3칸 = 6개 / 층 * 칸
			} average = total/count;
			}
		System.out.println("total = " + (int)total);
		System.out.println("average = " + String.format("%.2f", average));
	}//end main
}//end class
