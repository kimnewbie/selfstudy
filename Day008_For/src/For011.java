
public class For011 {
	public static void main(String[] args) {
		/*
		[연습문제]     클래스명 : For011
 	 	1~10중에서 짝수의 합계를 구하시오.
	 	*/
		int hap = 0;
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				hap += i;
			}
		}

		System.out.print("1~10중에서 짝수의 합계 : " + hap );
		
	}//end main
}//end class
