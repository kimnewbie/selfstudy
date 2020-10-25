package day21;
class Score001{
	//1. 멤버변수
	String name; int kor; int eng; int math; int total; int aver; String p; String s; String rank="";
	//2. 멤버함수
	
	//총점, 평균을 계산해주는 메소드
	void process() { 
		total = (kor+eng+math); 
		aver = total/3; }
	//합격을 계산해주는 메소드	
	void pass() { if(aver>=60&&kor>=40&&eng>=40&&math>=40){p ="합격";} else {p="불합격";} }
	//장학생을 계산해주는 메소드	
	void schola() { s=(aver>=95)?"장학생":"불합격";}		
	//평균정도를 별로 보여주는 메소드
	void star() {
		for(int i=0; i<(int)(aver/10); i++) {
			rank += "*";
		}
	}
	//출력해주는 메소드
	void show() {
		process();
		pass();
		schola();
		star();
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				+ "이름	국어	영어	수학	총점	평균	합격여부	장학생	랭킹\r\n"
				+ ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+aver+"\t"+p+"\t"+s+"\t"+rank+"\r");
	}
	
}
public class Class006 {
	public static void main(String[] args) {		
		Score001 iron = new Score001();
		iron.name="아이언맨"; 
		iron.kor=100;
		iron.eng=100;
		iron.math=100;
		iron.show();
		
		Score001 hulk = new Score001();
		hulk.name="헐크"; 
		hulk.kor=20;
		hulk.eng=50;
		hulk.math=30;
		hulk.show();
		/*
		1. Score001이라는 클래스 작성
		//1. 멤버변수
			name(이름), kor(국어), eng(영어), math(수학), total(총점), aver(평균), p(합격여부), s(장학생여부), rank(별정도)
		//2. 멤버함수 : 
			void process() : 총점, 평균을 계산해주는 메소드
			void pass() : 합격을 계산해주는 메소드
			void schola() : 장학생을 계산해주는 메소드
			void star() : 평균정도를 별로 보여주는 메소드
			void show() : 출력해주는 메소드
			
		ㅁ 출력내용
		::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
			이름		국어	영어	수학	총점	평균	합격여부	장학생	랭킹
		::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
			아이언맨	100	100	100	300	100	합격		장학생	**********
			
		::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
			이름		국어	영어	수학	총점	평균	합격여부	장학생	랭킹
		::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
			헐크		20	50	30	100	33	불합격	불합격	***
			
		ㅁ 주어진 옵션
		public static void main(String[] args) {
			Score iron = new Score();
			iron.name="아이언맨"; iron.kor=100, iron.eng=100, iron.mat=100;
			iron.show();
			
			Score hulk = new Score();
			iron.name="헐크"; hulk.kor=20, hulk.eng=50, hulk.mat=30;
			hulk.show();
		 */
	}//end main
}//end class
