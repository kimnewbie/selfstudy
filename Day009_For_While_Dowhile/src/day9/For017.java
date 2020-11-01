package day9;

import java.util.Scanner;

public class For017 {
	public static void main(String[] args) {
		/*
		0) 이름 담을 자료형선택해  name이라 변수명을 정하고 입력받기		  
		1) 국어점수 담을 자료형선택해 kor이라 변수명을 정하고 입력받기 
		(0~100사이만입력받기-아니라면 무한반복)
		2) 영어점수 담을 자료형선택해 eng이라 변수명을 정하고 입력받기 
		(0~100사이만입력받기-아니라면 무한반복)
		3) 수학점수 담을 자료형선택해 math이라 변수명을 정하고 입력받기 
		(0~100사이만입력받기-아니라면 무한반복)
		4) 총점점수 담을 자료형선택해 tot이라 변수명을 정하고 총점구하기 		
		5) 평균점수 담을 자료형(float)선택해 avg이라 변수명을 정하고  평균구하기 
		6) 모두 출력 	- 평균은 소수점이 처리되게 만들기 	
		7) 평균 95이상이면 장학생
		8) 각각 국어, 영어, 수학 점수 90이상 수,80이상 우,70이상 미,60이상 양,나머지 가
		9) 평균이 70이상이면 "합격"
		   평균이 70미만이면 무조건 "불합격" 
		10) 단, 세과목중에서 한과목이라도 40미만이면
			합격이 아니라 "재시험"    (재시험과목출력)
		11) 해당평균의 별 90점대면 별 9개 
	
		ㅁ실행화면
		이름 입력 > FIRST
		국어점수 입력 > 100
		영어점수 입력 > 100
		수학점수 입력 > 99
		==============================================================================
		이름		국어	영어	수학	총점	평균	합격여부	레벨			장학생	
		==============================================================================
		FIRST		100(수)	100(수)	99(수)	299	99.67	합격	★★★★★★★★★	 	장학생
		==============================================================================
		*/
		
		String name = "", star = "", kor_grade = "", re="", answer="",
				eng_grade = "", math_grade = "", pass="", janghak = "";
		int kor =0, eng=0, math=0, tot=0; 
		float avg = 0.f;
		Scanner scanner = new Scanner(System.in);
		
	for(;;) {
		System.out.print("이름 입력 > ");
		name = scanner.next(); 
		
		for(;;) {
			System.out.print("국어점수 > ");
			kor = scanner.nextInt();
			if(0<=kor && kor<=100) {break;}
		}
		for(;;) {
			System.out.print("영어점수 > ");
			eng = scanner.nextInt();
			if(0<=kor && kor<=100) {break;}
		}
		for(;;) {
			System.out.print("수학점수 > ");
			math = scanner.nextInt();
			if(0<=kor && kor<=100) {break;}
		}
		tot = kor+eng+math;
		avg = tot/3.0f; // 반올림할 경우: Math.round(tot/3f*100)/100f;
		
		if(kor>=90) {kor_grade = kor + "(수)" ;}
		else if(kor>=80) {kor_grade = kor +"(우)";	}
		else if(kor>=70) {kor_grade = kor + "(미)" ;}
		else if(kor>=60) {kor_grade = kor + "(양)" ;}
		else {kor_grade = kor + "(가)" ;}
		
		if(eng>=90) {eng_grade = eng + "(수)" ;}
		else if(eng>=80) {eng_grade = eng +"(우)";	}
		else if(eng>=70) {eng_grade = eng + "(미)" ;}
		else if(eng>=60) {eng_grade = eng + "(양)" ;}
		else {eng_grade = eng + "(가)" ;}
		
		if(math>=90) {math_grade = math + "(수)" ;}
		else if(math>=80) {math_grade = math +"(우)";	}
		else if(math>=70) {math_grade = math + "(미)" ;}
		else if(math>=60) {math_grade = math + "(양)" ;}
		else {math_grade = math + "(가)" ;}
		
		if(avg>=70&&(kor>=40&&eng>=40&&math>=40)) {pass = "합격";}
		else if (kor<40||eng<40||math<40) {pass ="재시험";}
		else {pass = "불합격";}
		
		if(avg>=95) {janghak = "장학생";}	
		else {janghak = "비해당";}
		
		/* [[스위치구문 말고 for구문 도전]]
		switch( (int)avg / 10 ){
			case 10: result ="★★★★★★★★★★"; break;
			case 9: result = "★★★★★★★★★"; break;
			case 8: result = "★★★★★★★★"; break;
			case 7: result = "★★★★★★★"; break;
			case 6: result = "★★★★★★"; break;
			case 5: result = "★★★★★"; break;
			case 4: result = "★★★★"; break;
			case 3: result = "★★★"; break;
			case 2: result = "★★"; break;
			case 1: result = "★"; break;					
		}		
		*/
		for(int i=1; i<=(int)avg/10; i++){ star+="★" ;}		
		
		System.out.println("==============================================================================");
		System.out.println("이름	 국어 	영어 	수학 	총점 	평균 	합격여부	   레벨	 	장학생");
		System.out.println("==============================================================================");
		
		System.out.println(name + "\t" + kor_grade+ "\t" +eng_grade+
							"\t" + math_grade + "\t" +tot + "\t" +String.format("%.2f",avg)
							+ "\t" +pass + "\t"+ star +"\t"+ janghak);	
		System.out.println("==============================================================================");
		
			
		for(;;) {
			System.out.println("다시 입력하십니까? yes or no");
			answer = scanner.next();
			if(answer.equals("no")) {System.out.println("종료합니다."); break;}
			else if(answer.equals("yes")) {break;}
		}
		if(answer.equals("yes")) {continue;}
		else {break;}
	}
	}//end main
}//end class
