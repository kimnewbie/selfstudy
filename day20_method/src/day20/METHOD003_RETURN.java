package day20;

public class METHOD003_RETURN {
	public static void main(String[] args) {
		/*
		 System.out.println("장수돌침대는 별이" + star(5));
		 1. 분석 : 리턴	- ( String )
		 2. 분석 : 파라미터 - (	int )
		 
		 ㅁ 출력내용 : 장수돌침대는 별이 5개 ★★★★★
		 ㅁ 주어진 옵션
		 public static void main(String[] args) {
		 	System.out.println("장수돌침대는 별이" + star(5));
		 }
		 */
		 System.out.println("장수돌침대는 별이" + star(5));
	}
	public static String star(int a) {
		String result = " " + a + "개 ";
		for(int i=0; i<a; i++) {
			result += "★";
		}
		return result;
	}
}
