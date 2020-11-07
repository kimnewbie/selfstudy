package Day031_Interface;

import java.util.Arrays;

public class System_arraycopy_method2 {
	public static void main(String[] args) {
		
		String[] listOfCities = new String[3];   // array created with size 3.
		listOfCities[0] = "New York";
		listOfCities[1] = "London";
		listOfCities[2] = "Berlin";
		
		String[] newArray = new String[listOfCities.length+1];
		//(1)크기가 4인 새배열 만들기
		System.arraycopy(listOfCities,0,newArray,0,listOfCities.length);
		//(2)이전배열의 기존 3요소를 오프셋 0,1 및 2의 새 배열에 복사하고
		newArray[listOfCities.length] = "Sydney";
		//(3)새요소를 오프셋3의 새 배열에 추가
		System.out.println(Arrays.toString(newArray));
		
		String[] newArray2 = Arrays.copyOf(listOfCities, listOfCities.length + 1);
		newArray2[listOfCities.length] = "Sydney";
		/////////////////////////////////////////////////////////////
		
		System.out.println(Arrays.toString(newArray2));
	      int arr1[] = { 0, 1, 2, 3, 4, 5 };
	      int arr2[] = { 5, 10, 20, 30, 40, 50 };
	    
	      // copies an array from the specified source array
	      System.arraycopy(arr1, 0, arr2, 0, 2);
	      System.out.print("arr2 = " + Arrays.toString(arr2)); //[0, 1, 20, 30, 40, 50]
	
		}//end main
}//end class
