package day12;

public class Ex011 {
	public static void main(String[] args) {
		/*
		피보나치 프로그램작성
		ㅁ 주어진옵션
			int num1 = 1, num2=1; int num3=0;
			System.out.println(num1 + "\t,\t" + num2 + "\t,\t" );
			
		ㅁ 출력된 화면
		1,1,2,3,5,8,13,21
		1 2 3
		  1 2 3
		    1 2 3
		*/
		int num1=1, num2=1; int num3=0;
		boolean  first = true;
		//화면 출력: [1	,	1	,	]
		for(int i=0; i<7; i++) {
			if(first) {first=false; System.out.print("1,");}
			else {System.out.print(",");}
			num3=num1+num2; //2=1+1
			num1=num2;
			num2=num3; // 2+1
			System.out.print(num1);
		}
	
	}//end main
}//end class