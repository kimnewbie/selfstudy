package Arr_Start;

import java.util.Arrays;

class Ex5_006_RockScissorsPaper {
	public static void main(String[] args) {
		String[] strArr = {"가위","바위","보"};
		System.out.println(Arrays.toString(strArr)); //[가위, 바위, 보]
		
		for(int i=0; i<strArr.length; i++) {
			int tmp = (int)(Math.random()*3); //0,1,2
			System.out.println(strArr[tmp]); //가위, 바위, 보
		}
	} // main
} 