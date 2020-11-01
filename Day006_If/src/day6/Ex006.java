package day6;

public class Ex006 {
	public static void main (String[] args ) {
		// 1. 34의 다음에 오는 10의 배수 구하기 : 40	=> 일의자리 34%10 = 4
		// 2. 40-34	= 6							=> 10-4 = 6
		
		// 일의 자리 구하기
		// 10 - 일의 자리
		int num = 34;
		
		System.out.println((10 - (num%10)));
		System.out.println("일의 자리구하기 : " 	+ 	  	 34%10 	 );
		System.out.println("10- 일 자리구하기 : "	+ (10 - (34%10)) );
		
		System.out.println((num+10)-(num%10)-num);
		//이건 내 답
		
	}//end main
}//end class

/*
아래는 변수  num의 값보다 크면서도 가장 가까운 10의 배수에서 변수 num의 값을 
뺀 나머지를 구하는 코드이다 
예)   34의 큰 10의 배수는 40 , 40-34=6  출력된내용 6

  public class Ex006 {
	public static void main (String[] args ) {
		int num = 34;
		System.out.println(    작성할코드부분   );
		
*/