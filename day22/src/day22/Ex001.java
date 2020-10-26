package day22;
class SutdaCard{
	//멤버변수
	int num; boolean isKwang;
	//멤버함수
	@Override
	public String toString() {
		return "SutdaCard [num=" + num + ", isKwang=" + isKwang + "]";
	}
	//생성자	
	SutdaCard() {}
}
public class Ex001 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard();
 		System.out.println("[num = " + card1.num + ", isKwang=" + card1.isKwang + "]");
 		//같은 거
 		System.out.println(card1);
 		
		/*
		 클래스명[StudaCard] 다음과 같은 멤버변수를 갖는 클래스를 정의하시오
		 타입		변수명		설명
		 int		num			카드의 숫자 사이의 정수 (변수에 들어갈 수 있는 데이터 예시 : 1~10)
		 boolean	isKwang		광 이면 아니면(변수에 들어갈 수 있는 데이터 예시 : true, false)
		 
		 ※ 힌트 : 필요없는 구성은 생략이 가능하다.
		 class SutdaCard{
		 	//멤버변수
		 	//멤버함수
		 	//생성자
		 }
		 ㅁ 주어진 옵션
		 public class Ex001 {
		 	public static void main(String[] args) {
		 		SutdaCard card1 = new SutdaCard();
		 		System.out.println("[num = " + card1.num + ", isKwang=" + card1.isKwang + "]");
		 		}
		 }
		 ㅁ 출력된 화면
		 [num = 0, isKwang = false]		 		
		 */
	}
}
