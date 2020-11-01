package day13;

public class DAY013_5 {
	public static void main(String[] args) {
		/*
		1. 배열이름 arr인 정수형공간 3개 만드시오     ={}; (new연산자 아님)
			초기화 방법을 이용하여 10, 20, 30을 대입하시오
		2. for+length 이용해서 출력하시오
		*/
		
		int[] arr = {10,20,30};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}//end main
}//end class
