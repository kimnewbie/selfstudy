package day16;

public class EX003 {
	public static void main(String[] args) {
		/*
		EX003
		배열에 담긴 모든 값을 더하는 프로그램을 완성하시오
		int[] arr = {10,20,30,40,50};
		int sum  = 0;
		
		ㅁ출력된 화면
		sum = 150
		*/
		int[] arr = {10,20,30,40,50};
		int sum  = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];	//반복되는 값을 {} 안에 넣기
		} System.out.println("sum = " +sum);
	}//end main
}//end class
