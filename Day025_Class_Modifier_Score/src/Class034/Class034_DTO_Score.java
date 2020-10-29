package Class034;

public class Class034_DTO_Score {
	public static void main(String[] args) {
		
		Score_ver1 iron = new Score_ver1(); //옵션바꾸지마세요
		iron.setName("아이언맨");
		iron.setKor(100);
		iron.setEng(100);
		iron.setMath(100);		
		
		Score_ver1 hulk= new Score_ver1(); //옵션바꾸지마세요
		hulk.setName("헐크");
		hulk.setKor(20);
		hulk.setEng(50);
		hulk.setMath(30);			
		
		Score_ver1.info();
		iron.show();
		hulk.show();
	}
}
/*
ㅁ 출력화면
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
이름		국어	영어	수학	총점	평균		합격여부	장학생	랭킹
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
아이언맨	100	100	100	300	100.0	합격		장학생	**********
헐크		20	50	30	100	33.33	불합격	

ㅁ 클래스 이름 : Score_ver1 ### this, private으로 설정하시오
	클래스1) 멤버변수(private)
			:	private String name, p; private String s; 
				private String rank = ""; 
				private int kor, eng, math, total; private double aver;
	클래스2) 멤버함수 :
				//총점, 평균을 계산해주는 메소드
				public void process();
				//합격을 계산해주는 메소드 - 60점이상이면 합격 아니면 불합격
				public void pass();
				//장학생을 계산해주는 메소드 - 95점이상이면 장학생
				public void schola();
				//평균정도를 별로 보여주는 메소드 - 평균점수대만큼 별출력
				public void star();
				//출력해주는 메소드
				public void show();

	클래스3) 생성자 :
				기본생성자				public Score_ver1()
				파라미터가 있는 생성자	public Score_ver1(String name, int kor, int eng, int math) ###옵션바꾸지마세요

	public static void main(String[] args) {
		Score_ver1 iron = new Score_ver1(); ###옵션바꾸지마세요
		Score_ver1 hulk= new Score_ver1(); ###옵션바꾸지마세요
*/