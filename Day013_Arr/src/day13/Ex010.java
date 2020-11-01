package day13;

public class Ex010 {
	public static void main(String[] args) {
		/*
		* 금일 요일을 구하시오 
		* 서기 1년~ 오늘총날수 : 737711
		* 2020년 10월 13일 화요일
		* int [] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		* String[] yoil = {"일", "월", "화", "수", "목", "금", "토", "일"};
		*		
		*/
		int [] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] yoil = {"일", "월", "화", "수", "목", "금", "토", "일"};
		int sum = 0;
		int today = 0;
		String w = "";
		
		for(int i=1; i<=2019; i++){
			if (i%4==0 && i%100!=0 || i%400==0) { sum+=366; }
			else { sum+=365; }
		}
		
		for(int i=0; i<10; i++) {
			mon[2] = 29; //335
			sum += mon[i];
		}
		today = (sum+13); //737711
		
		w = yoil[today%7];// 요일 0이면 '일' 1이면 '월' ...
		
		System.out.println("2020년 10월 13일 " + w + "요일");
		
	}//end main
}//end class
/* 선생님답
int today = 0;
int year = 2020, month=10, day=13;
int [] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
String[] yoil = {"일", "월", "화", "수", "목", "금", "토", "일"};

//1. 년
for(int i=1; i<year; i++) {
	today += (i%4==0 && i%100!=0 || i%400==0)? 366:365;			
}
//2. 월
mon[2] = (year%4==0 && year%100!=0 || year%400==0)? 29:28;
for(int i=0; i<month; i++) { today+=mon[i]; 			
}
//3. 일
today += day;
System.out.println("1. 총일수 : " + today);
//4. 요일
System.out.println("2-1. 서기1년1월1일 : 총일수%7 = " + 1%7); //1
System.out.println("2-2. 금일 : 총일수%7 = " + today%7);	  //2
System.out.println( yoil[today%7] + "요일");				  //화요일
*/