package day21;

import java.util.Calendar;

public class MathodApi006_interview_question {
	public static void main(String[] args) {
		//1. 서기1년1월1일~금일 
		//2. Calendar 클래스 사용하지 말기
		//Scanner scanner = new Scanner(System.in);
		Calendar today = Calendar.getInstance();
		System.out.print(today.get(1) + "년\t"); 
		System.out.print(today.get(2) + "월\t"); //월은 0부터
		System.out.println(today.get(5) + "일\t");
		

		System.out.print(today.get(Calendar.YEAR) + "년\t");
		System.out.print((today.get(Calendar.MONTH)+1) + "월\t"); //월은 0부터
		System.out.println(today.get(Calendar.DATE) + "일\t");
		
		System.out.print(today.get(10) + "시\t");
		System.out.print(today.get(12) + "분\t");
		System.out.println(today.get(13) + "초\t");
		
		System.out.print(today.get(Calendar.HOUR) + "시\t");
		System.out.print(today.get(Calendar.MINUTE) + "분\t");
		System.out.println(today.get(Calendar.SECOND) + "초\t");
		
	}//end main
}//end class
