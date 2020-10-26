package day22;
class Student002{
	//멤버변수
	String name; int ban; int	no; int	kor; int	eng; int	math;
	//멤버함수
	public int getTotal() { return this.kor+this.eng+this.math; }

	//public float getAverage() {return (Math.round(this.getTotal()*10/3f)/10f);}
	//double getAverage() {return getTotal()/3.0;} 에서
	String getAverage() {return String.format("%.1f", this.getTotal()/3.0);}
	
	//생성자
	Student002(){}
}
public class Ex004 {
	public static void main(String[] args) {
		Student002 s2 = new Student002(); 
		s2.name = "홍길동"; s2.ban = 1; s2.no=1; s2.kor=100; s2.eng=60; s2.math=76;
		System.out.println("이름 : " + s2.name);
		System.out.println("총점 : " + s2.getTotal());
		System.out.println("평균 : " + s2.getAverage());
		/*
		ㅁ 다음과 같은 멤버변수를 갖는 클래스를 정의하시오
		[Student002]
		타입		변수명	설명
		String	name	학생이름
		int		ban		반
		int		no		번호
		int		kor		국어점수
		int		eng		영어점수
		int		math	수학점수
		
		※힌트
		필요없는 구성은 생략이 가능하다.
		class Student002{
			//멤버변수
			//멤버함수
			//생성자
		}
		
		ㅁ 출력된 화면
		이름 : 홍길동
		총점 : 236
		평균 : 78.7
		
		ㅁ 주어진 옵션
		public static void main(String[] args) {
			Student002 s2 = new Student002(); 
			s2.name = "홍길동"; s2.ban = 1; s2.no=1; s2.kor=100; s2.eng=60; s2.math=76;
			System.out.println("이름 : " + s2.name);
			System.out.println("총점 : " + s2.getTotal());
			System.out.println("평균 : " + s2.getAverage()); //78.7
		 */		 
	}
}
