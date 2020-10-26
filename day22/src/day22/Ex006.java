package day22;
class Distance{
	//멤버변수
	int x,x1,y,y1;
	//생성자
	Distance(){}
	//d.getDistance(1,1,2,2)
	//리턴값:	double	메서드:getDistance					파라미터:1,1,2,2		
	double getDistance(int x, int y, int x1, int y1) { return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));} // 1-2=-1인데 양수로 하기 위해서 제곱
		//Math.pow() : 제곱
		//Math.sqrt() : 루트
	
}
public class Ex006 {
	
	public static double getDistance(int x, int y, int x1, int y1){ return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));} 
	public static void main(String[] args) {
	
		Distance d = new Distance(); // 인스턴스란? 클래스(붕어빵들) 객체(붕어빵) 찍어낸 것 d
	 	System.out.println("객체 찍어서 사용 일반 메서드 : " + d.getDistance(1,1,2,2)); //객체 찍어서 사용 일반메서드 : 1.4142135623730951
	 	System.out.println("클래스 멤버함수이용 : " + getDistance(1,1,2,2));
		/*
		 두 점의 거리를 계산하는 코드를 완성하시오		 
		 :::: 주어진 옵션
		 public static void main(String[] args) {
		 	Distance d = new Distance(); // 인스턴스란? 클래스(붕어빵들) 객체(붕어빵) 찍어낸 것 d
		 	System.out.println("객체 찍어서 사용 일반 메서드 : " + d.getDistance(1,1,2,2));
		 	System.out.println("클래스 멤버함수이용 : " + getDistance(1,1,2,2));
		 	
		 :::: 실행결과
		 객체 찍어서 사용 일반메서드 : 1.4142135623730951
		 클래스 멤버함수 이용 : 1.4142135623730951
		 */
	}
	//static이 붙은 이유는 메모리상에 먼저 띄어놓겠다!
	
}
