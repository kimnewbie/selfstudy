package StringClass;

import java.util.Arrays;

public class Ex002 {

	public static void main(String[] args) {
		int[] 	arr   = {0,1,2,3,4}; // 1차원 배열 arr
		int[][] arr2D = {{11,12},{21,22}}; // 2차원 배열 
		
		System.out.println(Arrays.toString(arr)); //[0,1,2,3,4]
		System.out.println(Arrays.deepToString(arr2D)); //[[11,12],[21,22]]

		String[][] str2D  = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D,str2D2)); //false
		System.out.println(Arrays.deepEquals(str2D,str2D2)); //true
		
	}

}
