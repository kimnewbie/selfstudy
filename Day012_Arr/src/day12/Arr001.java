package day12;

public class Arr001 {
	public static void main(String[] args) {
		/*
		p181~p228
		ㅁArray 배열
			- 하나의 변수에 2개 이상의 동일한 자료형의 값을 저장할 수 있는 공간
			- 공간 변수 < 배열 
				변수 : int a; int b; int c; // 3개까지는 쉽게 만들 수 있음
				배열 : int []arr; //int []까지 자료형
			- (재료) {영역} [번호]
		*/
		int [] arr = {1,2,3};
		// arr = [	 1	 |	 2	 |	 3	 ];
		//	   	   arr[0]  arr[1]  arr[2] ★ 배열인덱스(순서,색인,첨자)는 0부터 시
		System.out.println(arr[0] +"\t"+ arr[1] +"\t"+ arr[2]);
		
		int [] arr2 = {10,20,30};
		int [] arr3 = {1,2,3,4,5}; 		//배열명: arr3 - 1,2,3,4,5
		int [] arr4 = {100,200,300};	//배열명: arr4 - 100,200,300
		char [] arr5 = {'a','b','c'};	//배열명: arr5 - 'a','b','c'
		
		for(int a=0; a<3; a++) {
			System.out.print(arr[a]+"\t");			
		}
		System.out.println("배열의 개수 : " + arr.length);
		for(int a=0; a<arr.length; a++) {System.out.print(arr[a]+"\t");}
		
	}//end main
}//end class
