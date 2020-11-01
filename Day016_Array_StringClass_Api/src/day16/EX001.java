package day16;

public class EX001 {
	public static void main(String[] args) {
		/*
		EX001
		다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하시오.
		a. int[] arr[];
		int[] arr1[]; int[][]arr2; 가능
		
		b. int[] arr3 = {1,2,3,};
		마지막에 쉼표가 들어가도 가능(O)
		but 쉼표 뒤에는 데이터x
		확인 방법 : System.out.print(Array.toString(arr3));
		{}데이터를 넣으면 자동으로 메모리를 빌려옴
		
		c. int[] arr = new int[5];
		int [] arr4 = new int[5];
		int [] arr5 = new int[]; ------> 메모리 빌려오는 개수가 몇개인지 알려줘야함
		
		d. int[] arr = new int[5]{1,2,3,4,5}; ------->(X)
		[5]{} 중첩으로 이중 오더가 들어옴
				
		e. int arr[5]; ------->(X)
		
		f. int[] arr[] = new int[3][];
		int[] arr8[] = new int[3][]; (O)
		int[][]arr9 = new int[3][]; (O)
		*/
		System.out.print("잘못된 것 : d - 둘중 하나마나 써야함, e-int arr[] = new int[5]로 사용");
		
		int [] arr_test1 = {1,2,3};
		int [] arr_test2 = new int[3];
		int [] arr_test3 = new int[]{1,2,3};
	}//end main
}//end class
