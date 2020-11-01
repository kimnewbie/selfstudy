package day13;

public class Ex005 {
	public static void main(String[] args) {
		/*
		다음 2차원 배열에서 음수의 개수를 출력하시오
		int[] su={-3,5,-1,9,-7};
		*/
		
		int[] su={-3,5,-1,9,-7};
		int minus = 0;
		
		for(int i=0; i<su.length; i++) {
			if(su[i]<0) { minus++; }
		}System.out.println("음수의 개수 = " + minus + "개");
	}//end main
}//end class