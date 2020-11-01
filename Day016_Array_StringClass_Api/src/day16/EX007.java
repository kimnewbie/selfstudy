package day16;

import java.util.Arrays;

public class EX007 {
	public static void main(String[] args) {
		/*★★설명다시봐
		EX007
		각 숫자의 개수를 세어서 개수만큼 answer '*'을 찍어서 그래프를 그리는 프로그램이다
		ㅁ 출력된 화면
		1***
		2**
		3**
		4****
		
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		for(int i=0; i<answer.length; i++){
			(1) 알맞은 코드를 넣어 완성하시오
		}
		for(int i=0; i<counter.length; i++){
			(2) 알맞은 코드를 넣어 완성하시오
			System.out.println();
		}
		*/
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2}; // 0층 11칸
		int[] counter = new int[4]; //[0,0,0,0] 박스라고 생각해
		for(int i=0; i<answer.length; i++){	//answer.length=11
			/*		
			counter[answer[0]-1]++; counter[0] = 1자리
			counter[answer[1]-1]++; counter[3] = 4자리
			counter[answer[2]-1]++; counter[3] = 4자리
			counter[answer[3]-1]++; counter[2] = 3자리
			counter[answer[4]-1]++; counter[0] = 1자리
			counter[answer[5]-1]++; counter[3] = 4자리
			counter[answer[6]-1]++; counter[3] = 4자리
			counter[answer[7]-1]++; counter[1] = 2자리
			counter[answer[8]-1]++; counter[0] = 1자리
			counter[answer[9]-1]++; counter[2] = 3자리
			counter[answer[10]-1]++; counter[1] = 2자리
			*/
			counter[answer[i]-1]++; // 3,2,2,4
		}System.out.println();
		
		System.out.println(Arrays.toString(counter));
		/*
		for(int i=0; i<3; i++){System.out.print("*");
		System.out.println();
		for(int i=0; i<counter[1]; i++){System.out.print("*");
		System.out.println();
		*/
		for(int f=0; f<counter.length; f++) { //counter.length=4
			System.out.print(f+1); //f=0,1,2,3 [+1] 1,2,3,4
			for(int r=0; r<counter[f]; r++) { //counter[f]=3 2 2 4
				System.out.print("*");
				}System.out.println();
			}
		
	}//end main
}//end class
