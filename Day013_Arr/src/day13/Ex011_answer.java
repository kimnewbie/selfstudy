package day13;

public class Ex011_answer {	
	public static void main(String[] args) {
		
		int today = 0;
		int year = 2020, month=10, day=13;
		int [] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] yoil = {"일", "월", "화", "수", "목", "금", "토"};
	
		//1. 년
		for(int i=1; i<year; i++) {
			today += (i%4==0 && i%100!=0 || i%400==0)? 366:365;			
		}
		//2. 월
		mon[2] = (year%4==0 && year%100!=0 || year%400==0)? 29:28; //이게 for안에 가면 -1이됨
		for(int i=0; i<month; i++) { today+=mon[i]; }
		//3. 일
		today += day;
		System.out.println("1. 총일수 : " + today);
		//4. 요일
		System.out.println("2-1. 서기1년1월1일 : 총일수%7 = " + 1%7); //1 (월요일)
		System.out.println("2-2. 금일 : 총일수%7 = " + today%7);	  //2
		System.out.println( yoil[today%7] + "요일");				  //화요일
		/////////////////////////////////////////////////////////////////
		System.out.println("==================================");
		System.out.println(year + "년" + month + "월" + day + "일");
		System.out.println("==================================");
		for(int i=0; i<yoil.length; i++) {System.out.print( yoil[i] + "\t");}
		System.out.println();
		//2020년의 10월 1일의 요일 => today-13+1 (-13만 하면 9월의 마지막 날)
		//2020년의 10월 1일의 요일 => (today-day+1)%7
		for(int i=0; i<(today-day+1)%7; i++) {System.out.print("*\t");}
		//mon[10] => 31
		for(int i=1; i<=mon[month]; i++) { //1일부터 31일까지
			if((today-day+i)%7==0) {System.out.println();} // 10월 1일은 목요일 = 나눈값 4
			System.out.print(i + "\t");					   
			// (today-day+i)%7==0 나눈 값이 0이면 일요일 
			// 일요일이면 줄바꿈해랏!!!!!! 느낌
		}
	}//end main
}//end class
