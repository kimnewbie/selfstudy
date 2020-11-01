package day16;

import java.util.Arrays;

public class EX005 {
	public static void main(String[] args) {
		/*
		EX005
		중복되지 않은 숫자로 이루어진 자리 숫자를 만들어내는 프로그램이다
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		//배열의 임의의 요소를 골라서 위치를 바꾼다
		for(int i=0; i<ballArr.length;i++){
			int j= (int)(Math.random() * ballArr.length);
			int tmp = 0;}
			(1)알맞은 코드를 넣어 완성하시오
			자리바꾸기 이용하기		
		//		
		for(int i=0; i<ball3.length; i++){
			System.out.print(ball3[i]);
		}
		= System.out.println( Arrays.toString(ball3) );
		를 사용하면 i를 안씀
		
		ㅁ 출력된화면
		[7, 2, 5]
		*/		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		for(int i=0; i<ballArr.length;i++){
			int j= (int)(Math.random() * ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		System.out.println(Arrays.toString(ballArr)); // 숫자 ballArr중 9개 랜덤 출력
		
		for(int i=0; i<ball3.length; i++) {
			ball3[i] = ballArr[i];
			System.out.print(ball3[i] + "\t");			
		}
		System.out.println(Arrays.toString(ball3));
		
	}//end main
}//end class

/*
자리 바꾸기
int a = 10, b = 20, backup = 0;	[backup:	||a:10	||b:20]
backup = a;						[backup:10	||a:10	||b:20]
a = b;							[backup:10	||a:20	||b:20]
b = backup;						[backup:10	||a:20	||b:10]
*/
