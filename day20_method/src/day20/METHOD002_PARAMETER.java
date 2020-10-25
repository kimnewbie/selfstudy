package day20;

public class METHOD002_PARAMETER {
	public static void main(String[] args) {
		/*
		 star(2);
		 1. 분석 : 리턴	- ( String )
		 2. 분석 : 파라미터 - (	int )
		 
		 ㅁ 출력내용 : ★★
		 ㅁ 주어진 옵션
		 public static void main(String[] args) {
		 	star(2);
		 }
		 */
		star(2);
	}
	public static String star(int a) {
		String result = "";
		for(int i=0; i<a; i++) {
			System.out.print(result = "★");
		}
		return result;
	}
}
