package day22;
class MyPoint{
	//멤버변수
	int x,y;
	//멤버함수
	double getDistance(int x1, int y1) {
		return Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
	}
	//생성자
	
	MyPoint(){}
	MyPoint(int x, int y){this.x = x; this.y = y;}

}
public class Ex007 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		System.out.println( p.getDistance(2,2) );
		/*
		 Q7. 클래스를 만들어 다음과 같은 결과를 얻도록 하시오
		 [MyPoint] : 두 점 사이의 거리를 구해주는 클래스
		 
		 :::: 주어진 옵션
		 public class Ex007 {
			public static void main(String[] args) {
				MyPoint p = new MyPoint(1,1);
				System.out.println( p.getDistance(2,2) );
			}
		}
		 */
	}
}
