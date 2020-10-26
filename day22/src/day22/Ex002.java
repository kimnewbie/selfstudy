package day22;
class SutdaCard002{
	//멤버변수
	int num; boolean isKwang;
	//멤버함수
	//card1.info() => return 값 : 3또는 1K => String / 메서드명 : info / 파라미터 : X
	String info(){
		//else { return this.num; }
		// #todo2. 3, false=> 3만 출력/1,true=>1K 출력
		// #todo2. 만약 isKwang이 true라면 1K출력 - 숫자 + K출력/ 아니라면 3출력 숫자만 출력
//		if(isKwang == true) {return this.num + "K";}
//		else {return Integer.toString(this.num);}
		return (isKwang)? "" + num + "K" : ""+num;
	}
	//생성자
	SutdaCard002(){ // 밑에 같은 파라미터 생성자가 나오는 순간-기본생성자는 수동호출로 변경이 된다.
		this.num = 1; this.isKwang = true;
	}
	SutdaCard002(int num, boolean isKwang){ this.num = num; this.isKwang = isKwang; }
	
}
public class Ex002 {
	public static void main(String[] args) {
		SutdaCard002 card1 = new SutdaCard002(3, false);//=>3.false =>3		=>파라미터가 있는 생성자
 		SutdaCard002 card2 = new SutdaCard002();		//=>()		=>1K	=>기본생성자셋팅 #todo1. num은 숫자1, boolean true; 로 셋팅
 		
 		System.out.println(card1.info());//3K출력
 		System.out.println(card2.info());//1K출력 (default 생성자 이용, 1셋팅 K문자열리턴)
		/*
		 Q2. [StudaCard002]에 생성자를 추가해서 실행 다음과 같은 결과를 얻도록 하시오
		 타입		변수명		설명
		 int		num			카드의 숫자 사이의 정수 (변수에 들어갈 수 있는 데이터 예시 : 1~10)
		 boolean	isKwang		광 이면 아니면(변수에 들어갈 수 있는 데이터 예시 : true, false)
		 
		 ※ 힌트1 : 필요없는 구성은 생략이 가능하다.
		 class SutdaCard002{
		 	//멤버변수
		 	//멤버함수
		 	//생성자
		 }
		 ※ 힌트2
		 멤버함수추가 : card1.info()	=> return : String, 메서드명: info(), 파라미터 :x
		 	※ 만약 isKwang이 true라면 num + "k", 아니라면 num만 return
		 생성자(초기화를 해주는 목적) 추가 : new StudCard();	=> 기본값 num : 1, isKwang : true
		 
		 ㅁ 주어진 옵션
		 public class Ex002 {
		 	public static void main(String[] args) {
		 		SutdaCard002 card1 = new SutdaCard002(3, false);
		 		SutdaCard002 card2 = new SutdaCard002();
		 		
		 		System.out.println(card1.info());//3K출력
		 		System.out.println(card2.info());//1K출력 (default 생성자 이용, 1셋팅 K문자열리턴)
		 }
		 ㅁ 출력된 화면
		 3
		 1K	 		
		 */
		
	}
}
