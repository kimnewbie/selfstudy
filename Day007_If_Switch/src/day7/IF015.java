package day7;

import java.util.Scanner;

public class IF015 {
	public static void main (String[] args) {		
		// [GIGO]변수
		String stdid = "";
		int kor= 0, eng= 0, math= 0, total = 0; float avg = 0.0f;
		String jang = "-", pass ="", level = "", 
						level_kor="", level_eng="", level_math="", re="재시험\t";
		Scanner scanner = new Scanner(System.in);
		// [GIGO]입력
		System.out.println("학번입력 > "); stdid = scanner.next();
		System.out.println("국어입력 > "); kor = scanner.nextInt();
		System.out.println("영어입력 > "); eng = scanner.nextInt();
		System.out.println("수학입력 > "); math = scanner.nextInt();
		// [GIGO] 처리
		//		  처리1,2) 총점, 평균처리
		//		  처리3) 평균 95이상이면 장학생
		//		  처리4) 국어점수 90이상 수,80이상 우,70이상 미,60이상 양,나머지 가
		//		  처리5) 평균이 70이상이면 "합격" 
		//				단, 세과목중에서 한과목이라도 40미만이면 합격이 아니라 "재시험"
		//				평균이 70미만이면 무조건 "불합격"
		total = kor + eng + math;
		avg = total/3.0f;
		
		if(avg >= 95) { jang = "장학생";	}
		
		//if
		if(kor >= 90) {level_kor= kor +"(수)";	}
		else if(kor >= 80) {level_kor= kor +"(우)";	}
		else if(kor >= 70) {level_kor= kor +"(미)";	}
		else if(kor >= 60) {level_kor= kor +"(양)";	}
		else 			   {level_kor= kor +"(가)";}
		// 대처방안1: for / 대처방안2: method / 대처방안3: 삼항연산자
		
		level_eng = (eng >= 90)? eng+"(수)" :
					(eng >= 80)? eng+"(우)" :
					(eng >= 90)? eng+"(미)" :
					(eng >= 90)? eng+"(양)" : eng + "(가)";
					
		level_math = (math >= 90)? math+"(수)" :
					(math >= 80)? math+"(우)" :
					(math >= 90)? math+"(미)" :
					(math >= 90)? math+"(양)" : math + "(가)";
		
		//////////// pass
		if(avg >= 70) {pass="합격";}
		else {pass="불합격";}
		
		////////////level
		level = "Lv" + ((int)avg/10);
		
		////////////re
		// +의 두가지 의미 1) 숫자+숫자 더하기 2) 문자열+문자열 출력
		if(kor < 40) {re += "O\t" ;} else {re += "-\t";}
		re += (eng < 40)? "O\t" :  "-\t" ;
		re += (math < 40)? "O\t" : "-\t" ;

		
		
		if(avg >= 70) {
			pass = "합격";
			if(kor < 40 || eng < 40 || math < 40) {pass="재시험";}
		}else {pass = "불합격";}		
		// [GIGO]출력
		System.out.println("==================================================================================="
				+ "\n" +
	"학번	국어	영어	수학	총점	평균	합격여부	장학생 레벨" + "\n" +
	"===================================================================================");
	System.out.println(stdid + "\t" + level_kor+ "\t" + level_eng+ "\t" 
						+ level_math+ "\t" + total+ "\t" + String.format("%.2f",avg) + "\t" 
						+ pass + "\t"+ jang + "\t" + level);
	System.out.println("===================================================================================");
	System.out.println("재시험여부");
	System.out.println("===================================================================================");
		//String.format("%.2f",)
	}//end main

}//end class



