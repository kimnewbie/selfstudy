
public class For007 {
	public static void main(String[] args) {
		/*
		서기1년~서기2020년중에서 윤년의 개수를 출력하시오.
		*/
		
		int cnt = 0;
		
		for(int i=1; i<=2020; i++) {
			if((i%4==0 && i%100!=0)||i%400==0) {
				System.out.println(i);
				cnt ++;
			}
		}
			System.out.println("서기1년~서기2020년중에서 윤년의 개수 : " + cnt);

	}//end main
}//end class