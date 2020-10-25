package day21;

public class MethodApi001 {
	public static void main(String[] args) {
		System.out.println("001. Math");
		//절대값, 큰수, 작은수, 랜덤
		//Math.random()	- Math에 마우스 올리기/F2(포커스 고정)/지구본모양 클릭>api로 넘어감
		
		System.out.println(Math.random());
		//double .java.lang.Math.random()	: return: double, 메서드이름: lang.Math.random, 파라미터()
		System.out.println(Math.PI);
		// SF ( static / final ) 파이는 변경되면 안되서 고정
		System.out.println(Math.abs(-10)); // int java.lang.Math.abs(int a)
		System.out.println(Math.abs(-2.1)); // 오버로딩 가능 파라미터 자료형과 개수만 중요
		System.out.println(Math.max(10, 3)); // 최대값
		System.out.println(Math.min(10, 3)); // 최소값
		
		//Q1) int ma = 10, mb=20, mc=30; Math.max를 이용해서 제일 큰수 찾기
		int ma = 10, mb=20, mc=30; 
		System.out.println(Math.max(Math.max(ma, mb),mc));
		//Q2) 다음의 결과값을 적어보고 어떤 의미인지 적으시오.
		System.out.println("0.5이상 반올림 : "+Math.round(1.5f)); // [결과값] : 2 -> 반올림
		System.out.println("올림 : "+Math.ceil(1.1f)); // [결과값] : 2.0 -> 올림
		System.out.println("올림 : "+Math.ceil(1.9f)); // [결과값] : 2.0 -> 올림
		System.out.println("내림 : "+Math.floor(1.1f)); // [결과값] : 1.0 -> 버림
		System.out.println("내림 : "+Math.floor(1.9f)); // [결과값] : 1.0 -> 버림
		//Q3) 1~45까지의 숫자 랜덤하게 나오게 만들기 (Math.random())
		System.out.println(((int)(Math.random()*45)+1));
		
	
	}
}
