package day6;

import java.util.Scanner;

public class IF014 {
	public static void main (String[] args) {
		/*	  0) 학번 담을 자료형선택해  학번이라 변수명을 정하고 입력받기		  
	  1) 국어점수 담을 자료형선택해 kor이라 변수명을 정하고 입력받기
	  2) 영어점수 담을 자료형선택해 eng이라 변수명을 정하고 입력받기
	  3) 수학점수 담을 자료형선택해 math이라 변수명을 정하고 입력받기
	  4) 총점점수 담을 자료형선택해 tot이라 변수명을 정하고 총점구하기 		
	  5) 평균점수 담을 자료형(float)선택해 avg이라 변수명을 정하고  평균구하기 
	  6) 모두 출력 	- 평균은 소수점이 처리되게 만들기 	
	  7) 평균 95이상이면 장학생
	  8) 국어점수 90이상 수,80이상 우,70이상 미,60이상 양,나머지 가
	  9) 평균이 70이상이면 "합격"
		 단, 세과목중에서 한과목이라도 40미만이면
		 합격이 아니라 "재시험"
		 평균이 70미만이면 무조건 "불합격" 


	학번 입력 > std1111
	국어점수 입력 > 100
	영어점수 입력 > 100
	수학점수 입력 > 99

	=================================================================================== 
	학번	국어	영어	수학	총점	평균	합격여부	레벨	장학생
	=================================================================================== 
	std1111	100	100	99	299	99.67	합격	수	장학생
	=================================================================================== 
*/
		
		//GIGO
		//변수
		String num, result, lv,janghak = "";
		int kor, eng, math, total = 0;		
		float avg = total/(float)3.0f ;
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("학번 입력>");
		num = scanner.next();
		System.out.println("국어점수 입력>");
		kor = scanner.nextInt();
		System.out.println("영어점수 입력>");
		eng = scanner.nextInt();
		System.out.println("수학점수> 입력");
		math = scanner.nextInt();
		
		//처리
		total = kor + eng + math ;
		avg = Math.round((total/3.0f)*100)/100f;

		if(kor >= 90) {lv ="수";}
		else if(80<=kor) {lv ="우";}
		else if(70<=kor){lv ="미";}
		else if(60<=kor){lv ="양";}
		else { lv = "가";}
		
		if((avg >= 70) && ((kor >= 40) && (eng >= 40) && (math >= 40))) {result = "합격";}
		else if((avg >= 70) && (kor < 40 || eng <40 || math < 40 )) {result="재시험";}
		else { result = "불합격";}
		
		if (avg >= 95) {janghak = "장학생";}
		else {janghak = "해당없음";}
		
		//출력
		System.out.println("==================================================================================="
				+ "\n" +
	"학번	국어	영어	수학	총점	평균	합격여부	레벨	장학생" + "\n" +
	"===================================================================================");
	System.out.println(num + "\t" + kor+ "\t" + eng+ "\t" 
						+ math+ "\t" + total+ "\t" + avg + "\t" 
						+ result + "\t"+ lv + "\t" + janghak);
	System.out.println("===================================================================================");
	

	}//end main

}//end class
