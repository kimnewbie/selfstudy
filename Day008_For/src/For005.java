
public class For005 {
	public static void main(String[] args) {
		/*
  	 	1~10까지 3의 배수 개수를 출력하시오.
	 	1~10까지 3의 배수 : 3
		 */
		
		//변수
		int hap = 0; // 전체 합을 담을 box
		//입력
		//처리
		//ver-1 3의 배수라면 hap 숫자 1 증가
		/*
		if ( 1%3== 0) { hap++; }	//X
		if ( 2%3== 0) { hap++; }	//X
		if ( 3%3== 0) { hap++; }	//O
		*/
		//ver-2 for문 정리
		for(int i=1; i<=10; i++) {			//10회 반복
			if( i%3 == 0) { hap++ ; }		//3의 배수라면 hap 1증가
		}
		System.out.println("1~10까지 3의 배수 : " + hap);	//3
	}//end main
}//end class
