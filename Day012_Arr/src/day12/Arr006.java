package day12;

public class Arr006 {
	public static void main(String[] args) {
		/*
		1. 배열이름이 arrfloat인 실수형공간 5개 만드시오
		2. for + length를 이용하여 데이터를 대입하시오 : 1.1, 1.2, 1.3, 1.4, 1.5
		3. for + length 이용하여 출력하시오
		*/
		float data = 1.f;
		float [] arrfloat = new float[5];
		for(int i=0; i<arrfloat.length; i++) {			
			data += 0.1f; arrfloat[i]=data;
			System.out.print(String.format("%.1f", data) + "\t");
		}
	}//end main
}//end class
