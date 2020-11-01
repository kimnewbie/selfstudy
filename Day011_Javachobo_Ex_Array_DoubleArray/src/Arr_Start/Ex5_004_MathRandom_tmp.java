package Arr_Start;
import java.util.Arrays;

class Ex5_004_MathRandom_tmp {
	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9}; //처음부터 겹치는 숫자가 없으므로 랜덤값도 중복값이 나올 수 없음
		System.out.println(Arrays.toString(numArr));//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

		for (int i=0; i < 100; i++ ) { //100번섞기
			int n = (int)(Math.random() * 10);  // 0~9 중의 한 값을 임의로 얻는다.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;//numArr[0]과 numArr[n]의 값을 서로 바꾼다.
		}
		System.out.println(Arrays.toString(numArr));
	} // main의 끝
}