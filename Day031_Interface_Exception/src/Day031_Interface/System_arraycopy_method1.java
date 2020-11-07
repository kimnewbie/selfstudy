package Day031_Interface;

import java.util.Arrays;

public class System_arraycopy_method1 {
	public static void main(String[] args) {
		
		System.out.println("ver-1");
		int[] arr = {1,2,3};
		int[] temp = new int[arr.length+1]; //(arr.length) 3+1
		
		System.arraycopy(arr,0,temp,0,2); 
		//원본, 배열 몇번째방부터, 새로이, 새로운 배열몇번째부터, 몇개
		System.out.println(Arrays.toString(arr)); //[1, 2, 3]
		System.out.println(Arrays.toString(temp)); //[1, 2, 0, 0]
		
		System.arraycopy(arr,0,temp,0,arr.length);
		// === System.arraycopy(arr,0,temp,0,3);
		System.out.println(Arrays.toString(arr)); //[1, 2, 3]
		System.out.println(Arrays.toString(temp)); //[1, 2, 3, 0]
		
		System.out.println("\n\nver-2");
		char[] arr2 = {'a','b','c','d'}; 
		char[] temp2 = new char[arr2.length]; //4의 배열
		
		System.arraycopy(arr2,1,temp2,0,3);//arr2 1번째 방은 b부터 3개 b,c,d
		System.out.println(Arrays.toString(arr2)); //[a, b, c, d]
		System.out.println(Arrays.toString(temp2)); //[b, c, d, ]
	}
}
