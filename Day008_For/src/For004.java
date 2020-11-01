
public class For004 {	
	public static void main(String[] args) {
		/*
		 for문을 이용하여 1~10까지의 합을 구하시오.
		 1~10까지의 합 : 55
		 ※ 1~10까지의 합을 담을 변수 만들기 : int hap = 0;
		 
		 hap = hap + 1		// 1) hap : 0 	2) hap : 1담기	3) 최종hap : 1
		 hap = hap + 2		// 2) hap : 1	2) hap : 2담기	3) 최종hap : 1+2=3
		 hap = hap + 3		// 3) hap : 3	2) hap : 3담기	3) 최종hap : 3+3=6
		 */
		
		//변수
		int hap = 0; // 전체 합을 담을 box
		//입력
		//처리
		for(int i=1; i<=10; i++){
			hap += i; } // hap = 0 + 1
		//출력
		System.out.println("1~10까지의 합 : " + hap ); // hap = 55
		
	}//end main
}//end class
