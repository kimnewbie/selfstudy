package day12;

public class Arr002 {
	public static void main(String[] args) {
		/*
		1. 배열이름이 arrfloat인 실수형 공간 5개 만드시오
		2. 데이터를 대입하시오 : 1.1 , 1.2 , 1.3, 1.4, 1.5
		3. for + length 이용해서 출력하시오
		*/
		
		float [] arrfloat = {1.1f , 1.2f , 1.3f, 1.4f, 1.5f};
		//					 [0]	[1]		[2]	 [3]	[4]
		for(int i=0; i<arrfloat.length; i++) {
			System.out.print(arrfloat[i] + "\t");			
		}
	}//end main
}//end class
