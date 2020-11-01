
public class For006 {
	public static void main(String[] args) {
		/*
		1~10까지 3의 배수의 합을 출력하시오.
 		1~10까지 3의 배수의 합 : 3+6+9 = 18
	 	*/
		//변수
		int hap = 0; // 전체 합을 담을 box
		boolean first = true;
		//입력
		//처리
		//ver-1 3의 배수라면 합해랏
		/*
		System.out.print( 3 + " + "); // 만약에 3의 배수라면
		System.out.print( 6 + " + "); // 만약에 3의 배수라면
		System.out.print( 9 + " = "); // 만약에 3의 배수라면
		System.out.print( 18 ); // 만약에 3의 배수라면
		*/
		//ver-2 for문 정리
		//만약 1이 3의 배수라면
		/*
		if( 1%3 == 0 ) { hap += 1; System.out.print(	   + 1 );}
		if( 2%3 == 0 ) { hap += 2; System.out.print( " + " + 2 );}
		if( 3%3 == 0 ) { hap += 3; System.out.print( " + " + 3 );}
		System.out.println( " = " + hap);
		*/
		//ver-3 for문 정리			
		for(int i=1; i<=10; i++) {
			if( i%3 == 0 ) {
				if( first ) { first = false; } // 처음엔 true라서 통과
				else { System.out.print("+");} // 하지만 false로 바껴서 
				hap += i ;					   // 뒤부턴 + 붙어서 출력
				System.out.print(i);				
			}
		}
		//출력
		System.out.print("=" + hap);
	}//end main
}//end class