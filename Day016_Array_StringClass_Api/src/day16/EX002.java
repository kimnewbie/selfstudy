package day16;

import java.util.Arrays;

public class EX002 {
	public static void main(String[] args) {
		/*
		EX002
		다음과 같은 배열이 있을 때 arr[3].length의 값은 얼마인가
		int[][] arr = {
			{5,5,5,5,5}, 
			{10,10,10},
			{20,20,20,20},
			{30,30}};
			
		*/
		int[][] arr = {
				{5,5,5,5,5}, 
				{10,10,10},
				{20,20,20,20},
				{30,30}};
		
		System.out.println("답 : {30,30} = 2개");
		System.out.println();
		System.out.println("1. 배열층수 : " + arr.length);
		System.out.println("2. arr[3]의칸수 : " + arr[3].length);
		
		System.out.println( Arrays.toString(arr) );
		//주소 위치 나타냄
		//[[I@7de26db8, [I@1175e2db, [I@36aa7bc2, [I@76ccd017]
		System.out.println( Arrays.deepToString(arr) ); //ctrl + shift + o 스캐너 처럼 사용		
		//값 나타냄
		//[[5, 5, 5, 5, 5], [10, 10, 10], [20, 20, 20, 20], [30, 30]]
		
	}//end main
}//end class
