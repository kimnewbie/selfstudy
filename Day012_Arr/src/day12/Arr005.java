package day12;

public class Arr005 {
	public static void main(String[] args) {
		/*
		1. 배열이름이 arr인 정수형 공간 3개 만드시오
		2. for + length를 이용하여 데이터를 대입하시오 : 10 20 30
		3. for + length 이용해서 출력하시오
		*/
		int [] arr = new int[3]; // new(공간빌려오기) int(정수형) [개수]
		// arr[0] arr[1] arr[2]
		
		/*
		ver1
		arr[0] = 10; 
		arr[1] = 20; 
		arr[2] = 30;		
		/ver2
		int data = 0;
		data=data+10; arr[0] = data;
		data=data+10; arr[1] = data;		
		data=data+10; arr[2] = data;
		*/
		
		//ver3
		int data = 0;
		for(int i=0; i<arr.length; i++) {
			data=data+10; arr[i] = data;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}//end main
}//end class
